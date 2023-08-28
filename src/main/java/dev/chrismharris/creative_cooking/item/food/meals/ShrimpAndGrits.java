package dev.chrismharris.creative_cooking.item.food.meals;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Items;

public class ShrimpAndGrits extends BowlFoodItem {

    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB)
            .food(new FoodProperties.Builder()
                    .saturationMod(7f)
                    .nutrition(11)
                    .build()
            ).craftRemainder(Items.BOWL);

    public ShrimpAndGrits() {
        super(PROPERTIES);
    }

}
