package com.hydefy.dimensionaladventures.core.util;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static class Blocks {
//        public static final Tags.IOptionalNamedTag<Block> DOWSING_ROD_VALUABLES
//                = tag("dowsing_rod_valuables");

        private static Tags.IOptionalNamedTag<Block> tag(String name) {
            return BlockTags.createOptional(new ResourceLocation(DimensionalAdventures.MODID, name));
        }

        private static Tags.IOptionalNamedTag<Block> forgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final Tags.IOptionalNamedTag<Item> FEATHER_WOOD_LOGS = tag("feather_wood_logs");
        public static final Tags.IOptionalNamedTag<Item> ASHBARK_LOGS = tag("ashbark_logs");

        private static Tags.IOptionalNamedTag<Item> tag(String name) {
            return ItemTags.createOptional(new ResourceLocation(DimensionalAdventures.MODID, name));
        }

        private static Tags.IOptionalNamedTag<Item> forgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}
