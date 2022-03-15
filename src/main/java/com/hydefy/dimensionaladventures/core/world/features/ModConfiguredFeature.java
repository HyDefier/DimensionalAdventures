package com.hydefy.dimensionaladventures.core.world.features;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.core.world.features.structures.ModStructures;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.PlainVillagePools;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;

public class ModConfiguredFeature {
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_LARGE_ROCKS  = ModStructures.LARGE_ROCKS.get()
            .configured(new JigsawConfiguration(() -> PlainVillagePools.START, 0));

    public static void registerConfiguredStructures() {
        Registry<ConfiguredStructureFeature<?, ?>> registry = BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE;
        Registry.register(registry, new ResourceLocation(DimensionalAdventures.MODID, "configured_large_rocks"), CONFIGURED_LARGE_ROCKS);
    }
}
