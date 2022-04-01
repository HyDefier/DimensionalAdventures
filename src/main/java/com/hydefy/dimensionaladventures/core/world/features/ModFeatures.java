package com.hydefy.dimensionaladventures.core.world.features;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;

public class ModFeatures {

    //SPAWNS
    public static void illagerSpawns(MobSpawnSettings.Builder builder) {
        builder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.PILLAGER, 2, 5, 6));
        builder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ILLUSIONER, 1, 0, 1));
        builder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.VINDICATOR, 1, 3, 4));
        builder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.RAVAGER, 1, 0, 1));
        builder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.EVOKER, 1, 1, 2));
        builder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 1, 0, 4));
    }

    public static void waterSpawns(MobSpawnSettings.Builder builder) {
        builder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.DROWNED, 3, 1, 4));
        builder.addSpawn(MobCategory.WATER_CREATURE, new MobSpawnSettings.SpawnerData(EntityType.GLOW_SQUID, 1, 1, 4));
        builder.addSpawn(MobCategory.WATER_CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SQUID, 1, 1, 4));
        builder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PARROT, 15, 1, 4));
    }

    public static void endSpawns(MobSpawnSettings.Builder builder) {
        builder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 3, 0, 4));
        builder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMITE, 1, 0, 4));
    }

    //TERRAIN
    public static void addFloatingIslands(BiomeGenerationSettings.Builder builder) {
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, ModTerrainPlacements.ISLAND);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, ModTerrainPlacements.HOT_ISLAND);
    }

    //TREES
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
