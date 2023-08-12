package dev.chrismharris.creative_cooking.block;

import dev.chrismharris.creative_cooking.register.ItemRegister;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class CornCropBlock extends CropBlock {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;

    public static final VoxelShape HITBOX_AGE_0 = Block.box(4, -1, 4, 12, 13, 12);
    public static final VoxelShape HITBOX_AGE_1 = Block.box(4, -1, 4, 12, 21, 12);
    public static final VoxelShape HITBOX_AGE_2_3 = Block.box(4, -1, 4, 12, 31, 12);

    public CornCropBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }

    @Override
    public @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter getter, @NotNull BlockPos pos,
                                        @NotNull CollisionContext context) {
        return switch (state.getValue(AGE)) {
            case 1 -> HITBOX_AGE_1;
            case 2, 3 -> HITBOX_AGE_2_3;
            default -> HITBOX_AGE_0;
        };
    }

    @Override
    public @NotNull IntegerProperty getAgeProperty() {
        return AGE;
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