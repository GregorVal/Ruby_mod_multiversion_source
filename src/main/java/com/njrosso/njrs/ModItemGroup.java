package com.njrosso.njrs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup extends CreativeModeTab {
    public ModItemGroup(String label) {
        super(label);
    }

    public static final CreativeModeTab NJR = new CreativeModeTab("TabNJRs") {
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.njrs.get());
        }
    };

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.njrs.get());
    }
}
