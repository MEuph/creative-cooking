package dev.chrismharris.creative_cooking.item.ingredient;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.world.item.Item;

public class CowStomach extends Item {

    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB);

    public CowStomach() {
        super(CowStomach.PROPERTIES);
    }
}
