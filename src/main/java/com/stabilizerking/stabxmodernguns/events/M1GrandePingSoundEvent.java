package com.stabilizerking.stabxmodernguns.events;


import com.mrcrayfish.guns.event.GunFireEvent;
import com.stabilizerking.stabxmodernguns.StabxModernGuns;
import com.stabilizerking.stabxmodernguns.registeration.ModItemRegisteration;
import com.stabilizerking.stabxmodernguns.registeration.ModSoundRegisteration;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

//Now this class will be used to Register and add the M1 Grand Ping Sound when ammo reaches 1 then ping sound
//will be played.

@Mod.EventBusSubscriber(modid = StabxModernGuns.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class M1GrandePingSoundEvent {

    @SubscribeEvent
    public static void postShoot(GunFireEvent event) {

        Player player = event.getPlayer();
        ItemStack heldItem = player.getMainHandItem();
        CompoundTag tag = heldItem.getTag();

        if(heldItem.getItem() == ModItemRegisteration.M1_GRANDE.get() && tag != null) {

            if(tag.getInt("AmmoCount") == 1)
                event.getPlayer().level.playSound(player, player.blockPosition(), ModSoundRegisteration.M1_GRANDE_PING.get(), SoundSource.MASTER, 3.0F, 1.0F);

        }

    }

}