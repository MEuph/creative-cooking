package dev.chrismharris.creative_cooking.client.lang;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.register.BlockRegister;
import dev.chrismharris.creative_cooking.register.ItemRegister;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnUsProvider extends LanguageProvider {

    public ModEnUsProvider(DataGenerator gen) {
        super(gen, CreativeCookingMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Item Groups
        add("itemGroup.creative_cooking", "Creative Cooking");

        // Items
        add(ItemRegister.BREAD_SLICE.get(), "Slice of Bread");
        add(ItemRegister.CORN_COB.get(), "Corn");
        add(ItemRegister.CORN_SEEDS.get(), "Corn Seeds");

        // Blocks
        add(BlockRegister.CORN_CROP.get(), "Corn Crop");
        add(BlockRegister.BREAD_LOAF.get(), "Loaf of Bread");
        add(BlockRegister.BREAD_PAN.get(), "Bread Pan (Empty)");
    }

}
