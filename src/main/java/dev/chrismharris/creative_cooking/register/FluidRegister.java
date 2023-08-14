package dev.chrismharris.creative_cooking.register;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
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

public class FluidRegister {
    // Fluid color is in format ARBG

    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

    public static final ResourceLocation MILK_STILL_RL = new ResourceLocation("forge", "block/milk_still");
    public static final ResourceLocation MILK_FLOWING_RL = new ResourceLocation("forge", "block/milk_flowing");

    public static final DeferredRegister<Fluid> FLUIDS
            = DeferredRegister.create(ForgeRegistries.FLUIDS, CreativeCookingMod.MOD_ID);

    public static final RegistryObject<FlowingFluid> SKIM_MILK_FLUID
            = FLUIDS.register("skim_milk_fluid", () -> new ForgeFlowingFluid.Source(FluidRegister.SKIM_MILK_PROPERTIES));

    public static final RegistryObject<FlowingFluid> SKIM_MILK_FLOWING
            = FLUIDS.register("skim_milk_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegister.SKIM_MILK_PROPERTIES));

    public static final ForgeFlowingFluid.Properties SKIM_MILK_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> SKIM_MILK_FLUID.get(), () -> SKIM_MILK_FLOWING.get(), FluidAttributes.builder(MILK_STILL_RL, MILK_FLOWING_RL)
            .density(1500).luminosity(2).viscosity(800).sound(SoundEvents.BUCKET_EMPTY).overlay(WATER_OVERLAY_RL)
            .color(0xffe0e0e0)).slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(() -> FluidRegister.SKIM_MILK_BLOCK.get()).bucket(() -> ItemRegister.SKIM_MILK_BUCKET.get()
            );

    public static final RegistryObject<LiquidBlock> SKIM_MILK_BLOCK = BlockRegister.BLOCKS.register("skim_milk",
            () -> new LiquidBlock(() -> FluidRegister.SKIM_MILK_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops())
    );

    public static final RegistryObject<FlowingFluid> CREAM_FLUID
            = FLUIDS.register("cream_fluid", () -> new ForgeFlowingFluid.Source(FluidRegister.CREAM_PROPERTIES));

    public static final RegistryObject<FlowingFluid> CREAM_FLOWING
            = FLUIDS.register("cream_flowing", () -> new ForgeFlowingFluid.Flowing(FluidRegister.CREAM_PROPERTIES));

    public static final ForgeFlowingFluid.Properties CREAM_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> CREAM_FLUID.get(), () -> CREAM_FLOWING.get(), FluidAttributes.builder(MILK_STILL_RL, MILK_FLOWING_RL)
            .density(1024).viscosity(1024).sound(SoundEvents.BUCKET_EMPTY).overlay(WATER_OVERLAY_RL)
            .color(0xffffffff)).slopeFindDistance(2).levelDecreasePerBlock(3)
            .block(() -> FluidRegister.CREAM_BLOCK.get()).bucket(() -> ItemRegister.CREAM_BUCKET.get()
            );

    public static final RegistryObject<LiquidBlock> CREAM_BLOCK = BlockRegister.BLOCKS.register("cream",
            () -> new LiquidBlock(() -> FluidRegister.CREAM_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noCollission().strength(100f).noDrops())
    );

    public static void register(IEventBus bus) {
        FLUIDS.register(bus);
    }
}