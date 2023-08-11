package dev.chrismharris.creative_cooking.client.lang;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.init.BlockRegister;
import dev.chrismharris.creative_cooking.init.ItemRegister;
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
        add(ItemRegister.EXAMPLE_ITEM.get(), "Example Item");
        add(ItemRegister.EXAMPLE_FUEL.get(), "Example Fuel");
        add(ItemRegister.EXAMPLE_FOOD.get(), "Example Food");

        // Blocks
        add(BlockRegister.EXAMPLE_BLOCK.get(), "Example Block");
    }

}
