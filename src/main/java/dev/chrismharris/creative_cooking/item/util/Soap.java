package dev.chrismharris.creative_cooking.item.util;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.world.item.Item;

public class Soap extends Item {

    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB);


    public Soap() {
        super(Soap.PROPERTIES);
    }
}
