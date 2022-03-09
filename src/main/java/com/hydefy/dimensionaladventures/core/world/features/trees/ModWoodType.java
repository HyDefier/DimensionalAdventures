package com.hydefy.dimensionaladventures.core.world.features.trees;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodType {
    public static final WoodType ASHBARK =
            WoodType.create(new ResourceLocation(DimensionalAdventures.MODID, "ashbark").toString());
    public static final WoodType FEATHER =
            WoodType.create(new ResourceLocation(DimensionalAdventures.MODID, "feather").toString());
}
