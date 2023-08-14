package dev.chrismharris.creative_cooking.item.ingredient;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.register.BlockRegister;
import net.minecraft.world.item.Item;

public class CornGrits extends Item {

    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB);

    public CornGrits() {
        super(CornGrits.PROPERTIES);
    }
}
