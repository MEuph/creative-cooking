package dev.chrismharris.creative_cooking.item.food.meat;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class SlicedChicken extends Item {
    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB)
            .food(new FoodProperties.Builder()
                    .saturationMod(0f)
                    .nutrition(1)
                    .effect(() -> new MobEffectInstance(MobEffects.POISON, 20 * 10, 0), 0.75f)
                    .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 20 * 30, 0), 0.25f)
                    .meat()
                    .build()
            );

    public SlicedChicken() {
        super(PROPERTIES);
    }
}
