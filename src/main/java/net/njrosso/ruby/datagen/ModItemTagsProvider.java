package net.njrosso.ruby.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.njrosso.ruby.RubyMod;
import net.njrosso.ruby.items.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, RubyMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //add custom swords to sword tag to make them enchantable
        tag(ItemTags.SWORDS).add(ModItems.njrs.get());
        tag(ItemTags.SWORDS).add(ModItems.master_katana.get());

        //add custom armor to armor tag to make them enchantable
        tag(ItemTags.CHEST_ARMOR).add(ModItems.njrchestplate.get());
        tag(ItemTags.HEAD_ARMOR).add(ModItems.njrhelm.get());
        tag(ItemTags.LEG_ARMOR).add(ModItems.njrleg.get());
        tag(ItemTags.FOOT_ARMOR).add(ModItems.njrboots.get());
    }
}