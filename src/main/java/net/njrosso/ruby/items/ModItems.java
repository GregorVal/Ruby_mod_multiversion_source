package net.njrosso.ruby.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.njrosso.ruby.RubyMod;
import net.njrosso.ruby.armor.ModArmorMaterials;
import net.njrosso.ruby.armor.chestplateItem;

public class ModItems {

    public static final Item njingot = registerItem("njrsingot", new Item(new FabricItemSettings()));

    public static final Item njrs = registerItem("ruby_sw", new katana(ModTier.njrs, 3,
            -2.4f, new FabricItemSettings()));

    public static final Item chestplate = registerItem("njrschest", new chestplateItem(ModArmorMaterials.njrs, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(RubyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RubyMod.LOGGER.info("Registering items for " + RubyMod.MOD_ID);
    }
}
