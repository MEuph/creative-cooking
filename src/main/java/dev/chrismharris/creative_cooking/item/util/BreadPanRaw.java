package dev.chrismharris.creative_cooking.item.util;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BreadPanRaw extends Item {

    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB);


    public BreadPanRaw() {
        super(BreadPanRaw.PROPERTIES);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, List<Component> pTooltipComponents,
                                @NotNull TooltipFlag isAdvanced) {
        pTooltipComponents.add(new TranslatableComponent("tooltip.creative_cooking.bread_pan_raw.tooltip"));
    }
}
