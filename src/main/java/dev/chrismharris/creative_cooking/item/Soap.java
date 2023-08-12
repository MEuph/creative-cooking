package dev.chrismharris.creative_cooking.item;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.register.BlockRegister;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;

public class Soap extends Item {

    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB);


    public Soap() {
        super(Soap.PROPERTIES);
    }
}
