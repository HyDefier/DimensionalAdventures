package com.hydefy.dimensionaladventures.client.event;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.client.renderer.FeathererRenderer;
import com.hydefy.dimensionaladventures.client.renderer.PortalChickenRenderer;
import com.hydefy.dimensionaladventures.client.renderer.model.FeathererModel;
import com.hydefy.dimensionaladventures.client.renderer.model.PortalChickenModel;
import com.hydefy.dimensionaladventures.common.block.ModFluids;
import com.hydefy.dimensionaladventures.core.init.BlockInit;
import com.hydefy.dimensionaladventures.core.init.EntityInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.spongepowered.asm.mixin.transformer.ClassInfo;

@Mod.EventBusSubscriber(modid = DimensionalAdventures.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientModEvents {

    private ClientModEvents() {}

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(BlockInit.FEATHERER_EGG_BLOCK.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(BlockInit.GIZZARD_SEED_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.OIL_FLUID.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.OIL_BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModFluids.OIL_FLOWING.get(), RenderType.translucent());
    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(FeathererModel    .LAYER_LOCATION, FeathererModel    ::createBodyLayer);
        event.registerLayerDefinition(PortalChickenModel.LAYER_LOCATION, PortalChickenModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.FEATHERER     .get(), FeathererRenderer    ::new);
        event.registerEntityRenderer(EntityInit.PORTAL_CHICKEN.get(), PortalChickenRenderer::new);
    }
}