package dev.chrismharris.creative_cooking.item;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class ExampleFuel extends Item {
    public static final Properties PROPERTIES = new Properties().tab(CreativeCookingMod.CC_TAB);

    public ExampleFuel() {
        super(ExampleFuel.PROPERTIES);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 100; // 5 seconds
    }
}
