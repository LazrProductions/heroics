package com.lazrproductions.heroics.init;


import com.lazrproductions.heroics.ConversationsMod;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageType;


public class ModDamageTypes {
    //In case you want to add your own damage source
    //public static final ResourceKey<DamageType> HANG = register("hang");

    public static ResourceKey<DamageType> register (String key){
        return ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation(ConversationsMod.MODID, key));
    }

    // public static DamageSource GetModSource(Entity entity, ResourceKey<DamageType> type, @Nullable Entity other) {
    //    return new DamageSource(entity.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(HANG), entity, other == null ? entity : other);
    // }

    public static void bootstrap(BootstapContext<DamageType> context) {
        //context.register(HANG, new DamageType("hang", 0.1F));
    }
}
