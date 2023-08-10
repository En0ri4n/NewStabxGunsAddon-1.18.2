package com.stabilizerking.stabxmodernguns.registeration;

import com.stabilizerking.stabxmodernguns.StabxModernGuns;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSoundRegisteration {

    //Now this CLass will be use for every Single Gun Sounds
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, StabxModernGuns.MOD_ID);

    // Gun Sounds

    //Pistols Gun Sounds
    public static final RegistryObject<SoundEvent> GLOCK_19C_FIRE = register("item.glock19c.fire");
    public static final RegistryObject<SoundEvent> GLOCK_19C_SUPPRESSED = register("item.glock19c.suppressed");
    public static final RegistryObject<SoundEvent> MAGNUM_500_FIRE = register("item.magnum500.fire");
    public static final RegistryObject<SoundEvent> MAGNUM_500_SUPPRESSED = register("item.magnum500.suppressed");
    public static final RegistryObject<SoundEvent> DESERT_EAGLE_MARK_14_FIRE = register("item.desert_eagle_mark14.fire");


    //SMGs Gun sounds
    public static final RegistryObject<SoundEvent> MP5_CLASSIC_FIRE = register("item.mp5_classic.fire");
    public static final RegistryObject<SoundEvent> MP5_CLASSIC_COCK = register("item.mp5_classic.cock");
    public static final RegistryObject<SoundEvent> STRIKER45_FIRE = register("item.striker45.fire");
    public static final RegistryObject<SoundEvent> STRIKER45_COCK = register("item.striker45.cock");
    public static final RegistryObject<SoundEvent> MP40_FIRE = register("item.mp40.fire");
    public static final RegistryObject<SoundEvent> MP40_COCK = register("item.mp40.cock");
    public static final RegistryObject<SoundEvent> TEC9_FIRE = register("item.tec9.fire");

    //Assault Rifles Gun Sounds
    public static final RegistryObject<SoundEvent> AK47_FIRE = register("item.ak47.fire");
    public static final RegistryObject<SoundEvent> AK47_COCK = register("item.ak47.cock");
    public static final RegistryObject<SoundEvent> AK47_SUPPRESSED = register("item.ak47.suppressed");
    public static final RegistryObject<SoundEvent> AKM_762_FIRE = register("item.akm762.fire");
    public static final RegistryObject<SoundEvent> AKM_762_COCK = register("item.akm762.cock");
    public static final RegistryObject<SoundEvent> AKS_74UX_FIRE = register("item.aks74ux.fire");;
    public static final RegistryObject<SoundEvent> AKS_74UX_COCK = register("item.aks74ux.cock");
    public static final RegistryObject<SoundEvent> HK416_SIX_FIRE  = register("item.hk416.fire");
    public static final RegistryObject<SoundEvent> STG44_FIRE = register("item.stg44.fire");
    public static final RegistryObject<SoundEvent> STG44_SUPPRESSED = register("item.stg44.suppressed");
    public static final RegistryObject<SoundEvent> SCAR17_FIRE = register("item.scar17.fire");
    public static final RegistryObject<SoundEvent> SCAR17_SUPPRESSED = register("item.scar17.suppressed");
    public static final RegistryObject<SoundEvent> MK_MOD_11_FIRE = register("item.mkmod11.fire");
    public static final RegistryObject<SoundEvent> MK_MOD_11_SUPPRESSED = register("item.mkmod11.suppressed");
    public static final RegistryObject<SoundEvent> MK_MOD_11_RELOAD = register("item.mkmod11.reload");
    public static final RegistryObject<SoundEvent> MK_MOD_11_COCK = register("item.mkmod11.cock");
    public static final RegistryObject<SoundEvent> M4_FIRE = register("item.m4.fire");
    public static final RegistryObject<SoundEvent> M4_COCK = register("item.m4.cock");
    public static final RegistryObject<SoundEvent> M4A1_FIRE = register("item.m4a1.fire");
    public static final RegistryObject<SoundEvent> M4A1_COCK = register("item.m4a1.cock");
    public static final RegistryObject<SoundEvent> M4A1_SUPPRESSED = register("item.m4a1.suppressed");
    public static final RegistryObject<SoundEvent> M16_FIRE = register("item.m16.fire");
    public static final RegistryObject<SoundEvent> M16_COCK = register("item.m16.cock");
    public static final RegistryObject<SoundEvent> M_SIXTEEN_SUPPRESSED = register("item.m16.suppressed");
    public static final RegistryObject<SoundEvent> G36C_HD_FIRE = register("item.g36chd.fire");
    public static final RegistryObject<SoundEvent> G36C_HD_COCK = register("item.g36chd.cock");
    public static final RegistryObject<SoundEvent> G36C_HD_SUPPRESSED = register("item.g36chd.suppressed");
    public static final RegistryObject<SoundEvent> ACR_BUSHMASTER_FIRE = register("item.acr_bushmaster.fire");
    public static final RegistryObject<SoundEvent> ACR_BUSHMASTER_COCK = register("item.acr_bushmaster.cock");

    //Light Machine gun sounds
    public static final RegistryObject<SoundEvent> M60_FIRE = register("item.m60.fire");
    public static final RegistryObject<SoundEvent> M60_SUPPRESSED = register("item.m60.suppressed");


    //Rifles Gun Sounds
    public static final RegistryObject<SoundEvent> ARISAKA_TYPE_99_FIRE = register("item.arisaka_type99.fire");
    public static final RegistryObject<SoundEvent> ARISAKA_TYPE_99_COCK = register("item.arisaka_type99.cock");

    public static final RegistryObject<SoundEvent> M1_GRANDE_FIRE = register("item.m1_grande.fire");
    public static final RegistryObject<SoundEvent> M1_GRANDE_COCK = register("item.m1_grande.cock");
    public static final RegistryObject<SoundEvent> M1_GRANDE_PING = register("item.m1_grande.ping");

    //Sniper Gun Sounds
    public static final RegistryObject<SoundEvent> ARTIC_WARFARE_MAGNUM_FIRE = register("item.artic_warfare_magnum.fire");
    public static final RegistryObject<SoundEvent> ARTIC_WARFARE_MAGNUM_COCK = register("item.artic_warfare_magnum.cock");
    public static final RegistryObject<SoundEvent> M82_FIRE = register("item.m82.fire");
    public static final RegistryObject<SoundEvent> M82_COCK = register("item.m82.cock");
    //Shotgun Gun Sounds
    public static final RegistryObject<SoundEvent> SPAS12_FIRE = register("item.spas12.fire");
    public static final RegistryObject<SoundEvent> SPAS12_COCK = register("item.spas12.cock");
    public static final RegistryObject<SoundEvent> SPAS12_RELOAD = register("item.spas12.reload");
    public static final RegistryObject<SoundEvent> AA12_FIRE = register("item.aa12.fire");
    public static final RegistryObject<SoundEvent> AA12_COCK = register("item.aa12.cock");
    public static final RegistryObject<SoundEvent> AA12_SUPPRESSED = register("item.artic_warfare_magnum.suppressed");

    //Misc Other Sounds
    public static final RegistryObject<SoundEvent> MK_170_CROSSBOW_FIRE = register("item.mk_170_crossbow.fire");
    public static final RegistryObject<SoundEvent> MK_170_CROSSBOW_COCK = register("item.mk_170_crossbow.cock");

    private static RegistryObject<SoundEvent> register(String name) {


        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(StabxModernGuns.MOD_ID, name)));
    }
}
