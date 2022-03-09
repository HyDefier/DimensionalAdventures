package com.hydefy.dimensionaladventures.core.world.biome;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.core.init.ItemInit;
import com.hydefy.dimensionaladventures.core.world.features.ModDefaultFeatures;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.biome.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SeramaniaBiomes {
    public static final DeferredRegister<Biome> BIOMES =
            DeferredRegister.create(ForgeRegistries.BIOMES, DimensionalAdventures.MODID);

    public static final RegistryObject<Biome> FADED_FIELDS = BIOMES.register("faded_fields",
            SeramaniaBiomes::createFadedFields);

    private static Biome createFadedFields() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder();
        BiomeDefaultFeatures.endSpawns(spawnSettings);
        BiomeDefaultFeatures.farmAnimals(spawnSettings);
        BiomeDefaultFeatures.monsters(spawnSettings, 95, 5, 100, true);

        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder();
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(generationSettings);

        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        return (new Biome.BiomeBuilder()).precipitation(Biome.Precipitation.SNOW).biomeCategory(Biome.BiomeCategory.PLAINS)
                .temperature(0.8F).downfall(0.4F)
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0xA8CAC5).waterFogColor(0xD3E4E2)
                        .fogColor(0xB6E7C8).skyColor(0xB6E7C8).grassColorOverride(0xB6E7C8)
                        //.ambientParticle(new AmbientParticleSettings(ParticleTypes.FIREWORK, 0.118093334F))
                        .build()).mobSpawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build()).build();
    }

    public static final RegistryObject<Biome> FEATHER_FIELDS = BIOMES.register("feather_fields",
            SeramaniaBiomes::createFeatherFields);

    private static Biome createFeatherFields() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder();
        BiomeDefaultFeatures.endSpawns(spawnSettings);
        BiomeDefaultFeatures.farmAnimals(spawnSettings);
        BiomeDefaultFeatures.monsters(spawnSettings, 95, 5, 100, true);

        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder();
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(generationSettings);

        ModDefaultFeatures.addModFeatherwoodTrees(generationSettings);
//        BiomeDefaultFeatures.addDefaultOres(generationSettings);
//        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
//        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        return (new Biome.BiomeBuilder()).precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.PLAINS)
                .temperature(0.8F).downfall(0.4F)
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x7FC3CF).waterFogColor(0x3290A5)
                        .fogColor(0xC0D8FF).skyColor(0x77ADFF).grassColorOverride(0x4EC260)
                        //.ambientParticle(new AmbientParticleSettings(ParticleTypes.FIREWORK, 0.118093334F))
                        .build()).mobSpawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build()).build();
    }

    public static final RegistryObject<Biome> FIRE_FIELDS = BIOMES.register("fire_fields",
            SeramaniaBiomes::createFireFields);

    private static Biome createFireFields() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder();
//        BiomeDefaultFeatures.farmAnimals(spawnSettings);
//        BiomeDefaultFeatures.monsters(spawnSettings, 95, 5, 100, true);

        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder();
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(generationSettings);

        ModDefaultFeatures.addModFeatherwoodTrees(generationSettings);
        ModDefaultFeatures.addModAshbarkFallTrees(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        return (new Biome.BiomeBuilder()).precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.NETHER)
                .temperature(1.0F).downfall(0.0F)
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0xB6CEEA).waterFogColor(0xFFBDA5)
                        .fogColor(0xFFFFA5).skyColor(0xFF8EA5).grassColorOverride(0xDB96A0)
                        .ambientParticle(new AmbientParticleSettings(ParticleTypes.ASH, 0.118093334F))
                        .build()).mobSpawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build()).build();
    }

    public static final RegistryObject<Biome> FLOODED_FIELDS = BIOMES.register("flooded_fields",
            SeramaniaBiomes::createFloodedFields);

    private static Biome createFloodedFields() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder();
        BiomeDefaultFeatures.endSpawns(spawnSettings);
        BiomeDefaultFeatures.farmAnimals(spawnSettings);
        BiomeDefaultFeatures.monsters(spawnSettings, 95, 5, 100, true);

        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder();
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(generationSettings);

        ModDefaultFeatures.addModFeatherwoodTrees(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        return (new Biome.BiomeBuilder()).precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.OCEAN)
                .temperature(0.8F).downfall(0.4F)
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x6EDDFA).waterFogColor(0xABEDFA)
                        .fogColor(0xABEDFA).skyColor(0xB0FBFF).grassColorOverride(0x5BF7A4)
                        .build()).mobSpawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build()).build();
    }

    public static final RegistryObject<Biome> FROZEN_FIELDS = BIOMES.register("frozen_fields",
            SeramaniaBiomes::createFrozenFields);

    private static Biome createFrozenFields() {
        MobSpawnSettings.Builder spawnSettings = new MobSpawnSettings.Builder();
        BiomeDefaultFeatures.endSpawns(spawnSettings);
        BiomeDefaultFeatures.farmAnimals(spawnSettings);
        BiomeDefaultFeatures.monsters(spawnSettings, 95, 5, 100, true);

        BiomeGenerationSettings.Builder generationSettings = new BiomeGenerationSettings.Builder();
        BiomeDefaultFeatures.addDefaultUndergroundVariety(generationSettings);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(generationSettings);

        ModDefaultFeatures.addModFeatherwoodTrees(generationSettings);
        BiomeDefaultFeatures.addDefaultOres(generationSettings);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationSettings);
        BiomeDefaultFeatures.addDefaultSprings(generationSettings);
        return (new Biome.BiomeBuilder()).precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.PLAINS)
                .temperature(0.8F).downfall(0.4F)
                .specialEffects((new BiomeSpecialEffects.Builder())
                        .waterColor(0x36D5FC).waterFogColor(0xFFFFFF)
                        .fogColor(0x60FDF1).skyColor(0xB5E7F4).grassColorOverride(0x31FFFF)
                        //.ambientParticle(new AmbientParticleSettings(ParticleTypes.FIREWORK, 0.118093334F))
                        .build()).mobSpawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build()).build();
    }

    public static void register(IEventBus eventBus) {
        BIOMES.register(eventBus);
    }
}