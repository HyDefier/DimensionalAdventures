package com.hydefy.dimensionaladventures.core.world.features;

import com.hydefy.dimensionaladventures.core.init.BlockInit;
import com.hydefy.dimensionaladventures.core.init.FeatureInit;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.MiscOverworldFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.BlockStateConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModTerrainFeatures {
    public static final ConfiguredFeature<BlockStateConfiguration, ?> ISLAND = FeatureUtils.register("island", FeatureInit.FLOATING_ISLAND.get().configured(new BlockStateConfiguration(BlockInit.SERASTONE_BLOCK.get().defaultBlockState())));
    public static final ConfiguredFeature<BlockStateConfiguration, ?> HOT_ISLAND = FeatureUtils.register("hot_island", FeatureInit.FLOATING_HOT_ISLAND.get().configured(new BlockStateConfiguration(BlockInit.DEEP_SERASTONE_BLOCK.get().defaultBlockState())));
}
