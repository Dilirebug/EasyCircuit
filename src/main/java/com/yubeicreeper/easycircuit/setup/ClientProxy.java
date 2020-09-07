package com.yubeicreeper.easycircuit.setup;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

/**
 * @author tangjie
 * @date 2020/9/4
 */
public class ClientProxy implements IProxy {
    @Override
    public void init() {

    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
