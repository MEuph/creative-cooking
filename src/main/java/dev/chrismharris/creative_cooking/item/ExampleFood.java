package dev.chrismharris.creative_cooking.item;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class ExampleFood extends Item {
    public static final Properties PROPERTIES = new Properties()
            .tab(CreativeCookingMod.CC_TAB)
            .food(new FoodProperties.Builder()
                    .alwaysEat()
                    .fast()
                    .effect(() -> new MobEffectInstance(MobEffects.BAD_OMEN, 200, 0), 1f)
                    .build()
            );

    private ExampleFood(Properties properties) {
        super(properties);
    }

    public ExampleFood() {
        super(ExampleFood.PROPERTIES);
    }


}
