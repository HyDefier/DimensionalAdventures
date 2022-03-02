package com.hydefy.dimensionaladventures.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.*;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class HealingStationBlock extends HorizontalDirectionalBlock {

    //TODO remove negative effects
    //TODO grant food? No, OP and mod adds improved food options that would become obsolete.
    //TODO add recharging time and green texture to indicate charged? or gray to indicate empty..
    //TODO verify xp is good currency
    //TODO Update texture

    public HealingStationBlock(Properties properties) {
        super(properties);
        registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FACING);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player,
                                 InteractionHand hand, BlockHitResult result) {
        if (!level.isClientSide) {
            if (player.experienceLevel < 1 && !player.isCreative()) {
                //soundToClient(player, pos, SoundEvents.FIRE_EXTINGUISH, SoundSource.PLAYERS, 1.0f, 1.0f, level);
                return InteractionResult.FAIL;
            }

            if (!player.isCreative() && player.getHealth() < 20) {
                player.giveExperienceLevels(-1);
                player.heal(5);
            }
        }
        level.playSound(player, pos, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.PLAYERS, 1.0f, 1.0f);
        double offset = state.getShape(level, pos).max(Direction.Axis.Y, 0.5D, 0.5D) + 0.03125D;
        Random random = level.getRandom();
        player.heal(5);
        for (int i = 0; i < 5; i++) {
            double randX = random.nextGaussian() * 0.02D;
            double randY = random.nextGaussian() * 0.02D;
            double randZ = random.nextGaussian() * 0.02D;
            level.addParticle(ParticleTypes.COMPOSTER, (double) pos.getX() + 0.13124999403953552D + 0.737500011920929D * (double) random.nextFloat(),
                    (double) pos.getY() + offset + (double) random.nextFloat() * (1.0D - offset), (double) pos.getZ()
                            + 0.13124999403953552D + 0.737500011920929D * (double) random.nextFloat(), randX, randY, randZ);

        }
        return InteractionResult.SUCCESS;
    }
}
