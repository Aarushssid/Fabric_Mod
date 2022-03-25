package net.blockpro9.tut.util;

import net.blockpro9.tut.Tut;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> DOWSING_ROD_DETECTABLE_BLOCKS =
                createTag("dowsing_rod_detectable_blocks");
        public static final TagKey<Block> MYTHRIL_BLOCKS =
                createCommonTag("mythril_blocks");
        public static final TagKey<Block> MYTHRIL_ORES =
                createCommonTag("mythril_ores");


        private static TagKey<Block> createTag(String name) {
             return TagKey.of(Registry.BLOCK_KEY, new Identifier(Tut.MOD_ID, name));
        }
        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }

    }

    public static class Items {
        public static final TagKey<Item> MYTHRIL_INGOTS = createCommonTag("mythril_ingots");
        public static final TagKey<Item> MYTHRIL_NUGGETS = createCommonTag("mythril_nuggets");
        public static final TagKey<Item> RAW_MYTHRILS = createCommonTag("raw_mythrils");


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(Tut.MOD_ID, name));
        }
        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }
}
