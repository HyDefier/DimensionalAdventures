package com.hydefy.dimensionaladventures.core.world.features;

import com.hydefy.dimensionaladventures.core.world.features.trees.ModTreePlacements;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;

import java.util.List;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class ModVegetationFeatures {
    public static final ConfiguredFeature<RandomFeatureConfiguration, ?> FEATHER_TREES_PLAINS = FeatureUtils.register("feather_trees_plains", Feature.RANDOM_SELECTOR.configured(new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(ModTreePlacements.FEATHER_WOOD_CHECKED1, 0.33333334F)), ModTreePlacements.FEATHER_WOOD_CHECKED2)));
    public static final ConfiguredFeature<RandomFeatureConfiguration, ?> ASHBARK_TREES_FOREST = FeatureUtils.register("ashbark_trees_forest", Feature.RANDOM_SELECTOR.configured(new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(ModTreePlacements.ASHBARK_CHECKED1, 0.33333334F)), ModTreePlacements.ASHBARK_CHECKED2)));
    public static final ConfiguredFeature<RandomFeatureConfiguration, ?> ASHBARK_TREES_FALL_FOREST = FeatureUtils.register("ashbark_trees_fall_forest", Feature.RANDOM_SELECTOR.configured(new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(ModTreePlacements.RED_ASHBARK_CHECKED1, 0.25F), new WeightedPlacedFeature(ModTreePlacements.RED_ASHBARK_CHECKED2, 0.25F), new WeightedPlacedFeature(ModTreePlacements.ASHBARK_CHECKED1, 0.25F)), ModTreePlacements.ASHBARK_CHECKED2)));
}
