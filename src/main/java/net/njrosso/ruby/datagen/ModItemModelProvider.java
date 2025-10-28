package net.njrosso.ruby.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.njrosso.ruby.RubyMod;
import net.njrosso.ruby.items.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RubyMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.njingot.get());
        basicItem(ModItems.njrhelm.get());
        basicItem(ModItems.njrchestplate.get());
        basicItem(ModItems.njrleg.get());
        basicItem(ModItems.njrboots.get());
    }


}
