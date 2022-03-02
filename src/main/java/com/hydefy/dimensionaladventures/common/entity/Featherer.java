package com.hydefy.dimensionaladventures.common.entity;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.core.init.EntityInit;
import com.hydefy.dimensionaladventures.core.init.SoundInit;
import net.minecraft.ResourceLocationException;
import net.minecraft.core.BlockPos;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Shearable;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.IForgeShearable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Featherer extends Animal implements Shearable, IForgeShearable {

    //TODO save and display shear state
    //TODO make dye-able and add dyed feather blocks
    //TODO Animations

    private static final EntityDataAccessor<Byte> DATA_WOOL_ID = null;

    private static final ResourceLocation LOOT_TABLE = new ResourceLocation(DimensionalAdventures.MODID, "entities/featherer");

    public Featherer(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new TemptGoal(this, 1.2D, Ingredient.of(Items.SHEARS), false));
        this.goalSelector.addGoal(1, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(2, new FloatGoal(this));
        this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.25D));
        this.goalSelector.addGoal(5, new PanicGoal(this, 1.4D));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 1.0D));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, 4.0D).add(Attributes.MOVEMENT_SPEED, 0.27D);
    }

    public InteractionResult mobInteract(Player p_29853_, InteractionHand p_29854_) {
        p_29853_.getItemInHand(p_29854_);
        return super.mobInteract(p_29853_, p_29854_);
    }

    public void shear(SoundSource p_29819_) {
        this.level.playSound((Player)null, this, SoundEvents.SHEEP_SHEAR, p_29819_, 1.0F, 1.0F);
        this.setSheared(true);
        int i = 1 + this.random.nextInt(3);

        for(int j = 0; j < i; ++j) {
            ItemEntity itementity = this.spawnAtLocation(Items.FEATHER, 1);
            if (itementity != null) {
                itementity.setDeltaMovement(itementity.getDeltaMovement().add((double)((this.random.nextFloat() - this.random.nextFloat()) * 0.1F), (double)(this.random.nextFloat() * 0.05F), (double)((this.random.nextFloat() - this.random.nextFloat()) * 0.1F)));
            }
        }

    }

    public boolean isSheared() {
        return ((Byte)this.entityData.get(DATA_WOOL_ID) & 16) != 0;
    }

    public void setSheared(boolean p_29879_) {
        byte b0 = (Byte)this.entityData.get(DATA_WOOL_ID);
        if (p_29879_) {
            this.entityData.set(DATA_WOOL_ID, (byte)(b0 | 16));
        } else {
            this.entityData.set(DATA_WOOL_ID, (byte)(b0 & -17));
        }

    }

    public boolean readyForShearing() {
        return true;
        //return this.isAlive() && !this.isSheared() && !this.isBaby();
    }

    public boolean isShearable(@Nonnull ItemStack item, Level world, BlockPos pos) {
        return this.readyForShearing();
    }

    @Nonnull
    public List<ItemStack> onSheared(@Nullable Player player, @Nonnull ItemStack item, Level world, BlockPos pos, int fortune) {
        world.playSound((Player)null, this, SoundEvents.SHEEP_SHEAR, player == null ? SoundSource.BLOCKS : SoundSource.PLAYERS, 1.0F, 1.0F);
        if (world.isClientSide) {
            return Collections.emptyList();
        } else {
            //this.setSheared(true);
            int i = 1 + this.random.nextInt(3);
            List<ItemStack> items = new ArrayList();

            for(int j = 0; j < i; ++j) {
                items.add(new ItemStack(Items.FEATHER));
            }

            return items;
        }
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundInit.FEATHERER_AMBIENT.get();
    }

    @Override
    protected SoundEvent getDeathSound()   {
        return SoundInit.FEATHERER_DEATH.get();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundInit.FEATHERER_HURT.get();
    }

    @Override
    protected ResourceLocation getDefaultLootTable() {
        return LOOT_TABLE;
    }

    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob parent) {
        return EntityInit.FEATHERER.get().create(level);
    }
}
