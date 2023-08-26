package dev.chrismharris.creative_cooking.item.food.basic;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class MincedGarlic extends Item {
    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB)
            .food(new FoodProperties.Builder()
                    .saturationMod(0f)
                    .nutrition(1)
                    .build()
            );

    public MincedGarlic() {
        super(PROPERTIES);
    }
}
