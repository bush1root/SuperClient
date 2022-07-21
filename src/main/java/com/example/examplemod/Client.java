package com.example.examplemod;

import com.example.examplemod.Module.Module;
import com.example.examplemod.Module.imlp.GlowESP;
import com.example.examplemod.Module.imlp.Hitbox;
import com.example.examplemod.Module.imlp.Sprint;

import java.util.concurrent.CopyOnWriteArrayList;

public class Client {
    public static CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<>();

    public static void startup() {
        modules.add(new GlowESP());
        modules.add(new Hitbox());
        modules.add(new Sprint());
    }

    public static void keyPress(int key, int action) {
        if (action == 1) {
            for (Module m : modules) {
                if (m.getKeyCode() == key) {
                    m.toggle();
                }
            }
        }
    }
}
