package com.hydefy.dimensionaladventures;

import com.hydefy.dimensionaladventures.common.block.ModFluids;
import com.hydefy.dimensionaladventures.common.block.entity.ModBlockEntities;
import com.hydefy.dimensionaladventures.core.init.*;
import com.hydefy.dimensionaladventures.core.world.biome.SeramaniaBiomes;
import com.hydefy.dimensionaladventures.core.world.features.trees.ModWoodType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

import com.google.common.collect.HashMultimap;
import com.mojang.serialization.Codec;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.FlatLevelSource;
import net.minecraft.world.level.levelgen.StructureSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

import java.lang.reflect.Method;
import java.util.Map;

@Mod("dimensionaladventures")
public class DimensionalAdventures
{
    //      /execute in dimensionaladventures:seramania run tp Dev 42 100 42

    //TODO oil to acid

    //TODO fix portal chicken anim
    //TODO golden egg/ chicken
    //TODO golden egg to gold nuggets
    //TODO texture overhaul
    //TODO featherwood (falling logs)

    //TODO steel refined in furnace is rough steel texture
    //TODO steel furnace for better refining requires fuel from fire fields
    //TODO steel scrap refined in steel furnace make pure steel nugget, pure steel strong enough for nokin
    //TODO Make a new tool tier so diamond cannot mine nokin
    //TODO folded pure/refined steel at an advanced crafting station made from something post floating feather islands..

    //TODO get mod first-release ready
    //TODO flesh-out custom sounds

    public static final String MODID = "dimensionaladventures";

    public static final CreativeModeTab SERAMANIA_TAB = new CreativeModeTab(MODID + "_seramania") {
        @Override @NotNull
        public ItemStack makeIcon() {
            return ItemInit.PORTAL_EGG_ITEM.get().getDefaultInstance();
        }
    };

    public static final CreativeModeTab RUINED_TECHNOLOGY_TAB = new CreativeModeTab(MODID + "_ruined_technology") {
        @Override @NotNull
        public ItemStack makeIcon() {
            return ItemInit.STEEL_SCRAP_ITEM.get().getDefaultInstance();
        }
    };

    public DimensionalAdventures() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        SoundInit               .SOUNDS                  .register(bus);
        BlockInit               .BLOCKS                  .register(bus);
        ItemInit                .ITEMS                   .register(bus);
        EntityInit              .ENTITIES                .register(bus);

        WoodType.register(ModWoodType.ASHBARK);
        WoodType.register(ModWoodType.FEATHER);

        ModFluids.register(bus);

        ModBlockEntities.register(bus);

        SeramaniaBiomes.register(bus);

        //Unnecessary?
//        bus.addListener(CommonModEvents::commonSetup);
//        bus.addListener(ClientModEvents::clientSetup);

        // Register self
//        MinecraftForge.EVENT_BUS.register(this);
    }

    private static Method GETCODEC_METHOD;
    public void addDimensionalSpacing(final WorldEvent.Load event) {
        if(event.getWorld() instanceof ServerLevel serverLevel) {
            ChunkGenerator chunkGenerator = serverLevel.getChunkSource().getGenerator();

            // Skip superflat worlds to prevent issues with it. Plus, users don't want structures clogging up their superflat worlds.
            if (chunkGenerator instanceof FlatLevelSource && serverLevel.dimension().equals(Level.OVERWORLD)) {
                return;
            }

            StructureSettings worldStructureConfig = chunkGenerator.getSettings();


            try {
                if(GETCODEC_METHOD == null) GETCODEC_METHOD = ObfuscationReflectionHelper.findMethod(ChunkGenerator.class, "codec");
                ResourceLocation cgRL = Registry.CHUNK_GENERATOR.getKey((Codec<? extends ChunkGenerator>) GETCODEC_METHOD.invoke(chunkGenerator));
                if(cgRL != null && cgRL.getNamespace().equals("terraforged")) return;
            }
            catch(Exception ignored){}

//            Map<StructureFeature<?>, StructureFeatureConfiguration> tempMap = new HashMap<>(worldStructureConfig.structureConfig());
//            tempMap.putIfAbsent(STStructures.RUN_DOWN_HOUSE.get(), StructureSettings.DEFAULTS.get(STStructures.RUN_DOWN_HOUSE.get()));
//            worldStructureConfig.structureConfig = tempMap;
        }
    }

    /**
     * Helper method that handles setting up the map to multimap relationship to help prevent issues.
     */
    private static void associateBiomeToConfiguredStructure(Map<StructureFeature<?>, HashMultimap<ConfiguredStructureFeature<?, ?>, ResourceKey<Biome>>> STStructureToMultiMap, ConfiguredStructureFeature<?, ?> configuredStructureFeature, ResourceKey<Biome> biomeRegistryKey) {
        STStructureToMultiMap.putIfAbsent(configuredStructureFeature.feature, HashMultimap.create());
        HashMultimap<ConfiguredStructureFeature<?, ?>, ResourceKey<Biome>> configuredStructureToBiomeMultiMap = STStructureToMultiMap.get(configuredStructureFeature.feature);
        if(!(configuredStructureToBiomeMultiMap.containsValue(biomeRegistryKey))) {
            configuredStructureToBiomeMultiMap.put(configuredStructureFeature, biomeRegistryKey);
        }
    }
}
