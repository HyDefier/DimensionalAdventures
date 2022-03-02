package com.hydefy.dimensionaladventures.core.init;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.common.block.entity.FeathererEggBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class BlockEntityInit {

    private BlockEntityInit() {}

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister
            .create(ForgeRegistries.BLOCK_ENTITIES, DimensionalAdventures.MODID);

    public static final RegistryObject<BlockEntityType<FeathererEggBlockEntity>> FEATHERER_EGG_BLOCK = BLOCK_ENTITIES
            .register("featherer_egg", () -> BlockEntityType.Builder.of(FeathererEggBlockEntity::new,
                    BlockInit.FEATHERER_EGG_BLOCK.get()).build(null));
}
