package dev.chrismharris.creative_cooking.client;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.register.BlockRegister;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid= CreativeCookingMod.MOD_ID,bus= Mod.EventBusSubscriber.Bus.MOD,value= Dist.CLIENT)
public class ClientEventBusSubscriber {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.BREAD_LOAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.BREAD_PAN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.BREAD_PAN_RAW.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.BREAD_PAN_DIRTY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.BREAD_PAN_DIRTY_FILLED.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.CORN_CROP.get(), RenderType.cutout());
    }
}
