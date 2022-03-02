package com.hydefy.dimensionaladventures.common.item;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class PortalBoxItem extends Item {

    //TODO move Block Entities?

    public PortalBoxItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        CompoundTag nbt = stack.getOrCreateTag();
        return nbt.contains(DimensionalAdventures.MODID, Tag.TAG_COMPOUND)
                && nbt.getCompound(DimensionalAdventures.MODID).contains("ContainedBlock", Tag.TAG_COMPOUND);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        ItemStack stack = context.getItemInHand();
        var player = context.getPlayer();
        var level = player.level;
        BlockPos pos = context.getClickedPos();
        BlockState state = level.getBlockState(pos);
        if (((!player.isCreative() && (!player.mayBuild() || !(state.getBlock().getExplosionResistance() < 3600000.0F)))
                || state.hasBlockEntity())) {
            player.displayClientMessage(new TextComponent("Cannot Warp Block"),true);
            return InteractionResult.FAIL;
        }

        if (!stack.getOrCreateTag().contains(DimensionalAdventures.MODID, Tag.TAG_COMPOUND))
            stack.getOrCreateTag().put(DimensionalAdventures.MODID, new CompoundTag());

        CompoundTag nbt = stack.getOrCreateTag().getCompound(DimensionalAdventures.MODID);

        if (!nbt.contains("ContainedBlock", Tag.TAG_COMPOUND))
            nbt.put("ContainedBlock", NbtUtils.writeBlockState(Blocks.AIR.defaultBlockState()));

        //Save state's block data to temp
        nbt.put("TempBlock", NbtUtils.writeBlockState(state));


        //Overwrite state with contained
        BlockState containedState = NbtUtils.readBlockState(nbt.getCompound("ContainedBlock"));
        level.setBlockAndUpdate(pos, containedState);

        //Move temp to contained
        nbt.put("ContainedBlock", nbt.get("TempBlock"));
        nbt.remove("TempBlock");

        return InteractionResult.SUCCESS;
    }
}
