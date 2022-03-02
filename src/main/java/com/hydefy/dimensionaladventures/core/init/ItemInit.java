package com.hydefy.dimensionaladventures.core.init;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.common.block.ModFluids;
import com.hydefy.dimensionaladventures.common.item.ModArmorItem;
import com.hydefy.dimensionaladventures.common.item.PortalBoxItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit {

    private ItemInit() {}

    //TODO add Vulnerability potion effect opposite of resistance

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            DimensionalAdventures.MODID);

    //ADVANCED BLOCK ITEMS
    public static final RegistryObject<BlockItem> FEATHERER_EGG_BLOCK_ITEM = ITEMS.register
            ("featherer_egg_block", () -> new BlockItem(BlockInit.FEATHERER_EGG_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> HEALING_STATION_BLOCK_ITEM = ITEMS.register
            ("healing_station_block", () -> new BlockItem(BlockInit.HEALING_STATION.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> STEEL_SCRAP_ITEM = ITEMS.register
            ("steel_scrap_block", () -> new BlockItem(BlockInit.STEEL_SCRAP_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.RUINED_TECHNOLOGY_TAB)));

    //ADVANCED ITEMS
    public static final RegistryObject<PortalBoxItem> PORTAL_BOX_ITEM = ITEMS.register("portal_box", () ->
            new PortalBoxItem(new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB).stacksTo(1)));

    //TODO feather falling effect to boots alone instead of set bonus?
    //TODO edit armor model for boots to add wings
    //ARMOR
    public static final RegistryObject<ArmorItem> FEATHER_HELMET = ITEMS.register("feather_helmet",
            () -> new ArmorItem(ArmorMaterialInit.FEATHER, EquipmentSlot.HEAD,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    public static final RegistryObject<ArmorItem> FEATHER_CHESTPLATE = ITEMS.register("feather_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.FEATHER, EquipmentSlot.CHEST,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    public static final RegistryObject<ArmorItem> FEATHER_LEGGINGS = ITEMS.register("feather_leggings",
            () -> new ArmorItem(ArmorMaterialInit.FEATHER, EquipmentSlot.LEGS,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    public static final RegistryObject<ModArmorItem> FEATHER_BOOTS = ITEMS.register("feather_boots",
            () -> new ModArmorItem(ArmorMaterialInit.FEATHER, EquipmentSlot.FEET,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    //BLOCK ITEMS
    public static final RegistryObject<BlockItem> BLACK_SMOOTH_FEATHER_BLOCK_ITEM = ITEMS.register
            ("black_smooth_feather_block", () -> new BlockItem(BlockInit.BLACK_SMOOTH_FEATHER_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> BLUE_SMOOTH_FEATHER_BLOCK_ITEM = ITEMS.register
            ("blue_smooth_feather_block", () -> new BlockItem(BlockInit.BLUE_SMOOTH_FEATHER_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> BROWN_SMOOTH_FEATHER_BLOCK_ITEM = ITEMS.register
            ("brown_smooth_feather_block", () -> new BlockItem(BlockInit.BROWN_SMOOTH_FEATHER_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> CHICKEN_COMB_BLOCK_ITEM = ITEMS.register("chicken_comb_block"
            , () -> new BlockItem(BlockInit.CHICKEN_COMB_BLOCK.get(), new Item.Properties()
            .tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> CYAN_SMOOTH_FEATHER_BLOCK_ITEM = ITEMS.register
            ("cyan_smooth_feather_block", () -> new BlockItem(BlockInit.CYAN_SMOOTH_FEATHER_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> EGGSHELL_BLOCK_ITEM = ITEMS.register("eggshell_block"
            , () -> new BlockItem(BlockInit.EGGSHELL_BLOCK.get(), new Item.Properties()
            .tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> FEATHER_BLOCK_ITEM = ITEMS.register("feather_block"
            , () -> new BlockItem(BlockInit.FEATHER_BLOCK.get(), new Item.Properties()
            .tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> GIZZARD_SEED_BLOCK_ITEM = ITEMS.register("gizzard_seed_block"
            , () -> new BlockItem(BlockInit.GIZZARD_SEED_BLOCK.get(), new Item.Properties()
            .tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> GRAY_SMOOTH_FEATHER_BLOCK_ITEM = ITEMS.register
            ("gray_smooth_feather_block", () -> new BlockItem(BlockInit.GRAY_SMOOTH_FEATHER_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> GREEN_SMOOTH_FEATHER_BLOCK_ITEM = ITEMS.register
            ("green_smooth_feather_block", () -> new BlockItem(BlockInit.GREEN_SMOOTH_FEATHER_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> LIGHT_BLUE_SMOOTH_FEATHER_BLOCK_ITEM = ITEMS.register
            ("light_blue_smooth_feather_block", () -> new BlockItem(BlockInit.LIGHT_BLUE_SMOOTH_FEATHER_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> LIGHT_GRAY_SMOOTH_FEATHER_BLOCK_ITEM = ITEMS.register
            ("light_gray_smooth_feather_block", () -> new BlockItem(BlockInit.LIGHT_GRAY_SMOOTH_FEATHER_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> LIME_SMOOTH_FEATHER_BLOCK_ITEM = ITEMS.register
            ("lime_smooth_feather_block", () -> new BlockItem(BlockInit.LIME_SMOOTH_FEATHER_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> MAGENTA_SMOOTH_FEATHER_BLOCK_ITEM = ITEMS.register
            ("magenta_smooth_feather_block", () -> new BlockItem(BlockInit.MAGENTA_SMOOTH_FEATHER_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> ORANGE_SMOOTH_FEATHER_BLOCK_ITEM = ITEMS.register
            ("orange_smooth_feather_block", () -> new BlockItem(BlockInit.ORANGE_SMOOTH_FEATHER_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> PINK_SMOOTH_FEATHER_BLOCK_ITEM = ITEMS.register
            ("pink_smooth_feather_block", () -> new BlockItem(BlockInit.PINK_SMOOTH_FEATHER_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> PURPLE_SMOOTH_FEATHER_BLOCK_ITEM = ITEMS.register
            ("purple_smooth_feather_block", () -> new BlockItem(BlockInit.PURPLE_SMOOTH_FEATHER_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> RED_EGG_BLOCK_ITEM = ITEMS.register("red_egg_block"
            , () -> new BlockItem(BlockInit.RED_EGG_BLOCK.get(), new Item.Properties()
            .tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> RED_SMOOTH_FEATHER_BLOCK_ITEM = ITEMS.register
            ("red_smooth_feather_block", () -> new BlockItem(BlockInit.RED_SMOOTH_FEATHER_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> SMOOTH_FEATHER_BLOCK_ITEM = ITEMS.register
            ("smooth_feather_block", () -> new BlockItem(BlockInit.SMOOTH_FEATHER_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> WHITE_SMOOTH_FEATHER_BLOCK_ITEM = ITEMS.register
            ("white_smooth_feather_block", () -> new BlockItem(BlockInit.WHITE_SMOOTH_FEATHER_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> YELLOW_SMOOTH_FEATHER_BLOCK_ITEM = ITEMS.register
            ("yellow_smooth_feather_block", () -> new BlockItem(BlockInit.YELLOW_SMOOTH_FEATHER_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    //FOODS
    public static final RegistryObject<Item> COOKED_HEARTY_CHICKEN = ITEMS.register("cooked_hearty_chicken",
            () -> new Item(new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)
            .food(new FoodProperties.Builder().nutrition(8).saturationMod(1.2f).alwaysEat().meat()
                .effect(() -> new MobEffectInstance(MobEffects.HEAL, 0, 2), 1.0f)
                .build())));
    public static final RegistryObject<Item> GOLDEN_COOKED_HEARTY_CHICKEN = ITEMS.register("golden_cooked_hearty_chicken",
            () -> new Item(new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)
            .food(new FoodProperties.Builder().nutrition(8).saturationMod(1.2f).alwaysEat().meat()
                .effect(() -> new MobEffectInstance(MobEffects.HEAL, 0, 2), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.JUMP, 400, 1), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400, 4), 1.0f)
                .build())));
    public static final RegistryObject<Item> HEARTY_CHICKEN = ITEMS.register("hearty_chicken",
            () -> new Item(new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)
            .food(new FoodProperties.Builder().nutrition(3).saturationMod(0.3f).alwaysEat().meat()
                .effect(() -> new MobEffectInstance(MobEffects.HEAL, 0, 1), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.POISON, 60, 1), 0.1f)
                .build())));

    //NORMAL ITEMS
    public static final RegistryObject<Item> BROKEN_EGGSHELL_ITEM = ITEMS.register("broken_eggshell", () ->
            new Item(new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<Item> PORTAL_EGG_ITEM = ITEMS.register("portal_egg", () ->
            new Item(new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<Item> RED_EGG_ITEM = ITEMS.register("red_egg", () ->
            new Item(new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<Item> STEEL_SCRAP = ITEMS.register("steel_scrap", () ->
            new Item(new Item.Properties().tab(DimensionalAdventures.RUINED_TECHNOLOGY_TAB)));

    //SEED ITEMS
    public static final RegistryObject<Item> GIZZARD_SEEDS = ITEMS.register("gizzard_seeds", () ->
            new ItemNameBlockItem(BlockInit.GIZZARD_SEED_CROP.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    //SPAWN EGG ITEMS
    public static final RegistryObject<ForgeSpawnEggItem> FEATHERER_SPAWN_EGG      = ITEMS.register(
            "featherer_spawn_egg"     , () -> new ForgeSpawnEggItem(EntityInit.FEATHERER     , 0xFFD4F8,
            0xFCFCF4, new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB).stacksTo(16)));
    public static final RegistryObject<ForgeSpawnEggItem> PORTAL_CHICKEN_SPAWN_EGG = ITEMS.register(
            "portal_chicken_spawn_egg", () -> new ForgeSpawnEggItem(EntityInit.PORTAL_CHICKEN, 0x266775,
            0xFF0000, new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB).stacksTo(16)));

    //TOOLS
    public static final RegistryObject<BucketItem> EGGSHELL_BUCKET = ITEMS.register("eggshell_bucket",() -> new
            BucketItem(Fluids.EMPTY, (new Item.Properties()).stacksTo(16).tab(DimensionalAdventures.SERAMANIA_TAB)));

    public static final RegistryObject<Item> OIL_BUCKET = ITEMS.register("oil_bucket",
            () -> new BucketItem(() -> ModFluids.OIL_FLUID.get(),
                    new Item.Properties().stacksTo(1).tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<AxeItem> FEATHER_AXE = ITEMS.register("feather_axe",
            () -> new AxeItem(ToolMaterialInit.FEATHER, 0, 1.0f,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<HoeItem> FEATHER_HOE = ITEMS.register("feather_hoe",
            () -> new HoeItem(ToolMaterialInit.FEATHER, 0, 1.0f,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<PickaxeItem> FEATHER_PICKAXE = ITEMS.register("feather_pickaxe",
            () -> new PickaxeItem(ToolMaterialInit.FEATHER, 0, 1.0f,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<ShovelItem> FEATHER_SHOVEL = ITEMS.register("feather_shovel",
            () -> new ShovelItem(ToolMaterialInit.FEATHER, 0, 1.0f,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<SwordItem> FEATHER_SWORD = ITEMS.register("feather_sword",
            () -> new SwordItem(ToolMaterialInit.FEATHER, 0, 1.0f,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
}