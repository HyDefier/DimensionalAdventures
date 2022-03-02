package com.hydefy.dimensionaladventures.client.renderer;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.client.renderer.model.FeathererModel;
import com.hydefy.dimensionaladventures.common.entity.Featherer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class FeathererRenderer<Type extends Featherer> extends MobRenderer<Type, FeathererModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(DimensionalAdventures.MODID, "textures/entities/featherer.png");

    public FeathererRenderer(EntityRendererProvider.Context context) {
        super(context, new FeathererModel<>(context.bakeLayer(FeathererModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}
