package net.njrosso.ruby.armor;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.Level;
import net.njrosso.ruby.enchantments.ModEnchants;

public class akatsukiArmor extends ArmorItem {
    public akatsukiArmor(ArmorMaterial armorMaterial, Type type, Properties properties) {
        super(armorMaterial, type, properties);
    }

    @Override
    public void inventoryTick(ItemStack itemStack, Level level, Entity entity, int i, boolean bl) {
        if (entity instanceof Player) {
            Enchantment witherThorns = ModEnchants.WitherThorns;
            witherThorns.doPostHurt((Player)entity, ((Player) entity).getLastHurtByMob(), 1);
        }
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }
}