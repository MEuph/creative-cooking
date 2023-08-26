package dev.chrismharris.creative_cooking.block.crop;

import dev.chrismharris.creative_cooking.register.ItemRegister;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

@SuppressWarnings("unused")
public class GarlicCropBlock extends CropBlock {
    public static final Properties PROPERTIES = Properties.
            of(Material.PLANT)
            .noCollission()
            .randomTicks()
            .instabreak()
            .sound(SoundType.CROP);

    public static final int MAX_AGE = 4;
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 4);
    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), // Age 0
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), // Age 1
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), // Age 2
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), // Age 3
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D)  // Age 4
    };


    public GarlicCropBlock() {
        super(GarlicCropBlock.PROPERTIES);
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0));
    }

    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    public int getMaxAge() {
        return 4;
    }

    protected ItemLike getBaseSeedId() {
        return ItemRegister.GARLIC.get();
    }

    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, Random pRandom) {
        if (pRandom.nextInt(3) != 0) {
            super.randomTick(pState, pLevel, pPos, pRandom);
        }

    }

    protected int getBonemealAgeIncrease(Level pLevel) {
        return super.getBonemealAgeIncrease(pLevel) / 3;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }

    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE_BY_AGE[pState.getValue(this.getAgeProperty())];
    }
}