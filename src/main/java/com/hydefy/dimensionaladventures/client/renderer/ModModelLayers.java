package com.hydefy.dimensionaladventures.client.renderer;

import com.google.common.collect.Sets;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.Set;
import java.util.stream.Stream;

public class ModModelLayers {
    private static final String DEFAULT_LAYER = "main";
    private static final Set<ModelLayerLocation> ALL_MODELS = Sets.newHashSet();

    public static final ModelLayerLocation PORTAL_CHICKEN = register("portal_chicken");

    private static ModelLayerLocation register(String p_171294_) {
        return register(p_171294_, "main");
    }

    private static ModelLayerLocation register(String p_171296_, String p_171297_) {
        ModelLayerLocation modellayerlocation = createLocation(p_171296_, p_171297_);
        if (!ALL_MODELS.add(modellayerlocation)) {
            throw new IllegalStateException("Duplicate registration for " + modellayerlocation);
        } else {
            return modellayerlocation;
        }
    }

    private static ModelLayerLocation createLocation(String p_171301_, String p_171302_) {
        return new ModelLayerLocation(new ResourceLocation("minecraft", p_171301_), p_171302_);
    }

    private static ModelLayerLocation registerInnerArmor(String p_171299_) {
        return register(p_171299_, "inner_armor");
    }

    private static ModelLayerLocation registerOuterArmor(String p_171304_) {
        return register(p_171304_, "outer_armor");
    }

    public static ModelLayerLocation createBoatModelName(Boat.Type p_171290_) {
        return createLocation("boat/" + p_171290_.getName(), "main");
    }

    public static ModelLayerLocation createSignModelName(WoodType p_171292_) {
        ResourceLocation location = new ResourceLocation(p_171292_.name());
        return new ModelLayerLocation(new ResourceLocation(location.getNamespace(), "sign/" + location.getPath()), "main");
    }

    public static Stream<ModelLayerLocation> getKnownLocations() {
        return ALL_MODELS.stream();
    }
}
