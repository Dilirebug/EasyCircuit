package com.yubeicreeper.easycircuit.setup;

import com.yubeicreeper.easycircuit.block.FirstBlockScreen;
import com.yubeicreeper.easycircuit.block.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

/**
 * @author tangjie
 * @date 2020/9/4
 */
public class ClientProxy implements IProxy {
    @Override
    public void init() {
        // 绑定container和screen
        ScreenManager.registerFactory(ModBlocks.FIRSTBLOCK_CONTAINER, FirstBlockScreen::new);
    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }

    @Override
    public PlayerEntity getClientPlayer() {
        return Minecraft.getInstance().player;
    }
}
