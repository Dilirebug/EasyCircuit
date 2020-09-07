package com.yubeicreeper.easycircuit.item;

import com.yubeicreeper.easycircuit.EasyCircuit;
import net.minecraft.item.Item;

/**
 * @author tangjie
 * @date 2020/9/6
 */
public class FirstItem extends Item {
    public FirstItem() {
        super(new Item.Properties()
                .maxStackSize(1) // 最大堆叠数
                .group(EasyCircuit.setup.itemGroup));
        setRegistryName("firstitem");
    }
}
