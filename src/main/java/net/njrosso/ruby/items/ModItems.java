package net.njrosso.ruby.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.njrosso.ruby.RubyMod;

public class ModItems {

    public static final Item njingot = registerItem("njrsingot", new Item(new FabricItemSettings()));

    public static final Item njrs = registerItem("ruby_sw", new katana(ModTier.njrs, 3,
            -2.4f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(RubyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RubyMod.LOGGER.info("Registering items for " + RubyMod.MOD_ID);
    }
}
