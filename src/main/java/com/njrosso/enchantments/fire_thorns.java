package com.njrosso.enchantments;

import com.njrosso.armor.samurai.bootItem;
import com.njrosso.armor.samurai.chestplateItem;
import com.njrosso.armor.samurai.helmetItem;
import com.njrosso.armor.samurai.leggingsItem;
import java.util.Map;
import java.util.Random;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;

public class fire_thorns extends Enchantment {
    protected fire_thorns(Enchantment.Rarity p_44676_, EnchantmentCategory p_44677_, EquipmentSlot... p_44678_) {
        super(p_44676_, p_44677_, p_44678_);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public void doPostHurt(LivingEntity livingEntity, Entity entity, int level) {
        Random random = livingEntity.getRandom();
        Map.Entry<EquipmentSlot, ItemStack> entry = EnchantmentHelper.getRandomItemWith(EnchantInit.fire_thorns.get(), livingEntity);
        if (entity != null) {
            entity.hurt(DamageSource.IN_FIRE, 13.5F);
            entity.setSecondsOnFire(3);
        }
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return stack.getItem() instanceof helmetItem || stack.getItem() instanceof chestplateItem || stack.getItem() instanceof leggingsItem || stack.getItem() instanceof bootItem;
    }
}
