package com.example.examplemod.Module.imlp;

import com.example.examplemod.Module.Module;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class GlowESP extends Module {
    public GlowESP() {
        super("GlowESP", 80);
    }

    @SubscribeEvent
    public void onRender(RenderPlayerEvent e) {
        e.getEntity().setGlowing(true);
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
        for (PlayerEntity p : mc.level.players()) {
            p.setGlowing(false);
        }
    }
}
