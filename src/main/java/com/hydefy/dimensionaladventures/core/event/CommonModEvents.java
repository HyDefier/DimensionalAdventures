package com.hydefy.dimensionaladventures.core.event;

import com.google.common.collect.ImmutableMap;
import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.common.block.entity.ModBlockEntities;
import com.hydefy.dimensionaladventures.common.entity.Chiko;
import com.hydefy.dimensionaladventures.common.entity.Featherer;
import com.hydefy.dimensionaladventures.common.entity.PortalChicken;
import com.hydefy.dimensionaladventures.core.init.BlockInit;
import com.hydefy.dimensionaladventures.core.init.EntityInit;
import com.hydefy.dimensionaladventures.core.init.ItemInit;
import com.hydefy.dimensionaladventures.core.world.OreGeneration;
import com.hydefy.dimensionaladventures.core.world.features.trees.ModWoodType;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import java.util.Random;

@Mod.EventBusSubscriber(modid = DimensionalAdventures.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonModEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityInit.CHIKO.get(), Chiko.createAttributes().build());
        event.put(EntityInit.FEATHERER.get(), Featherer.createAttributes().build());
        event.put(EntityInit.PORTAL_CHICKEN.get(), PortalChicken.createAttributes().build());
    }

    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            OreGeneration.registerOres();
            //PacketHandler.init();
            SpawnPlacements.register(EntityInit.PORTAL_CHICKEN.get(), SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.WORLD_SURFACE, PortalChicken::canSpawn);
            SpawnPlacements.register(EntityInit.CHIKO.get(), SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.WORLD_SURFACE, Chiko::canSpawn);
            SpawnPlacements.register(EntityInit.FEATHERER.get(), SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.WORLD_SURFACE, Featherer::canSpawn);
            AxeItem.STRIPPABLES = new ImmutableMap.Builder<Block, Block>().putAll(AxeItem.STRIPPABLES)
                    .put(BlockInit.ASHBARK_LOG.get(), BlockInit.STRIPPED_ASHBARK_LOG.get())
                    .put(BlockInit.ASHBARK_WOOD.get(), BlockInit.STRIPPED_ASHBARK_WOOD.get())

                    .put(BlockInit.FEATHER_WOOD_LOG.get(), BlockInit.STRIPPED_FEATHER_WOOD_LOG.get())
                    .put(BlockInit.FEATHER_WOOD.get(), BlockInit.STRIPPED_FEATHER_WOOD.get()).build();

            //LEAVES, SAPLING, & SEEDS 0.3f
            ComposterBlock.COMPOSTABLES.put(ItemInit.GIZZARD_SEEDS.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(ItemInit.FEATHER_WOOD_LEAVES_ITEM.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(ItemInit.FEATHER_WOOD_SAPLING_ITEM.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(ItemInit.ASHBARK_LEAVES_ITEM.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(ItemInit.ASHBARK_SAPLING_ITEM.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(ItemInit.RED_ASHBARK_LEAVES_ITEM.get(), 0.3f);

            //MASS PRODUCED UNPROCESSED CROPS 0.5f
            ComposterBlock.COMPOSTABLES.put(ItemInit.FEATHER_CONE_ITEM.get(), 0.5f);

            //FLOWERS, QUALITY CROPS, & UNCOOKED PLANT EDIBLES 0.65f
            //ComposterBlock.COMPOSTABLES.put(ItemInit.CUSTOM_FLOWER.get(), 0.65f);   //TODO

            //SUPER GRAIN FOODS 1.0f
            ComposterBlock.COMPOSTABLES.put(ItemInit.GIZZARD_SEED_BLOCK_ITEM.get(), 1.0f);

            BlockEntityRenderers.register(ModBlockEntities.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);
            Sheets.addWoodType(ModWoodType.ASHBARK);
            Sheets.addWoodType(ModWoodType.FEATHER);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(BlockInit.ASHBARK_SAPLING.getId(), BlockInit.POTTED_ASHBARK_SAPLING);

        });

    }
}
