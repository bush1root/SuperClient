package com.example.examplemod;

import com.example.examplemod.Key.Keys;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("examplemod")
public class ExampleMod {
    private static final Logger LOGGER = LogManager.getLogger();

    public ExampleMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new Keys());
    }

    private void setup(final FMLCommonSetupEvent event) {
        Client.startup();
    }
}
