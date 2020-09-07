package com.yubeicreeper.easycircuit.block;

import com.yubeicreeper.easycircuit.tileentity.FirstBlockTile;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * @author tangjie
 * @date 2020/9/4
 */
public class FirstBlock extends Block {
    public FirstBlock() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(2.0f)
                .lightValue(14));
        setRegistryName("firstblock");
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity entity, ItemStack stack) {
        if (entity != null) {
            worldIn.setBlockState(pos, state.with(BlockStateProperties.FACING, getFacingFromEntity(pos, entity)), 2);
        }
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new FirstBlockTile();
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        super.fillStateContainer(builder);
        builder.add(BlockStateProperties.FACING);
    }

    public static Direction getFacingFromEntity(BlockPos clickedBlock, LivingEntity entity) {
        return Direction.getFacingFromVector((float)(entity.posX - clickedBlock.getX()), (float)(entity.posY - clickedBlock.getY()), (float)(entity.posZ - clickedBlock.getZ()));
    }
}
