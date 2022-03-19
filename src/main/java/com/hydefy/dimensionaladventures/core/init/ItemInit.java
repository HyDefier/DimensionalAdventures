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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ItemInit {

    private ItemInit() {}

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            DimensionalAdventures.MODID);

    //ADVANCED BLOCK ITEMS
    public static final RegistryObject<BlockItem> FEATHERER_EGG_BLOCK_ITEM = ITEMS.register
            ("featherer_egg_block", () -> new BlockItem(BlockInit.FEATHERER_EGG_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> HEALING_STATION_BLOCK_ITEM = ITEMS.register
            ("healing_station_block", () -> new BlockItem(BlockInit.HEALING_STATION.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> STEEL_SCRAP_BLOCK_ITEM = ITEMS.register
            ("steel_scrap_block", () -> new BlockItem(BlockInit.STEEL_SCRAP_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.RUINED_TECHNOLOGY_TAB)));

    //ADVANCED ITEMS
    public static final RegistryObject<PortalBoxItem> PORTAL_BOX_ITEM = ITEMS.register("portal_box", () ->
            new PortalBoxItem(new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB).stacksTo(1)));

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

    public static final RegistryObject<ArmorItem> FEATHER_CONE_HELMET = ITEMS.register("feather_cone_helmet",
            () -> new ArmorItem(ArmorMaterialInit.FEATHER_CONE, EquipmentSlot.HEAD,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<ArmorItem> FEATHER_CONE_CHESTPLATE = ITEMS.register("feather_cone_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.FEATHER_CONE, EquipmentSlot.CHEST,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<ArmorItem> FEATHER_CONE_LEGGINGS = ITEMS.register("feather_cone_leggings",
            () -> new ArmorItem(ArmorMaterialInit.FEATHER_CONE, EquipmentSlot.LEGS,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<ModArmorItem> FEATHER_CONE_BOOTS = ITEMS.register("feather_cone_boots",
            () -> new ModArmorItem(ArmorMaterialInit.FEATHER_CONE, EquipmentSlot.FEET,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    public static final RegistryObject<ArmorItem> FEATHER_HIDE_HELMET = ITEMS.register("feather_hide_helmet",
            () -> new ArmorItem(ArmorMaterialInit.FEATHER_HIDE, EquipmentSlot.HEAD,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<ArmorItem> FEATHER_HIDE_CHESTPLATE = ITEMS.register("feather_hide_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.FEATHER_HIDE, EquipmentSlot.CHEST,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<ArmorItem> FEATHER_HIDE_LEGGINGS = ITEMS.register("feather_hide_leggings",
            () -> new ArmorItem(ArmorMaterialInit.FEATHER_HIDE, EquipmentSlot.LEGS,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<ModArmorItem> FEATHER_HIDE_BOOTS = ITEMS.register("feather_hide_boots",
            () -> new ModArmorItem(ArmorMaterialInit.FEATHER_HIDE, EquipmentSlot.FEET,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    public static final RegistryObject<ArmorItem> IRON_FEATHER_HELMET = ITEMS.register("iron_feather_helmet",
            () -> new ArmorItem(ArmorMaterialInit.IRON_FEATHER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<ArmorItem> IRON_FEATHER_CHESTPLATE = ITEMS.register("iron_feather_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.IRON_FEATHER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<ArmorItem> IRON_FEATHER_LEGGINGS = ITEMS.register("iron_feather_leggings",
            () -> new ArmorItem(ArmorMaterialInit.IRON_FEATHER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<ModArmorItem> IRON_FEATHER_BOOTS = ITEMS.register("iron_feather_boots",
            () -> new ModArmorItem(ArmorMaterialInit.IRON_FEATHER, EquipmentSlot.FEET,
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
    public static final RegistryObject<BlockItem> FEATHER_DIRT_BLOCK_ITEM = ITEMS.register("feather_dirt_block"
            , () -> new BlockItem(BlockInit.FEATHER_DIRT_BLOCK.get(), new Item.Properties()
            .tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> FEATHER_GRASS_BLOCK_ITEM = ITEMS.register("feather_grass_block"
            , () -> new BlockItem(BlockInit.FEATHER_GRASS_BLOCK.get(), new Item.Properties()
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
            .food(new FoodProperties.Builder().nutrition(8).saturationMod(1.2f).meat()
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
            .food(new FoodProperties.Builder().nutrition(3).saturationMod(0.3f).meat()
                .effect(() -> new MobEffectInstance(MobEffects.HEAL, 0, 1), 1.0f)
                .effect(() -> new MobEffectInstance(MobEffects.POISON, 60, 1), 0.1f)
                .build())));

    //NORMAL ITEMS
    public static final RegistryObject<Item> BROKEN_EGGSHELL_ITEM = ITEMS.register("broken_eggshell", () ->
            new Item(new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<Item> FEATHER_CONE_ITEM = ITEMS.register("feather_cone", () ->
            new Item(new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<Item> FEATHER_HIDE_ITEM = ITEMS.register("feather_hide", () ->
            new Item(new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<Item> FIRE_FEATHER = ITEMS.register("fire_feather", () ->
            new Item(new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<Item> IRON_FEATHER_ITEM = ITEMS.register("iron_feather", () ->
            new Item(new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<Item> IRON_FEATHER_INGOT_ITEM = ITEMS.register("iron_feather_ingot", () ->
            new Item(new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<Item> IRON_FEATHER_NUGGET_ITEM = ITEMS.register("iron_feather_nugget", () ->
            new Item(new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<Item> PORTAL_EGG_ITEM = ITEMS.register("portal_egg", () ->
            new Item(new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<Item> RED_EGG_ITEM = ITEMS.register("red_egg", () ->
            new Item(new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<Item> STEEL_SCRAP_ITEM = ITEMS.register("steel_scrap", () ->
            new Item(new Item.Properties().tab(DimensionalAdventures.RUINED_TECHNOLOGY_TAB)));

    //SEED ITEMS
    public static final RegistryObject<Item> GIZZARD_SEEDS = ITEMS.register("gizzard_seeds", () ->
            new ItemNameBlockItem(BlockInit.GIZZARD_SEED_CROP.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    //SPAWN EGG ITEMS
    public static final RegistryObject<ForgeSpawnEggItem> CHIKO_SPAWN_EGG = ITEMS.register(
            "chiko_spawn_egg", () -> new ForgeSpawnEggItem(EntityInit.CHIKO, 0xEDEDED,
            0xFF0000, new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB).stacksTo(16)));
    public static final RegistryObject<ForgeSpawnEggItem> FEATHERER_SPAWN_EGG = ITEMS.register(
            "featherer_spawn_egg", () -> new ForgeSpawnEggItem(EntityInit.FEATHERER, 0xFFD4F8,
            0xFCFCF4, new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB).stacksTo(16)));
    public static final RegistryObject<ForgeSpawnEggItem> PORTAL_CHICKEN_SPAWN_EGG = ITEMS.register(
            "portal_chicken_spawn_egg", () -> new ForgeSpawnEggItem(EntityInit.PORTAL_CHICKEN, 0x266775,
            0xFF0000, new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB).stacksTo(16)));

    //TOOLS
    public static final RegistryObject<BucketItem> EGGSHELL_BUCKET = ITEMS.register("eggshell_bucket",() -> new
            BucketItem(Fluids.EMPTY, (new Item.Properties()).stacksTo(16).tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<Item> OIL_BUCKET = ITEMS.register("oil_bucket",
            () -> new BucketItem(ModFluids.OIL_FLUID,
            new Item.Properties().stacksTo(1).tab(DimensionalAdventures.SERAMANIA_TAB)));

    public static final RegistryObject<AxeItem> FEATHER_AXE = ITEMS.register("feather_axe",
            () -> new AxeItem(ToolMaterialInit.FEATHER, 5.0F, -3.0F,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<HoeItem> FEATHER_HOE = ITEMS.register("feather_hoe",
            () -> new HoeItem(ToolMaterialInit.FEATHER, 0, -3.0f,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<PickaxeItem> FEATHER_PICKAXE = ITEMS.register("feather_pickaxe",
            () -> new PickaxeItem(ToolMaterialInit.FEATHER, 1, -2.8f,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<ShovelItem> FEATHER_SHOVEL = ITEMS.register("feather_shovel",
            () -> new ShovelItem(ToolMaterialInit.FEATHER, 1.5f, -3.0f,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<SwordItem> FEATHER_SWORD = ITEMS.register("feather_sword",
            () -> new SwordItem(ToolMaterialInit.FEATHER, 3, -2.4f,
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    public static final RegistryObject<AxeItem> FEATHER_CONE_AXE = ITEMS.register("feather_cone_axe",
            () -> new AxeItem(ToolMaterialInit.FEATHER_CONE, 6.0F, -3.1F,
                    new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<HoeItem> FEATHER_CONE_HOE = ITEMS.register("feather_cone_hoe",
            () -> new HoeItem(ToolMaterialInit.FEATHER_CONE, 0, -3.0f,
                    new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<PickaxeItem> FEATHER_CONE_PICKAXE = ITEMS.register("feather_cone_pickaxe",
            () -> new PickaxeItem(ToolMaterialInit.FEATHER_CONE, 1, -2.8f,
                    new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<ShovelItem> FEATHER_CONE_SHOVEL = ITEMS.register("feather_cone_shovel",
            () -> new ShovelItem(ToolMaterialInit.FEATHER_CONE, 1.5f, -3.0f,
                    new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<SwordItem> FEATHER_CONE_SWORD = ITEMS.register("feather_cone_sword",
            () -> new SwordItem(ToolMaterialInit.FEATHER_CONE, 3, -2.4f,
                    new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    public static final RegistryObject<AxeItem> IRON_FEATHER_AXE = ITEMS.register("iron_feather_axe",
            () -> new AxeItem(ToolMaterialInit.IRON_FEATHER, 5.0F, -3.0F,
                    new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<HoeItem> IRON_FEATHER_HOE = ITEMS.register("iron_feather_hoe",
            () -> new HoeItem(ToolMaterialInit.IRON_FEATHER, 0, -3.0f,
                    new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<PickaxeItem> IRON_FEATHER_PICKAXE = ITEMS.register("iron_feather_pickaxe",
            () -> new PickaxeItem(ToolMaterialInit.IRON_FEATHER, 1, -2.8f,
                    new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<ShovelItem> IRON_FEATHER_SHOVEL = ITEMS.register("iron_feather_shovel",
            () -> new ShovelItem(ToolMaterialInit.IRON_FEATHER, 1.5f, -3.0f,
                    new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<SwordItem> IRON_FEATHER_SWORD = ITEMS.register("iron_feather_sword",
            () -> new SwordItem(ToolMaterialInit.IRON_FEATHER, 3, -2.4f,
                    new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    //STONE BLOCK ITEMS
    public static final RegistryObject<BlockItem> COBBLED_SERASTONE_BLOCK_ITEM = ITEMS.register
            ("cobbled_serastone_block", () -> new BlockItem(BlockInit.COBBLED_SERASTONE_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> COBBLED_SERASTONE_SLAB_ITEM = ITEMS.register
            ("cobbled_serastone_slab", () -> new BlockItem(BlockInit.COBBLED_SERASTONE_SLAB.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    public static final RegistryObject<BlockItem> DEEP_SERASTONE_BLOCK_ITEM = ITEMS.register
            ("deep_serastone_block", () -> new BlockItem(BlockInit.DEEP_SERASTONE_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> DEEP_SERASTONE_SLAB_ITEM = ITEMS.register
            ("deep_serastone_slab", () -> new BlockItem(BlockInit.DEEP_SERASTONE_SLAB.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    public static final RegistryObject<BlockItem> MOSSY_COBBLED_SERASTONE_BLOCK_ITEM = ITEMS.register
            ("mossy_cobbled_serastone_block", () -> new BlockItem(BlockInit.MOSSY_COBBLED_SERASTONE_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> MOSSY_COBBLED_SERASTONE_SLAB_ITEM = ITEMS.register
            ("mossy_cobbled_serastone_slab", () -> new BlockItem(BlockInit.MOSSY_COBBLED_SERASTONE_SLAB.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    public static final RegistryObject<BlockItem> MOSSY_DEEP_SERASTONE_BLOCK_ITEM = ITEMS.register
            ("mossy_deep_serastone_block", () -> new BlockItem(BlockInit.MOSSY_DEEP_SERASTONE_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> MOSSY_DEEP_SERASTONE_SLAB_ITEM = ITEMS.register
            ("mossy_deep_serastone_slab", () -> new BlockItem(BlockInit.MOSSY_DEEP_SERASTONE_SLAB.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    public static final RegistryObject<BlockItem> MOSSY_SERASTONE_BLOCK_ITEM = ITEMS.register
            ("mossy_serastone_block", () -> new BlockItem(BlockInit.MOSSY_SERASTONE_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> MOSSY_SERASTONE_SLAB_ITEM = ITEMS.register
            ("mossy_serastone_slab", () -> new BlockItem(BlockInit.MOSSY_SERASTONE_SLAB.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    public static final RegistryObject<BlockItem> SERASTONE_BLOCK_ITEM = ITEMS.register
            ("serastone_block", () -> new BlockItem(BlockInit.SERASTONE_BLOCK.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> SERASTONE_SLAB_ITEM = ITEMS.register
            ("serastone_slab", () -> new BlockItem(BlockInit.SERASTONE_SLAB.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    //WOOD BLOCK ITEMS
    public static final RegistryObject<BlockItem> ASHBARK_LOG_ITEM = ITEMS.register
            ("ashbark_log", () -> new BlockItem(BlockInit.ASHBARK_LOG.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> ASHBARK_ITEM = ITEMS.register
            ("ashbark_wood", () -> new BlockItem(BlockInit.ASHBARK_WOOD.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> STRIPPED_ASHBARK_LOG_ITEM = ITEMS.register
            ("stripped_ashbark_log", () -> new BlockItem(BlockInit.STRIPPED_ASHBARK_LOG.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> STRIPPED_ASHBARK_ITEM = ITEMS.register
            ("stripped_ashbark_wood", () -> new BlockItem(BlockInit.STRIPPED_ASHBARK_WOOD.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> ASHBARK_PLANKS_ITEM = ITEMS.register
            ("ashbark_planks", () -> new BlockItem(BlockInit.ASHBARK_PLANKS.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> ASHBARK_LEAVES_ITEM = ITEMS.register
            ("ashbark_leaves", () -> new BlockItem(BlockInit.ASHBARK_LEAVES.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> ASHBARK_SAPLING_ITEM = ITEMS.register
            ("ashbark_sapling", () -> new BlockItem(BlockInit.ASHBARK_SAPLING.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    public static final RegistryObject<BlockItem> ASHBARK_DOOR_ITEM = ITEMS.register
            ("ashbark_door", () -> new DoubleHighBlockItem(BlockInit.ASHBARK_DOOR.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> ASHBARK_SLAB_ITEM = ITEMS.register
            ("ashbark_slab", () -> new BlockItem(BlockInit.ASHBARK_SLAB.get(), new Item.Properties()
            .tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> ASHBARK_PRESSURE_PLATE_ITEM = ITEMS.register
            ("ashbark_pressure_plate", () -> new BlockItem(BlockInit.ASHBARK_PRESSURE_PLATE.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> ASHBARK_FENCE_ITEM = ITEMS.register
            ("ashbark_fence", () -> new BlockItem(BlockInit.ASHBARK_FENCE.get(), new Item.Properties()
            .tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> ASHBARK_TRAPDOOR_ITEM = ITEMS.register
            ("ashbark_trapdoor", () -> new BlockItem(BlockInit.ASHBARK_TRAPDOOR.get(), new Item.Properties()
            .tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> ASHBARK_FENCE_GATE_ITEM = ITEMS.register
            ("ashbark_fence_gate", () -> new BlockItem(BlockInit.ASHBARK_FENCE_GATE.get(), new
            Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> ASHBARK_STAIRS_ITEM = ITEMS.register
            ("ashbark_stairs", () -> new BlockItem(BlockInit.ASHBARK_STAIRS.get(), new Item.Properties()
            .tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> ASHBARK_BUTTON_ITEM = ITEMS.register
            ("ashbark_button", () -> new BlockItem(BlockInit.ASHBARK_BUTTON.get(), new Item.Properties()
            .tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> ASHBARK_SIGN_ITEM = ITEMS.register
            ("ashbark_sign", () -> new SignItem((new Item.Properties()).stacksTo(16).tab
            (DimensionalAdventures.SERAMANIA_TAB), BlockInit.ASHBARK_SIGN.get(), BlockInit.ASHBARK_WALL_SIGN.get()));

    public static final RegistryObject<BlockItem> ASHBARK_PANEL_ITEM = ITEMS.register
            ("ashbark_panel", () -> new BlockItem(BlockInit.ASHBARK_PANEL.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    
    public static final RegistryObject<BlockItem> RED_ASHBARK_LEAVES_ITEM = ITEMS.register
            ("red_ashbark_leaves", () -> new BlockItem(BlockInit.RED_ASHBARK_LEAVES.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    public static final RegistryObject<BlockItem> FEATHER_WOOD_LOG_ITEM = ITEMS.register
            ("feather_wood_log", () -> new BlockItem(BlockInit.FEATHER_WOOD_LOG.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> FEATHER_WOOD_ITEM = ITEMS.register
            ("feather_wood", () -> new BlockItem(BlockInit.FEATHER_WOOD.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> STRIPPED_FEATHER_WOOD_LOG_ITEM = ITEMS.register
            ("stripped_feather_wood_log", () -> new BlockItem(BlockInit.STRIPPED_FEATHER_WOOD_LOG.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> STRIPPED_FEATHER_WOOD_ITEM = ITEMS.register
            ("stripped_feather_wood", () -> new BlockItem(BlockInit.STRIPPED_FEATHER_WOOD.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> FEATHER_WOOD_PLANKS_ITEM = ITEMS.register
            ("feather_wood_planks", () -> new BlockItem(BlockInit.FEATHER_WOOD_PLANKS.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> FEATHER_WOOD_LEAVES_ITEM = ITEMS.register
            ("feather_wood_leaves", () -> new BlockItem(BlockInit.FEATHER_WOOD_LEAVES.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> FEATHER_WOOD_SAPLING_ITEM = ITEMS.register
            ("feather_wood_sapling", () -> new BlockItem(BlockInit.FEATHER_WOOD_SAPLING.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));

    public static final RegistryObject<BlockItem> FEATHER_WOOD_DOOR_ITEM = ITEMS.register
            ("feather_wood_door", () -> new DoubleHighBlockItem(BlockInit.FEATHER_WOOD_DOOR.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> FEATHER_WOOD_SLAB_ITEM = ITEMS.register
            ("feather_wood_slab", () -> new BlockItem(BlockInit.FEATHER_WOOD_SLAB.get(), new Item.Properties()
            .tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> FEATHER_WOOD_PRESSURE_PLATE_ITEM = ITEMS.register
            ("feather_wood_pressure_plate", () -> new BlockItem(BlockInit.FEATHER_WOOD_PRESSURE_PLATE.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> FEATHER_WOOD_FENCE_ITEM = ITEMS.register
            ("feather_wood_fence", () -> new BlockItem(BlockInit.FEATHER_WOOD_FENCE.get(), new Item.Properties()
            .tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> FEATHER_WOOD_TRAPDOOR_ITEM = ITEMS.register
            ("feather_wood_trapdoor", () -> new BlockItem(BlockInit.FEATHER_WOOD_TRAPDOOR.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> FEATHER_WOOD_FENCE_GATE_ITEM = ITEMS.register
            ("feather_wood_fence_gate", () -> new BlockItem(BlockInit.FEATHER_WOOD_FENCE_GATE.get(), new
            Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> FEATHER_WOOD_STAIRS_ITEM = ITEMS.register
            ("feather_wood_stairs", () -> new BlockItem(BlockInit.FEATHER_WOOD_STAIRS.get(), new Item.Properties()
            .tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> FEATHER_WOOD_BUTTON_ITEM = ITEMS.register
            ("feather_wood_button", () -> new BlockItem(BlockInit.FEATHER_WOOD_BUTTON.get(), new Item.Properties()
            .tab(DimensionalAdventures.SERAMANIA_TAB)));
    public static final RegistryObject<BlockItem> FEATHER_WOOD_SIGN_ITEM = ITEMS.register
            ("feather_wood_sign", () -> new SignItem((new Item.Properties()).stacksTo(16).tab
            (DimensionalAdventures.SERAMANIA_TAB), BlockInit.FEATHER_WOOD_SIGN.get(),
            BlockInit.FEATHER_WOOD_WALL_SIGN.get()));

    public static final RegistryObject<BlockItem> FEATHER_WOOD_PANEL_ITEM = ITEMS.register
            ("feather_wood_panel", () -> new BlockItem(BlockInit.FEATHER_WOOD_PANEL.get(),
            new Item.Properties().tab(DimensionalAdventures.SERAMANIA_TAB)));
}
