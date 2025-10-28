package net.njrosso.ruby.armor;

import net.njrosso.ruby.items.ModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class uniformItem extends ArmorItem {
    public uniformItem(ArmorMaterial material, EquipmentSlot slot, Item.Properties properties) {
        super(material, slot, properties);
    }

    public void onArmorTick(ItemStack stack, Level level, Player player) {
        if (!level.isClientSide) {
            boolean fullset = player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.u_helm.get() &&
                    player.getItemBySlot(EquipmentSlot.CHEST).getItem() == ModItems.u_chest.get() &&
                    player.getItemBySlot(EquipmentSlot.LEGS).getItem() == ModItems.u_leg.get() &&
                    player.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.u_boots.get();
            if (fullset) {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 2));
                player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1));
            }
        }

    }

    public boolean isEnchantable(ItemStack stack) {
        return true;
    }
}