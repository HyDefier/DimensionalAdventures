package com.hydefy.dimensionaladventures;

import com.hydefy.dimensionaladventures.common.block.ModFluids;
import com.hydefy.dimensionaladventures.core.init.*;
import com.hydefy.dimensionaladventures.core.world.biome.SeramaniaBiomes;
import com.hydefy.dimensionaladventures.core.world.dimension.ModDimensions;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

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
            return ItemInit.STEEL_SCRAP.get().getDefaultInstance();
        }
    };

    public DimensionalAdventures() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        SoundInit               .SOUNDS                  .register(bus);
        BlockEntityInit         .BLOCK_ENTITIES          .register(bus);
        BlockInit               .BLOCKS                  .register(bus);
        ItemInit                .ITEMS                   .register(bus);
        EntityInit              .ENTITIES                .register(bus);

        ModFluids.register(bus);

        SeramaniaBiomes.register(bus);

        ModDimensions.register();
    }
}
