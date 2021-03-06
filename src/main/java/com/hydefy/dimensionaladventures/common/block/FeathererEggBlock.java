package com.hydefy.dimensionaladventures.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class FeathererEggBlock extends FallingBlock {//implements EntityBlock {

    //TODO fix transparency
    //TODO use seatEntity

    public FeathererEggBlock(Properties properties) {
        super(properties);
    }

    protected static final VoxelShape SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);

    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

//    @Nullable
//    @Override
//    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
//        return BlockEntityInit.FEATHERER_EGG_BLOCK.get().create(pos, state);
//    }
//
//    @Override
//    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player,
//                                 InteractionHand hand, BlockHitResult result) {
//
//        final var egg = (FeathererEggBlockEntity) level.getBlockEntity(pos);
//
//        if (!level.isClientSide()) {
//            if (player.startRiding(egg.seat)) {
//                player.displayClientMessage(new TextComponent("Incubating"),false);
//            } else {
//                player.displayClientMessage(new TextComponent("Unable to Incubate"),false);
//            }
//        }
//        return InteractionResult.PASS;
//    }
//
//    @Nullable
//    @Override
//    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
//        return level.isClientSide ? null : ($0, $1, $2, blockEntity) -> ((FeathererEggBlockEntity) blockEntity).tick();
//    }
}
