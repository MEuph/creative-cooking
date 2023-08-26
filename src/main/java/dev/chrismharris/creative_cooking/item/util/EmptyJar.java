package dev.chrismharris.creative_cooking.item.util;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.world.item.Item;

public class EmptyJar extends Item {

    public static final Properties PROPERTIES = new Properties()
            .stacksTo(16)
            .tab(CreativeCookingMod.CC_TAB);


    public EmptyJar() {
        super(EmptyJar.PROPERTIES);
    }
}
