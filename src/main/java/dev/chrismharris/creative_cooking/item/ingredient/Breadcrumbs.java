package dev.chrismharris.creative_cooking.item.ingredient;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.world.item.Item;

public class Breadcrumbs extends Item {

    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB);

    public Breadcrumbs() {
        super(Breadcrumbs.PROPERTIES);
    }
}
