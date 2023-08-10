package com.stabilizerking.stabxmodernguns.item;

import com.mrcrayfish.guns.item.GunItem;
import net.minecraft.world.item.ItemStack;


public class StabxModernGunsItem extends GunItem {

    private final boolean canColor;

    public StabxModernGunsItem(Properties properties, boolean canColor) {
        super(properties);
        this.canColor = canColor;
    }

    @Override
    public boolean canColor(ItemStack stack) {
        return this.canColor;
    }

}
