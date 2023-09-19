package com.lazrproductions.heroics.init;


import com.lazrproductions.heroics.ConversationsMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        ConversationsMod.MODID);

        // Normal Items
        // public static final RegistryObject<Item> KEY = ITEMS.register("key",
        //                 () -> new Key(new Item.Properties().stacksTo(16)));
                


        // Block Items
        // public static final RegistryObject<Item> REINFORCED_STONE_ITEM = ITEMS.register("reinforced_stone",
        //                 () -> new BlockItem(ModBlocks.REINFORCED_STONE.get(), new Item.Properties()));

        
        public static void register(IEventBus bus) {
                ITEMS.register(bus);
        }
}
