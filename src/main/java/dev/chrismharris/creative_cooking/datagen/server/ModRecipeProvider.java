package dev.chrismharris.creative_cooking.datagen.server;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.init.BlockInit;
import dev.chrismharris.creative_cooking.init.ItemInit;
import dev.chrismharris.creative_cooking.init.TagInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.Objects;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        // Shaped recipe
        ShapedRecipeBuilder.shaped(ItemInit.EXAMPLE_ITEM.get())
                .define('a', BlockInit.EXAMPLE_BLOCK.get().asItem())
                .define('b', TagInit.Items.COOL_ITEMS)
                .pattern("aba")
                .pattern("bab")
                .pattern("aba")
                .save(pFinishedRecipeConsumer,
                        new ResourceLocation(
                                CreativeCookingMod.MOD_ID,
                                Objects.requireNonNull(ItemInit.EXAMPLE_ITEM.get()
                                        .getRegistryName())
                                        .getPath() + "_recipe"
                        )
                );

        // Shapeless recipe
        ShapelessRecipeBuilder.shapeless(BlockInit.EXAMPLE_BLOCK.get().asItem(), 4)
                .requires(ItemInit.EXAMPLE_ITEM.get())
                .requires(ItemInit.EXAMPLE_ITEM.get())
                .requires(ItemInit.EXAMPLE_ITEM.get())
                .requires(Items.DIAMOND)
                .save(pFinishedRecipeConsumer,
                        new ResourceLocation(
                                CreativeCookingMod.MOD_ID,
                                Objects.requireNonNull(BlockInit.EXAMPLE_BLOCK.get()
                                        .getRegistryName())
                                        .getPath() + "_recipe"
                        )
                );

        // Cooking recipe
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemInit.EXAMPLE_FOOD.get()), ItemInit.EXAMPLE_FUEL.get(), 1f, 20)
                .save(pFinishedRecipeConsumer, new ResourceLocation(CreativeCookingMod.MOD_ID, Objects.requireNonNull(ItemInit.EXAMPLE_FUEL.get().getRegistryName()).getPath() + "_smelting"));


    }
}
