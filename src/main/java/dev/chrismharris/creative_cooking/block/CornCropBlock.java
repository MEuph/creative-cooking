package dev.chrismharris.creative_cooking.block;

import dev.chrismharris.creative_cooking.register.ItemRegister;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class CornCropBlock extends CropBlock {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;

    public static final VoxelShape HITBOX = Block.box(0, -1, 0, 16, 19, 16);

    public CornCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter getter, @NotNull BlockPos pos,
                                        @NotNull CollisionContext context) {
        return HITBOX;
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    protected @NotNull ItemLike getBaseSeedId() {
        return ItemRegister.CORN_SEEDS.get();
    }
}