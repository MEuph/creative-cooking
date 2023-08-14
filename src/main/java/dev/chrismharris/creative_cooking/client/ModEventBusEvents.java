package dev.chrismharris.creative_cooking.client;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.register.EntityRegister;
import dev.chrismharris.creative_cooking.entity.shrimp.ShrimpEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid= CreativeCookingMod.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(EntityRegister.SHRIMP_ENTITY.get(), ShrimpEntity.setAttributes());
    }
}
