package dev.chrismharris.creative_cooking.datagen.client;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Objects;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, CreativeCookingMod.MOD_ID, helper);
    }

    protected void simpleBlockItem(Item item) {
        getBuilder(Objects.requireNonNull(item.getRegistryName()).toString())
                .parent(getExistingFile(modLoc("block/" + item.getRegistryName().getPath())));
    }

    protected void oneLayerItem(Item item, ResourceLocation texture) {
        ResourceLocation itemTexture = new ResourceLocation(texture.getNamespace(), "item/" + texture.getPath());
        if (existingFileHelper.exists(itemTexture, PackType.CLIENT_RESOURCES, ".png", "textures")) {
            getBuilder(Objects.requireNonNull(item.getRegistryName())
                    .getPath())
                    .parent(getExistingFile(mcLoc("item/generated"))).texture("layer0", itemTexture);
        } else {
            System.err.println("Texture for " + Objects.requireNonNull(item.getRegistryName()).toString() + " not present at " + itemTexture.toString());
        }
    }

    protected void oneLayerItem(Item item) {
        oneLayerItem(item, Objects.requireNonNull(item.getRegistryName()));
    }

    @Override
    protected void registerModels() {
        // Block items
//        simpleBlockItem(BlockRegister.EXAMPLE_BLOCK.get().asItem());

        // Simple items
//        oneLayerItem(ItemRegister.EXAMPLE_ITEM.get());
//        oneLayerItem(ItemRegister.EXAMPLE_FUEL.get());
//        oneLayerItem(ItemRegister.EXAMPLE_FOOD.get());
    }
}
