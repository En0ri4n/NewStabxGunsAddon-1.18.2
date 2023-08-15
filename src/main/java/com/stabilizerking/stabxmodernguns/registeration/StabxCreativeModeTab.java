package com.stabilizerking.stabxmodernguns.registeration;


import com.mrcrayfish.guns.util.GunHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

@SuppressWarnings("ALL")
public class StabxCreativeModeTab
{

    // In this Class We will Use this To Register The Multiple Creative Tabs just6 like Items and Sounds So we can have
    // lots of  creative tabs for each category just to fix lag. when opening a creative menu.


    //---------------------------------------------Creatve Tab for Pistols ---------------------------------------------------------------//
    public static final CreativeModeTab STABX_MODERN_GUNS_GROUP = new CreativeModeTab("stabxmodernguns")
    {
        @Override
        public ItemStack makeIcon()
        {
            return GunHelper.setWeaponFull(ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON.get().getDefaultInstance());
        }
    };

    //---------------------------------------------Creatve Tab for SMGs ---------------------------------------------------------------//
    public static final CreativeModeTab STABX_SMGs = new CreativeModeTab("stabx_smgs")
    {
        @Override
        public ItemStack makeIcon()
        {
            return GunHelper.setWeaponFull(ModItemRegisteration.MP5_CLASSIC.get().getDefaultInstance());
        }
    };

    //---------------------------------------------Creatve Tab for Assault Rifles ---------------------------------------------------------------//

    public static final CreativeModeTab STABX_ASSAULT_RIFLES = new CreativeModeTab("stabx_assault_rifles")
    {
        @Override
        public ItemStack makeIcon()
        {
            return GunHelper.setWeaponFull(ModItemRegisteration.M4.get().getDefaultInstance());
        }
    };

    //---------------------------------------------Creatve Tab For Shotguns ---------------------------------------------------------------//

    public static final CreativeModeTab STABX_SHOTGUNS = new CreativeModeTab("stabx_shotguns")
    {
        @Override
        public ItemStack makeIcon()
        {
            return GunHelper.setWeaponFull(ModItemRegisteration.AA_12.get().getDefaultInstance());
        }
    };
    //---------------------------------------------Creatve Tab for Rifles ---------------------------------------------------------------//

    public static final CreativeModeTab STABX_RIFlES = new CreativeModeTab("stabx_rifles")
    {
        @Override
        public ItemStack makeIcon()
        {
            return GunHelper.setWeaponFull(ModItemRegisteration.ARISAKA_TYPE_99.get().getDefaultInstance());
        }
    };

    public static final CreativeModeTab STABX_DMR_RIFlES = new CreativeModeTab("stabx_dmrs")
    {

        public ItemStack makeIcon()
        {
            return GunHelper.setWeaponFull(ModItemRegisteration.M14.get().getDefaultInstance());
        }
    };

    //---------------------------------------------Creatve Tab for Sniper Rifles ---------------------------------------------------------------//

    public static final CreativeModeTab STABX_SNIPER_RIFlES = new CreativeModeTab("stabx_sniper_rifles")
    {
        @Override
        public ItemStack makeIcon()
        {
            return GunHelper.setWeaponFull(ModItemRegisteration.ARTIC_WARFARE_MAGNUM.get().getDefaultInstance());
        }
    };

    //---------------------------------------------Creatve Tab for LMGs ---------------------------------------------------------------//


    public static final CreativeModeTab STABX_LMGs = new CreativeModeTab("stabx_lmgs")
    {
        @Override
        public ItemStack makeIcon()
        {
            return GunHelper.setWeaponFull(ModItemRegisteration.M60.get().getDefaultInstance());
        }
    };

    //--------------------------------Creatve Tab for Attachments and Other Miscellaneous Items ---------------------------------------------------------------//

    public static final CreativeModeTab STABX_MICS = new CreativeModeTab("stabx_misc")
    {
        @Override
        public ItemStack makeIcon()
        {
            return GunHelper.setWeaponFull(ModItemRegisteration.MK_170_CROSSBOW.get().getDefaultInstance());
        }
    };

    //---------------------------------------------Creative Tab for Ammunition only ---------------------------------------------------------------//

    public static final CreativeModeTab STABX_AMMUNATION = new CreativeModeTab("stabx_ammunation")
    {
        @Override
        public ItemStack makeIcon()
        {
            return GunHelper.setWeaponFull(ModItemRegisteration.NINE_MM.get().getDefaultInstance());
        }
    };
}