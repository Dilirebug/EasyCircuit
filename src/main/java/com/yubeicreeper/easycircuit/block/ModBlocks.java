package com.yubeicreeper.easycircuit.block;

import com.yubeicreeper.easycircuit.tileentity.FirstBlockTile;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;



/**
 * @author tangjie
 * @date 2020/9/4
 */
public class ModBlocks {
    @ObjectHolder("easycircuit:firstblock")
    public static FirstBlock FIRSTBLOCK;

    @ObjectHolder("easycircuit:firstblock")
    public static TileEntityType<FirstBlockTile> FIRSTBLOCK_TILE;
}
