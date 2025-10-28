package net.njrosso.ruby.items;

import net.njrosso.ruby.RubyMod;
import net.njrosso.ruby.armor.ModArmorMaterials;
import net.njrosso.ruby.armor.samurai.*;
import net.njrosso.ruby.armor.uniformItem;
import net.njrosso.ruby.items.custom.katana.katana;
import net.njrosso.ruby.items.custom.tj_katana;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS;
    public static final RegistryObject<Item> njrsingot;
    public static final RegistryObject<Item> njrs;
    public static final RegistryObject<Item> master_k;
    public static final RegistryObject<Item> njrhelm;
    public static final RegistryObject<Item> njrchestplate;
    public static final RegistryObject<Item> njrleg;
    public static final RegistryObject<Item> njrboots;
    public static final RegistryObject<Item> u_helm;
    public static final RegistryObject<Item> u_chest;
    public static final RegistryObject<Item> u_leg;
    public static final RegistryObject<Item> u_boots;
    public static final RegistryObject<Item> strange_scrap;
    public static final RegistryObject<Item> tj_katana;

    public ModItems() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RubyMod.MODID);
        njrsingot = ITEMS.register("njrsingot", () -> {
            return new Item((new Item.Properties()).tab(ModItemGroups.NJR));
        });
        njrs = ITEMS.register("njrs", () -> {
            return new katana(ModTier.njrs_item, 0, -2.4F, (new Item.Properties()).tab(ModItemGroups.NJR));
        });
        master_k = ITEMS.register("master_k", () -> {
            return new katana(ModTier.njrs_item, 0, -2.4F, (new Item.Properties()).tab(ModItemGroups.NJR));
        });
        njrhelm = ITEMS.register("njrshelm", () -> {
            return new SamuraiArmor(ModArmorMaterials.njrs, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModItemGroups.NJR));
        });
        njrchestplate = ITEMS.register("njrschest", () -> {
            return new SamuraiArmor(ModArmorMaterials.njrs, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModItemGroups.NJR));
        });
        njrleg = ITEMS.register("njrsleg", () -> {
            return new SamuraiArmor(ModArmorMaterials.njrs, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModItemGroups.NJR));
        });
        njrboots = ITEMS.register("njrsboot", () -> {
            return new SamuraiArmor(ModArmorMaterials.njrs, EquipmentSlot.FEET, (new Item.Properties()).tab(ModItemGroups.NJR));
        });
        u_helm = ITEMS.register("u_helm", () -> {
            return new uniformItem(ModArmorMaterials.unif, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModItemGroups.NJR));
        });
        u_chest = ITEMS.register("u_chest", () -> {
            return new uniformItem(ModArmorMaterials.unif, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModItemGroups.NJR));
        });
        u_leg = ITEMS.register("u_leg", () -> {
            return new uniformItem(ModArmorMaterials.unif, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModItemGroups.NJR));
        });
        u_boots = ITEMS.register("u_boots", () -> {
            return new uniformItem(ModArmorMaterials.unif, EquipmentSlot.FEET, (new Item.Properties()).tab(ModItemGroups.NJR));
        });
        strange_scrap = ITEMS.register("strange_scrap", () -> {
            return new Item((new Item.Properties()).tab(ModItemGroups.NJR));
        });
        tj_katana = ITEMS.register("tj_katana", () -> {
            return new tj_katana(ModTier.tj_katana_item, 0, -2.4F, (new Item.Properties()).tab(ModItemGroups.NJR));
        });
    }
}