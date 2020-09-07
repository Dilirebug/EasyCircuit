package com.yubeicreeper.easycircuit.setup;

import net.minecraft.world.World;

/**
 * @author tangjie
 * @date 2020/9/4
 */
public interface IProxy {
    void init();

    World getClientWorld();
}
