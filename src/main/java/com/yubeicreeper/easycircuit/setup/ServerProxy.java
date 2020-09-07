package com.yubeicreeper.easycircuit.setup;

import net.minecraft.world.World;

/**
 * @author tangjie
 * @date 2020/9/4
 */
public class ServerProxy implements IProxy {
    @Override
    public void init() {

    }

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("只能在客户端执行");
    }
}
