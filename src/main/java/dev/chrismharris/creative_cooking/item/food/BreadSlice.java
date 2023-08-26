package dev.chrismharris.creative_cooking.item.food;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class BreadSlice extends Item {
    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB)
            .food(new FoodProperties.Builder()
                    .saturationMod(0.1f)
                    .nutrition(1)
                    .fast()
                    .build()
            );

    public BreadSlice() {
        super(BreadSlice.PROPERTIES);
    }


}
