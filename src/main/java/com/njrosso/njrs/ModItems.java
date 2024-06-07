package com.njrosso.njrs;

import com.njrosso.armor.ModArmorMaterials;
import com.njrosso.armor.uniformItem;
import com.njrosso.armor.samurai.bootItem;
import com.njrosso.armor.samurai.chestplateItem;
import com.njrosso.armor.samurai.helmetItem;
import com.njrosso.armor.samurai.leggingsItem;
import com.njrosso.weapons.njrs_item;
import com.njrosso.weapons.tj_katana;
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
    public static final RegistryObject<Item> njrs_helmet;
    public static final RegistryObject<Item> njrs_chestplate;
    public static final RegistryObject<Item> njrs_legs;
    public static final RegistryObject<Item> njrs_boots;
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
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "njrs");
        njrsingot = ITEMS.register("njrsingot", () -> {
            return new Item((new Item.Properties()).tab(ModItemGroup.NJR));
        });
        njrs = ITEMS.register("njrs", () -> {
            return new njrs_item(ModTier.njrs_item, 0, -2.4F, (new Item.Properties()).tab(ModItemGroup.NJR));
        });
        master_k = ITEMS.register("master_k", () -> {
            return new njrs_item(ModTier.njrs_item, 0, -2.4F, (new Item.Properties()).tab(ModItemGroup.NJR));
        });
        njrs_helmet = ITEMS.register("njrshelm", () -> {
            return new helmetItem(ModArmorMaterials.njrs, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModItemGroup.NJR));
        });
        njrs_chestplate = ITEMS.register("njrschest", () -> {
            return new chestplateItem(ModArmorMaterials.njrs, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModItemGroup.NJR));
        });
        njrs_legs = ITEMS.register("njrsleg", () -> {
            return new leggingsItem(ModArmorMaterials.njrs, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModItemGroup.NJR));
        });
        njrs_boots = ITEMS.register("njrsboot", () -> {
            return new bootItem(ModArmorMaterials.njrs, EquipmentSlot.FEET, (new Item.Properties()).tab(ModItemGroup.NJR));
        });
        u_helm = ITEMS.register("u_helm", () -> {
            return new uniformItem(ModArmorMaterials.unif, EquipmentSlot.HEAD, (new Item.Properties()).tab(ModItemGroup.NJR));
        });
        u_chest = ITEMS.register("u_chest", () -> {
            return new uniformItem(ModArmorMaterials.unif, EquipmentSlot.CHEST, (new Item.Properties()).tab(ModItemGroup.NJR));
        });
        u_leg = ITEMS.register("u_leg", () -> {
            return new uniformItem(ModArmorMaterials.unif, EquipmentSlot.LEGS, (new Item.Properties()).tab(ModItemGroup.NJR));
        });
        u_boots = ITEMS.register("u_boots", () -> {
            return new uniformItem(ModArmorMaterials.unif, EquipmentSlot.FEET, (new Item.Properties()).tab(ModItemGroup.NJR));
        });
        strange_scrap = ITEMS.register("strange_scrap", () -> {
            return new Item((new Item.Properties()).tab(ModItemGroup.NJR));
        });
        tj_katana = ITEMS.register("tj_katana", () -> {
            return new tj_katana(ModTier.tj_katana_item, 0, -2.4F, (new Item.Properties()).tab(ModItemGroup.NJR));
        });
    }
}