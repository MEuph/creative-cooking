package dev.chrismharris.creative_cooking.item.food.meat;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class CookedShrimp extends Item {
    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB)
            .food(new FoodProperties.Builder()
                    .saturationMod(3f)
                    .nutrition(3)
                    .meat()
                    .build()
            );

    public CookedShrimp() {
        super(PROPERTIES);
    }
}
