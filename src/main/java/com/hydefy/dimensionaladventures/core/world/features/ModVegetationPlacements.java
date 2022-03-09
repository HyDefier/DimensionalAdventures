package com.hydefy.dimensionaladventures.core.world.features;

import net.minecraft.core.BlockPos;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.placement.*;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.TREE_THRESHOLD;

public class ModVegetationPlacements {
    public static final PlacedFeature FEATHER_TREES_PLAINS = PlacementUtils.register("feather_trees_plains", ModVegetationFeatures.FEATHER_TREES_PLAINS.placed(PlacementUtils.countExtra(0, 0.05F, 1), InSquarePlacement.spread(), TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(), BlockPos.ZERO)), BiomeFilter.biome()));
    public static final PlacedFeature ASHBARK_TREES_FOREST = PlacementUtils.register("ashbark_trees_forest", ModVegetationFeatures.ASHBARK_TREES_FOREST.placed(PlacementUtils.countExtra(10, 0.1F, 1), InSquarePlacement.spread(), TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(), BlockPos.ZERO)), BiomeFilter.biome()));
    public static final PlacedFeature ASHBARK_TREES_FALL_FOREST = PlacementUtils.register("ashbark_trees_fall_forest", ModVegetationFeatures.ASHBARK_TREES_FALL_FOREST.placed(PlacementUtils.countExtra(10, 0.1F, 1), InSquarePlacement.spread(), TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(), BlockPos.ZERO)), BiomeFilter.biome()));
}
