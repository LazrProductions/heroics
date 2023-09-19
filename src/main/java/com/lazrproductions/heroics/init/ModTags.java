package com.lazrproductions.heroics.init;

import com.lazrproductions.heroics.ConversationsMod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        //public static final TagKey<Block> LOCKABLE_BLOCKS = tag("lockable_blocks");

        public static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ConversationsMod.MODID, name));
        }
    }
    
}
