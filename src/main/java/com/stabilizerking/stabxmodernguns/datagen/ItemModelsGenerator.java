package com.stabilizerking.stabxmodernguns.datagen;

import com.stabilizerking.stabxmodernguns.StabxModernGuns;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistryEntry;

import java.util.Objects;

public class ItemModelsGenerator extends ItemModelProvider
{
    public ItemModelsGenerator(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, StabxModernGuns.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        ForgeRegistries.ITEMS.getValues().stream()
                .map(ForgeRegistryEntry::getRegistryName)
                .filter(Objects::nonNull)
                .filter(registryName -> StabxModernGuns.MOD_ID.equals(registryName.getNamespace()))
                .forEach(this::basicItem);
    }
}
