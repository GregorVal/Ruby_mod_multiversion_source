package net.njrosso.ruby.items.custom;

import java.util.Iterator;
import java.util.List;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class tj_katana extends SwordItem {
    public tj_katana(Tier tier, int p_43270_, float p_43271_, Item.Properties p_43272_) {
        super(tier, p_43270_, p_43271_, p_43272_);
    }

    @Override
    public boolean hurtEnemy(@NotNull ItemStack stack, @NotNull LivingEntity target, @NotNull LivingEntity attacker) {
        if (target instanceof LivingEntity) {
            target.hurt(DamageSource.FREEZE, 13.5F);
            target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 5));
            target.addEffect(new MobEffectInstance(MobEffects.WITHER, 200, 1));
        }

        multiE(attacker);
        return super.hurtEnemy(stack, target, attacker);
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
                if (entity instanceof LivingEntity) {
                    entity.hurt(DamageSource.FREEZE, 13.5F);
                    ((LivingEntity)entity).addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 5));
                    ((LivingEntity)entity).addEffect(new MobEffectInstance(MobEffects.WITHER, 200, 1));
                }
            }
        }

    }

    public boolean m_8120_(ItemStack p_41456_) {
        return true;
    }
}