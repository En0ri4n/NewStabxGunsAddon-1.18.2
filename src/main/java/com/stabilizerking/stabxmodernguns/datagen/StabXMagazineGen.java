package com.stabilizerking.stabxmodernguns.datagen;

import com.mrcrayfish.guns.common.Magazine;
import com.mrcrayfish.guns.datagen.MagazineProvider;
import com.mrcrayfish.guns.init.ModSounds;
import com.stabilizerking.stabxmodernguns.registeration.ModItemRegisteration;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class StabXMagazineGen extends MagazineProvider
{
    protected StabXMagazineGen(DataGenerator generator)
    {
        super(generator);
    }

    @Override
    protected void registerMagazines()
    {
        addMagazine(getId(ModItemRegisteration.NINE_MM_MAGAZINE), Magazine.Builder.create()
                .setMaxAmmo(15)
                .setReloadAmount(15)
                .setStoredAmmo(ModItemRegisteration.NINE_MM.get())
                .setReloadSound(ModSounds.ITEM_PISTOL_RELOAD.get())
                .build());

        addMagazine(getId(ModItemRegisteration.NINE_X_19MM_PARABELLUM_MAGAZINE), Magazine.Builder.create()
                .setMaxAmmo(15)
                .setReloadAmount(15)
                .setStoredAmmo(ModItemRegisteration.NINE_X_19MM_PARABELLUM.get())
                .setReloadSound(ModSounds.ITEM_PISTOL_RELOAD.get())
                .build());

        addMagazine(getId(ModItemRegisteration.SEVEN_62_MM_MAGAZINE), Magazine.Builder.create()
                .setMaxAmmo(30)
                .setReloadAmount(30)
                .setStoredAmmo(ModItemRegisteration.SEVEN_62_MM.get())
                .setReloadSound(ModSounds.ITEM_PISTOL_RELOAD.get())
                .build());

        addMagazine(getId(ModItemRegisteration.TWELVE_GAUGE_BUCKSHOT_SLUG_SHELL_MAGAZINE), Magazine.Builder.create()
                .setMaxAmmo(8)
                .setReloadAmount(8)
                .setStoredAmmo(ModItemRegisteration.TWELVE_GAUGE_BUCKSHOT_SLUG_SHELL.get())
                .setReloadSound(ModSounds.ITEM_PISTOL_RELOAD.get())
                .build());

        addMagazine(getId(ModItemRegisteration.FIVE_56_X_45_NATO_MAGAZINE), Magazine.Builder.create()
                .setMaxAmmo(30)
                .setReloadAmount(30)
                .setStoredAmmo(ModItemRegisteration.FIVE_56_X_45_NATO.get())
                .setReloadSound(ModSounds.ITEM_PISTOL_RELOAD.get())
                .build());

        addMagazine(getId(ModItemRegisteration.SEVEN_7_X_58_MM_MAGAZINE), Magazine.Builder.create()
                .setMaxAmmo(30)
                .setReloadAmount(30)
                .setStoredAmmo(ModItemRegisteration.SEVEN_7_X_58_MM.get())
                .setReloadSound(ModSounds.ITEM_PISTOL_RELOAD.get())
                .build());

        addMagazine(getId(ModItemRegisteration.SEVEN_THIRTYTWO_MM_KURZ_MAGAZINE), Magazine.Builder.create()
                .setMaxAmmo(30)
                .setReloadAmount(30)
                .setStoredAmmo(ModItemRegisteration.SEVEN_32_X_33_MM_KURZ.get())
                .setReloadSound(ModSounds.ITEM_PISTOL_RELOAD.get())
                .build());

        addMagazine(getId(ModItemRegisteration.FIFTY_CALIBER_MAGAZINE), Magazine.Builder.create()
                .setMaxAmmo(10)
                .setReloadAmount(10)
                .setStoredAmmo(ModItemRegisteration.FIFTY_CALIBER.get())
                .setReloadSound(ModSounds.ITEM_PISTOL_RELOAD.get())
                .build());

        addMagazine(getId(ModItemRegisteration.THREE_HUNDRED_WM_MAGAZINE), Magazine.Builder.create()
                .setMaxAmmo(10)
                .setReloadAmount(10)
                .setStoredAmmo(ModItemRegisteration.THREE_HUNDRED_WM.get())
                .setReloadSound(ModSounds.ITEM_PISTOL_RELOAD.get())
                .build());

        addMagazine(getId(ModItemRegisteration.FIFTY_AE_MAGAZINE), Magazine.Builder.create()
                .setMaxAmmo(10)
                .setReloadAmount(10)
                .setStoredAmmo(ModItemRegisteration.FIFTY_AE.get())
                .setReloadSound(ModSounds.ITEM_PISTOL_RELOAD.get())
                .build());

        addMagazine(getId(ModItemRegisteration.FOURTY_FIVE_ACP_MAGAZINE), Magazine.Builder.create()
                .setMaxAmmo(10)
                .setReloadAmount(10)
                .setStoredAmmo(ModItemRegisteration.FOURTY_FIVE_ACP.get())
                .setReloadSound(ModSounds.ITEM_PISTOL_RELOAD.get())
                .build());

        addMagazine(getId(ModItemRegisteration.SEVEN_SIXTYTWO_X_FIFTYONE_MM_NATO_MAGAZINE), Magazine.Builder.create()
                .setMaxAmmo(10)
                .setReloadAmount(10)
                .setStoredAmmo(ModItemRegisteration.SEVEN_62_MM_MAGAZINE.get())
                .setReloadSound(ModSounds.ITEM_PISTOL_RELOAD.get())
                .build());

        addMagazine(getId(ModItemRegisteration.FIFTY_BMG_MAGAZINE), Magazine.Builder.create()
                .setMaxAmmo(10)
                .setReloadAmount(10)
                .setStoredAmmo(ModItemRegisteration.FIFTY_BMG.get())
                .setReloadSound(ModSounds.ITEM_PISTOL_RELOAD.get())
                .build());

        addMagazine(getId(ModItemRegisteration.THRITY_SIXTY_MAGAZINE), Magazine.Builder.create()
                .setMaxAmmo(10)
                .setReloadAmount(10)
                .setStoredAmmo(ModItemRegisteration.THRITY_SIXTY_AMMO.get())
                .setReloadSound(ModSounds.ITEM_PISTOL_RELOAD.get())
                .build());

        addMagazine(getId(ModItemRegisteration.THREE_HUNDREED_BLACKOUT_MAGAZINE), Magazine.Builder.create()
                .setMaxAmmo(10)
                .setReloadAmount(10)
                .setStoredAmmo(ModItemRegisteration.THRITY_SIXTY_AMMO.get())
                .setReloadSound(ModSounds.ITEM_PISTOL_RELOAD.get())
                .build());

        addMagazine(getId(ModItemRegisteration.SEVEN_92x57MM_MAGAZINE), Magazine.Builder.create()
                .setMaxAmmo(10)
                .setReloadAmount(10)
                .setStoredAmmo(ModItemRegisteration.THRITY_SIXTY_AMMO.get())
                .setReloadSound(ModSounds.ITEM_PISTOL_RELOAD.get())
                .build());

        addMagazine(getId(ModItemRegisteration.FOUR_6x30MM_MAGAZINE), Magazine.Builder.create()
                .setMaxAmmo(10)
                .setReloadAmount(10)
                .setStoredAmmo(ModItemRegisteration.THRITY_SIXTY_AMMO.get())
                .setReloadSound(ModSounds.ITEM_PISTOL_RELOAD.get())
                .build());
    }

    private ResourceLocation getId(RegistryObject<Item> item)
    {
        return item.get().getRegistryName();
    }
}
