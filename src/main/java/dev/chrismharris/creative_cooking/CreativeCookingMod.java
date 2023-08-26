package dev.chrismharris.creative_cooking;

import dev.chrismharris.creative_cooking.register.BlockRegister;
import dev.chrismharris.creative_cooking.register.EntityRegister;
import dev.chrismharris.creative_cooking.register.FluidRegister;
import dev.chrismharris.creative_cooking.register.ItemRegister;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("creative_cooking")
public class CreativeCookingMod {

    public static final String MOD_ID = "creative_cooking";

    public static final CreativeModeTab CC_TAB = new CreativeModeTab(MOD_ID) {
        @Override
        @OnlyIn(Dist.CLIENT)
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ItemRegister.BREAD_SLICE.get());
        }
    };

    public CreativeCookingMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        EntityRegister.ENTITY_TYPES.register(bus);
        FluidRegister.FLUIDS.register(bus);
        BlockRegister.BLOCKS.register(bus);
        ItemRegister.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            SpawnPlacements.register(EntityRegister.SHRIMP_ENTITY.get(),
                    SpawnPlacements.Type.IN_WATER,
                    Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    WaterAnimal::checkSurfaceWaterAnimalSpawnRules
            );
        });
    }
}
