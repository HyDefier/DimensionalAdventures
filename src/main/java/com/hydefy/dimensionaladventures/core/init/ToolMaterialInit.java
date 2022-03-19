package com.hydefy.dimensionaladventures.core.init;

import com.hydefy.dimensionaladventures.core.BaseToolMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public final class ToolMaterialInit {

    private ToolMaterialInit() {}

    public static final Tier FEATHER = new BaseToolMaterial(
            3, 42, 14.0f, 4.5f, 1200,
            () -> Ingredient.of(Items.FEATHER));

    public static final Tier FEATHER_CONE = new BaseToolMaterial(
            2, 720, 7.0f, 2.5f, 16,
            () -> Ingredient.of(ItemInit.FEATHER_CONE_ITEM.get()));

    public static final Tier IRON_FEATHER = new BaseToolMaterial(
            4, 2048, 12.0f, 3.5f, 22,
            () -> Ingredient.of(ItemInit.FEATHER_CONE_ITEM.get()));
}
