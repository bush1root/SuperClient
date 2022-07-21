package com.example.examplemod.Module.imlp;

import com.example.examplemod.Module.Module;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Hitbox extends Module {
    public Hitbox() {
        super("Hitbox", 72);
    }

    @SubscribeEvent
    public void onUpdate(RenderPlayerEvent e) {
        Entity p = e.getEntity();
        double size = 0.5;

        if (e.getEntity() != mc.player) {
            e.getEntity().setBoundingBox(new AxisAlignedBB(
                    p.getX() - size,
                    p.getBoundingBox().minY,
                    p.getZ() - size,
                    p.getX() + size,
                    p.getBoundingBox().maxY,
                    p.getZ() + size
            ));
        }
    }
}
