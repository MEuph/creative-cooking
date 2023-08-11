package dev.chrismharris.creative_cooking.block;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.BlockHitResult;

public class ExampleBlock extends Block {
    public static final BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties
                    .of(Material.METAL, MaterialColor.COLOR_PURPLE)
                    .strength(3.0f)
                    .sound(SoundType.AMETHYST)
                    .requiresCorrectToolForDrops();

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties()
            .tab(CreativeCookingMod.CC_TAB);

    public ExampleBlock(Properties properties) {
        super(properties);
    }

    public ExampleBlock() {
        super(ExampleBlock.PROPERTIES);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (!pLevel.isClientSide()) {
            if (pPlayer.getItemInHand(pHand).getItem().equals(Items.DIAMOND)) {
                System.out.println(pPlayer.getName().getString() + " interacted with block at pos " + pPos.toShortString() + " using a diamond.");
            }

            return InteractionResult.CONSUME;
        }

        return super.use(pState, pLevel, pPos, pPlayer, pHand, pHit);
    }
}
