package com.yubeicreeper.easycircuit.setup;

import com.yubeicreeper.easycircuit.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

/**
 * @author tangjie
 * @date 2020/9/6
 */
public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("easycircuit") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.FIRSTBLOCK);
        }
    };

    public void init() {

    }
}
