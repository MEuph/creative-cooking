package dev.chrismharris.creative_cooking.item;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.register.BlockRegister;
import net.minecraft.world.item.ItemNameBlockItem;

public class TomatoSeeds extends ItemNameBlockItem {
    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB);

    public TomatoSeeds() {
        super(BlockRegister.TOMATO_BUSH.get(), PROPERTIES);
    }
}
