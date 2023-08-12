package dev.chrismharris.creative_cooking.block;

import dev.chrismharris.creative_cooking.CreativeCookingMod;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class BreadLoaf extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public static final VoxelShape HITBOX_WEST_EAST = Stream.of(
            Block.box(1, 0, 5, 15, 4, 11),
            Block.box(1, 4, 4, 15, 6, 12),
            Block.box(1, 6, 6, 15, 7, 10)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public static final VoxelShape HITBOX_NORTH_SOUTH = Stream.of(
            Block.box(5, 0, 1, 11, 4, 15),
            Block.box(4, 4, 1, 12, 6, 15),
            Block.box(6, 6, 1, 10, 7, 15)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    @SuppressWarnings("deprecation")
    @Override
    public @NotNull VoxelShape getShape(BlockState state, @NotNull BlockGetter getter, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        if (state.getValue(FACING).equals(Direction.NORTH) ||
                state.getValue(FACING).equals(Direction.SOUTH)) {
            return HITBOX_NORTH_SOUTH;
        } else {
            return HITBOX_WEST_EAST;
        }
    }

    public static final BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties
            .of(Material.CAKE, MaterialColor.COLOR_BROWN)
            .strength(0f)
            .sound(SoundType.WOOL)
            .dynamicShape();

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties()
            .tab(CreativeCookingMod.CC_TAB);

    public BreadLoaf() {
        super(BreadLoaf.PROPERTIES);

        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH));

        /* North/South
         * VoxelShapes.box(0.3125, 0, 0.0625, 0.6875, 0.25, 0.9375)
         * VoxelShapes.box(0.25, 0.25, 0.0625, 0.75, 0.375, 0.9375)
         * VoxelShapes.box(0.375, 0.375, 0.0625, 0.625, 0.4375, 0.9375)
         */

        /* West/East
         * VoxelShapes.box(0.0625, 0, 0.3125, 0.9375, 0.25, 0.6875)
         * VoxelShapes.box(0.0625, 0.25, 0.25, 0.9375, 0.375, 0.75)
         * VoxelShapes.box(0.0625, 0.375, 0.375, 0.9375, 0.4375, 0.625)
         */

    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
