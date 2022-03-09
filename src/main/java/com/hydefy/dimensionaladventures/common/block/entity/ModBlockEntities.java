package com.hydefy.dimensionaladventures.common.block.entity;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.core.init.BlockInit;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, DimensionalAdventures.MODID);

    public static final RegistryObject<BlockEntityType<FeathererEggBlockEntity>> FEATHERER_EGG_BLOCK = BLOCK_ENTITIES
            .register("featherer_egg", () -> BlockEntityType.Builder.of(FeathererEggBlockEntity::new,
            BlockInit.FEATHERER_EGG_BLOCK.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> SIGN_BLOCK_ENTITIES =
            BLOCK_ENTITIES.register("sign_block_entity", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            BlockInit.ASHBARK_WALL_SIGN.get(),
                            BlockInit.ASHBARK_SIGN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}