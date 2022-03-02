package com.hydefy.dimensionaladventures.common.block;

import com.hydefy.dimensionaladventures.core.init.ItemInit;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;

public class GizzardSeedCrop extends CropBlock {

    public GizzardSeedCrop(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ItemInit.GIZZARD_SEEDS.get();
    }
}
