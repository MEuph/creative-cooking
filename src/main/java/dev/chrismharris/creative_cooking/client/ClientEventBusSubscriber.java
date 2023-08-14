package dev.chrismharris.creative_cooking.client;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.register.EntityRegister;
import dev.chrismharris.creative_cooking.entity.shrimp.ShrimpEntityModel;
import dev.chrismharris.creative_cooking.entity.shrimp.ShrimpEntityRenderer;
import dev.chrismharris.creative_cooking.register.BlockRegister;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid= CreativeCookingMod.MOD_ID,bus= Mod.EventBusSubscriber.Bus.MOD,value= Dist.CLIENT)
public class ClientEventBusSubscriber {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ShrimpEntityModel.LAYER_LOCATION, ShrimpEntityModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void clientBlockSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.BREAD_LOAF.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.BREAD_PAN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.COOKED_BREAD_PAN.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(BlockRegister.BREAD_PAN_RAW.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(BlockRegister.BREAD_PAN_DIRTY.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(BlockRegister.BREAD_PAN_DIRTY_FILLED.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.CORN_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.PEANUT_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.ONION_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.GARLIC_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.STRAWBERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.LEMON_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.LIME_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.TOMATO_BUSH.get(), RenderType.cutout());

        EntityRenderers.register(EntityRegister.SHRIMP_ENTITY.get(), ShrimpEntityRenderer::new);
    }
}
