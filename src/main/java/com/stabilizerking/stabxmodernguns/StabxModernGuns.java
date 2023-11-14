package com.stabilizerking.stabxmodernguns;

import com.stabilizerking.stabxmodernguns.client.ClientHandler;
import com.stabilizerking.stabxmodernguns.registeration.ModItemRegisteration;
import com.stabilizerking.stabxmodernguns.registeration.ModSoundRegisteration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(StabxModernGuns.MOD_ID)
public class StabxModernGuns
{
    public static final String MOD_ID = "stabxmodernguns";
    private static final Logger LOGGER = LogManager.getLogger();

    public StabxModernGuns()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItemRegisteration.ITEMS.register(bus);
        ModSoundRegisteration.SOUNDS.register(bus);

        bus.addListener(this::clientSetup);
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
        event.enqueueWork(ClientHandler::registerModelOverrides);
    }

}
