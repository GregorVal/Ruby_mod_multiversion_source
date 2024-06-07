package com.njrosso.enchantments;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EnchantInit {
    public static final DeferredRegister<Enchantment> Enchants;
    public static RegistryObject<Enchantment> fire_sweep;
    public static RegistryObject<Enchantment> fire_thorns;

    public EnchantInit() {
    }

    public static void register(IEventBus eventBus) {
        Enchants.register(eventBus);
    }

    static {
        Enchants = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, "njrs");
        fire_sweep = Enchants.register("fire_sweep", () -> {
            return new fire_sweep(Rarity.UNCOMMON, EnchantmentCategory.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND}) {
            };
        });
        fire_thorns = Enchants.register("fire_thorns", () -> {
            return new fire_thorns(Rarity.UNCOMMON, EnchantmentCategory.ARMOR_CHEST, new EquipmentSlot[]{EquipmentSlot.CHEST}) {
            };
        });
    }
}
