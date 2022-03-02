package com.hydefy.dimensionaladventures.core.world.biome;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class SeramaniaBiomeGeneration {
    public static void generateBiomes() {
        addBiome(SeramaniaBiomes.FEATHER_FIELDS.get(), BiomeManager.BiomeType.WARM, 20);
        addBiome(SeramaniaBiomes.FIRE_FIELDS.get(), BiomeManager.BiomeType.DESERT, 20);
        addBiome(SeramaniaBiomes.FLOODED_FIELDS.get(), BiomeManager.BiomeType.COOL, 20);
        addBiome(SeramaniaBiomes.FADED_FIELDS.get(), BiomeManager.BiomeType.ICY, 20);
    }

    private static void addBiome(Biome biome, BiomeManager.BiomeType type, int weight, BiomeDictionary.Type... types) {
        ResourceKey<Biome> key =  ResourceKey.create(ForgeRegistries.Keys.BIOMES,
                Objects.requireNonNull(ForgeRegistries.BIOMES.getKey(biome)));

        BiomeDictionary.addTypes(key, types);
        BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(key, weight));
    }
}