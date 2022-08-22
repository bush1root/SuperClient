package com.example.examplemod.Module.imlp;

import com.example.examplemod.Client;
import com.example.examplemod.Module.Module;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class HUD extends Module {
    public HUD() {
        super("HUD", 0);
    }

    @SubscribeEvent
    public void onUpdate(RenderGameOverlayEvent e) {
        if (e.getType() == RenderGameOverlayEvent.ElementType.TEXT) {
            int y = 10;

            for (Module m : Client.modules) {
                if (m.isToggled()) {
                    mc.font.draw(e.getMatrixStack(), m.getName(), 10, y, -1);
                    y += 10;
                }
            }
        }
    }
}
