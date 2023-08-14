package dev.chrismharris.creative_cooking.register;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.block.BreadLoaf;
import dev.chrismharris.creative_cooking.block.BreadPan;
import dev.chrismharris.creative_cooking.block.CookedBreadPan;
import dev.chrismharris.creative_cooking.block.bush.LemonBushBlock;
import dev.chrismharris.creative_cooking.block.bush.LimeBushBlock;
import dev.chrismharris.creative_cooking.block.bush.StrawberryBushBlock;
import dev.chrismharris.creative_cooking.block.bush.TomatoBushBlock;
import dev.chrismharris.creative_cooking.block.crop.CornCropBlock;
import dev.chrismharris.creative_cooking.block.crop.GarlicCropBlock;
import dev.chrismharris.creative_cooking.block.crop.OnionCropBlock;
import dev.chrismharris.creative_cooking.block.crop.PeanutCropBlock;
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

    public static final RegistryObject<Block> COOKED_BREAD_PAN = register(
            "cooked_bread_pan",
            CookedBreadPan::new,
            object -> () -> new BlockItem(object.get(), CookedBreadPan.ITEM_PROPERTIES)
    );

//    public static final RegistryObject<Block> BREAD_PAN_RAW = register(
//            "bread_pan_raw",
//            BreadPanRaw::new,
//            object -> () -> new BlockItem(object.get(), BreadPanRaw.ITEM_PROPERTIES)
//    );
//
//    public static final RegistryObject<Block> BREAD_PAN_DIRTY = register(
//            "bread_pan_dirty",
//            BreadPanDirty::new,
//            object -> () -> new BlockItem(object.get(), BreadPanDirty.ITEM_PROPERTIES)
//    );
//
//    public static final RegistryObject<Block> BREAD_PAN_DIRTY_FILLED = register(
//            "bread_pan_dirty_filled",
//            BreadPanDirtyFilled::new,
//            object -> () -> new BlockItem(object.get(), BreadPanDirtyFilled.ITEM_PROPERTIES)
//    );

    public static final RegistryObject<Block> CORN_CROP = registerBlockWithoutBlockItem(
            "corn_crop",
            () -> new CornCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion())
    );

    public static final RegistryObject<Block> PEANUT_CROP = registerBlockWithoutBlockItem(
            "peanut_crop",
            PeanutCropBlock::new
    );

    public static final RegistryObject<Block> ONION_CROP = registerBlockWithoutBlockItem(
            "onion_crop",
            OnionCropBlock::new
    );

    public static final RegistryObject<Block> GARLIC_CROP = registerBlockWithoutBlockItem(
            "garlic_crop",
            GarlicCropBlock::new
    );

    public static final RegistryObject<Block> STRAWBERRY_BUSH = registerBlockWithoutBlockItem(
            "strawberry_bush",
            () -> new StrawberryBushBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).noOcclusion())
    );

    public static final RegistryObject<Block> LEMON_BUSH = registerBlockWithoutBlockItem(
            "lemon_bush",
            () -> new LemonBushBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).noOcclusion())
    );
    public static final RegistryObject<Block> LIME_BUSH = registerBlockWithoutBlockItem(
            "lime_bush",
            () -> new LimeBushBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).noOcclusion())
    );
    public static final RegistryObject<Block> TOMATO_BUSH = registerBlockWithoutBlockItem(
            "tomato_bush",
            () -> new TomatoBushBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).noOcclusion())
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
