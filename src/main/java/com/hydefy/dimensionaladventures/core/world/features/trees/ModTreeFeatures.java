package com.hydefy.dimensionaladventures.core.world.features.trees;

import com.google.common.collect.ImmutableList;
import com.hydefy.dimensionaladventures.core.init.BlockInit;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaPineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.PineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModTreeFeatures {
    public static final ConfiguredFeature<TreeConfiguration, ?> FEATHER1 = FeatureUtils.register("feather1", Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BlockInit.FEATHER_WOOD_LOG.get()), new StraightTrunkPlacer(5, 2, 1), BlockStateProvider.simple(BlockInit.FEATHER_WOOD_LEAVES.get()), new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2)), new TwoLayersFeatureSize(2, 0, 2))).ignoreVines().build()));
    public static final ConfiguredFeature<TreeConfiguration, ?> FEATHER2 = FeatureUtils.register("feather2", Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BlockInit.FEATHER_WOOD_LOG.get()), new StraightTrunkPlacer(6, 4, 0), BlockStateProvider.simple(BlockInit.FEATHER_WOOD_LEAVES.get()), new PineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(3, 4)), new TwoLayersFeatureSize(2, 0, 2))).ignoreVines().build()));
    public static final ConfiguredFeature<TreeConfiguration, ?> MEGA_FEATHER1 = FeatureUtils.register("mega_feather1", Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BlockInit.FEATHER_WOOD_LOG.get()), new GiantTrunkPlacer(13, 2, 14), BlockStateProvider.simple(BlockInit.FEATHER_WOOD_LEAVES.get()), new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(13, 17)), new TwoLayersFeatureSize(1, 1, 2))).decorators(ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(BlockInit.FEATHER_GRASS_BLOCK.get())))).build()));
    public static final ConfiguredFeature<TreeConfiguration, ?> MEGA_FEATHER2 = FeatureUtils.register("mega_feather2", Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BlockInit.FEATHER_WOOD_LOG.get()), new GiantTrunkPlacer(13, 2, 14), BlockStateProvider.simple(BlockInit.FEATHER_WOOD_LEAVES.get()), new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(3, 7)), new TwoLayersFeatureSize(1, 1, 2))).decorators(ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(BlockInit.FEATHER_GRASS_BLOCK.get())))).build()));

    public static final ConfiguredFeature<TreeConfiguration, ?> ASHBARK1 = FeatureUtils.register("ashbark1", Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BlockInit.ASHBARK_LOG.get()), new StraightTrunkPlacer(5, 2, 1), BlockStateProvider.simple(BlockInit.ASHBARK_LEAVES.get()), new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2)), new TwoLayersFeatureSize(2, 0, 2))).ignoreVines().build()));
    public static final ConfiguredFeature<TreeConfiguration, ?> ASHBARK2 = FeatureUtils.register("ashbark2", Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BlockInit.ASHBARK_LOG.get()), new StraightTrunkPlacer(6, 4, 0), BlockStateProvider.simple(BlockInit.ASHBARK_LEAVES.get()), new PineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(3, 4)), new TwoLayersFeatureSize(2, 0, 2))).ignoreVines().build()));
    public static final ConfiguredFeature<TreeConfiguration, ?> MEGA_ASHBARK1 = FeatureUtils.register("mega_ashbark1", Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BlockInit.ASHBARK_LOG.get()), new GiantTrunkPlacer(13, 2, 14), BlockStateProvider.simple(BlockInit.ASHBARK_LEAVES.get()), new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(13, 17)), new TwoLayersFeatureSize(1, 1, 2))).decorators(ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(Blocks.MAGMA_BLOCK)))).build()));
    public static final ConfiguredFeature<TreeConfiguration, ?> MEGA_ASHBARK2 = FeatureUtils.register("mega_ashbark2", Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BlockInit.ASHBARK_LOG.get()), new GiantTrunkPlacer(13, 2, 14), BlockStateProvider.simple(BlockInit.ASHBARK_LEAVES.get()), new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(3, 7)), new TwoLayersFeatureSize(1, 1, 2))).decorators(ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(Blocks.MAGMA_BLOCK)))).build()));

    public static final ConfiguredFeature<TreeConfiguration, ?> RED_ASHBARK1 = FeatureUtils.register("red_ashbark1", Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BlockInit.ASHBARK_LOG.get()), new StraightTrunkPlacer(5, 2, 1), BlockStateProvider.simple(BlockInit.RED_ASHBARK_LEAVES.get()), new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2)), new TwoLayersFeatureSize(2, 0, 2))).ignoreVines().build()));
    public static final ConfiguredFeature<TreeConfiguration, ?> RED_ASHBARK2 = FeatureUtils.register("red_ashbark2", Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(BlockInit.ASHBARK_LOG.get()), new StraightTrunkPlacer(6, 4, 0), BlockStateProvider.simple(BlockInit.RED_ASHBARK_LEAVES.get()), new PineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(3, 4)), new TwoLayersFeatureSize(2, 0, 2))).ignoreVines().build()));
}
