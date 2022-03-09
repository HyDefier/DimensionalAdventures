package com.hydefy.dimensionaladventures.core.event;

import com.google.common.collect.ImmutableMap;
import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.common.block.entity.ModBlockEntities;
import com.hydefy.dimensionaladventures.common.entity.Featherer;
import com.hydefy.dimensionaladventures.common.entity.PortalChicken;
import com.hydefy.dimensionaladventures.core.init.BlockInit;
import com.hydefy.dimensionaladventures.core.init.EntityInit;
import com.hydefy.dimensionaladventures.core.world.OreGeneration;
import com.hydefy.dimensionaladventures.core.world.features.trees.ModWoodType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = DimensionalAdventures.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonModEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityInit.FEATHERER     .get(), Featherer    .createAttributes().build());
        event.put(EntityInit.PORTAL_CHICKEN.get(), PortalChicken.createAttributes().build());
    }

    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            OreGeneration.registerOres();
            //PacketHandler.init();
            SpawnPlacements.register(EntityInit.PORTAL_CHICKEN.get(), SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.WORLD_SURFACE, PortalChicken::canSpawn);
            AxeItem.STRIPPABLES = new ImmutableMap.Builder<Block, Block>().putAll(AxeItem.STRIPPABLES)
                    .put(BlockInit.ASHBARK_LOG.get(), BlockInit.STRIPPED_ASHBARK_LOG.get())
                    .put(BlockInit.ASHBARK_WOOD.get(), BlockInit.STRIPPED_ASHBARK_WOOD.get())

                    .put(BlockInit.FEATHER_WOOD_LOG.get(), BlockInit.STRIPPED_FEATHER_WOOD_LOG.get())
                    .put(BlockInit.FEATHER_WOOD.get(), BlockInit.STRIPPED_FEATHER_WOOD.get()).build();

            BlockEntityRenderers.register(ModBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);
            Sheets.addWoodType(ModWoodType.ASHBARK);
            Sheets.addWoodType(ModWoodType.FEATHER);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.ASHBARK_SAPLING.getId(), BlockInit.POTTED_ASHBARK_SAPLING);

        });

    }
}
