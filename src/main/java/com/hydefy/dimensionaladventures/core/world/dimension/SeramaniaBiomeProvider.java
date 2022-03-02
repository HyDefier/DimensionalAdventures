package com.hydefy.dimensionaladventures.core.world.dimension;

import com.hydefy.dimensionaladventures.core.world.biome.SeramaniaBiomes;
import com.mojang.serialization.Codec;
import net.minecraft.core.Registry;
import net.minecraft.resources.RegistryLookupCodec;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SeramaniaBiomeProvider extends BiomeSource {

    public static final Codec<SeramaniaBiomeProvider> CODEC = RegistryLookupCodec.create(Registry.BIOME_REGISTRY)
            .xmap(SeramaniaBiomeProvider::new, SeramaniaBiomeProvider::getBiomeRegistry).codec();

    private final Biome[] biome = new Biome[4];
    private final Registry<Biome> biomeRegistry;
    private static final List<ResourceKey<Biome>> SPAWN = Collections.singletonList(Biomes.PLAINS);

    public SeramaniaBiomeProvider(Registry<Biome> biomeRegistry) {
        super(getStartBiomes(biomeRegistry));
        this.biomeRegistry = biomeRegistry;
        biome[0] = biomeRegistry.get(SeramaniaBiomes.FLOODED_FIELDS.getId());   //Pretty easy to traverse by boat
        biome[1] = biomeRegistry.get(SeramaniaBiomes.FIRE_FIELDS.getId());      //Can't take heat
        biome[2] = biomeRegistry.get(SeramaniaBiomes.FEATHER_FIELDS.getId());   //Not part of progression?
        biome[3] = biomeRegistry.get(SeramaniaBiomes.FADED_FIELDS.getId());     //Can't stand on ground or hit mobs

    }

    private static List<Biome> getStartBiomes(Registry<Biome> registry) {
        return SPAWN.stream().map(s -> registry.get(s.location())).collect(Collectors.toList());
    }

    public Registry<Biome> getBiomeRegistry() {
        return biomeRegistry;
    }

    @Override
    protected Codec<? extends BiomeSource> codec() {
        return CODEC;
    }

    @Override
    public BiomeSource withSeed(long seed) {
        return this;
    }

    @Override
    public Biome getNoiseBiome(int x, int y, int z, Climate.Sampler sampler) {

        if (y > 100) return biome[2];
        else if (y > 50) return biome[1];
        else if (y > 0)return biome[0];
        else return biome[2];
    }
}