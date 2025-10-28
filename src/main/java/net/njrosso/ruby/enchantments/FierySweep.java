package net.njrosso.ruby.enchantments;


import java.util.Iterator;
import java.util.List;

import net.njrosso.ruby.items.custom.katana.katana;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.decoration.ItemFrame;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;

public class FierySweep extends Enchantment {
    public FierySweep(Enchantment.Rarity p_44676_, EnchantmentCategory p_44677_, EquipmentSlot... p_44678_) {
        super(p_44676_, p_44677_, p_44678_);
    }

    public static void multiE(LivingEntity player1) {
        Entity p = player1;
        if (p instanceof Player player) {
            Level world1 = player.getLevel();
            double range = 3.0;
            List<Entity> entities = world1.getEntities(player, player.getBoundingBox().inflate(range));
            Iterator var7 = entities.iterator();

            while(var7.hasNext()) {
                Entity entity = (Entity)var7.next();
                if (entity instanceof LivingEntity && !(entity instanceof ItemEntity) && !(entity instanceof ArmorStand) && !(entity instanceof ItemFrame)) {
                    entity.hurt(DamageSource.IN_FIRE, 13.5F);
                    entity.setSecondsOnFire(5);
                }
            }
        }

    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity target, int level) {
        if (!pAttacker.level.isClientSide) {
            ServerLevel world = (ServerLevel)pAttacker.level;
            if (EnchantmentHelper.getEnchantmentLevel(this, pAttacker) > 0) {
                Player player = (Player)pAttacker;
                multiE(pAttacker);
            }
        }

        super.doPostAttack(pAttacker, target, level);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return stack.getItem() instanceof katana;
    }
}