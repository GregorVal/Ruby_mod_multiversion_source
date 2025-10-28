package net.njrosso.ruby.enchantments;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.njrosso.ruby.RubyMod;

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
        Enchants = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, RubyMod.MODID);
        fire_sweep = Enchants.register("fiery_sweep", () -> {
            return new FierySweep(Rarity.UNCOMMON, EnchantmentCategory.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND}) {
            };
        });
        fire_thorns = Enchants.register("fiery_thorns", () -> {
            return new FieryThorns(Rarity.UNCOMMON, EnchantmentCategory.ARMOR_CHEST, new EquipmentSlot[]{EquipmentSlot.CHEST}) {
            };
        });
    }
}
