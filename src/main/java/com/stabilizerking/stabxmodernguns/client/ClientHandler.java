package com.stabilizerking.stabxmodernguns.client;

import com.mrcrayfish.guns.client.render.gun.model.SimpleModel;
import com.mrcrayfish.guns.client.render.gun.ModelOverrides;
import com.stabilizerking.stabxmodernguns.registeration.ModItemRegisteration;


public class ClientHandler {
    public static void registerModelOverrides() {
        ModelOverrides.register(ModItemRegisteration.M1_GRANDE.get(), new SimpleModel(SpecialModels.M1_GRANDE::getModel));
        ModelOverrides.register(ModItemRegisteration.M4.get(), new SimpleModel(SpecialModels.M4::getModel));
        ModelOverrides.register(ModItemRegisteration.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON.get(), new SimpleModel(SpecialModels.FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON::getModel));
        ModelOverrides.register(ModItemRegisteration.GLOCK_19_C.get(), new SimpleModel(SpecialModels.GLOCK_19_C::getModel));
        ModelOverrides.register(ModItemRegisteration.DESERT_EAGLE_MARK_14.get(), new SimpleModel(SpecialModels.DESERT_EAGLE_MARK_14::getModel));
        ModelOverrides.register(ModItemRegisteration.MP5_CLASSIC.get(), new SimpleModel(SpecialModels.MP5_CLASSIC::getModel));
        ModelOverrides.register(ModItemRegisteration.STRIKER45.get(), new SimpleModel(SpecialModels.STRIKER45::getModel));
        ModelOverrides.register(ModItemRegisteration.MP40.get(), new SimpleModel(SpecialModels.MP40::getModel));
        ModelOverrides.register(ModItemRegisteration.TEC9.get(), new SimpleModel(SpecialModels.TEC9::getModel));
        ModelOverrides.register(ModItemRegisteration.HK416.get(), new SimpleModel(SpecialModels.HK416::getModel));
        ModelOverrides.register(ModItemRegisteration.MK_MOD11.get(), new SimpleModel(SpecialModels.MK_MOD11::getModel));
        ModelOverrides.register(ModItemRegisteration.SCAR_17.get(), new SimpleModel(SpecialModels.SCAR_17::getModel));
        ModelOverrides.register(ModItemRegisteration.AK_47.get(), new SimpleModel(SpecialModels.AK_47::getModel));
        ModelOverrides.register(ModItemRegisteration.AKM_762.get(), new SimpleModel(SpecialModels.AKM_762::getModel));
        ModelOverrides.register(ModItemRegisteration.AKS_74_UX.get(), new SimpleModel(SpecialModels.AKS_74_UX::getModel));
        ModelOverrides.register(ModItemRegisteration.STG44.get(), new SimpleModel(SpecialModels.STG44::getModel));
        ModelOverrides.register(ModItemRegisteration.M16.get(), new SimpleModel(SpecialModels.M16::getModel));
        ModelOverrides.register(ModItemRegisteration.M4A1.get(), new SimpleModel(SpecialModels.M4A1::getModel));
        ModelOverrides.register(ModItemRegisteration.G36C_HD.get(), new SimpleModel(SpecialModels.G36C_HD::getModel));
        ModelOverrides.register(ModItemRegisteration.ACR_BUSHMASTER.get(), new SimpleModel(SpecialModels.ACR_BUSHMASTER::getModel));
        ModelOverrides.register(ModItemRegisteration.AA_12.get(), new SimpleModel(SpecialModels.AA_12::getModel));
        ModelOverrides.register(ModItemRegisteration.SPAS_12.get(), new SimpleModel(SpecialModels.SPAS_12::getModel));
        ModelOverrides.register(ModItemRegisteration.ARISAKA_TYPE_99.get(), new SimpleModel(SpecialModels.ARISAKA_TYPE_99::getModel));
        ModelOverrides.register(ModItemRegisteration.ARTIC_WARFARE_MAGNUM.get(), new SimpleModel(SpecialModels.ARTIC_WARFARE_MAGNUM::getModel));
        ModelOverrides.register(ModItemRegisteration.SCAR_17.get(), new SimpleModel(SpecialModels.SCAR_17::getModel));
        ModelOverrides.register(ModItemRegisteration.BARRETT_M82.get(), new SimpleModel(SpecialModels.BARRETT_M82::getModel));
        ModelOverrides.register(ModItemRegisteration.M60.get(), new SimpleModel(SpecialModels.M60::getModel));
        ModelOverrides.register(ModItemRegisteration.MK_170_CROSSBOW.get(), new SimpleModel(SpecialModels.MK_170_CROSSBOW::getModel));

    }
}
