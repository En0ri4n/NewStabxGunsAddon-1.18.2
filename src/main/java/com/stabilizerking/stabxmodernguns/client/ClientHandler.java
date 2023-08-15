package com.stabilizerking.stabxmodernguns.client;

import com.mrcrayfish.guns.client.render.gun.ModelOverrides;
import com.mrcrayfish.guns.client.render.gun.model.SimpleModel;
import com.stabilizerking.stabxmodernguns.client.render.gun.model.*;
import com.stabilizerking.stabxmodernguns.registeration.ModItemRegisteration;

import java.util.Objects;


public class ClientHandler
{
    public static void registerModelOverrides()
    {
//        ModelOverrides.register(ModItemRegisteration.M1_GRANDE.get(), new SimpleModel(SpecialModels.M1_GRANDE::getModel));
//        ModelOverrides.register(ModItemRegisteration.M4.get(), new SimpleModel(SpecialModels.M4::getModel));
//        ModelOverrides.register(ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON.get(), new SimpleModel(SpecialModels.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON::getModel));
//        ModelOverrides.register(ModItemRegisteration.GLOCK_19_C.get(), new SimpleModel(SpecialModels.GLOCK_19_C::getModel));
//        ModelOverrides.register(ModItemRegisteration.DESERT_EAGLE_MARK_14.get(), new SimpleModel(SpecialModels.DESERT_EAGLE_MARK_14::getModel));
//        ModelOverrides.register(ModItemRegisteration.MP5_CLASSIC.get(), new SimpleModel(SpecialModels.MP5_CLASSIC::getModel));
//        ModelOverrides.register(ModItemRegisteration.STRIKER45.get(), new SimpleModel(SpecialModels.STRIKER45::getModel));
//        ModelOverrides.register(ModItemRegisteration.MP40.get(), new SimpleModel(SpecialModels.MP40::getModel));
//        ModelOverrides.register(ModItemRegisteration.TEC9.get(), new SimpleModel(SpecialModels.TEC9::getModel));
//        ModelOverrides.register(ModItemRegisteration.HK416.get(), new SimpleModel(SpecialModels.HK416::getModel));
//        ModelOverrides.register(ModItemRegisteration.MK_MOD11.get(), new SimpleModel(SpecialModels.MK_MOD11::getModel));
//        ModelOverrides.register(ModItemRegisteration.SCAR_17.get(), new SimpleModel(SpecialModels.SCAR_17::getModel));
//        ModelOverrides.register(ModItemRegisteration.AK_47.get(), new SimpleModel(SpecialModels.AK_47::getModel));
//        ModelOverrides.register(ModItemRegisteration.AKM_762.get(), new SimpleModel(SpecialModels.AKM_762::getModel));
//        ModelOverrides.register(ModItemRegisteration.AKS_74_UX.get(), new SimpleModel(SpecialModels.AKS_74_UX::getModel));
//        ModelOverrides.register(ModItemRegisteration.STG44.get(), new SimpleModel(SpecialModels.STG44::getModel));
//        ModelOverrides.register(ModItemRegisteration.M16.get(), new SimpleModel(SpecialModels.M16::getModel));
//        ModelOverrides.register(ModItemRegisteration.M4A1.get(), new SimpleModel(SpecialModels.M4A1::getModel));
//        ModelOverrides.register(ModItemRegisteration.G36C_HD.get(), new SimpleModel(SpecialModels.G36C_HD::getModel));
//        ModelOverrides.register(ModItemRegisteration.ACR_BUSHMASTER.get(), new SimpleModel(SpecialModels.ACR_BUSHMASTER::getModel));
//        ModelOverrides.register(ModItemRegisteration.AA_12.get(), new SimpleModel(SpecialModels.AA_12::getModel));
//        ModelOverrides.register(ModItemRegisteration.SPAS_12.get(), new SimpleModel(SpecialModels.SPAS_12::getModel));
//        ModelOverrides.register(ModItemRegisteration.ARISAKA_TYPE_99.get(), new SimpleModel(SpecialModels.ARISAKA_TYPE_99::getModel));
//        ModelOverrides.register(ModItemRegisteration.ARTIC_WARFARE_MAGNUM.get(), new SimpleModel(SpecialModels.ARTIC_WARFARE_MAGNUM::getModel));
//        ModelOverrides.register(ModItemRegisteration.SCAR_17.get(), new SimpleModel(SpecialModels.SCAR_17::getModel));
//        ModelOverrides.register(ModItemRegisteration.BARRETT_M82.get(), new SimpleModel(SpecialModels.BARRETT_M82::getModel));
//        ModelOverrides.register(ModItemRegisteration.M60.get(), new SimpleModel(SpecialModels.M60::getModel));
//        ModelOverrides.register(ModItemRegisteration.MK_170_CROSSBOW.get(), new SimpleModel(SpecialModels.MK_170_CROSSBOW::getModel));

        ModelOverrides.register(ModItemRegisteration.M1_GRANDE.get(), new M1GarandRifleModel());
        ModelOverrides.register(ModItemRegisteration.M4.get(), new M4Model());
        Objects.requireNonNull(SpecialModels.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON);
        ModelOverrides.register(ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON.get(), new SimpleModel(SpecialModels.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON::getModel));
        ModelOverrides.register(ModItemRegisteration.GLOCK_19_C.get(), new Glock19cModel());
        ModelOverrides.register(ModItemRegisteration.DESERT_EAGLE_MARK_14.get(), new Deaglemk14Model());
        ModelOverrides.register(ModItemRegisteration.MP5_CLASSIC.get(), new Mp5GunModel());
        Objects.requireNonNull(SpecialModels.STRIKER45);
        ModelOverrides.register(ModItemRegisteration.STRIKER45.get(), new SimpleModel(SpecialModels.STRIKER45::getModel));
        ModelOverrides.register(ModItemRegisteration.MP40.get(), new Mp40GunModel());
        Objects.requireNonNull(SpecialModels.TEC9);
        ModelOverrides.register(ModItemRegisteration.TEC9.get(), new SimpleModel(SpecialModels.TEC9::getModel));
        Objects.requireNonNull(SpecialModels.HK416);
        ModelOverrides.register(ModItemRegisteration.HK416.get(), new SimpleModel(SpecialModels.HK416::getModel));
        Objects.requireNonNull(SpecialModels.MK_MOD11);
        ModelOverrides.register(ModItemRegisteration.MK_MOD11.get(), new SimpleModel(SpecialModels.MK_MOD11::getModel));
        ModelOverrides.register(ModItemRegisteration.AK_47.get(), new Ak47GunModel());
        ModelOverrides.register(ModItemRegisteration.AKM_762.get(), new Akm762GunModel());
        ModelOverrides.register(ModItemRegisteration.AKS_74_UX.get(), new Aks74uxGunModel());
        ModelOverrides.register(ModItemRegisteration.STG44.get(), new Stg44GunModel());
        ModelOverrides.register(ModItemRegisteration.M16.get(), new M16Model());
        ModelOverrides.register(ModItemRegisteration.M4A1.get(), new M4A1Model());
        Objects.requireNonNull(SpecialModels.G36C_HD);
        ModelOverrides.register(ModItemRegisteration.G36C_HD.get(), new SimpleModel(SpecialModels.G36C_HD::getModel));
        ModelOverrides.register(ModItemRegisteration.ACR_BUSHMASTER.get(), new ACR360BushmasterModel());
        ModelOverrides.register(ModItemRegisteration.AA_12.get(), new AA12UxModel());
        Objects.requireNonNull(SpecialModels.SPAS_12);
        ModelOverrides.register(ModItemRegisteration.SPAS_12.get(), new SimpleModel(SpecialModels.SPAS_12::getModel));
        ModelOverrides.register(ModItemRegisteration.ARISAKA_TYPE_99.get(), new ArisakaType99GunModel());
        ModelOverrides.register(ModItemRegisteration.ARTIC_WARFARE_MAGNUM.get(), new AWMRifleModel());
        ModelOverrides.register(ModItemRegisteration.SCAR_17.get(), new Scar17Model());
        ModelOverrides.register(ModItemRegisteration.BARRETT_M82.get(), new M82GunModel());
        Objects.requireNonNull(SpecialModels.MK_170_CROSSBOW);
        ModelOverrides.register(ModItemRegisteration.MK_170_CROSSBOW.get(), new SimpleModel(SpecialModels.MK_170_CROSSBOW::getModel));
        ModelOverrides.register(ModItemRegisteration.SCAR_17HD.get(), new Scar17HDGunModel());
        ModelOverrides.register(ModItemRegisteration.FAMAS_G7.get(), new FamasG7GunModel());
        ModelOverrides.register(ModItemRegisteration.KAR98K.get(), new Kar98kRifleModel());
        ModelOverrides.register(ModItemRegisteration.COLT_M1911A1.get(), new M1911A1GunModel());
        ModelOverrides.register(ModItemRegisteration.AUG556.get(), new Aug556GunModel());
        ModelOverrides.register(ModItemRegisteration.MCX_MOHEYBADGER.get(), new McxHoneybadgerModel());
        ModelOverrides.register(ModItemRegisteration.ZRX_MP7.get(), new Mp7Model());
        ModelOverrides.register(ModItemRegisteration.SPR_3608.get(), new SprSniperRifleModel());
        ModelOverrides.register(ModItemRegisteration.SKS.get(), new SksMarksmanModel());
        ModelOverrides.register(ModItemRegisteration.M14.get(), new M14GunModel());
        ModelOverrides.register(ModItemRegisteration.M60.get(), new M60Model());

    }
}
