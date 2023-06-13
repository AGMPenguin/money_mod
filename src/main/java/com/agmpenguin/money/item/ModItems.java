package com.agmpenguin.money.item;

import com.agmpenguin.money.Money;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Money.MOD_ID);

    public static final RegistryObject<Item> ONE_DOLLAR = registerItem("one_dollar");
    public static final RegistryObject<Item> FIVE_DOLLARS = registerItem("five_dollars");
    public static final RegistryObject<Item> TEN_DOLLARS = registerItem("ten_dollars");
    public static final RegistryObject<Item> FIFTY_DOLLARS = registerItem("fifty_dollars");
    public static final RegistryObject<Item> ONE_HUNDRED_DOLLARS = registerItem("one_hundred_dollars");

    private static RegistryObject<Item> registerItem(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
