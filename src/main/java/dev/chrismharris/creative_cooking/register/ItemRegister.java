package dev.chrismharris.creative_cooking.register;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.item.food.*;
import dev.chrismharris.creative_cooking.item.food.basic.*;
import dev.chrismharris.creative_cooking.item.food.bush.*;;
import dev.chrismharris.creative_cooking.item.food.meat.*;
import dev.chrismharris.creative_cooking.item.food.root_crop.*;
import dev.chrismharris.creative_cooking.item.food.surface_crop.*;
import dev.chrismharris.creative_cooking.item.ingredient.*;
import dev.chrismharris.creative_cooking.item.seed.*;
import dev.chrismharris.creative_cooking.item.util.*;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@SuppressWarnings({"unused"})
public class ItemRegister {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreativeCookingMod.MOD_ID);

    public static final RegistryObject<Item> BREAD_SLICE = register("bread_slice", BreadSlice::new);
    public static final RegistryObject<Item> CORN_COB = register("corn_cob", CornCob::new);
    public static final RegistryObject<Item> CORN_SEEDS = register("corn_seeds", CornSeeds::new);
    public static final RegistryObject<Item> SOAP = register("soap", Soap::new);
    public static final RegistryObject<Item> EMPTY_JAR = register("empty_jar", EmptyJar::new);
    public static final RegistryObject<Item> STRAWBERRY = register("strawberry", Strawberry::new);
    public static final RegistryObject<Item> STRAWBERRY_JAM = register("strawberry_jam", StrawberryJam::new);
    public static final RegistryObject<Item> LEMON = register("lemon", Lemon::new);
    public static final RegistryObject<Item> LIME = register("lime", Lime::new);
    public static final RegistryObject<Item> TOMATO = register("tomato", Tomato::new);
    public static final RegistryObject<Item> LEMON_SEEDS = register("lemon_seeds", LemonSeeds::new);
    public static final RegistryObject<Item> LIME_SEEDS = register("lime_seeds", LimeSeeds::new);
    public static final RegistryObject<Item> TOMATO_SEEDS = register("tomato_seeds", TomatoSeeds::new);
    public static final RegistryObject<Item> PEANUT = register("peanut", Peanut::new);
    public static final RegistryObject<Item> ONION = register("onion", Onion::new);
    public static final RegistryObject<Item> GARLIC = register("garlic", Garlic::new);
    public static final RegistryObject<Item> SHRIMP_SPAWN_EGG = ITEMS.register("shrimp_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityRegister.SHRIMP_ENTITY, 0x948e8d, 0x3b3635,
                    new Item.Properties().tab(CreativeCookingMod.CC_TAB
                    )));
    public static final RegistryObject<Item> RAW_SHRIMP = register("raw_shrimp", RawShrimp::new);
    public static final RegistryObject<Item> SLICED_CHICKEN = register("sliced_chicken", SlicedChicken::new);
    public static final RegistryObject<Item> DICED_CHICKEN = register("diced_chicken", DicedChicken::new);
    public static final RegistryObject<Item> GROUND_BEEF = register("ground_beef", GroundBeef::new);
    public static final RegistryObject<Item> COOKED_SHRIMP = register("cooked_shrimp", CookedShrimp::new);
    public static final RegistryObject<Item> BREAD_PAN_RAW = register("bread_pan_raw", BreadPanRaw::new);
    ;
    public static final RegistryObject<Item> BREAD_PAN_DIRTY = register("bread_pan_dirty", BreadPanRaw::new);
    public static final RegistryObject<Item> CORN_GRITS = register("corn_grits", CornGrits::new);
    public static final RegistryObject<Item> CORNSTARCH = register("cornstarch", Cornstarch::new);
    public static final RegistryObject<Item> BOWL_OF_GRITS = register("bowl_of_grits", BowlOfGrits::new);

    public static final RegistryObject<BucketItem> SKIM_MILK_BUCKET = register("skim_milk_bucket",
            () -> new BucketItem(FluidRegister.SKIM_MILK_FLUID,
                    new Item.Properties().tab(CreativeCookingMod.CC_TAB).stacksTo(1).craftRemainder(Items.BUCKET))
    );
    public static final RegistryObject<BucketItem> CREAM_BUCKET = register("cream_bucket",
            () -> new BucketItem(FluidRegister.CREAM_FLUID,
                    new Item.Properties().tab(CreativeCookingMod.CC_TAB).stacksTo(1).craftRemainder(Items.BUCKET))
    );

    public static final RegistryObject<BucketItem> BUTTER_BUCKET = register("butter_bucket",
            () -> new BucketItem(FluidRegister.BUTTER_FLUID,
                    new Item.Properties().tab(CreativeCookingMod.CC_TAB).stacksTo(1).craftRemainder(Items.BUCKET))
    );
    public static final RegistryObject<BucketItem> BUTTERMILK_BUCKET = register("buttermilk_bucket",
            () -> new BucketItem(FluidRegister.BUTTERMILK_FLUID,
                    new Item.Properties().tab(CreativeCookingMod.CC_TAB).stacksTo(1).craftRemainder(Items.BUCKET))
    );
    public static final RegistryObject<BucketItem> MOZZARELLA_BUCKET = register("mozzarella_bucket",
            () -> new BucketItem(FluidRegister.MOZZARELLA_FLUID,
                    new Item.Properties().tab(CreativeCookingMod.CC_TAB).stacksTo(1).craftRemainder(Items.BUCKET))
    );

    public static final RegistryObject<BucketItem> STRAWBERRY_JAM_BUCKET = register("strawberry_jam_bucket",
            () -> new BucketItem(FluidRegister.STRAWBERRY_JAM_FLUID,
                    new Item.Properties().tab(CreativeCookingMod.CC_TAB).stacksTo(1).craftRemainder(Items.BUCKET))
    );

    public static final RegistryObject<BucketItem> PEANUT_OIL_BUCKET = register("peanut_oil_bucket",
            () -> new BucketItem(FluidRegister.PEANUT_OIL_FLUID,
                    new Item.Properties().tab(CreativeCookingMod.CC_TAB).stacksTo(1).craftRemainder(Items.BUCKET))
    );
    
    public static final RegistryObject<Item> BUTTER_STICK = register("butter_stick", ButterStick::new);
    public static final RegistryObject<Item> MOZZARELLA_BALL = register("mozzarella_ball", MozzarellaBall::new);
    public static final RegistryObject<Item> COW_STOMACH = register("cow_stomach", CowStomach::new);
    public static final RegistryObject<Item> RENNET = register("rennet", Rennet::new);
    public static final RegistryObject<Item> SALT = register("salt", Salt::new);

    static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }
}
