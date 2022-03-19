package com.hydefy.dimensionaladventures.common.item;

import com.google.common.collect.ImmutableMap;
import com.hydefy.dimensionaladventures.core.init.ArmorMaterialInit;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.WaterFluid;

import java.util.Map;

public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, MobEffectInstance> MATERIAL_TO_EFFECT_MAP =
            (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>()).put
            (ArmorMaterialInit.FEATHER, new MobEffectInstance(MobEffects.SLOW_FALLING,
            1, 0, true, false, false)).put(

            ArmorMaterialInit.FEATHER_CONE, new MobEffectInstance(MobEffects.REGENERATION,
            1, 0, true, false, false))
//                    .put(
//
//            ArmorMaterialInit.IRON_FEATHER, new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,
//            1, 0, true, false, false)).put(
//
//            ArmorMaterialInit.IRON_FEATHER, new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,
//            1, 0, true, false, false))
            .build();


    public ModArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
        super(material, slot, settings);
    }

    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if(!world.isClientSide()) {
            if(hasFullSuitOfArmorOn(player)) {
                ItemStack boots = player.getInventory().getArmor(0);
                if (!((boots.getItem().getClass() == ArmorItem.class) || (boots.getItem().getClass() == ModArmorItem.class)))
                    return; //REACTION FAILED
                ArmorItem bootsItem = ((ArmorItem)boots.getItem());
                ArmorMaterial material = bootsItem.getMaterial();
                if (material == ArmorMaterialInit.FEATHER) {
                    evaluateArmorEffectsFeatherFalling(player, true);
                } else if (material == ArmorMaterialInit.FEATHER_CONE){
                    evaluateArmorEffects(player, false);
                } else if (material == ArmorMaterialInit.IRON_FEATHER){
                    evaluateArmorEffectsTank(player, false);
                }
            }
        }
    }

    private void evaluateArmorEffectsTank(Player player, boolean allowWings) {
        if(hasCorrectArmorOn(ArmorMaterialInit.IRON_FEATHER, player, allowWings)) {
            if (player.isCrouching()) {
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 0));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1, 0));
//                player.canStandOnFluid(WaterFluid);
            }
        }
//        for (Map.Entry<ArmorMaterial, MobEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
//            ArmorMaterial mapArmorMaterial = entry.getKey();
//            //MobEffectInstance mapStatusEffect = entry.getValue();
//
//
//        }
    }

    private void evaluateArmorEffectsFeatherFalling(Player player, boolean allowWings) {
        for (Map.Entry<ArmorMaterial, MobEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            MobEffectInstance mapStatusEffect = entry.getValue();

            if(hasCorrectArmorOn(mapArmorMaterial, player, allowWings)) {
                if(!player.isCrouching()) { //Allow Fast Falling
                    //ItemStack breastplate = player.getInventory().getArmor(2);
                    if (player.isFallFlying()) {
                        if (!player.isSprinting()) { //Allow fast flight or "airbrakes"
                            addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect, allowWings);
                        }
                    } else {
                        addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect, allowWings);
                    }
                }
            }
        }
    }

    private void evaluateArmorEffects(Player player, boolean allowWings) {
        for (Map.Entry<ArmorMaterial, MobEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            MobEffectInstance mapStatusEffect = entry.getValue();

            if(hasCorrectArmorOn(mapArmorMaterial, player, allowWings)) {
                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect, allowWings);
            }
        }
    }

    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial,
                                            MobEffectInstance mapStatusEffect, boolean allowWings) {
        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.getEffect());

        if(hasCorrectArmorOn(mapArmorMaterial, player, allowWings) && !hasPlayerEffect) {
            player.addEffect(new MobEffectInstance(mapStatusEffect.getEffect(),
                    mapStatusEffect.getDuration(), mapStatusEffect.getAmplifier()));

            //if(new Random().nextFloat() > 0.6f) { // 40% of damaging the armor! Possibly!
            //    player.getInventory().hurtArmor(DamageSource.MAGIC, 1f, new int[]{0, 1, 2, 3});
            //}
        }
    }

    private boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack breastplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player, boolean allowWings) {
        if (!hasFullSuitOfArmorOn(player)) return false;

        ArmorItem breastplateItem;

        ItemStack boots = player.getInventory().getArmor(0);
        if (!((boots.getItem().getClass() == ArmorItem.class) || (boots.getItem().getClass() == ModArmorItem.class)))
            return false;
        ArmorItem bootsItem = ((ArmorItem)boots.getItem());

        ItemStack leggings = player.getInventory().getArmor(1);
        if (!((leggings.getItem().getClass() == ArmorItem.class) || (leggings.getItem().getClass() == ModArmorItem.class)))
            return false;
        ArmorItem leggingsItem = ((ArmorItem)leggings.getItem());

        ItemStack helmet = player.getInventory().getArmor(3);
        if (!((helmet.getItem().getClass() == ArmorItem.class) || (helmet.getItem().getClass() == ModArmorItem.class)))
            return false;
        ArmorItem helmetItem = ((ArmorItem)helmet.getItem());

        ItemStack breastplate = player.getInventory().getArmor(2);
        if (allowWings) {
            if (!(breastplate.getItem().getClass() == ElytraItem.class)) {
                if (!((breastplate.getItem().getClass() == ArmorItem.class) || (breastplate.getItem().getClass() == ModArmorItem.class))) {
                    return false;
                } else {
                    breastplateItem = ((ArmorItem) breastplate.getItem());
                    return helmetItem.getMaterial() == material && breastplateItem.getMaterial() == material &&
                            leggingsItem.getMaterial() == material && bootsItem.getMaterial() == material;
                }
            } else {
                //wearingElytra
                return helmetItem.getMaterial() == material &&
                        leggingsItem.getMaterial() == material && bootsItem.getMaterial() == material;
            }
        } else if (!((breastplate.getItem().getClass() == ArmorItem.class) || (breastplate.getItem().getClass() == ModArmorItem.class))){
            return false;
        } else {
            if (!((breastplate.getItem().getClass() == ArmorItem.class) || (breastplate.getItem().getClass() == ModArmorItem.class)))
                return false;
            breastplateItem = ((ArmorItem) breastplate.getItem());
        }

        return helmetItem.getMaterial() == material && breastplateItem.getMaterial() == material &&
                leggingsItem.getMaterial() == material && bootsItem.getMaterial() == material;
    }
}