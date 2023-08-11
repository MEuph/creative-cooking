package dev.chrismharris.creative_cooking.datagen.server;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.init.BlockInit;
import dev.chrismharris.creative_cooking.init.TagInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(DataGenerator generator, @Nullable ExistingFileHelper helper) {
        super(generator, CreativeCookingMod.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Blocks.COBBLESTONE).add(BlockInit.EXAMPLE_BLOCK.get());
    }
}
