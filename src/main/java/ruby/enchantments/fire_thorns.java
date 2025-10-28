package ruby.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import ruby.armor.bootsItem;
import ruby.armor.chestplateItem;
import ruby.armor.helmetItem;
import ruby.armor.leggingsItem;

import java.util.Map;
import java.util.Random;

public class fire_thorns extends Enchantment {

    public fire_thorns() {
        super(Rarity.RARE, EnchantmentType.ARMOR, new EquipmentSlotType[]{EquipmentSlotType.CHEST, EquipmentSlotType.FEET, EquipmentSlotType.HEAD, EquipmentSlotType.LEGS});
    }

    @Override
    public int getMinCost(int enchantmentLevel) {
        return 1;
    }

    @Override
    public void doPostHurt(LivingEntity attacker, Entity target, int level) {
        Random random = attacker.getRandom();
        Map.Entry<EquipmentSlotType, ItemStack> entry = EnchantmentHelper.getRandomItemWith(EnchantInit.fire_thorns.get(), attacker);

        if (shouldHit(level, random) && target != null) {
            target.setSecondsOnFire(12);
        }
    }

    public static boolean shouldHit(int level, Random random) {
        return level > 0 && random.nextFloat() < 0.15F * (float) level;
    }

    @Override
    public boolean isAllowedOnBooks() {
        return true;
    }

    @Override
    public boolean isTradeable() {
        return true;
    }

    @Override
    public boolean isDiscoverable() {
        return true;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return stack.getItem() instanceof helmetItem ||
                stack.getItem() instanceof leggingsItem ||
                stack.getItem() instanceof chestplateItem ||
                stack.getItem() instanceof bootsItem;
    }
}
