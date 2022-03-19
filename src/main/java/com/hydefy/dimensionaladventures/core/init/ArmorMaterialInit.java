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

    //TODO balance and equip on Outland 's Finest
    public static final ArmorMaterial FEATHER = new BaseArmorMaterial(500, new int[] { 100, 200, 300, 400 },
            new int[] { 2, 5, 7, 2 }, -5.0f, 1.0f, DimensionalAdventures.MODID + ":feather",
            SoundEvents.BOOK_PAGE_TURN, () -> Ingredient.of(Items.FEATHER));

    private static final int fc = 25;
    public static final ArmorMaterial FEATHER_CONE = new BaseArmorMaterial
            (25,
            new int[] { 13 * fc, 15 * fc, 16 * fc, 11 * fc },
            new int[] { 3, 6, 7, 3 },
            0.0f,
            0.0f,
            DimensionalAdventures.MODID + ":feather_cone",
            SoundEvents.WOOD_FALL,
            () -> Ingredient.of(ItemInit.FEATHER_CONE_ITEM.get()));

    private static final int fd = 11;
    public static final ArmorMaterial FEATHER_HIDE = new BaseArmorMaterial
            (15,
            new int[] { 13 * fd, 15 * fd, 16 * fd, 11 * fd },
            new int[] { 2, 3, 4, 2 },
            0.0f,
            0.0f,
            DimensionalAdventures.MODID + ":feather_hide",
            SoundEvents.ARMOR_EQUIP_LEATHER,
            () -> Ingredient.of(ItemInit.FEATHER_CONE_ITEM.get()));

    private static final int fi = 42;
    public static final ArmorMaterial IRON_FEATHER = new BaseArmorMaterial
            (25,
            new int[] { 13 * fi, 15 * fi, 16 * fi, 11 * fi },
            new int[] { 3, 6, 8, 3 },
            0.1f,
            3.0f,
            DimensionalAdventures.MODID + ":iron_feather",
            SoundEvents.ANVIL_FALL,
            () -> Ingredient.of(ItemInit.FEATHER_CONE_ITEM.get()));

    //TODO find out if values higher than diamond protection work (1.19 *may* change significantly)
}