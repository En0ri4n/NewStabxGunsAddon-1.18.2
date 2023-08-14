package com.stabilizerking.stabxmodernguns.datagen;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataHandler
{
    @SubscribeEvent
    public static void onData(GatherDataEvent event)
    {
        event.getGenerator().addProvider(new ItemModelsGenerator(event.getGenerator(), event.getExistingFileHelper()));
        event.getGenerator().addProvider(new StabXMagazineGen(event.getGenerator()));
    }
}
