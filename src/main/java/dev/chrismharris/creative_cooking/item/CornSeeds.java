package dev.chrismharris.creative_cooking.item;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.register.BlockRegister;
import net.minecraft.world.item.ItemNameBlockItem;

public class CornSeeds extends ItemNameBlockItem {

    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB);

    public CornSeeds() {
        super(BlockRegister.CORN_CROP.get(), CornSeeds.PROPERTIES);
    }
}
