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
    M1_GARAND_CHAGING_HANDLE("gun/m1_grande_charging_handle"),
    M4("gun/m4"),
    M4_IRONSIGHTS("gun/m4_optic_sight_mount"),
    M4_IRONSIGHTS_MOUNT("gun/m4_optic_sight_unmount"),
    FIVE_HUNDRED_MAGNUM_SMITH_AND_WESSON("gun/500magnum_smith_and_wesson"),
    GLOCK_19_C("gun/glock19c"),
    GLOCK_19_C_SLIDER("gun/glock19c_slider_cover"),
    DESERT_EAGLE_MARK_14("gun/desert_eagle_mark14"),
    DESERT_EAGLE_MARK_14_SLIDER("gun/desert_eagle_mark14_slider"),
    MP5_CLASSIC("gun/mp5_classic"),
    MP5_CLASSIC_IRONSIGHTS("gun/mp5_classic_ironsights"),
    MP5_CLASSIC_IRONSIGHTS_MOUNT("gun/mp5_classic_ironsights_mount"),
    STRIKER45("gun/striker45"),
    MP40("gun/mp40"),
    MP40_CHARGING_HANDLE("gun/mp40_charging_handle"),
    TEC9("gun/tec9"),
    HK416("gun/hk416"),
    MK_MOD11("gun/mkmod11"),
    SCAR_17("gun/scar17"),
    SCAR_17_CHARGING_HANDLE("gun/scar17_charging_handle"),
    SCAR_17_IRONSIGHTS("gun/scar17_ironsights"),
    SCAR_17_IRONSIGHTS_MOUNT("gun/scar17_ironsights_mount"),
    AK_47("gun/ak47"),
    AK_47_CHARGING_HANDLE("gun/ak47_charging_handle"),
    AK_47_IRONSIGHTS("gun/ak47_ironsights"),
    AK_47_IRONSIGHTS_MOUNT("gun/ak47_ironsights_mount"),
    AKM_762("gun/akm_762"),
    AKM_762_CHARGING_HANDLE("gun/akm_762_charging_handle"),
    AKS_74_UX("gun/aks74ux"),
    AKS74UX_CHARGING_HANDLE("gun/aks74ux_charging_handle"),
    AKS74UX_IRONSIGHTS("gun/aks74ux_ironsights"),
    AKS74UX_IRONSIGHTS_MOUNT("gun/aks74ux_ironsights_mount"),

    STG44("gun/stg44"),
    STG44_CHARGING_HANDLE("gun/stg44_charging_handle"),
    M16("gun/m16"),
    M16_IRONSIGHTS("gun/m16_iron_sights"),
    M16_IRONSIGHTS_MOUNT("gun/m16_ironsights_mount"),
    M4A1("gun/m4a1"),
    M4A1_IRONSIGHTS("gun/m4a1_ironsights"),
    M4A1_IRONSIGHTS_MOUNT("gun/m4a1_ironsights_mount"),
    G36C_HD("gun/g36chd"),
    ACR_BUSHMASTER("gun/acr_360_bushmaster"),
    ACR_BUSHMASTER_IRONSIGHTS("gun/acr_360_bushmaster_iron_sights"),
    ACR_BUSHMASTER_IRONSIGHTS_MOUNT("gun/acr_360_bushmaster_iron_sights_mount"),
    AA12UX("gun/aa12ux"),
    AA12UX_IRONSIGHTS("gun/aa12ux_ironsights"),
    AA12UX_IRONSIGHTS_MOUNT("gun/aa12ux_ironsights_mount"),
    SPAS_12("gun/spas12"),

    ARISAKA_TYPE_99("gun/arisaka_type99"),
    ARISAKA_TYPE_99_BOLT("gun/arisaka_type99_bolt"),
    ARISAKA_TYPE_99_IRONSIGHTS("gun/arisaka_type99_ironsights"),
    ARISAKA_TYPE_99_IRONSIGHTS_MOUNT("gun/arisaka_type99_ironsights_mount"),
    ARTIC_WARFARE_MAGNUM("gun/artic_warfare_magnum"),
    ARTIC_WARFARE_MAGNUM_BOLT("gun/artic_warfare_magnum_bolt"),
    ARTIC_WARFARE_MAGNUM_BOLT_CHAMBER("gun/artic_warfare_magnum_bolt_chamber"),

    BARRETT_M82("gun/barrett_m82_sniper"),
    BARRETT_M82_CHARGING_HANDLE("gun/barrett_m82_sniper_charging_handle"),
    BARRETT_M82_IRONSIGHTS("gun/barrett_m82_sniper_ironsights"),
    BARRETT_M82_IRONSIGHTS_MOUNT("gun/barrett_m82_sniper_ironsights_mount"),

    M_SIXTY("gun/m60"),
    M60_IRONSIGHTS_FLIPPED("gun/m60_ironsights_flipped"),
    M60_CHARGING_HANDLE("gun/m60_charging_handle"),
    M60_IRONSIGHTS("gun/m60_ironsights"),
    MK_170_CROSSBOW("gun/mk_170_crossbow"),
    SCAR17_HD("gun/scar17hd"),
    SCAR17_HD_CHARGING_HANDLE("gun/scar17hd_charging_handle"),
    SCAR17_HD_IRONSIGHTS_MOUNT("gun/scar17hd_ironsights_mount"),
    SCAR17_HD_IRONSIGHTS("gun/scar17hd_ironsights"),

    FAMAS_G7("gun/famas_g7"),
    FAMAS_G7_CHARGING_HANDLE("gun/famas_g7_charging_handle"),
    FAMAS_G7_IRONSIGHTS_MOUNT("gun/famas_g7_ironsights_mount"),
    FAMAS_G7_IRONSIGHTS("gun/famas_g7_ironsights"),

    AUG556("gun/aug556"),
    AUG556_IRONSIGHTS_MOUNT("gun/aug556_ironsights_mount"),
    AUG556_IRONSIGHTS("gun/aug556_ironsights"),

    COLT_M1911A1("gun/colt_m1911a1"),
    COLT_M1911A1_SLIDER("gun/colt_m1911a1_slider"),
    KAR98K("gun/kar98k"),
    KAR98k_BOLT("gun/kar98k_bolt"),
    KAR98K_IRONSIGHTS("gun/kar98k_ironsights"),
    KAR98K_IRONSIGHTS_MOUNT("gun/kar98k_ironsights_mount"),

    MCX_HONEYBADGER("gun/mcx_citrus_honeybadger"),
    MCX_HONEYBADGER_IRONSIGHTS("gun/mcx_citrus_honeybadger_iron_sights"),
    MCX_HONEYBADGER_IRONSIGHTS_MOUNT("gun/mcx_citrus_honeybadger_iron_sights_mount"),

    SKS("gun/sks"),
    SKS_IRONSIGHTS("gun/sks_ironsights"),
    SKS_IRONSIGHTS_MOUNT("gun/sks_ironsights_mount"),
    SKS_CHARGING_HANDLE("gun/sks_charging_handle"),

    M_14("gun/m14"),
    M14_IRONSIGHTS("gun/m14_ironsights"),
    M14_IRONSIGHTS_MOUNT("gun/m14_ironsights_mount"),
    M14_CHARGING_HANDLE("gun/m14_charging_handle"),

    SPR_3608("gun/spr3608"),
    SPR_3608_BOLT("gun/spr3608_bolt"),

    ZXR_MP7("gun/zxr_mp7"),
    ZXR_MP7_IRONSIGHTS("gun/zxr_mp7_ironsights"),
    ZXR_MP7_IRONSIGHTS_MOUNT("gun/zxr_mp7_ironsights_mount");

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
