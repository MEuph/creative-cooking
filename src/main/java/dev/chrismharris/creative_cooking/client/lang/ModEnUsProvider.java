package dev.chrismharris.creative_cooking.client.lang;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.init.BlockInit;
import dev.chrismharris.creative_cooking.init.ItemInit;
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
        add(ItemInit.EXAMPLE_ITEM.get(), "Example Item");
        add(ItemInit.EXAMPLE_FUEL.get(), "Example Fuel");
        add(ItemInit.EXAMPLE_FOOD.get(), "Example Food");

        // Blocks
        add(BlockInit.EXAMPLE_BLOCK.get(), "Example Block");
    }

}
