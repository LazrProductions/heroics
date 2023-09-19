package com.lazrproductions.heroics.init;


import com.lazrproductions.heroics.ConversationsMod;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister
            .create(ForgeRegistries.ENTITY_TYPES, ConversationsMod.MODID);

//     public static RegistryObject<EntityType<PadlockEntity>> PADLOCK = ENTITY_TYPES.register("padlock",
//             () -> EntityType.Builder.<PadlockEntity>of(PadlockEntity::new, MobCategory.MISC)
//                     .clientTrackingRange(10)
//                     .updateInterval(Integer.MAX_VALUE)
//                     .setShouldReceiveVelocityUpdates(false)
//                     .sized(6 / 16f, 0.5f).canSpawnFarFromPlayer().fireImmune()
//                     .build(new ResourceLocation(CuffedMod.MODID, "padlock").toString()));

    public static void register(IEventBus bus) {
        ENTITY_TYPES.register(bus);
    }
}