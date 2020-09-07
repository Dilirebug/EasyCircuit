package com.yubeicreeper.easycircuit.tileentity;

import com.yubeicreeper.easycircuit.block.ModBlocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * @author tangjie
 * @date 2020/9/7
 */
public class FirstBlockTile extends TileEntity implements ITickableTileEntity {
    private ItemStackHandler itemStackHandler;

    public FirstBlockTile() {
        super(ModBlocks.FIRSTBLOCK_TILE);
    }

    private ItemStackHandler getHandler() {
        if (itemStackHandler == null) {
            itemStackHandler = new ItemStackHandler() {
                @Override
                public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
                    // 增加筛选功能
                    return stack.getItem() == ModBlocks.FIRSTBLOCK.asItem();
                }
            };
        }
        return itemStackHandler;
    }

    @Override
    public void tick() {
        if (world.isRemote) {

        }
    }

    @Override
    public void read(CompoundNBT tag) {
        CompoundNBT inv = tag.getCompound("inv");
        getHandler().deserializeNBT(inv);
        super.read(tag);
    }

    @Override
    public CompoundNBT write(CompoundNBT tag) {
        CompoundNBT compoundNBT = getHandler().serializeNBT();
        tag.put("inv", compoundNBT);
        return super.write(tag);
    }

    /**
     * 添加物品存储能力
     * @param cap
     * @param side
     * @param <T>
     * @return
     */
    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return LazyOptional.of(() -> (T)getHandler());
        }
        return super.getCapability(cap, side);
    }
}
