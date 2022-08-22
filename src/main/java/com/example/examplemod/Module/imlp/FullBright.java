package com.example.examplemod.Module.imlp;

import com.example.examplemod.Module.Module;

public class FullBright extends Module {
    public FullBright() {
        super("FullBright", 0);
    }

    @Override
    public void onEnable() {
        mc.options.gamma = 100;
    }

    @Override
    public void onDisable() {
        mc.options.gamma = 15;
    }
}
