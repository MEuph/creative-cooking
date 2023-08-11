package dev.chrismharris.creative_cooking.datagen.server;

import dev.chrismharris.creative_cooking.datagen.BaseLootTableProvider;
import dev.chrismharris.creative_cooking.init.BlockRegister;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Objects;

public class ModLootTableProvider extends BaseLootTableProvider {

    public ModLootTableProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void addTables() {
        dropSelf(BlockRegister.EXAMPLE_BLOCK.get());
    }

    protected void silkTouch(Block block, Item silk, int min, int max) {

    }

    protected void dropSelf(Block block) {
        add(block, createSimpleTable(Objects.requireNonNull(block.getRegistryName()).getPath(), block));
    }
}
