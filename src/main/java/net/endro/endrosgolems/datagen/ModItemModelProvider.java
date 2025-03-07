package net.endro.endrosgolems.datagen;

import net.endro.endrosgolems.EndrosGolems;
import net.endro.endrosgolems.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EndrosGolems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.TESTITEM.get());
        basicItem(ModItems.EVILTESTITEM.get());

    }
}
