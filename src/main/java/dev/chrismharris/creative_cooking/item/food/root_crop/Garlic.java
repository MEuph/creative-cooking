package dev.chrismharris.creative_cooking.item.food.root_crop;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.register.BlockRegister;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemNameBlockItem;

public class Garlic extends ItemNameBlockItem {
    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB)
            .food(new FoodProperties.Builder()
                    .saturationMod(1f)
                    .nutrition(1)
                    .fast()
                    .build()
            );

    public Garlic() {
        super(BlockRegister.GARLIC_CROP.get(), PROPERTIES);
    }
}
