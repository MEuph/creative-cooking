package dev.chrismharris.creative_cooking.datagen.server;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        // Shaped recipe
//        ShapedRecipeBuilder.shaped(ItemRegister.EXAMPLE_ITEM.get())
//                .define('a', BlockRegister.EXAMPLE_BLOCK.get().asItem())
//                .define('b', TagRegister.Items.COOL_ITEMS)
//                .pattern("aba")
//                .pattern("bab")
//                .pattern("aba")
//                .save(pFinishedRecipeConsumer,
//                        new ResourceLocation(
//                                CreativeCookingMod.MOD_ID,
//                                Objects.requireNonNull(ItemRegister.EXAMPLE_ITEM.get()
//                                        .getRegistryName())
//                                        .getPath() + "_recipe"
//                        )
//                );
//
//        // Shapeless recipe
//        ShapelessRecipeBuilder.shapeless(BlockRegister.EXAMPLE_BLOCK.get().asItem(), 4)
//                .requires(ItemRegister.EXAMPLE_ITEM.get())
//                .requires(ItemRegister.EXAMPLE_ITEM.get())
//                .requires(ItemRegister.EXAMPLE_ITEM.get())
//                .requires(Items.DIAMOND)
//                .save(pFinishedRecipeConsumer,
//                        new ResourceLocation(
//                                CreativeCookingMod.MOD_ID,
//                                Objects.requireNonNull(BlockRegister.EXAMPLE_BLOCK.get()
//                                        .getRegistryName())
//                                        .getPath() + "_recipe"
//                        )
//                );
//
//        // Cooking recipe
//        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegister.EXAMPLE_FOOD.get()), ItemRegister.EXAMPLE_FUEL.get(), 1f, 20)
//                .save(pFinishedRecipeConsumer, new ResourceLocation(CreativeCookingMod.MOD_ID, Objects.requireNonNull(ItemRegister.EXAMPLE_FUEL.get().getRegistryName()).getPath() + "_smelting"));
//

    }
}
