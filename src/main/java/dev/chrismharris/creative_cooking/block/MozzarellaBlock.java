package dev.chrismharris.creative_cooking.block;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class MozzarellaBlock extends Block {

    public static final Properties PROPERTIES = Properties
            .of(Material.CLAY, MaterialColor.COLOR_LIGHT_GRAY)
            .sound(SoundType.SLIME_BLOCK)
            .friction(0.8f);

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties()
            .tab(CreativeCookingMod.CC_TAB);

    public MozzarellaBlock() {
        super(MozzarellaBlock.PROPERTIES);
    }

//    @SuppressWarnings("deprecation")
//    @Override
//    public @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter getter, @NotNull BlockPos pos, @NotNull CollisionContext context) {
//        return Block.box(0, 0, 0, 16, 16, 16);
//    }
}
