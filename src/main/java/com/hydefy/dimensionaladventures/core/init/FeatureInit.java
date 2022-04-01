package com.hydefy.dimensionaladventures.core.init;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.common.feature.HotIslandFeature;
import com.hydefy.dimensionaladventures.common.feature.IslandFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.BlockStateConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FeatureInit {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES,
            DimensionalAdventures.MODID);

    public static final RegistryObject<Feature<BlockStateConfiguration>> FLOATING_ISLAND = FEATURES.register("island", () -> new IslandFeature(BlockStateConfiguration.CODEC));
    public static final RegistryObject<Feature<BlockStateConfiguration>> FLOATING_HOT_ISLAND = FEATURES.register("hot_island", () -> new HotIslandFeature(BlockStateConfiguration.CODEC));
}
