package com.lazrproductions.heroics.init;

import net.minecraftforge.registries.ForgeRegistries.Keys;
import net.minecraftforge.registries.RegisterEvent;

public class ModSounds {
    //public static final SoundEvent HANDCUFFED_SOUND = SoundEvent
    //        .createVariableRangeEvent(new ResourceLocation(MarianaMod.MODID, "apply_handcuffs"));

    public static void register(RegisterEvent event) {
        event.register(Keys.SOUND_EVENTS, x -> {
            //x.register(new ResourceLocation(MarianaMod.MODID, "apply_handcuffs"), HANDCUFFED_SOUND);
        });
    }
}
