package dev.chrismharris.creative_cooking.item.food.bush;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class Tomato extends Item {
    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB)
            .food(new FoodProperties.Builder()
                    .saturationMod(1f)
                    .nutrition(2)
                    .build()
            );

    public Tomato() {
        super(PROPERTIES);
    }
}
