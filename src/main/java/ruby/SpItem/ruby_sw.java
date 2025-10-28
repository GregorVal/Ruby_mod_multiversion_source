package ruby.SpItem;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import ruby.enchantments.EnchantInit;

import java.util.ListIterator;


public class ruby_sw extends SwordItem {
    public ruby_sw(IItemTier tier, int attack, float speed, Properties properties) {
        super(tier, attack, speed, properties);
    }


    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.setSecondsOnFire(15);
        return super.hurtEnemy(stack, target, attacker);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }
}