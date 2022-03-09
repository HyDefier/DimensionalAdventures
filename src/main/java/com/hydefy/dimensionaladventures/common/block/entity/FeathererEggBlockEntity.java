package com.hydefy.dimensionaladventures.common.block.entity;

import com.hydefy.dimensionaladventures.common.entity.SeatEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class FeathererEggBlockEntity extends BlockEntity {

    public SeatEntity seat;
    public int ticks = 0;
    public final Map<UUID, Integer> playerUses = new HashMap<>();

    public FeathererEggBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.FEATHERER_EGG_BLOCK.get() ,pos, state);
    }

    public SeatEntity getOrCreateSeat() {
        if (this.seat == null) {
            final var seat = new SeatEntity(this.level);
            seat.absMoveTo(this.worldPosition.getX() + 0.5D, this.worldPosition.getY(),
                    this.worldPosition.getZ() + 0.5D,
                    0.0f, 0.0f);
            this.level.addFreshEntity(seat);
            this.seat = seat;
        }

        return this.seat;
    }

    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

//    @Override
//    public CompoundTag getUpdateTag() {
//        return save(new CompoundTag());
//    }

    @Override
    public void handleUpdateTag(CompoundTag tag) {
        load(tag);
    }

    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);

        final ListTag playerUses = nbt.getList("PlayerUseMap", Tag.TAG_COMPOUND);
        playerUses.forEach(player -> {
            if (player instanceof final CompoundTag tag) {
                final UUID uuid = tag.getUUID("UUID");
                final int uses = tag.getInt("Uses");
                this.playerUses.put(uuid, uses);
            }
        });
    }

    @Override
    protected void saveAdditional(CompoundTag p_187471_) {
        super.saveAdditional(p_187471_);
    }

//    @Override
//    public CompoundTag save(CompoundTag nbt) {
//        super.save(nbt);
//
//        final var playerUses = new ListTag();
//        this.playerUses.forEach((uuid, uses) -> {
//            final var playerTag = new CompoundTag();
//            playerTag.putUUID("UUID", uuid);
//            playerTag.putInt("Uses", uses);
//            playerUses.add(playerTag);
//        });
//
//        nbt.put("PlayerUseMap", playerUses);
//        return nbt;
//    }

    @Override
    public void setRemoved() {
        super.setRemoved();
        if (this.seat != null) {
            this.seat.kill();
        }
    }

    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt) {
        load(pkt.getTag());
    }

    @Override
    public void onLoad() {
        super.onLoad();
        getOrCreateSeat();
    }

    public void tick() {
        if (this.ticks % 5 == 0 && (this.seat == null || this.seat.isRemoved())) {
            if (this.seat != null) {
                this.seat.kill();
                this.seat = null;
            }
            getOrCreateSeat();
        }
        this.ticks++;
    }
}
