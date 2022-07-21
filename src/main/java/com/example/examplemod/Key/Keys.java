package com.example.examplemod.Key;

import com.example.examplemod.Client;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Keys {
    @SubscribeEvent
    public void onKey(InputEvent.KeyInputEvent e) {
        Client.keyPress(e.getKey(), e.getAction());
    }
}
