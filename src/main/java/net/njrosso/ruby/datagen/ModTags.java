package net.njrosso.ruby.datagen;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.njrosso.ruby.RubyMod;

import javax.swing.text.html.HTML;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> EMPTY = createTag("");

        public static TagKey<Block> createTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(RubyMod.MODID, name));
        }
    }

    public static class Items{
        public static TagKey<Item> createTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(RubyMod.MODID, name));
        }
    }
}
