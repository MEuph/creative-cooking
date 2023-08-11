package dev.chrismharris.creative_cooking.datagen.server;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(DataGenerator generator, BlockTagsProvider provider, @Nullable ExistingFileHelper helper) {
        super(generator, provider, CreativeCookingMod.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.COBBLESTONE).add(BlockInit.EXAMPLE_BLOCK.get().asItem());
    }
}
