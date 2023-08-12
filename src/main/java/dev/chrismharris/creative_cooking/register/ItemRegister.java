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

    public static final RegistryObject<Item> BREAD_SLICE = register("bread_slice", BreadSlice::new);
    public static final RegistryObject<Item> CORN_COB = register("corn_cob", CornCob::new);
    public static final RegistryObject<Item> CORN_SEEDS = register("corn_seeds", CornSeeds::new);
    public static final RegistryObject<Item> SOAP = register("soap", Soap::new);

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }
}
