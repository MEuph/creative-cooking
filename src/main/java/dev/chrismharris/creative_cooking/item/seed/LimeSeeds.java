package dev.chrismharris.creative_cooking.item.seed;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.register.BlockRegister;
import net.minecraft.world.item.ItemNameBlockItem;

public class LimeSeeds extends ItemNameBlockItem {
    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB);

    public LimeSeeds() {
        super(BlockRegister.LIME_BUSH.get(), PROPERTIES);
    }
}
