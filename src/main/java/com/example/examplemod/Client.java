package com.example.examplemod;

import com.example.examplemod.Module.Module;
import com.example.examplemod.Module.imlp.GlowESP;

import java.util.concurrent.CopyOnWriteArrayList;

public class Client {
    public static CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<>();

    public static void startup() {
        modules.add(new GlowESP());
    }

    public static void keyPress(int key) {
        for (Module m : modules) {
            if (m.getKeyCode() == key) {
                m.toggle();
            }
        }
    }
}
