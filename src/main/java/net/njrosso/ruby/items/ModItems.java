package net.njrosso.ruby.items;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.Unbreakable;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.njrosso.ruby.RubyMod;
import net.njrosso.ruby.armor.samurai.*;
import net.njrosso.ruby.items.custom.katana.katana;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RubyMod.MODID);


    ///////////////////////////REPAIR AND CRAFTING ITEM////////////////
    public static final DeferredItem<Item> njingot = ITEMS.register("njrsingot",
            () -> new Item(new Item.Properties()));

    ///////////////////////////WEAPONS/////////////////////////////////
    public static final DeferredItem<Item> njrs = ITEMS.register("ruby_sw", () -> new katana(ModTier.NJRS, new Item.Properties().rarity(Rarity.EPIC).attributes(SwordItem.createAttributes(ModTier.NJRS, 3, -2.4f)).component(DataComponents.UNBREAKABLE, new Unbreakable(false))));
    
    public static final DeferredItem<Item> master_katana = ITEMS.register("mcd_master_katana", () -> new katana(ModTier.NJRS, new Item.Properties().attributes(SwordItem.createAttributes(ModTier.NJRS, 3, -2.4f))));

    ///////////////////////////SAMURAI ARMOR PIECES////////////////////////////

    public static final DeferredItem<ArmorItem> njrchestplate = ITEMS.register("njrschest",
            () -> new SamuraiArmor(ModArmorMaterials.njrs, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(1)));

    public static final DeferredItem<ArmorItem> njrhelm = ITEMS.register("njrshelm",
            () -> new SamuraiArmor(ModArmorMaterials.njrs, ArmorItem.Type.HELMET, new Item.Properties().stacksTo(1)));

    public static final DeferredItem<ArmorItem> njrboots = ITEMS.register("njrsboot",
            () -> new SamuraiArmor(ModArmorMaterials.njrs, ArmorItem.Type.BOOTS, new Item.Properties().stacksTo(1)));

    public static final DeferredItem<ArmorItem> njrleg = ITEMS.register("njrsleg",
            () -> new SamuraiArmor(ModArmorMaterials.njrs, ArmorItem.Type.LEGGINGS, new Item.Properties().stacksTo(1)));
}
