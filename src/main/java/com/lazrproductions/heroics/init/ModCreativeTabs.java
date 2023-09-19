package com.lazrproductions.heroics.init;

import com.lazrproductions.heroics.ConversationsMod;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, ConversationsMod.MODID);

        public static final RegistryObject<CreativeModeTab> MARIANA_TAB = CREATIVE_MODE_TABS.register("mariana_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .title(Component.translatable("itemGroup.mariana"))
                    //.icon(() -> ModItems.HANDCUFFS.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        //output.accept(ModItems.CELL_DOOR_ITEM.get());
                    }).build());

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }
}
