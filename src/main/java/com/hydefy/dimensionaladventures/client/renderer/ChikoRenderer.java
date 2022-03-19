package com.hydefy.dimensionaladventures.client.renderer;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.client.renderer.model.ChikoModel;
import com.hydefy.dimensionaladventures.client.renderer.model.FeathererModel;
import com.hydefy.dimensionaladventures.common.entity.Chiko;
import com.hydefy.dimensionaladventures.common.entity.Featherer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ChikoRenderer <Type extends Chiko> extends MobRenderer<Type, ChikoModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(DimensionalAdventures.MODID, "textures/entity/chiko.png");

    public ChikoRenderer(EntityRendererProvider.Context context) {
        super(context, new ChikoModel<>(context.bakeLayer(ChikoModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}
