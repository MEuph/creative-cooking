package dev.chrismharris.creative_cooking.block;

import com.simibubi.create.AllItems;
import dev.chrismharris.creative_cooking.CreativeCookingMod;
import dev.chrismharris.creative_cooking.register.BlockRegister;
import dev.chrismharris.creative_cooking.register.ItemRegister;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BreadPan extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public static final BooleanProperty FILLED = BooleanProperty.create("filled");
    public static final BooleanProperty DIRTY = BooleanProperty.create("dirty");

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
            .of(Material.WOOD, MaterialColor.COLOR_GRAY)
            .sound(SoundType.METAL)
            .dynamicShape();

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties()
            .tab(CreativeCookingMod.CC_TAB);

    public BreadPan() {
        super(BreadPan.PROPERTIES);

        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH));
        this.registerDefaultState(this.defaultBlockState().setValue(FILLED, false));
        this.registerDefaultState(this.defaultBlockState().setValue(DIRTY, false));
    }

    public BreadPan(boolean dirty) {
        super(BreadPan.PROPERTIES);

        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH));
        this.registerDefaultState(this.defaultBlockState().setValue(FILLED, false));
        this.registerDefaultState(this.defaultBlockState().setValue(DIRTY, true));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder
                .add(FACING)
                .add(FILLED)
                .add(DIRTY);
    }

    @SuppressWarnings("deprecation")
    @Override
    public @NotNull InteractionResult use(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos,
                                          @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hit) {
        if (!level.isClientSide()) {
            if (!state.getValue(BreadPan.FILLED)) {
                if (player.getItemInHand(hand).is(AllItems.DOUGH.get())) {
                    if (state.getValue(BreadPan.DIRTY)) {
                        player.sendMessage(new TranslatableComponent("message.creative_cooking.cannot_fill_pan"), player.getUUID());
                    } else {
                        player.getItemInHand(hand).shrink(1);
                        level.setBlock(pos, BlockRegister.BREAD_PAN.get().defaultBlockState().
                                        setValue(BreadPan.FILLED, true)
                                        .setValue(BreadPan.FACING, state.getValue(BreadPan.FACING)),
                                1);
                        level.playSound(null, pos, SoundEvents.SLIME_BLOCK_PLACE, SoundSource.BLOCKS, 1.0f, 1.0f);
                        player.getItemInHand(hand).use(level, player, hand);
                        return InteractionResult.CONSUME;
                    }
                }
            }
        }

        return super.use(state, level, pos, player, hand, hit);
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        if (state.getValue(BreadPan.FILLED)) {
            popResource(level, pos, new ItemStack(ItemRegister.BREAD_PAN_RAW.get(), 1));
        } else {
            if (!state.getValue(BreadPan.DIRTY)) {
                popResource(level, pos, new ItemStack(BlockRegister.BREAD_PAN.get().asItem(), 1));
            } else {
                popResource(level, pos, new ItemStack(ItemRegister.BREAD_PAN_DIRTY.get(), 1));
            }
        }
        return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }
}
