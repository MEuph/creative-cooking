package dev.chrismharris.creative_cooking.item.seed;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.register.BlockRegister;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemNameBlockItem;

public class CornSeeds extends ItemNameBlockItem {

    public static final Properties PROPERTIES = new Properties()
            .food(new FoodProperties.Builder()
                    .saturationMod(1f)
                    .nutrition(1)
                    .fast()
                    .build())
            .tab(CreativeCookingMod.CC_TAB);

    public CornSeeds() {
        super(BlockRegister.CORN_CROP.get(), CornSeeds.PROPERTIES);
    }
}
