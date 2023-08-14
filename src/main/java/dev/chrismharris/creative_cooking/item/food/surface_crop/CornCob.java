package dev.chrismharris.creative_cooking.item.food.surface_crop;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class CornCob extends Item {
    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB)
            .food(new FoodProperties.Builder()
                    .saturationMod(3f)
                    .nutrition(6)
                    .build()
            );

    public CornCob() {
        super(CornCob.PROPERTIES);
    }


}
