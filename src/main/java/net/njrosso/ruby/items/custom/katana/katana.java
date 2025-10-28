package net.njrosso.ruby.items.custom.katana;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class katana extends SwordItem {

    public katana(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.igniteForSeconds(12);
        return super.hurtEnemy(stack, target, attacker);
    }

    /*
    @Override
    public boolean supportsEnchantment(ItemStack stack, Holder<Enchantment> enchantment) {
        return enchantment == Enchantments.SHARPNESS ||
                enchantment == Enchantments.SWEEPING_EDGE ||
                enchantment == Enchantments.SMITE ||
                enchantment == Enchantments.KNOCKBACK ||
                enchantment == Enchantments.LOOTING ||
                enchantment == Enchantments.BANE_OF_ARTHROPODS;
    }*/
    /*
    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }*/
}