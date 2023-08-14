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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class UNUSEDBreadPanRaw extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public static final VoxelShape HITBOX_NORTH_SOUTH = Block.box(3, 0, 0, 13, 6, 16);
    public static final VoxelShape HITBOX_WEST_EAST = Block.box(0, 0, 3, 16, 6, 13);

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

    public static final Properties PROPERTIES = Properties
            .of(Material.METAL, MaterialColor.COLOR_GRAY)
            .strength(2f)
            .sound(SoundType.METAL)
            .dynamicShape();

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties()
            .tab(CreativeCookingMod.CC_TAB);

    public UNUSEDBreadPanRaw() {
        super(UNUSEDBreadPanRaw.PROPERTIES);

        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH));
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
