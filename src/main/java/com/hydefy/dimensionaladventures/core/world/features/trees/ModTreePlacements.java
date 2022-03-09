package com.hydefy.dimensionaladventures.core.world.features.trees;

import com.hydefy.dimensionaladventures.core.world.features.trees.ModTreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModTreePlacements {
    public static final PlacedFeature FEATHER_WOOD_CHECKED1 = PlacementUtils.register("feather_wood_checked1", ModTreeFeatures.FEATHER1.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING));
    public static final PlacedFeature FEATHER_WOOD_CHECKED2 = PlacementUtils.register("feather_wood_checked2", ModTreeFeatures.FEATHER2.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING));
    public static final PlacedFeature ASHBARK_CHECKED1 = PlacementUtils.register("ashbark_checked1", ModTreeFeatures.ASHBARK1.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING));
    public static final PlacedFeature ASHBARK_CHECKED2 = PlacementUtils.register("ashbark_checked2", ModTreeFeatures.ASHBARK2.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING));
    public static final PlacedFeature RED_ASHBARK_CHECKED1 = PlacementUtils.register("red_ashbark_checked1", ModTreeFeatures.RED_ASHBARK1.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING));
    public static final PlacedFeature RED_ASHBARK_CHECKED2 = PlacementUtils.register("red_ashbark_checked2", ModTreeFeatures.RED_ASHBARK2.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING));
}
