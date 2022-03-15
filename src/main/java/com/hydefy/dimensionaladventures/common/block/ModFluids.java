package com.hydefy.dimensionaladventures.common.block;

import com.hydefy.dimensionaladventures.DimensionalAdventures;
import com.hydefy.dimensionaladventures.core.init.BlockInit;
import com.hydefy.dimensionaladventures.core.init.ItemInit;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation(
            "dimensionaladventures:blocks/oil_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation(
            "dimensionaladventures:blocks/oil_still");   //TODO add flowing
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation(
            "dimensionaladventures:blocks/oil_still");   //TODO add overlay

    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, DimensionalAdventures.MODID);


    public static final RegistryObject<FlowingFluid> OIL_FLUID
            = FLUIDS.register("oil_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.OIL_PROPERTIES));

    public static final RegistryObject<FlowingFluid> OIL_FLOWING
            = FLUIDS.register("oil_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.OIL_PROPERTIES));

    public static final ForgeFlowingFluid.Properties OIL_PROPERTIES = new ForgeFlowingFluid.Properties(
            OIL_FLUID, OIL_FLOWING, FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
            .density(15).luminosity(2).viscosity(5).sound(SoundEvents.HONEY_DRINK).overlay(WATER_OVERLAY_RL)
            .color(0x5BFF32)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(ModFluids.OIL_BLOCK).bucket(ItemInit.OIL_BUCKET);

    public static final RegistryObject<LiquidBlock> OIL_BLOCK = BlockInit.BLOCKS.register("oil",
            () -> new LiquidBlock(ModFluids.OIL_FLUID, BlockBehaviour.Properties.of(Material.WATER).strength(100f).noDrops()));

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}