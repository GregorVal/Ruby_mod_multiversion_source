package net.njrosso.ruby.items.custom.katana;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class katana extends SwordItem {

    public katana(Tier tier, int i, float f, Properties properties) {
        super(tier, i, f, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.setSecondsOnFire(12);
        return super.hurtEnemy(stack, target, attacker);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }
}
