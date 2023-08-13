package dev.chrismharris.creative_cooking.datagen.server;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(DataGenerator generator, @Nullable ExistingFileHelper helper) {
        super(generator, CreativeCookingMod.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
//        tag(Tags.Blocks.COBBLESTONE).add(BlockRegister.EXAMPLE_BLOCK.get());
    }
}
