package com.hydefy.dimensionaladventures.common.block;

import com.hydefy.dimensionaladventures.core.world.dimension.Teleporter;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.stream.Stream;

public class TeleporterBlock extends HorizontalDirectionalBlock {
    public TeleporterBlock(Properties builder) {
        super(builder);
    }

    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
        if (!player.isCrouching()) {
            MinecraftServer server = level.getServer();

            player.displayClientMessage(new TextComponent("In " + level.dimension()),true);

            if ((level.dimension().toString()).equals("ResourceKey[minecraft:dimension / dimensionaladventures:seramania]")) {
                player.displayClientMessage(new TextComponent("Warping to Overworld"), false);
                player.changeDimension(Objects.requireNonNull(Objects.requireNonNull(level.getServer()).getLevel(level.getServer().overworld().dimension())), new Teleporter(blockPos, false));
            }
        }
        return InteractionResult.SUCCESS;
    }


}