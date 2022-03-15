package com.hydefy.dimensionaladventures.client.event;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.client.renderer.FeathererRenderer;
import com.hydefy.dimensionaladventures.client.renderer.PortalChickenRenderer;
import com.hydefy.dimensionaladventures.client.renderer.model.FeathererModel;
import com.hydefy.dimensionaladventures.client.renderer.model.PortalChickenModel;
import com.hydefy.dimensionaladventures.common.block.ModFluids;
import com.hydefy.dimensionaladventures.core.init.BlockInit;
import com.hydefy.dimensionaladventures.core.init.EntityInit;
import com.hydefy.dimensionaladventures.core.world.features.trees.ModWoodType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = DimensionalAdventures.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientModEvents {

    private ClientModEvents() {}

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(BlockInit.FEATHERER_EGG_BLOCK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.GIZZARD_SEED_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.ASHBARK_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.ASHBARK_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.POTTED_ASHBARK_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.ASHBARK_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.ASHBARK_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.ASHBARK_BUTTON.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.ASHBARK_PANEL.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.RED_ASHBARK_LEAVES.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.FEATHER_WOOD_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.FEATHER_WOOD_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.FEATHER_WOOD_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.FEATHER_WOOD_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockInit.FEATHER_WOOD_BUTTON.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.FEATHER_WOOD_PANEL.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModFluids.OIL_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.OIL_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.OIL_FLOWING.get(), RenderType.translucent());

        WoodType.register(ModWoodType.ASHBARK);
        WoodType.register(ModWoodType.FEATHER);
    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(FeathererModel.LAYER_LOCATION, FeathererModel::createBodyLayer);
        event.registerLayerDefinition(PortalChickenModel.LAYER_LOCATION, PortalChickenModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.FEATHERER.get(), FeathererRenderer::new);
        event.registerEntityRenderer(EntityInit.PORTAL_CHICKEN.get(), PortalChickenRenderer::new);
    }
}
