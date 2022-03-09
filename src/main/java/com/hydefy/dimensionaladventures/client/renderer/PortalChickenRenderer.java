package com.hydefy.dimensionaladventures.client.renderer;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.client.renderer.model.PortalChickenModel;
import com.hydefy.dimensionaladventures.common.entity.PortalChicken;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class PortalChickenRenderer<Type extends PortalChicken> extends MobRenderer<Type, PortalChickenModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(DimensionalAdventures.MODID, "textures/entity/portal_chicken.png");

    public PortalChickenRenderer(EntityRendererProvider.Context context) {
        super(context, new PortalChickenModel<>(context.bakeLayer(PortalChickenModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}
