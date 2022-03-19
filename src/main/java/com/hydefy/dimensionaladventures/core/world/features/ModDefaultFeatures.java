package com.hydefy.dimensionaladventures.core.world.features;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.MobSpawnSettings;
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

    public static void illagerSpawns(MobSpawnSettings.Builder builder) {
        builder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.PILLAGER, 10, 5, 6));
        builder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ILLUSIONER, 4, 0, 1));
        builder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.VINDICATOR, 15, 3, 4));
        builder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.RAVAGER, 5, 0, 1));
        builder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.EVOKER, 5, 1, 2));
        builder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 0, 4));
    }

    public static void drownedSpawns(MobSpawnSettings.Builder builder) {
        builder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.DROWNED, 15, 0, 4));
    }
}
