package net.njrosso.ruby.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.njrosso.ruby.RubyMod;

public class ModItemGroups {

    public static final CreativeModeTab Ruby = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            new ResourceLocation(RubyMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().title(Component.translatable("itemGroup.Ruby"))
                    .icon(() -> new ItemStack(ModItems.njrs)).displayItems(((displayContext, entries) -> {
                        entries.accept(ModItems.njingot);
                        entries.accept(ModItems.njrs);
                        entries.accept(ModItems.njrhelm);
                        entries.accept(ModItems.njrchestplate);
                        entries.accept(ModItems.njrleg);
                        entries.accept(ModItems.njrboots);
                        entries.accept(ModItems.dawn_chestplate);
                        entries.accept(ModItems.dawn_helmet);
                        entries.accept(ModItems.dawn_leggings);
                        entries.accept(ModItems.dawn_boots);
                        entries.accept(ModItems.strangescrap);
                        entries.accept(ModItems.master_katana);
                    })).build());

    public static void registerTabs() {
        RubyMod.LOGGER.info("Adding Ruby Mod tabs");
    }
}
