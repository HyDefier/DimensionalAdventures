//package com.hydefy.dimensionaladventures.common.entity;
//
//import net.minecraft.core.Registry;
//import net.minecraft.world.entity.Entity;
//import net.minecraft.world.entity.EntityType;
//import net.minecraft.world.entity.MobCategory;
//import net.minecraft.world.entity.animal.Cow;
//
//public class ModEntityType {
//    public static final EntityType<Chiko> CHIKO = register("chiko", EntityType.Builder.<Chiko>of(Chiko::new, MobCategory.CREATURE).sized(0.9F, 1.4F).clientTrackingRange(10));
//
//    private static <T extends Entity> EntityType<T> register(String p_20635_, EntityType.Builder<T> p_20636_) {
//        return Registry.register(p_20635_, Registry.ENTITY_TYPE_REGISTRY, p_20636_.build(p_20635_));
//    }
//}
