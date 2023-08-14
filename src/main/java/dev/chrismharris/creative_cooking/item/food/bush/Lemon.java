package dev.chrismharris.creative_cooking.item.food.bush;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.register.BlockRegister;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;

public class Lemon extends Item {
    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB)
            .food(new FoodProperties.Builder()
                    .saturationMod(1f)
                    .nutrition(2)
                    .build()
            );

    public Lemon() {
        super(PROPERTIES);
    }
}
