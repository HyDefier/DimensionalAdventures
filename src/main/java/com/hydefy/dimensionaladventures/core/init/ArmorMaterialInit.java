package com.hydefy.dimensionaladventures.core.init;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.core.BaseArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.awt.*;

public final class ArmorMaterialInit {

    private ArmorMaterialInit() {}

    public static final ArmorMaterial FEATHER = new BaseArmorMaterial(500, new int[] { 100, 200, 300, 400 },    //TODO fix nums
            new int[] { 2, 5, 7, 2 }, -5.0f, 1.0f, DimensionalAdventures.MODID + ":feather",
            SoundEvents.BOOK_PAGE_TURN, () -> Ingredient.of(Items.FEATHER));
}