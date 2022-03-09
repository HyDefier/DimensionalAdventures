package com.hydefy.dimensionaladventures.core.world.features;

import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;

public class ModDefaultFeatures {

    public static void addModFeatherwoodTrees(BiomeGenerationSettings.Builder p_126839_) {
        p_126839_.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.FEATHER_TREES_PLAINS);
    }
    public static void addModAshbarkTrees(BiomeGenerationSettings.Builder p_126839_) {
        p_126839_.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ASHBARK_TREES_FOREST);
    }
    public static void addModAshbarkFallTrees(BiomeGenerationSettings.Builder p_126839_) {
        p_126839_.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModVegetationPlacements.ASHBARK_TREES_FALL_FOREST);
    }
}
