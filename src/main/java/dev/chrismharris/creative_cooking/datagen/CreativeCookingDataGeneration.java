package dev.chrismharris.creative_cooking.datagen;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.client.lang.ModEnUsProvider;
import dev.chrismharris.creative_cooking.datagen.client.ModBlockStateProvider;
import dev.chrismharris.creative_cooking.datagen.client.ModItemModelProvider;
import dev.chrismharris.creative_cooking.datagen.server.ModBlockTagsProvider;
import dev.chrismharris.creative_cooking.datagen.server.ModItemTagsProvider;
import dev.chrismharris.creative_cooking.datagen.server.ModRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = CreativeCookingMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeCookingDataGeneration {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if (event.includeClient()) {
            generator.addProvider(new ModBlockStateProvider(generator, helper));
            generator.addProvider(new ModItemModelProvider(generator, helper));
            generator.addProvider(new ModEnUsProvider(generator));
        }

        if (event.includeServer()) {
            ModBlockTagsProvider blockTags = new ModBlockTagsProvider(generator, helper);

            generator.addProvider(new ModRecipeProvider(generator));
            generator.addProvider(blockTags);
            generator.addProvider(new ModItemTagsProvider(generator, blockTags, helper));
        }
    }
}