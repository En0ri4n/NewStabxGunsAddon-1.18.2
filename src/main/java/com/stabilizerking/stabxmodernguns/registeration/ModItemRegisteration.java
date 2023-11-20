package com.stabilizerking.stabxmodernguns.registeration;


import com.mrcrayfish.guns.common.GunModifiers;
import com.mrcrayfish.guns.item.*;
import com.mrcrayfish.guns.item.attachment.impl.Barrel;
import com.mrcrayfish.guns.item.attachment.impl.Scope;
import com.mrcrayfish.guns.item.attachment.impl.Stock;
import com.mrcrayfish.guns.item.attachment.impl.UnderBarrel;
import com.stabilizerking.stabxmodernguns.StabxModernGuns;
import com.stabilizerking.stabxmodernguns.common.ScopeProperties;
import com.stabilizerking.stabxmodernguns.item.M1GrandeGunItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

//This Class will be used to register every single  gun.

public class ModItemRegisteration
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StabxModernGuns.MOD_ID);


    // In here Each Gun is Divided into Different Categories So We can easily Understand from Which Category the Gun belongs :).


    //-------------------------------------------------Pistols ---------------------------------------------------------------//
    public static final RegistryObject<GunItem> FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON = registerGun("500magnum_smith_and_wesson", StabxCreativeModeTab.STABX_MODERN_GUNS_GROUP);

    public static final RegistryObject<GunItem> GLOCK_19_C = registerGun("glock19c", StabxCreativeModeTab.STABX_MODERN_GUNS_GROUP);

    public static final RegistryObject<GunItem> DESERT_EAGLE_MARK_14 = registerGun("desert_eagle_mark14", StabxCreativeModeTab.STABX_MODERN_GUNS_GROUP);

    public static final RegistryObject<GunItem> COLT_M1911A1 = registerGun("colt_m1911a1", StabxCreativeModeTab.STABX_MODERN_GUNS_GROUP);

    public static final RegistryObject<GunItem> BAREETA67 = registerGun("bareeta67", StabxCreativeModeTab.STABX_MODERN_GUNS_GROUP);

    public static final RegistryObject<GunItem> P226 = registerGun("p226", StabxCreativeModeTab.STABX_MODERN_GUNS_GROUP);

    public static final RegistryObject<GunItem> HKUSP45 = registerGun("hkusp45", StabxCreativeModeTab.STABX_MODERN_GUNS_GROUP);


    //-------------------------------------------------Sub Machine Guns ----------------------------------------------//

    public static final RegistryObject<GunItem> MP5_CLASSIC = registerGun("mp5_classic", StabxCreativeModeTab.STABX_SMGs);

    public static final RegistryObject<GunItem> STRIKER45 = registerGun("striker45", StabxCreativeModeTab.STABX_SMGs);

    public static final RegistryObject<GunItem> MP40 = registerGun("mp40", StabxCreativeModeTab.STABX_SMGs);

    public static final RegistryObject<GunItem> TEC9 = registerGun("tec9", StabxCreativeModeTab.STABX_SMGs);

    public static final RegistryObject<GunItem> ZXR_MP7 = registerGun("zxr_mp7", StabxCreativeModeTab.STABX_SMGs);

    public static final RegistryObject<GunItem> VECTOR45 = registerGun("kriss_vector45", StabxCreativeModeTab.STABX_SMGs);


    //-------------------------------------------------Assault Rifles ---------------------------------------------------------------//

    public static final RegistryObject<GunItem> M4 = registerGun("m4", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);

    public static final RegistryObject<GunItem> HK416 = registerGun("hk416", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);

    public static final RegistryObject<GunItem> MK_MOD11 = registerGun("mkmod11", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);

    public static final RegistryObject<GunItem> SCAR_17 = registerGun("scar17", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);

    public static final RegistryObject<GunItem> AK_47 = registerGun("ak47", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);

    public static final RegistryObject<GunItem> MODERN_GK57 = registerGun("modern_gk57", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);

    public static final RegistryObject<GunItem> AKS_74 = registerGun("aks74", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);

    public static final RegistryObject<GunItem> AKM_762 = registerGun("akm_762", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);

    public static final RegistryObject<GunItem> AKS_74_UX = registerGun("aks74ux", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);
    public static final RegistryObject<GunItem> STG44 = registerGun("stg44", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);

    public static final RegistryObject<GunItem> M16 = registerGun("m16", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);

    public static final RegistryObject<GunItem> M4A1 = registerGun("m4a1", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);
    public static final RegistryObject<GunItem> G36C_HD = registerGun("g36chd", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);
    public static final RegistryObject<GunItem> ACR_BUSHMASTER = registerGun("acr_360_bushmaster", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);
    public static final RegistryObject<GunItem> SCAR17_HD = registerGun("scar17hd", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);
    public static final RegistryObject<GunItem> AUG556 = registerGun("aug556", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);
    public static final RegistryObject<GunItem> FAMAS_G7 = registerGun("famas_g7", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);
    public static final RegistryObject<GunItem> MCX_HONEYBADGER = registerGun("mcx_citrus_honeybadger", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);

    public static final RegistryObject<GunItem> NZ41 = registerGun("nz41", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);

    public static final RegistryObject<GunItem> AZ67 = registerGun("az67", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);

    public static final RegistryObject<GunItem> AK_103 = registerGun("ak_103", StabxCreativeModeTab.STABX_ASSAULT_RIFLES);


    //-----------------------------------------------------ShotGuns ---------------------------------------------------------------//


    public static final RegistryObject<GunItem> AA_12 = registerGun("aa12ux", StabxCreativeModeTab.STABX_SHOTGUNS);

    public static final RegistryObject<GunItem> SPAS_12 = registerGun("spas12", StabxCreativeModeTab.STABX_SHOTGUNS);

    public static final RegistryObject<GunItem> MOSSBERG_500 = registerGun("mossberg500", StabxCreativeModeTab.STABX_SHOTGUNS);

    public static final RegistryObject<GunItem> SUPER_SHORTY = registerGun("serbu_super_shorty", StabxCreativeModeTab.STABX_SHOTGUNS);

    public static final RegistryObject<GunItem> BENELLI_M4 = registerGun("benelli_m4", StabxCreativeModeTab.STABX_SHOTGUNS);


    //------------------------------------------------------Rifles---------------------------------------------------------------//

    public static final RegistryObject<GunItem> ARISAKA_TYPE_99 = registerGun("arisaka_type99", StabxCreativeModeTab.STABX_RIFlES);

    public static final RegistryObject<M1GrandeGunItem> M1_GRANDE = ITEMS.register("m1_grande", () -> new M1GrandeGunItem(new Item.Properties().stacksTo(1).tab(StabxCreativeModeTab.STABX_RIFlES)));

    public static final RegistryObject<GunItem> KAR98K = registerGun("kar98k", StabxCreativeModeTab.STABX_RIFlES);

    public static final RegistryObject<M1GrandeGunItem> M1_GARAND_REMAKE = ITEMS.register("m1_garand_remake", () -> new M1GrandeGunItem(new Item.Properties().stacksTo(1).tab(StabxCreativeModeTab.STABX_RIFlES)));


    //----------------------------------------------------Marksman DMR Rifles---------------------------------------------------------------//

    public static final RegistryObject<GunItem> M14 = registerGun("m14", StabxCreativeModeTab.STABX_DMR_RIFlES);

    public static final RegistryObject<GunItem> SKS = registerGun("sks", StabxCreativeModeTab.STABX_DMR_RIFlES);

    //----------------------------------------------------Sniper Rifles---------------------------------------------------------------//

    public static final RegistryObject<GunItem> ARTIC_WARFARE_MAGNUM = registerGun("artic_warfare_magnum", StabxCreativeModeTab.STABX_SNIPER_RIFlES);

    public static final RegistryObject<GunItem> BARRETT_M82 = registerGun("barrett_m82_sniper", StabxCreativeModeTab.STABX_SNIPER_RIFlES);

    public static final RegistryObject<GunItem> SPR_3608 = registerGun("spr3608", StabxCreativeModeTab.STABX_SNIPER_RIFlES);

    public static final RegistryObject<GunItem> DRAGNAOV_SVD = registerGun("dragnaov_svd", StabxCreativeModeTab.STABX_SNIPER_RIFlES);

    public static final RegistryObject<GunItem> REMINGTON360 = registerGun("remington360", StabxCreativeModeTab.STABX_SNIPER_RIFlES);

    //--------------------------------------------------Light Machine Guns ---------------------------------------------------------------//

    public static final RegistryObject<GunItem> M_60 = registerGun("m60", StabxCreativeModeTab.STABX_LMGs);

    public static final RegistryObject<GunItem> RPK = registerGun("rpk", StabxCreativeModeTab.STABX_LMGs);

    public static final RegistryObject<GunItem> BRUEN_MK9 = registerGun("bruen_mk9", StabxCreativeModeTab.STABX_LMGs);

    //----------------------------------------------------Miscellaneous---------------------------------------------------------------//

    public static final RegistryObject<GunItem> MK_170_CROSSBOW = registerGun("mk_170_crossbow", StabxCreativeModeTab.STABX_MICS);

    //---------------------------------------Guns Attachments / Sight Scope Attachments ---------------------------------------------------------------//


    public static final RegistryObject<ScopeItem> RED_DOT_SIGHT = ITEMS.register("red_dot_sight", () -> new ScopeItem(Scope.builder().build(), new Item.Properties().stacksTo(1).tab(StabxCreativeModeTab.STABX_MICS)));

    public static final RegistryObject<ScopeItem> ZA_MINI_RED_DOT_SIGHT = ITEMS.register("za_mini_red_dot_sight", () -> new ScopeItem(ScopeProperties.ZA_MINI_SIGHT, new Item.Properties().stacksTo(1).tab(StabxCreativeModeTab.STABX_MICS)));


    public static final RegistryObject<ScopeItem> HOLOGRAPHIC_SIGHT = ITEMS.register("holographic_sight", () -> new ScopeItem(ScopeProperties.HOLOGRAPHIC_SIGHT, new Item.Properties().stacksTo(1).tab(StabxCreativeModeTab.STABX_MICS)));

    public static final RegistryObject<ScopeItem> MINI_SIGHT = ITEMS.register("mini_sight", () -> new ScopeItem(ScopeProperties.MINI_SIGHT, new Item.Properties().stacksTo(1).tab(StabxCreativeModeTab.STABX_MICS)));

    public static final RegistryObject<ScopeItem> KOBRA_SIGHT = ITEMS.register("kobra_sight", () -> new ScopeItem(ScopeProperties.KOBRA_SIGHT, new Item.Properties().stacksTo(1).tab(StabxCreativeModeTab.STABX_MICS)));

    public static final RegistryObject<ScopeItem> ACOG_SIGHT = ITEMS.register("acog_sight", () -> new ScopeItem(ScopeProperties.ACOG_SIGHT, new Item.Properties().stacksTo(1).tab(StabxCreativeModeTab.STABX_MICS)));

    public static final RegistryObject<ScopeItem> SIMPLE_SNIPER_SCOPE = ITEMS.register("simple_sniper_scope", () -> new ScopeItem(ScopeProperties.SIMPLE_SNIPER_SCOPE, new Item.Properties().stacksTo(1).tab(StabxCreativeModeTab.STABX_MICS)));


    //---------------------------------------------------- Stock Attachments ---------------------------------------------------------------//

    public static final RegistryObject<StockItem> CUSTOM_STOCK = ITEMS.register("custom_stock", () -> new StockItem(Stock.create(GunModifiers.STABILISED), new Item.Properties().stacksTo(1).tab(StabxCreativeModeTab.STABX_MICS)));


    //--------------------------------------------------- Barrel Attachments ---------------------------------------------------------------//

    public static final RegistryObject<BarrelItem> ADVANCED_SUPPRESSOR = ITEMS.register("advanced_suppressor", () -> new BarrelItem(Barrel.create(17.0f, GunModifiers.SILENCED), new Item.Properties().stacksTo(1).tab(StabxCreativeModeTab.STABX_MICS)));

    public static final RegistryObject<BarrelItem> ADVANCED_MUZZLE_BRAKE = ITEMS.register("advanced_muzzle_brake", () -> new BarrelItem(Barrel.create(7.0f, GunModifiers.SUPER_STABILISED), new Item.Properties().stacksTo(1).tab(StabxCreativeModeTab.STABX_MICS)));


    //-------------------------------------------------- UnderBarrel Attachments ---------------------------------------------------------------//

    public static final RegistryObject<UnderBarrelItem> ANGLED_FOREGRIP = ITEMS.register("angled_foregrip", () -> new UnderBarrelItem(UnderBarrel.create(GunModifiers.REDUCED_RECOIL), new Item.Properties().stacksTo(1).tab(StabxCreativeModeTab.STABX_MICS)));

    public static final RegistryObject<UnderBarrelItem> VERTICAL_FOREGRIP = ITEMS.register("vertical_foregrip", () -> new UnderBarrelItem(UnderBarrel.create(GunModifiers.BETTER_CONTROL), new Item.Properties().stacksTo(1).tab(StabxCreativeModeTab.STABX_MICS)));

    public static final RegistryObject<UnderBarrelItem> SKELETON_FOREGRIP = ITEMS.register("skeleton_grip", () -> new UnderBarrelItem(UnderBarrel.create(GunModifiers.STABILISED), new Item.Properties().stacksTo(1).tab(StabxCreativeModeTab.STABX_MICS)));


    //-------------------------------------------------------Weapons Ammunition--------------------------------------------------------------//

    public static final RegistryObject<Item> NINE_MM = registerAmmo("9mm");

    public static final RegistryObject<Item> NINE_X_19MM_PARABELLUM = registerAmmo("9x19mm_parabellum");

    public static final RegistryObject<Item> SEVEN_62_MM = registerAmmo("7.62mm");

    public static final RegistryObject<Item> FOUR_6_X_30MM = registerAmmo("4.6x30mm");

    public static final RegistryObject<Item> T303_BRITISH = registerAmmo("303_british");

    public static final RegistryObject<Item> SEVEN_92_X_57MM = registerAmmo("7.92x57mm");

    public static final RegistryObject<Item> THREE_300_BLACKOUT = registerAmmo("300_blackout");

    public static final RegistryObject<Item> TWELVE_GAUGE_BUCKSHOT_SLUG_SHELL = registerAmmo("12gauge_buckshot_slug_shell_360");

    public static final RegistryObject<Item> FIVE_56_X_45_NATO = registerAmmo("5.56x45_nato");

    public static final RegistryObject<Item> FIVE_45_X_39MM = registerAmmo("5.45x39mm");

    public static final RegistryObject<Item> SEVEN_7_X_58_MM = registerAmmo("7.7x58mm");

    public static final RegistryObject<Item> SEVEN_32_X_33_MM_KURZ = registerAmmo("7.32x33mm_kurz");

    public static final RegistryObject<Item> FIFTY_CALIBER = registerAmmo("50_caliber");

    public static final RegistryObject<Item> THREE_HUNDRED_WM = registerAmmo("300wm");

    public static final RegistryObject<Item> FIFTY_AE = registerAmmo("50ae");

    public static final RegistryObject<Item> FOURTY_FIVE_ACP = registerAmmo("45acp");

    public static final RegistryObject<Item> SEVEN_32_X_51_MM_NATO = registerAmmo("7.62x51mm_nato");

    public static final RegistryObject<Item> FIFTY_BMG = registerAmmo("50bmg");

    public static final RegistryObject<Item> THRITY_SIXTY_AMMO = registerAmmo("30_60_springfield_cartridge");

    public static final RegistryObject<Item> MK_CROSSBOW_ARROW = registerAmmo("mk_crossbow_arrow");

    //--------------------------------------------------- Weapons Magazines ------------------------------------------------------------------//
    public static final RegistryObject<Item> NINE_MM_MAGAZINE = registerMagazine("9mm_magazine");

    public static final RegistryObject<Item> NINE_X_19MM_PARABELLUM_MAGAZINE = registerMagazine("9x19mm_parabellum_magazine");

    public static final RegistryObject<Item> SEVEN_62_MM_MAGAZINE = registerMagazine("7.62mm_magazine");

    public static final RegistryObject<Item> TWELVE_GAUGE_BUCKSHOT_SLUG_SHELL_MAGAZINE = registerMagazine("12gauge_buckshot_slug_shell_360_magazine");

    public static final RegistryObject<Item> FIVE_56_X_45_NATO_MAGAZINE = registerMagazine("5.56x45_nato_magazine");

    public static final RegistryObject<Item> SEVEN_7_X_58_MM_MAGAZINE = registerMagazine("7.7x58mm_magazine");

    public static final RegistryObject<Item> SEVEN_THIRTYTWO_MM_KURZ_MAGAZINE = registerMagazine("7.32x33mm_kurz_magazine");

    public static final RegistryObject<Item> FIFTY_CALIBER_MAGAZINE = registerMagazine("50_caliber_magazine");

    public static final RegistryObject<Item> THREE_HUNDRED_WM_MAGAZINE = registerMagazine("300wm_magazine");

    public static final RegistryObject<Item> FIFTY_AE_MAGAZINE = registerMagazine("50ae_magazine");

    public static final RegistryObject<Item> FOURTY_FIVE_ACP_MAGAZINE = registerMagazine("45acp_magazine");

    public static final RegistryObject<Item> SEVEN_SIXTYTWO_X_FIFTYONE_MM_NATO_MAGAZINE = registerMagazine("7.62x51mm_nato_magazine");

    public static final RegistryObject<Item> FIFTY_BMG_MAGAZINE = registerMagazine("50bmg_magazine");

    public static final RegistryObject<Item> THRITY_SIXTY_MAGAZINE = registerMagazine("30_60_springfield_cartridge_magazine");

    public static final RegistryObject<Item> FOUR_6x30MM_MAGAZINE = registerMagazine("4.6x30mm_magazine");

    public static final RegistryObject<Item> SEVEN_92x57MM_MAGAZINE = registerMagazine("7.92x57mm_magazine");

    public static final RegistryObject<Item> THREE_HUNDREED_BLACKOUT_MAGAZINE = registerMagazine("300_blackout_magazine");

    private static RegistryObject<GunItem> registerGun(String name, CreativeModeTab tab)
    {
        return ITEMS.register(name, () -> new GunItem(new Item.Properties().stacksTo(1).tab(tab)));
    }

    private static RegistryObject<Item> registerAmmo(String name)
    {
        return ITEMS.register(name, () -> new AmmoItem(new Item.Properties().tab(StabxCreativeModeTab.STABX_AMMUNATION)));
    }

    private static RegistryObject<Item> registerMagazine(String name)
    {
        return ITEMS.register(name, () -> new MagazineItem(new Item.Properties().tab(StabxCreativeModeTab.STABX_AMMUNATION)));
    }
}
