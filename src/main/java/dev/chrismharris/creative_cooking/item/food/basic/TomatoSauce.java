package dev.chrismharris.creative_cooking.item.food.basic;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.register.ItemRegister;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BowlFoodItem;

public class TomatoSauce extends BowlFoodItem {

    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB)
            .food(new FoodProperties.Builder()
                    .saturationMod(2f)
                    .nutrition(3)
                    .build()
            )
            .craftRemainder(ItemRegister.EMPTY_JAR.get()
    );

    public TomatoSauce() {
        super(PROPERTIES);
    }

}
