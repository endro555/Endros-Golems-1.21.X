package net.endro.endrosgolems.item;

import net.endro.endrosgolems.EndrosGolems;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EndrosGolems.MOD_ID);

    public static final DeferredItem<Item> TESTITEM = ITEMS.register("testitem",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EVILTESTITEM = ITEMS.register("eviltestitem",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}