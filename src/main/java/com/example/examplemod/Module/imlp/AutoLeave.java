package com.example.examplemod.Module.imlp;

import com.example.examplemod.Module.Module;
import net.minecraft.network.play.server.SDisconnectPacket;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class AutoLeave extends Module {
    public AutoLeave() {
        super("AutoLeave", 0);
    }

    @SubscribeEvent
    public void onUpdate(RenderPlayerEvent e) {
        if (mc.player.distanceTo(e.getEntity()) <= 15) {
            mc.player.connection.handleDisconnect(new SDisconnectPacket());
        }
    }
}
