package com.hydefy.dimensionaladventures.core.event;

import java.util.List;
import java.util.function.Supplier;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.core.init.EntityInit;
import com.hydefy.dimensionaladventures.core.init.ItemInit;
import com.hydefy.dimensionaladventures.core.world.OreGeneration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.biome.MobSpawnSettings.SpawnerData;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = DimensionalAdventures.MODID, bus = Bus.FORGE)
public class CommonForgeEvents {
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void biomeLoading(BiomeLoadingEvent event) {

        if (event.getName().equals(new ResourceLocation("minecraft:plains"))) {
            event.getSpawns().addSpawn(MobCategory.CREATURE,
                    new SpawnerData(EntityInit.PORTAL_CHICKEN.get(), 50, 1, 2));
        }

        if (event.getName().equals(new ResourceLocation("dimensionaladventures:feather_fields"))
            ||event.getName().equals(new ResourceLocation("dimensionaladventures:fire_fields"))
            ||event.getName().equals(new ResourceLocation("dimensionaladventures:flooded_fields"))
            ||event.getName().equals(new ResourceLocation("dimensionaladventures:frozen_fields"))
            ||event.getName().equals(new ResourceLocation("dimensionaladventures:faded_fields"))) {
            event.getSpawns().addSpawn(MobCategory.CREATURE,
                    new SpawnerData(EntityInit.CHIKO.get(), 5000, 8, 32));
        }

        if (event.getName().equals(new ResourceLocation("dimensionaladventures:feather_fields"))
            ||event.getName().equals(new ResourceLocation("dimensionaladventures:fire_fields"))
            ||event.getName().equals(new ResourceLocation("dimensionaladventures:flooded_fields"))
            ||event.getName().equals(new ResourceLocation("dimensionaladventures:frozen_fields"))
            ||event.getName().equals(new ResourceLocation("dimensionaladventures:faded_fields"))) {
            event.getSpawns().addSpawn(MobCategory.CREATURE,
                    new SpawnerData(EntityInit.FEATHERER.get(), 50, 1, 3));
        }
    }

    @SubscribeEvent
    public static void burnTime(FurnaceFuelBurnTimeEvent event) {
        if (event.getItemStack().getItem() == ItemInit.FIRE_FEATHER.get()) {
            event.setBurnTime(469);
        }
    }
}