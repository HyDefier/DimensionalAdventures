package com.hydefy.dimensionaladventures.core.init;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.common.block.FeathererEggBlock;
import com.hydefy.dimensionaladventures.common.block.GizzardSeedCrop;
import com.hydefy.dimensionaladventures.common.block.HealingStationBlock;
import com.hydefy.dimensionaladventures.common.block.SteelScrapBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class BlockInit {

    private BlockInit() {}

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            DimensionalAdventures.MODID);

    //ADVANCED BLOCKS
    public static final RegistryObject<HealingStationBlock> HEALING_STATION = BLOCKS.register
            ("healing_station_block", () -> new HealingStationBlock(BlockBehaviour.Properties.of(Material.WOOD,
            MaterialColor.QUARTZ).strength(0.1f, 1.5f)));
    public static final RegistryObject<SteelScrapBlock> STEEL_SCRAP_BLOCK = BLOCKS.register
            ("steel_scrap_block", () -> new SteelScrapBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL,
            MaterialColor.TERRACOTTA_BLACK).strength(0.5f, 1.5f)
            .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));

    //BLOCK ENTITY BLOCKS
    public static final RegistryObject<FeathererEggBlock> FEATHERER_EGG_BLOCK = BLOCKS.register
            ("featherer_egg_block", () -> new FeathererEggBlock(BlockBehaviour.Properties.of(Material.EGG,
            MaterialColor.QUARTZ).strength(0.5f, 0.7f).sound(SoundType.BONE_BLOCK)));

    //CROP BLOCKS
    public static final RegistryObject<GizzardSeedCrop> GIZZARD_SEED_CROP = BLOCKS.register
            ("gizzard_seed_crop", () -> new GizzardSeedCrop(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    //NORMAL BLOCKS
    public static final RegistryObject<Block> BLACK_SMOOTH_FEATHER_BLOCK = BLOCKS.register
            ("black_smooth_feather_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.WOOL, MaterialColor.COLOR_BLACK).strength(0.7f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> BLUE_SMOOTH_FEATHER_BLOCK = BLOCKS.register
            ("blue_smooth_feather_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.WOOL, MaterialColor.COLOR_BLUE).strength(0.7f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> BROWN_SMOOTH_FEATHER_BLOCK = BLOCKS.register
            ("brown_smooth_feather_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.WOOL, MaterialColor.COLOR_BROWN).strength(0.7f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> CHICKEN_COMB_BLOCK = BLOCKS.register("chicken_comb_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SPONGE, MaterialColor.COLOR_RED)
            .strength(0.7f, 0.8f).sound(SoundType.STEM)));
    public static final RegistryObject<Block> CYAN_SMOOTH_FEATHER_BLOCK = BLOCKS.register
            ("cyan_smooth_feather_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.WOOL, MaterialColor.COLOR_CYAN).strength(0.7f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> EGGSHELL_BLOCK = BLOCKS.register("eggshell_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.EGG, MaterialColor.QUARTZ)
            .strength(0.9f, 0.5f).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> FEATHER_BLOCK = BLOCKS.register("feather_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.TERRACOTTA_WHITE)
            .strength(0.6f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> GIZZARD_SEED_BLOCK = BLOCKS.register("gizzard_seed_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.VEGETABLE, MaterialColor.COLOR_RED)
            .strength(0.5f, 1.0f).sound(SoundType.BAMBOO_SAPLING)));
    public static final RegistryObject<Block> GRAY_SMOOTH_FEATHER_BLOCK = BLOCKS.register
            ("gray_smooth_feather_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.WOOL, MaterialColor.COLOR_GRAY).strength(0.7f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> GREEN_SMOOTH_FEATHER_BLOCK = BLOCKS.register
            ("green_smooth_feather_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.WOOL, MaterialColor.COLOR_GREEN).strength(0.7f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> LIGHT_BLUE_SMOOTH_FEATHER_BLOCK = BLOCKS.register
            ("light_blue_smooth_feather_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.WOOL, MaterialColor.COLOR_LIGHT_BLUE).strength(0.7f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> LIGHT_GRAY_SMOOTH_FEATHER_BLOCK = BLOCKS.register
            ("light_gray_smooth_feather_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.WOOL, MaterialColor.COLOR_LIGHT_GRAY).strength(0.7f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> LIME_SMOOTH_FEATHER_BLOCK = BLOCKS.register
            ("lime_smooth_feather_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.WOOL, MaterialColor.COLOR_LIGHT_GREEN).strength(0.7f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> MAGENTA_SMOOTH_FEATHER_BLOCK = BLOCKS.register
            ("magenta_smooth_feather_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.WOOL, MaterialColor.COLOR_MAGENTA).strength(0.7f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> ORANGE_SMOOTH_FEATHER_BLOCK = BLOCKS.register
            ("orange_smooth_feather_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.WOOL, MaterialColor.COLOR_ORANGE).strength(0.7f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PINK_SMOOTH_FEATHER_BLOCK = BLOCKS.register
            ("pink_smooth_feather_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.WOOL, MaterialColor.COLOR_PINK).strength(0.7f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> PURPLE_SMOOTH_FEATHER_BLOCK = BLOCKS.register
            ("purple_smooth_feather_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.WOOL, MaterialColor.COLOR_PURPLE).strength(0.7f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> RED_EGG_BLOCK = BLOCKS.register("red_egg_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.EGG, MaterialColor.COLOR_RED)
            .strength(0.3f, 0.8f).sound(SoundType.BONE_BLOCK)));
    public static final RegistryObject<Block> RED_SMOOTH_FEATHER_BLOCK = BLOCKS.register
            ("red_smooth_feather_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.WOOL, MaterialColor.COLOR_RED).strength(0.7f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> SMOOTH_FEATHER_BLOCK = BLOCKS.register
            ("smooth_feather_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.WOOL, MaterialColor.TERRACOTTA_WHITE).strength(0.7f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> WHITE_SMOOTH_FEATHER_BLOCK = BLOCKS.register
            ("white_smooth_feather_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.WOOL, MaterialColor.QUARTZ).strength(0.7f).sound(SoundType.WOOL)));
    public static final RegistryObject<Block> YELLOW_SMOOTH_FEATHER_BLOCK = BLOCKS.register
            ("yellow_smooth_feather_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.WOOL, MaterialColor.GOLD).strength(0.7f).sound(SoundType.WOOL)));
}
