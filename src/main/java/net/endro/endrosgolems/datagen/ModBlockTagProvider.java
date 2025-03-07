package net.endro.endrosgolems.datagen;

import net.endro.endrosgolems.EndrosGolems;
import net.endro.endrosgolems.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EndrosGolems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
       tag(BlockTags.MINEABLE_WITH_PICKAXE)
               .add(ModBlocks.BENEVOLENT_BLOCK.get())
               .add(ModBlocks.NEUTRAL_BLOCK.get())
               .add(ModBlocks.SCARY_BLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.NEUTRAL_BLOCK.get());

    }
}
