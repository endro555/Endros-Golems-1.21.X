package net.endro.endrosgolems.item;

import net.endro.endrosgolems.EndrosGolems;
import net.endro.endrosgolems.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EndrosGolems.MOD_ID);

    public static final Supplier<CreativeModeTab> BISMUTH_ITEMS_TAB = CREATIVE_MODE_TAB.register("bismuth_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TESTITEM.get()))
                    .title(Component.translatable("creativetab.endrosgolems.testcategory"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TESTITEM);
                        output.accept(ModItems.EVILTESTITEM);
                    }).build());

    public static final Supplier<CreativeModeTab> BISMUTH_BLOCK_TAB = CREATIVE_MODE_TAB.register("bismuth_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SCARY_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EndrosGolems.MOD_ID, "bismuth_items_tab"))
                    .title(Component.translatable("creativetab.endrosgolems.testblocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.SCARY_BLOCK);
                        output.accept(ModBlocks.BENEVOLENT_BLOCK);
                        output.accept(ModBlocks.NEUTRAL_BLOCK);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}