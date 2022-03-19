package com.hydefy.dimensionaladventures.core;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public class BaseToolMaterial implements Tier {

    private final float attackDamageBonus, speed;
    private final int enchantability, harvestLevel, durability;
    private final Supplier<Ingredient> repairMaterial;

    public BaseToolMaterial(int harvestLevel, int durability, float speed, float attackDamageBonus, int enchantability,
                             Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.durability = durability;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public int getUses() {
        return this.durability;
    }
}