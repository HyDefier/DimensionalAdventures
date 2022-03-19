package com.hydefy.dimensionaladventures.common.entity;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.core.init.ItemInit;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.Vec3;

import java.util.Random;

public class PortalChicken extends Animal {
    //TODO Fix Wing Animations

    private static final Ingredient FOOD_ITEMS;
    public float flap;
    public float flapSpeed;
    public float oFlapSpeed;
    public float oFlap;
    public float flapping = 1.0F;
    private float nextFlap = 1.0F;
    public int eggTime;
    public boolean isChickenJockey;

    private static final ResourceLocation LOOT_TABLE = new ResourceLocation(DimensionalAdventures.MODID, "entities/portal_chicken");

    public PortalChicken(EntityType<? extends Animal> p_28236_, Level p_28237_) {
        super(p_28236_, p_28237_);
        this.eggTime = this.random.nextInt(6000) + 6000;
        this.setPathfindingMalus(BlockPathTypes.WATER, 0.0F);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.4D));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.0D, FOOD_ITEMS, false));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.1D));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
    }

    protected float getStandingEyeHeight(Pose pose, EntityDimensions entityDimensions) {
        return this.isBaby() ? entityDimensions.height * 0.85F : entityDimensions.height * 0.92F;
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 4.0D).add(Attributes.MOVEMENT_SPEED, 0.25D);
    }

    public void aiStep() {
        super.aiStep();
        this.oFlap = this.flap;
        this.oFlapSpeed = this.flapSpeed;
        this.flapSpeed = (float)((double)this.flapSpeed + (double)(this.onGround ? -1 : 4) * 0.3D);
        this.flapSpeed = Mth.clamp(this.flapSpeed, 0.0F, 1.0F);
        if (!this.onGround && this.flapping < 1.0F) {
            this.flapping = 1.0F;
        }

        this.flapping = (float)((double)this.flapping * 0.9D);
        Vec3 $$0 = this.getDeltaMovement();
        if (!this.onGround && $$0.y < 0.0D) {
            this.setDeltaMovement($$0.multiply(1.0D, 0.6D, 1.0D));
        }

        this.flap += this.flapping * 2.0F;
        if (!this.level.isClientSide && this.isAlive() && !this.isBaby() && !this.isChickenJockey() && --this.eggTime <= 0) {
            this.playSound(SoundEvents.CHICKEN_EGG, 1.0F, (this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F);
            this.spawnAtLocation(ItemInit.PORTAL_EGG_ITEM.get());
            this.eggTime = this.random.nextInt(6000) + 6000;
        }

    }

    protected boolean isFlapping() {
        return this.flyDist > this.nextFlap;
    }

    protected void onFlap() {
        this.nextFlap = this.flyDist + this.flapSpeed / 2.0F;
    }

    public boolean causeFallDamage(float p_148875_, float p_148876_, DamageSource damageSource) {
        return false;
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.CHICKEN_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return SoundEvents.CHICKEN_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.CHICKEN_DEATH;
    }

    @Override
    protected ResourceLocation getDefaultLootTable() {
        return LOOT_TABLE;
    }

    public static boolean canSpawn(EntityType<PortalChicken> entity, LevelAccessor levelAccess, MobSpawnType spawnType,
                                   BlockPos pos, Random random) {
        return checkAnimalSpawnRules(entity, levelAccess, spawnType, pos, random) && pos.getY() > 50;
    }

    protected void playStepSound(BlockPos blockPos, BlockState blockState) {
        this.playSound(SoundEvents.CHICKEN_STEP, 0.15F, 1.0F);
    }

    public Chicken getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return (Chicken)EntityType.CHICKEN.create(serverLevel);
    }

    public boolean isFood(ItemStack itemStack) {
        return FOOD_ITEMS.test(itemStack);
    }

    protected int getExperienceReward(Player player) {
        return this.isChickenJockey() ? 10 : super.getExperienceReward(player);
    }

    public void readAdditionalSaveData(CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        this.isChickenJockey = compoundTag.getBoolean("IsChickenJockey");
        if (compoundTag.contains("EggLayTime")) {
            this.eggTime = compoundTag.getInt("EggLayTime");
        }

    }

    public void addAdditionalSaveData(CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        compoundTag.putBoolean("IsChickenJockey", this.isChickenJockey);
        compoundTag.putInt("EggLayTime", this.eggTime);
    }

    public boolean removeWhenFarAway(double p_28266_) {
        return this.isChickenJockey();
    }

    public void positionRider(Entity entity) {
        super.positionRider(entity);
        float $$1 = Mth.sin(this.yBodyRot * 0.017453292F);
        float $$2 = Mth.cos(this.yBodyRot * 0.017453292F);
        float $$3 = 0.1F;
        float $$4 = 0.0F;
        entity.setPos(this.getX() + (double)(0.1F * $$1), this.getY(0.5D) + entity.getMyRidingOffset() + 0.0D, this.getZ() - (double)(0.1F * $$2));
        if (entity instanceof LivingEntity) {
            ((LivingEntity)entity).yBodyRot = this.yBodyRot;
        }

    }

    public boolean isChickenJockey() {
        return this.isChickenJockey;
    }

    public void setChickenJockey(boolean p_28274_) {
        this.isChickenJockey = p_28274_;
    }

    static {
        FOOD_ITEMS = Ingredient.of(Items.WHEAT_SEEDS, Items.MELON_SEEDS, Items.PUMPKIN_SEEDS, Items.BEETROOT_SEEDS, ItemInit.GIZZARD_SEEDS.get());
    }
}
