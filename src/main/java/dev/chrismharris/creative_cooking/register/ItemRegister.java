package dev.chrismharris.creative_cooking.register;

import dev.chrismharris.creative_cooking.item.*;
import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemRegister {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreativeCookingMod.MOD_ID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", ExampleItem::new);
    public static final RegistryObject<Item> EXAMPLE_FUEL = register("example_fuel", ExampleFuel::new);

    public static final RegistryObject<Item> EXAMPLE_FOOD = register("example_food", ExampleFood::new);

    public static final RegistryObject<Item> BREAD_SLICE = register("bread_slice", BreadSlice::new);

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }

}
