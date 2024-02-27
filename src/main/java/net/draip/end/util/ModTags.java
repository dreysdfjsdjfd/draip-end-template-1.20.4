package net.draip.end.util;

import net.draip.end.DraipEnd;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ENDSTONE_BLOCKS =
                createTag("endstone_blocks");

        private static TagKey<Block> createTag(String name) {
            return  TagKey.of(RegistryKeys.BLOCK, new Identifier(DraipEnd.MOD_ID, name));
        }
    }

    public  static class Items {

        private static TagKey<Item> createTag(String name) {
            return  TagKey.of(RegistryKeys.ITEM, new Identifier(DraipEnd.MOD_ID, name));
        }
    }

    }
