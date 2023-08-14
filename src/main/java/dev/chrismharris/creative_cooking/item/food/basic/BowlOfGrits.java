package dev.chrismharris.creative_cooking.item.food.basic;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BowlFoodItem;

public class BowlOfGrits extends BowlFoodItem {

    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB)
            .food(new FoodProperties.Builder()
                    .saturationMod(3f)
                    .nutrition(4)
                    .build()
            );

    public BowlOfGrits() {
        super(PROPERTIES);
    }

}
