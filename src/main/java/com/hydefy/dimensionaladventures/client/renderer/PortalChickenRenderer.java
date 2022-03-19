package com.hydefy.dimensionaladventures.client.renderer;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.client.renderer.model.PortalChickenModel;
import com.hydefy.dimensionaladventures.common.entity.PortalChicken;
import net.minecraft.client.model.ChickenModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.Chicken;

public class PortalChickenRenderer extends MobRenderer<PortalChicken, PortalChickenModel<PortalChicken>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(DimensionalAdventures.MODID, "textures/entity/portal_chicken.png");

    public PortalChickenRenderer(EntityRendererProvider.Context context) {
        //super(context, new PortalChickenModel<>(context.bakeLayer(ModModelLayers.PORTAL_CHICKEN)), 0.3F);
        super(context, new PortalChickenModel<>(context.bakeLayer(ModelLayers.CHICKEN)), 0.3F);
    }

//    public PortalChickenRenderer(EntityRendererProvider.Context context) {
//        super(context, new PortalChickenModel<>(context.bakeLayer(PortalChickenModel.LAYER_LOCATION)), 0.5f);
//    }

    @Override
    public ResourceLocation getTextureLocation(PortalChicken entity) {
        return TEXTURE;
    }
}
