package dev.chrismharris.creative_cooking.item.ingredient;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class RoastedPeanuts extends Item {

    public static final Properties PROPERTIES = new Properties()
            .food(new FoodProperties.Builder()
                    .saturationMod(3f)
                    .fast()
                    .nutrition(4)
                    .build())
            .tab(CreativeCookingMod.CC_TAB);

    public RoastedPeanuts() {
        super(RoastedPeanuts.PROPERTIES);
    }
}
