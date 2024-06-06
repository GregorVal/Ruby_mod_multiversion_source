package net.njrosso.ruby.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.njrosso.ruby.RubyMod;

public class ModItemGroups {
    public static final ItemGroup Ruby = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RubyMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.Ruby"))
                    .icon(() -> new ItemStack(ModItems.njrs)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.njingot);
                        entries.add(ModItems.njrs);
                    })).build());
    public static void registerTabs() {
        RubyMod.LOGGER.info("Adding Ruby Mod tabs");
    }
}
