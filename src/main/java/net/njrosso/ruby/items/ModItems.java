package net.njrosso.ruby.items;

import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.njrosso.ruby.RubyMod;
import net.njrosso.ruby.armor.ModArmorMaterials;
import net.njrosso.ruby.armor.samurai.*;
import net.njrosso.ruby.items.custom.katana.katana;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RubyMod.MODID);


    ///////////////////////////REPAIR AND CRAFTING ITEM////////////////
    public static final RegistryObject<Item> njingot = ITEMS.register("njrsingot",
            () -> new Item(new Item.Properties()));

    ///////////////////////////WEAPONS/////////////////////////////////
    public static final RegistryObject<Item> njrs = ITEMS.register("ruby_sw",
            () -> new katana(ModTier.NJRS, 3, -2.4f, new Item.Properties()));
    
    public static final RegistryObject<Item> master_katana = ITEMS.register("mcd_master_katana",
            () -> new katana(ModTier.NJRS, 3, -2.4f, new Item.Properties()));

    ///////////////////////////SAMURAI ARMOR PIECES////////////////////////////

    public static final RegistryObject<ArmorItem> njrchestplate = ITEMS.register("njrschest",
            () -> new SamuraiArmor(ModArmorMaterials.njrs, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<ArmorItem> njrhelm = ITEMS.register("njrshelm",
            () -> new SamuraiArmor(ModArmorMaterials.njrs, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<ArmorItem> njrboots = ITEMS.register("njrsboot",
            () -> new SamuraiArmor(ModArmorMaterials.njrs, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<ArmorItem> njrleg = ITEMS.register("njrsleg",
            () -> new SamuraiArmor(ModArmorMaterials.njrs, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));
}
