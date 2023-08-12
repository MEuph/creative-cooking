package dev.chrismharris.creative_cooking.register;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.block.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;
import java.util.function.Supplier;

public class BlockRegister {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CreativeCookingMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = ItemRegister.ITEMS;

    public static final RegistryObject<Block> BREAD_LOAF = register(
            "bread_loaf",
            BreadLoaf::new,
            object -> () -> new BlockItem(object.get(), BreadLoaf.ITEM_PROPERTIES)
    );

    public static final RegistryObject<Block> BREAD_PAN = register(
            "bread_pan",
            BreadPan::new,
            object -> () -> new BlockItem(object.get(), BreadPan.ITEM_PROPERTIES)
    );

    public static final RegistryObject<Block> BREAD_PAN_RAW = register(
            "bread_pan_raw",
            BreadPanRaw::new,
            object -> () -> new BlockItem(object.get(), BreadPanRaw.ITEM_PROPERTIES)
    );

    public static final RegistryObject<Block> BREAD_PAN_DIRTY = register(
            "bread_pan_dirty",
            BreadPanDirty::new,
            object -> () -> new BlockItem(object.get(), BreadPanDirty.ITEM_PROPERTIES)
    );

    public static final RegistryObject<Block> BREAD_PAN_DIRTY_FILLED = register(
            "bread_pan_dirty_filled",
            BreadPanDirtyFilled::new,
            object -> () -> new BlockItem(object.get(), BreadPanDirtyFilled.ITEM_PROPERTIES)
    );

    public static final RegistryObject<Block> CORN_CROP = registerBlockWithoutBlockItem(
            "corn_crop",
            () -> new CornCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion())
    );

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

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
