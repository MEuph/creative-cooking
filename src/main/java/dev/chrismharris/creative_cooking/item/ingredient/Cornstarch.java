package dev.chrismharris.creative_cooking.item.ingredient;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.world.item.Item;

public class Cornstarch extends Item {

    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB);

    public Cornstarch() {
        super(Cornstarch.PROPERTIES);
    }
}
