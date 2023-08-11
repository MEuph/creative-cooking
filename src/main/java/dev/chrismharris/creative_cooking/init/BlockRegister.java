package dev.chrismharris.creative_cooking.init;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.block.BreadLoaf;
import dev.chrismharris.creative_cooking.block.ExampleBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;
import java.util.function.Supplier;

public class BlockRegister {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CreativeCookingMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = ItemRegister.ITEMS;

    public static final RegistryObject<Block> EXAMPLE_BLOCK = register(
            "example_block",
            ExampleBlock::new,
            object -> () -> new BlockItem(object.get(), ExampleBlock.ITEM_PROPERTIES)
    );

    public static final RegistryObject<Block> BREAD_LOAF = register(
            "bread_loaf",
            BreadLoaf::new,
            object -> () -> new BlockItem(object.get(), BreadLoaf.ITEM_PROPERTIES)
    );

    private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block,
                                                                @NotNull Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> obj = registerBlock(name, block);
        ITEMS.register(name, item.apply(obj));
        return obj;
    }
}
