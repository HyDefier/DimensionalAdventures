package com.hydefy.dimensionaladventures.core.init;

import com.hydefy.dimensionaladventures.core.BaseToolMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public final class ToolMaterialInit {

    private ToolMaterialInit() {}

    public static final Tier FEATHER = new BaseToolMaterial(3.0f, 84, 3, 7.5f, 1200,
            () -> Ingredient.of(Items.FEATHER));
}
