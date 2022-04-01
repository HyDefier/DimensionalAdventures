package com.hydefy.dimensionaladventures.core.world.features;

import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModTerrainPlacements {
    public static final PlacedFeature ISLAND = PlacementUtils.register("island", ModTerrainFeatures.ISLAND.placed(RarityFilter.onAverageOnceEvery(200), InSquarePlacement.spread(), BiomeFilter.biome()));
    public static final PlacedFeature HOT_ISLAND = PlacementUtils.register("hot_island", ModTerrainFeatures.HOT_ISLAND.placed(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), BiomeFilter.biome()));

}
