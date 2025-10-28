package net.njrosso.ruby.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups extends CreativeModeTab {
    public ModItemGroups(String label) {
        super(label);
    }

    public static final CreativeModeTab NJR = new CreativeModeTab("Tabruby") {
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.njrs.get());
        }
    };

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.njrs.get());
    }
}
