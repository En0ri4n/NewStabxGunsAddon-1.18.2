package com.stabilizerking.stabxmodernguns.client;

import com.stabilizerking.stabxmodernguns.StabxModernGuns;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ForgeModelBakery;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = StabxModernGuns.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public enum SpecialModels {
    M1_GRANDE("gun/m1_grande"),
    M4("gun/m4"),
    FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON ("gun/500magnum_smith_and_wesson"),
    GLOCK_19_C ("gun/glock19c"),
    DESERT_EAGLE_MARK_14("gun/desert_eagle_mark14"),
    MP5_CLASSIC("gun/mp5_classic"),
    STRIKER45("gun/striker45"),
    MP40("gun/mp40"),
    TEC9("gun/tec9"),
    HK416("gun/hk416"),
    MK_MOD11("gun/mkmod11"),
    SCAR_17("gun/scar17"),
    AK_47("gun/ak47"),
    AKM_762("gun/akm_762"),
    AKS_74_UX("gun/aks74ux"),
    STG44("gun/stg44"),
    M16("gun/m16"),
    M4A1("gun/m4a1"),
    G36C_HD("gun/g36chd"),
    ACR_BUSHMASTER("gun/acr_360_bushmaster"),
    AA_12("gun/aa12"),
    SPAS_12("gun/spas12"),
    ARISAKA_TYPE_99("gun/arisaka_type99"),
    ARTIC_WARFARE_MAGNUM("gun/artic_warfare_magnum"),
    BARRETT_M82("gun/barrett_m82_sniper"),
    M60("gun/m60"),
    MK_170_CROSSBOW("gun/mk_170_crossbow");

    private final ResourceLocation modelLoc;
    private BakedModel cachedModel;

    SpecialModels(String modelName) {
        this.modelLoc = new ResourceLocation(StabxModernGuns.MOD_ID, "special/" + modelName);
    }

    public BakedModel getModel() {
        if (this.cachedModel == null) {
            this.cachedModel = Minecraft.getInstance().getModelManager().getModel(this.modelLoc);
        }
        return this.cachedModel;
    }

    @SubscribeEvent
    public static void onRegisterAdditionalModelEvent(final ModelRegistryEvent event) {
        for (SpecialModels specialModel : values()) {
            ForgeModelBakery.addSpecialModel(specialModel.modelLoc);
        }
    }

    @SubscribeEvent
    public static void onBakingCompletedEvent(final ModelBakeEvent event) {
        for (SpecialModels specialModel : values()) {
            specialModel.cachedModel = null;
        }
    }
}
