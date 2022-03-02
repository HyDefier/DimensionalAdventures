package com.hydefy.dimensionaladventures.core.world.features;

import net.minecraft.data.worldgen.Carvers;
import net.minecraft.data.worldgen.placement.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;

public class ModDefaultFeatures {
//    public static void addModDefaultCarversAndLakes(BiomeGenerationSettings.Builder builder) {
//
//    }
//
//    public static void addModDefaultMonsterRoom(BiomeGenerationSettings.Builder builder) {
//    }
//
//    public static void addModDefaultUndergroundVariety(BiomeGenerationSettings.Builder builder) {
//    }
//
//    public static void addModDefaultOres(BiomeGenerationSettings.Builder builder) {
//        addModDefaultOres(builder, false);
//    }
//
//    public static void addModDefaultOres(BiomeGenerationSettings.Builder builder, boolean more_scrap) {
//        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OrePlacements.ORE_COAL_UPPER);
//    }

//    public static void addModExtraGold(BiomeGenerationSettings.Builder p_126817_) {
//        p_126817_.addModFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OrePlacements.ORE_GOLD_EXTRA);
//    }


//    public static void addModInfestedStone(BiomeGenerationSettings.Builder p_126821_) {
//        p_126821_.addModFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, OrePlacements.ORE_INFESTED);
//    }

//    public static void addModDefaultSoftDisks(BiomeGenerationSettings.Builder p_126823_) {
//        p_126823_.addModFeature(GenerationStep.Decoration.UNDERGROUND_ORES, MiscOverworldPlacements.DISK_SAND);
//        p_126823_.addModFeature(GenerationStep.Decoration.UNDERGROUND_ORES, MiscOverworldPlacements.DISK_CLAY);
//        p_126823_.addModFeature(GenerationStep.Decoration.UNDERGROUND_ORES, MiscOverworldPlacements.DISK_GRAVEL);
//    }


//    public static void addModRareBerryBushes(BiomeGenerationSettings.Builder p_194736_) {
//        p_194736_.addModFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_BERRY_RARE);
//    }

//    public static void addModCommonBerryBushes(BiomeGenerationSettings.Builder p_194738_) {
//        p_194738_.addModFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_BERRY_COMMON);
//    }

//    public static void addModLightBambooVegetation(BiomeGenerationSettings.Builder p_126835_) {
//        p_126835_.addModFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.BAMBOO_LIGHT);
//    }

//    public static void addModBambooVegetation(BiomeGenerationSettings.Builder p_126837_) {
//        p_126837_.addModFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.BAMBOO);
//        p_126837_.addModFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.BAMBOO_VEGETATION);
//    }

//    public static void addModTaigaTrees(BiomeGenerationSettings.Builder p_126839_) {
//        p_126839_.addModFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_TAIGA);
//    }

//    public static void addModGroveTrees(BiomeGenerationSettings.Builder p_194740_) {
//        p_194740_.addModFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_GROVE);
//    }
//
//    public static void addModWaterTrees(BiomeGenerationSettings.Builder p_126841_) {
//        p_126841_.addModFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_WATER);
//    }


//    public static void addModLushCavesVegetationFeatures(BiomeGenerationSettings.Builder p_176851_) {
//        p_176851_.addModFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.LUSH_CAVES_CEILING_VEGETATION);
//        p_176851_.addModFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.CAVE_VINES);
//        p_176851_.addModFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.LUSH_CAVES_CLAY);
//        p_176851_.addModFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.LUSH_CAVES_VEGETATION);
//        p_176851_.addModFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.ROOTED_AZALEA_TREE);
//        p_176851_.addModFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.SPORE_BLOSSOM);
//        p_176851_.addModFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CavePlacements.CLASSIC_VINES);
//    }

//    public static void addModLushCavesSpecialOres(BiomeGenerationSettings.Builder p_176853_) {
//        p_176853_.addModFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OrePlacements.ORE_CLAY);
//    }


//    public static void addModForestFlowers(BiomeGenerationSettings.Builder p_126707_) {
//        p_126707_.addModFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.FOREST_FLOWERS);
//    }

//    public static void addModJungleMelons(BiomeGenerationSettings.Builder p_198930_) {
//        p_198930_.addModFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_MELON);
//    }

//    public static void addModAncientDebris(BiomeGenerationSettings.Builder p_126776_) {
//        p_126776_.addModFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, OrePlacements.ORE_ANCIENT_DEBRIS_LARGE);
//        p_126776_.addModFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, OrePlacements.ORE_ANCIENT_DEBRIS_SMALL);
//    }

//    public static void farmAnimals(MobSpawnSettings.Builder p_126735_) {
//        p_126735_.addModSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
//        p_126735_.addModSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
//        p_126735_.addModSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
//        p_126735_.addModSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
//    }
//
//    public static void caveSpawns(MobSpawnSettings.Builder p_176860_) {
//        p_176860_.addModSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
//        p_176860_.addModSpawn(MobCategory.UNDERGROUND_WATER_CREATURE, new MobSpawnSettings.SpawnerData(EntityType.GLOW_SQUID, 10, 4, 6));
//    }
//
//    public static void commonSpawns(MobSpawnSettings.Builder p_126789_) {
//        caveSpawns(p_126789_);
//        monsters(p_126789_, 95, 5, 100, false);
//    }
//
//    public static void oceanSpawns(MobSpawnSettings.Builder p_126741_, int p_126742_, int p_126743_, int p_126744_) {
//        p_126741_.addModSpawn(MobCategory.WATER_CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SQUID, p_126742_, 1, p_126743_));
//        p_126741_.addModSpawn(MobCategory.WATER_AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.COD, p_126744_, 3, 6));
//        commonSpawns(p_126741_);
//        p_126741_.addModSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.DROWNED, 5, 1, 1));
//    }
//
//    public static void plainsSpawns(MobSpawnSettings.Builder p_126793_) {
//        farmAnimals(p_126793_);
//        p_126793_.addModSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.HORSE, 5, 2, 6));
//        p_126793_.addModSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.DONKEY, 1, 1, 3));
//        commonSpawns(p_126793_);
//    }
//
//    public static void snowySpawns(MobSpawnSettings.Builder p_126797_) {
//        p_126797_.addModSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 10, 2, 3));
//        p_126797_.addModSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.POLAR_BEAR, 1, 1, 2));
//        caveSpawns(p_126797_);
//        monsters(p_126797_, 95, 5, 20, false);
//        p_126797_.addModSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 80, 4, 4));
//    }
//
//    public static void desertSpawns(MobSpawnSettings.Builder p_126801_) {
//        p_126801_.addModSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 4, 2, 3));
//        caveSpawns(p_126801_);
//        monsters(p_126801_, 19, 1, 100, false);
//        p_126801_.addModSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.HUSK, 80, 4, 4));
//    }
//
//    public static void dripstoneCavesSpawns(MobSpawnSettings.Builder p_194734_) {
//        caveSpawns(p_194734_);
//        int i = 95;
//        monsters(p_194734_, 95, 5, 100, false);
//        p_194734_.addModSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.DROWNED, 95, 4, 4));
//    }
//
//    public static void monsters(MobSpawnSettings.Builder p_194726_, int p_194727_, int p_194728_, int p_194729_, boolean p_194730_) {
//        p_194726_.addModSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
//        p_194726_.addModSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(p_194730_ ? EntityType.DROWNED : EntityType.ZOMBIE, p_194727_, 4, 4));
//        p_194726_.addModSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, p_194728_, 1, 1));
//        p_194726_.addModSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, p_194729_, 4, 4));
//        p_194726_.addModSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
//        p_194726_.addModSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
//        p_194726_.addModSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
//        p_194726_.addModSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));
//    }
//
//    public static void baseJungleSpawns(MobSpawnSettings.Builder p_126809_) {
//        farmAnimals(p_126809_);
//        p_126809_.addModSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
//        commonSpawns(p_126809_);
//    }
//    public static void endSpawns(MobSpawnSettings.Builder p_126813_) {
//        p_126813_.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 4, 4));
//    }
}
