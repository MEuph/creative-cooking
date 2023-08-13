package dev.chrismharris.creative_cooking.register;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.item.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class ItemRegister {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreativeCookingMod.MOD_ID);

    public static final RegistryObject<Item> BREAD_SLICE = register("bread_slice", BreadSlice::new);
    public static final RegistryObject<Item> CORN_COB = register("corn_cob", CornCob::new);
    public static final RegistryObject<Item> CORN_SEEDS = register("corn_seeds", CornSeeds::new);
    public static final RegistryObject<Item> SOAP = register("soap", Soap::new);
    public static final RegistryObject<Item> STRAWBERRY = register("strawberry", Strawberry::new);
    public static final RegistryObject<Item> LEMON = register("lemon", Lemon::new);
    public static final RegistryObject<Item> LIME = register("lime", Lime::new);
    public static final RegistryObject<Item> TOMATO = register("tomato", Tomato::new);
    public static final RegistryObject<Item> LEMON_SEEDS = register("lemon_seeds", LemonSeeds::new);
    public static final RegistryObject<Item> LIME_SEEDS = register("lime_seeds", LimeSeeds::new);
    public static final RegistryObject<Item> TOMATO_SEEDS = register("tomato_seeds", TomatoSeeds::new);
    public static final RegistryObject<Item> PEANUT = register("peanut", Peanut::new);
    public static final RegistryObject<Item> ONION = register("onion", Onion::new);
    public static final RegistryObject<Item> GARLIC = register("garlic", Garlic::new);

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }
}
