package net.njrosso.ruby.enchantments;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.njrosso.ruby.RubyMod;

public class ModEnchants {

    public static final Enchantment WitherThorns = registerEnchant("wither_thorns", new WitherThornsEnchant(Enchantment.Rarity.UNCOMMON,
            EnchantmentCategory.ARMOR, new EquipmentSlot[]{EquipmentSlot.CHEST}));


    private static Enchantment registerEnchant(String name, Enchantment enchantment){
        return Registry.register(BuiltInRegistries.ENCHANTMENT, new ResourceLocation(RubyMod.MOD_ID, name), enchantment);
    }

    public static void registerModEnchants() {
        RubyMod.LOGGER.info("Registering enchantments for " + RubyMod.MOD_ID);
    }
}
