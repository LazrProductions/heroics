package com.lazrproductions.heroics.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    // Chaining
    // max Chain length
    //public static final ForgeConfigSpec.ConfigValue<Float> MAX_CHAIN_LENGTH;

    static {
        BUILDER.push("Mariana Configs");
                // MAX_CHAIN_LENGTH = BUILDER.comment("The maximum distance, in blocks, that a chained player can get from their anchor. DEFAULT: 5.0").comment("[Float]")
                //         .define("Maximum Chain Length", 5.0f);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
