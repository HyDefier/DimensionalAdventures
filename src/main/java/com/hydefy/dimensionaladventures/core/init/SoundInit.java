package com.hydefy.dimensionaladventures.core.init;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class SoundInit {

    private SoundInit() {}

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
            DimensionalAdventures.MODID);

    public static final RegistryObject<SoundEvent> FEATHERER_AMBIENT = SOUNDS.register("entity.featherer.ambient", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "entity.featherer.ambient")));
    public static final RegistryObject<SoundEvent> FEATHERER_DEATH   = SOUNDS.register("entity.featherer.death"  , () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "entity.featherer.death"  )));
    public static final RegistryObject<SoundEvent> FEATHERER_HURT    = SOUNDS.register("entity.featherer.hurt"   , () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "entity.featherer.hurt"   )));
}
