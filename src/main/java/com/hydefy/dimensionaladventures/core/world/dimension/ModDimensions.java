package com.hydefy.dimensionaladventures.core.world.dimension;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class ModDimensions {

    public static final ResourceKey<Level> SERAMANIA = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(DimensionalAdventures.MODID, "seramania"));

    public static void register() {
        Registry.register(Registry.CHUNK_GENERATOR, new ResourceLocation(DimensionalAdventures.MODID, "seramania_chunkgen"),
                SeramaniaChunkGenerator.CODEC);
        Registry.register(Registry.BIOME_SOURCE, new ResourceLocation(DimensionalAdventures.MODID, "biomes"),
                SeramaniaBiomeProvider.CODEC);
    }
}