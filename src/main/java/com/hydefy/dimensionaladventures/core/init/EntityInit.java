package com.hydefy.dimensionaladventures.core.init;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.common.entity.Featherer;
import com.hydefy.dimensionaladventures.common.entity.PortalChicken;
import com.hydefy.dimensionaladventures.common.entity.SeatEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class EntityInit {

    private EntityInit() {}

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES,
            DimensionalAdventures.MODID);

    //width, height

    public static final RegistryObject<EntityType<Featherer>>     FEATHERER      = ENTITIES.register
            ("featherer",      () -> EntityType.Builder.of(Featherer::new    , MobCategory.CREATURE).sized
            (0.6f, 0.6f).build(new ResourceLocation(DimensionalAdventures.MODID,
            "featherer").toString()));
    public static final RegistryObject<EntityType<PortalChicken>> PORTAL_CHICKEN = ENTITIES.register
            ("portal_chicken", () -> EntityType.Builder.of(PortalChicken::new, MobCategory.CREATURE).sized
            (0.5f, 0.7f).build(new ResourceLocation(DimensionalAdventures.MODID,
            "portal_chicken").toString()));
    public static final RegistryObject<EntityType<Entity>>        SEAT_ENTITY    = ENTITIES.register
            ("seat_entity",    () -> EntityType.Builder.of(SeatEntity::new   , MobCategory.MISC   ).sized
            (0.6f, 0.6f).build(new ResourceLocation(DimensionalAdventures.MODID,
            "seat_entity").toString()));
}
