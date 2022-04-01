package com.hydefy.dimensionaladventures.core.init;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.common.block.*;
import com.hydefy.dimensionaladventures.core.world.features.trees.AshbarkTreeGrower;
import com.hydefy.dimensionaladventures.core.world.features.trees.FeatherWoodTreeGrower;
import com.hydefy.dimensionaladventures.core.world.features.trees.ModWoodType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
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
    public static final RegistryObject<Block> TELEPORTER_BLOCK = BLOCKS.register("teleporter_block",
            () -> new TeleporterBlock(BlockBehaviour.Properties.of(Material.METAL)));

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
    public static final RegistryObject<Block> FEATHER_DIRT_BLOCK = BLOCKS.register("feather_dirt_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_LIGHT_GRAY)
            .strength(0.5f).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> FEATHER_GRASS_BLOCK = BLOCKS.register("feather_grass_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.QUARTZ)
            .strength(0.5f).sound(SoundType.GRASS)));
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

    //STONES
    public static final RegistryObject<Block> COBBLED_SERASTONE_BLOCK = BLOCKS.register
            ("cobbled_serastone_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.STONE, MaterialColor.COLOR_LIGHT_GRAY).strength(2.1f, 7.0f)
            .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBBLED_SERASTONE_SLAB = BLOCKS.register
            ("cobbled_serastone_slab", () -> new SlabBlock(BlockBehaviour.Properties.of
            (Material.STONE, MaterialColor.COLOR_LIGHT_GRAY).strength(2.1F, 7.0F)
            .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEP_SERASTONE_BLOCK = BLOCKS.register
            ("deep_serastone_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.STONE, MaterialColor.DEEPSLATE).strength(4.0f, 30.0f)
            .sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEP_SERASTONE_SLAB = BLOCKS.register
            ("deep_serastone_slab", () -> new SlabBlock(BlockBehaviour.Properties.of
            (Material.STONE, MaterialColor.DEEPSLATE).strength(4.0F, 30.0F)
            .sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_COBBLED_SERASTONE_BLOCK = BLOCKS.register
            ("mossy_cobbled_serastone_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.STONE, MaterialColor.COLOR_LIGHT_GRAY).strength(2.1f, 7.0f)
            .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_COBBLED_SERASTONE_SLAB = BLOCKS.register
            ("mossy_cobbled_serastone_slab", () -> new SlabBlock(BlockBehaviour.Properties.of
            (Material.STONE, MaterialColor.COLOR_LIGHT_GRAY).strength(2.1F, 7.0F)
            .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_DEEP_SERASTONE_BLOCK = BLOCKS.register
            ("mossy_deep_serastone_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.STONE, MaterialColor.DEEPSLATE).strength(4.0f, 30.0f)
            .sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_DEEP_SERASTONE_SLAB = BLOCKS.register
            ("mossy_deep_serastone_slab", () -> new SlabBlock(BlockBehaviour.Properties.of
            (Material.STONE, MaterialColor.DEEPSLATE).strength(4.0F, 30.0F)
            .sound(SoundType.ANCIENT_DEBRIS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MOSSY_SERASTONE_BLOCK = BLOCKS.register
            ("mossy_serastone_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.STONE, MaterialColor.COLOR_LIGHT_GRAY).strength(2.1f, 7.0f)
            .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSSY_SERASTONE_SLAB = BLOCKS.register
            ("mossy_serastone_slab", () -> new SlabBlock(BlockBehaviour.Properties.of
            (Material.STONE, MaterialColor.COLOR_LIGHT_GRAY).strength(2.1F, 7.0F)
            .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SERASTONE_BLOCK = BLOCKS.register
            ("serastone_block",() -> new Block(BlockBehaviour.Properties.of
            (Material.STONE, MaterialColor.COLOR_LIGHT_GRAY).strength(2.1f, 7.0f)
            .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SERASTONE_SLAB = BLOCKS.register
            ("serastone_slab", () -> new SlabBlock(BlockBehaviour.Properties.of
            (Material.STONE, MaterialColor.COLOR_LIGHT_GRAY).strength(2.1F, 7.0F)
            .sound(SoundType.DRIPSTONE_BLOCK).requiresCorrectToolForDrops()));

    //WOODS
    public static final RegistryObject<Block> ASHBARK_LOG =  BLOCKS.register("ashbark_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> ASHBARK_WOOD =  BLOCKS.register("ashbark_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_ASHBARK_LOG =  BLOCKS.register("stripped_ashbark_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ASHBARK_WOOD =  BLOCKS.register("stripped_ashbark_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> ASHBARK_PLANKS =  BLOCKS.register("ashbark_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
    public static final RegistryObject<Block> ASHBARK_LEAVES = BLOCKS.register("ashbark_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> ASHBARK_SAPLING = BLOCKS.register("ashbark_sapling",
            () -> new SaplingBlock(new AshbarkTreeGrower(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_SAPLING)
            .sound(SoundType.BAMBOO_SAPLING).lightLevel((p_50872_) -> 8)));
    public static final RegistryObject<Block> POTTED_ASHBARK_SAPLING = BLOCKS.register("potted_ashbark_sapling",
            () -> new FlowerPotBlock(null, BlockInit.ASHBARK_SAPLING, BlockBehaviour.Properties.copy
            (Blocks.POTTED_DANDELION).noOcclusion().lightLevel((p_50872_) -> 8)));

    public static final RegistryObject<Block> ASHBARK_DOOR = BLOCKS.register("ashbark_door", () -> new DoorBlock
            (BlockBehaviour.Properties.of(Material.NETHER_WOOD, Blocks.CRIMSON_PLANKS.defaultMaterialColor())
            .strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> ASHBARK_SLAB = BLOCKS.register("ashbark_slab", () -> new SlabBlock
            (BlockBehaviour.Properties.of(Material.NETHER_WOOD, Blocks.CRIMSON_PLANKS.defaultMaterialColor()).strength
            (2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ASHBARK_PRESSURE_PLATE = BLOCKS.register("ashbark_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of
            (Material.NETHER_WOOD, Blocks.CRIMSON_PLANKS.defaultMaterialColor()).noCollission().strength(0.5F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ASHBARK_FENCE = BLOCKS.register("ashbark_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD, Blocks.CRIMSON_PLANKS
            .defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ASHBARK_TRAPDOOR = BLOCKS.register("ashbark_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD, Blocks.CRIMSON_PLANKS
            .defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
            //.isValidSpawn(Blocks::never)));
    public static final RegistryObject<Block> ASHBARK_FENCE_GATE = BLOCKS.register("ashbark_fence_gate", () ->
            new FenceGateBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD, Blocks.CRIMSON_PLANKS
            .defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ASHBARK_STAIRS = BLOCKS.register("ashbark_stairs", () -> new
            StairBlock(Blocks.CRIMSON_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy
            (Blocks.CRIMSON_PLANKS)));
    public static final RegistryObject<Block> ASHBARK_BUTTON = BLOCKS.register("ashbark_button", () -> new
            WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ASHBARK_SIGN = BLOCKS.register("ashbark_sign", () -> new
            ModStandingSignBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD, Blocks.CRIMSON_PLANKS
            .defaultMaterialColor()).noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.ASHBARK));
    public static final RegistryObject<Block> ASHBARK_WALL_SIGN = BLOCKS.register("ashbark_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD, Blocks.CRIMSON_PLANKS
            .defaultMaterialColor()).noCollission().strength(1.0F).sound(SoundType.WOOD)
            .dropsLike(ASHBARK_SIGN.get()), ModWoodType.ASHBARK));

    public static final RegistryObject<Block> ASHBARK_PANEL = BLOCKS.register("ashbark_panel",
            () -> new ModPanelBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.CRIMSON_PLANKS
            .defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
            //.isValidSpawn(Blocks::never)));
    
    public static final RegistryObject<Block> RED_ASHBARK_LEAVES = BLOCKS.register("red_ashbark_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    
    public static final RegistryObject<Block> FEATHER_WOOD_LOG =  BLOCKS.register("feather_wood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> FEATHER_WOOD =  BLOCKS.register("feather_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_FEATHER_WOOD_LOG =  BLOCKS.register("stripped_feather_wood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_FEATHER_WOOD =  BLOCKS.register("stripped_feather_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> FEATHER_WOOD_PLANKS =  BLOCKS.register("feather_wood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            });
    public static final RegistryObject<Block> FEATHER_WOOD_LEAVES = BLOCKS.register("feather_wood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            });
    public static final RegistryObject<Block> FEATHER_WOOD_SAPLING = BLOCKS.register("feather_wood_sapling",
            () -> new SaplingBlock(new FeatherWoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_SAPLING)));

    public static final RegistryObject<Block> FEATHER_WOOD_DOOR = BLOCKS.register("feather_wood_door", () ->
            new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_PLANKS.defaultMaterialColor())
            .strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
    public static final RegistryObject<Block> FEATHER_WOOD_SLAB = BLOCKS.register("feather_wood_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_PLANKS.defaultMaterialColor()).strength
            (2.0F, 3.0F).sound(SoundType.WOOD)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            });
    public static final RegistryObject<Block> FEATHER_WOOD_PRESSURE_PLATE = BLOCKS.register
            ("feather_wood_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING
            , BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_PLANKS.defaultMaterialColor()).noCollission()
            .strength(0.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FEATHER_WOOD_FENCE = BLOCKS.register("feather_wood_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_PLANKS
            .defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FEATHER_WOOD_TRAPDOOR = BLOCKS.register("feather_wood_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_PLANKS
            .defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
            //.isValidSpawn(Blocks::never)));
    public static final RegistryObject<Block> FEATHER_WOOD_FENCE_GATE = BLOCKS.register("feather_wood_fence_gate"
            , () ->new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_PLANKS
            .defaultMaterialColor()).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FEATHER_WOOD_STAIRS = BLOCKS.register("feather_wood_stairs",
            () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy
            (Blocks.OAK_PLANKS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            });
    public static final RegistryObject<Block> FEATHER_WOOD_BUTTON = BLOCKS.register("feather_wood_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FEATHER_WOOD_SIGN = BLOCKS.register("feather_wood_sign", () -> new
            ModStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_PLANKS
            .defaultMaterialColor()).noCollission().strength(1.0F).sound(SoundType.WOOD), ModWoodType.ASHBARK));
    public static final RegistryObject<Block> FEATHER_WOOD_WALL_SIGN = BLOCKS.register("feather_wood_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_PLANKS
            .defaultMaterialColor()).noCollission().strength(1.0F).sound(SoundType.WOOD)
            .dropsLike(FEATHER_WOOD_SIGN.get()), ModWoodType.FEATHER));

    public static final RegistryObject<Block> FEATHER_WOOD_PANEL = BLOCKS.register("feather_wood_panel",
            () -> new ModPanelBlock(BlockBehaviour.Properties.of(Material.WOOD, Blocks.OAK_PLANKS
            .defaultMaterialColor()).strength(3.0F).sound(SoundType.WOOD).noOcclusion()));
            //.isValidSpawn(Blocks::never)));
}
