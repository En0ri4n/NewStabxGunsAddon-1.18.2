package com.stabilizerking.stabxmodernguns.registeration;


import com.mrcrayfish.guns.item.GunItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;



public class StabxCreativeModeTab {

    // In this Class We will Use this To Register The Multiple Creative Tabs just6 like Items and Sounds So we can have
    // lots of  creative tabs for each category just to fix lag. when opening a creative menu.


    //---------------------------------------------Creatve Tab for Pistols ---------------------------------------------------------------//
    public static final CreativeModeTab STABX_MODERN_GUNS_GROUP = new CreativeModeTab("stabxmodernguns")
    {
        @Override
        public ItemStack makeIcon()
        {
            ItemStack stack = new ItemStack(ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON.get());
            stack.getOrCreateTag().putInt("AmmoCount", ((GunItem) ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON.get()).getGun().getGeneral().getMaxAmmo());
            return stack;
        }
    };

    //---------------------------------------------Creatve Tab for SMGs ---------------------------------------------------------------//
    public static final CreativeModeTab STABX_SMGs = new CreativeModeTab("stabx_smgs")
    {
        @Override
        public ItemStack makeIcon()
        {
            ItemStack stack = new ItemStack(ModItemRegisteration. MP5_CLASSIC.get());
            stack.getOrCreateTag().putInt("AmmoCount",((GunItem) ModItemRegisteration. MP5_CLASSIC.get()).getGun().getGeneral().getMaxAmmo());
            return stack;
        }
    };

    //---------------------------------------------Creatve Tab for Assault Rifles ---------------------------------------------------------------//

    public static final CreativeModeTab STABX_ASSAULT_RIFLES = new CreativeModeTab("stabx_assault_rifles")
    {
        @Override
        public ItemStack makeIcon()
        {
            ItemStack stack = new ItemStack(ModItemRegisteration.M4.get());
            stack.getOrCreateTag().putInt("AmmoCount",((GunItem) ModItemRegisteration.M4.get()).getGun().getGeneral().getMaxAmmo());
            return stack;
        }
    };

    //---------------------------------------------Creatve Tab For Shotguns ---------------------------------------------------------------//

    public static final CreativeModeTab STABX_SHOTGUNS = new CreativeModeTab("stabx_shotguns")
    {
        @Override
        public ItemStack makeIcon()
        {
            ItemStack stack = new ItemStack(ModItemRegisteration.AA_12.get());
            stack.getOrCreateTag().putInt("AmmoCount",((GunItem) ModItemRegisteration.AA_12.get()).getGun().getGeneral().getMaxAmmo());
            return stack;
        }
    };
    //---------------------------------------------Creatve Tab for Rifles ---------------------------------------------------------------//

    public static final CreativeModeTab STABX_RIFlES = new CreativeModeTab("stabx_rifles")
    {
        @Override
        public ItemStack makeIcon()
        {
            ItemStack stack = new ItemStack(ModItemRegisteration.ARISAKA_TYPE_99.get());
            stack.getOrCreateTag().putInt("AmmoCount",((GunItem) ModItemRegisteration.ARISAKA_TYPE_99.get()).getGun().getGeneral().getMaxAmmo());
            return stack;
        }
    };

    //---------------------------------------------Creatve Tab for Sniper Rifles ---------------------------------------------------------------//

    public static final CreativeModeTab STABX_SNIPER_RIFlES = new CreativeModeTab("stabx_sniper_rifles")
    {
        @Override
        public ItemStack makeIcon()
        {
            ItemStack stack = new ItemStack(ModItemRegisteration.ARTIC_WARFARE_MAGNUM.get());
            stack.getOrCreateTag().putInt("AmmoCount",((GunItem) ModItemRegisteration.ARTIC_WARFARE_MAGNUM.get()).getGun().getGeneral().getMaxAmmo());
            return stack;
        }
    };

    //---------------------------------------------Creatve Tab for LMGs ---------------------------------------------------------------//


    public static final CreativeModeTab STABX_LMGs = new CreativeModeTab("stabx_lmgs")
    {
        @Override
        public ItemStack makeIcon()
        {
            ItemStack stack = new ItemStack(ModItemRegisteration.M60.get());
            stack.getOrCreateTag().putInt("AmmoCount",((GunItem) ModItemRegisteration.M60.get()).getGun().getGeneral().getMaxAmmo());
            return stack;
        }
    };

    //--------------------------------Creatve Tab for Attachments and Other Miscellaneous Items ---------------------------------------------------------------//

    public static final CreativeModeTab STABX_MICS = new CreativeModeTab("stabx_misc")
    {
        @Override
        public ItemStack makeIcon()
        {
            ItemStack stack = new ItemStack(ModItemRegisteration.MK_170_CROSSBOW.get());
            stack.getOrCreateTag().putInt("AmmoCount",((GunItem) ModItemRegisteration.MK_170_CROSSBOW.get()).getGun().getGeneral().getMaxAmmo());
            return stack;
        }
    };

    //---------------------------------------------Creative Tab for Ammunition only ---------------------------------------------------------------//

    public static final CreativeModeTab STABX_AMMUNATION = new CreativeModeTab("stabx_ammunation")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItemRegisteration.NINE_MM.get());
        }
    };
}