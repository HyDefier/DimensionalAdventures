package com.hydefy.dimensionaladventures.core.event;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.common.entity.Featherer;
import com.hydefy.dimensionaladventures.common.entity.PortalChicken;
import com.hydefy.dimensionaladventures.core.init.EntityInit;
import com.hydefy.dimensionaladventures.core.world.OreGeneration;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = DimensionalAdventures.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonModEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityInit.FEATHERER     .get(), Featherer    .createAttributes().build());
        event.put(EntityInit.PORTAL_CHICKEN.get(), PortalChicken.createAttributes().build());
    }

    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            OreGeneration.registerOres();
            //PacketHandler.init();
            SpawnPlacements.register(EntityInit.PORTAL_CHICKEN.get(), SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.WORLD_SURFACE, PortalChicken::canSpawn);
        });
    }
}
