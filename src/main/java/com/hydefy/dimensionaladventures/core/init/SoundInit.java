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

    //ENTITY
    public static final RegistryObject<SoundEvent> FEATHERER_AMBIENT = SOUNDS.register("entity.featherer.ambient", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "entity.featherer.ambient")));
    public static final RegistryObject<SoundEvent> FEATHERER_DEATH = SOUNDS.register("entity.featherer.death", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "entity.featherer.death")));
    public static final RegistryObject<SoundEvent> FEATHERER_HURT = SOUNDS.register("entity.featherer.hurt", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "entity.featherer.hurt")));

    //SONGS
    public static final RegistryObject<SoundEvent> ALL_FOR_THEM_A = SOUNDS.register("all_for_them_alpha", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "all_for_them_alpha")));
    public static final RegistryObject<SoundEvent> COLD_FEET_A = SOUNDS.register("cold_feet_alpha", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "cold_feet_alpha")));
    public static final RegistryObject<SoundEvent> COLD_FEET_A_S = SOUNDS.register("cold_feet_alpha_slow", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "cold_feet_alpha_slow")));
    public static final RegistryObject<SoundEvent> FINAL_BREATH_A = SOUNDS.register("final_breath_alpha", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "final_breath_alpha")));
    public static final RegistryObject<SoundEvent> FINAL_BREATH_A_S = SOUNDS.register("final_breath_alpha_slow", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "final_breath_alpha_slow")));
    public static final RegistryObject<SoundEvent> LEAVING_THE_NEST_A = SOUNDS.register("leaving_the_nest_alpha", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "leaving_the_nest_alpha")));
    public static final RegistryObject<SoundEvent> LEAVING_THE_NEST_A_S = SOUNDS.register("leaving_the_nest_alpha_slow", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "leaving_the_nest_alpha_slow")));
    public static final RegistryObject<SoundEvent> LEAVING_THE_NEST_A_T = SOUNDS.register("leaving_the_nest_alpha_trippy", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "leaving_the_nest_alpha_trippy")));
    public static final RegistryObject<SoundEvent> MORNING_TROT_A = SOUNDS.register("morning_trot_alpha", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "morning_trot_alpha")));
    public static final RegistryObject<SoundEvent> OUTSIDE_THE_SHELL_A = SOUNDS.register("outside_the_shell_alpha", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "outside_the_shell_alpha")));
    public static final RegistryObject<SoundEvent> OUTSIDE_THE_SHELL_A_S = SOUNDS.register("outside_the_shell_alpha_slow", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "outside_the_shell_alpha_slow")));
    public static final RegistryObject<SoundEvent> PICK_UP_STRAW_A = SOUNDS.register("pick_up_straw_alpha", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "pick_up_straw_alpha")));
    public static final RegistryObject<SoundEvent> THATS_MY_STRAW_A = SOUNDS.register("thats_my_straw_alpha", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "thats_my_straw_alpha")));
    public static final RegistryObject<SoundEvent> THE_SIMPLE_LIFE_A = SOUNDS.register("the_simple_life_alpha", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "the_simple_life_alpha")));
    public static final RegistryObject<SoundEvent> THREE_LITTLE_EGGS_A = SOUNDS.register("three_little_eggs_alpha", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "three_little_eggs_alpha")));
    public static final RegistryObject<SoundEvent> THREE_LITTLE_EGGS_A_S = SOUNDS.register("three_little_eggs_alpha_slow", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "three_little_eggs_alpha_slow")));
    public static final RegistryObject<SoundEvent> WE_ARE_THE_STORM_A = SOUNDS.register("we_are_the_storm_alpha", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "we_are_the_storm_alpha")));
    public static final RegistryObject<SoundEvent> WEATHER_THE_STORM_A = SOUNDS.register("weather_the_storm_alpha", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "weather_the_storm_alpha")));
    public static final RegistryObject<SoundEvent> WHAT_IS_STRAW_A = SOUNDS.register("what_is_straw_alpha", () ->
            new SoundEvent(new ResourceLocation(DimensionalAdventures.MODID, "what_is_straw_alpha")));
}
