package com.example.examplemod.Module.imlp;

import com.example.examplemod.Module.Module;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Sprint extends Module {
    public Sprint() {
        super("Sprint", 73);
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent e) {
        if (!mc.player.horizontalCollision && mc.player.input.hasForwardImpulse()) {
            mc.player.setSprinting(true);
        }
    }
}
