package com.hydefy.dimensionaladventures.core.world.features.trees;

import net.minecraft.world.level.block.grower.AbstractMegaTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import java.util.Random;

public class FeatherWoodTreeGrower extends AbstractMegaTreeGrower {
    protected ConfiguredFeature<?, ?> getConfiguredFeature(Random p_60044_, boolean p_60045_) {
        return p_60044_.nextBoolean () ? ModTreeFeatures.FEATHER1 : ModTreeFeatures.FEATHER2;
    }

    protected ConfiguredFeature<?, ?> getConfiguredMegaFeature(Random p_60042_) {
        return p_60042_.nextBoolean() ? ModTreeFeatures.MEGA_FEATHER1 : ModTreeFeatures.MEGA_FEATHER2;
    }
}