package net.njrosso.ruby.armor.samurai;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.njrosso.ruby.items.ModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class SamuraiArmor extends ArmorItem {
    private final EquipmentSlot type;
    public SamuraiArmor(ArmorMaterial armorMaterial, EquipmentSlot settype, Item.Properties properties) {
        super(armorMaterial, settype, properties);
        type = settype;
    }

    @Override
    public boolean isEnchantable(ItemStack stack)
    {
        return true;
    }

    //now let's check if the wearer has full set and make him fire immune
    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected)
    {
        if (entity instanceof Player)
        {
            if (type == EquipmentSlot.HEAD)
            {
                Player player = (Player) entity;
                //make player immune to fire if s/he's wearing the armor
                if (player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.njrhelm.get()
                        && player.getItemBySlot(EquipmentSlot.CHEST).getItem() == ModItems.njrchestplate.get()
                        && player.getItemBySlot(EquipmentSlot.LEGS).getItem() == ModItems.njrleg.get()
                        && player.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.njrboots.get())
                {
                    //make player immune to fire damage and apply regeneration if s/he's on fire
                    //be careful not to apply regeneration multiple times or the player will become almost immortal
                    if(player.isOnFire() && !player.getActiveEffects().stream().anyMatch(MobEffect -> MobEffect.getEffect().equals(MobEffects.REGENERATION))){
                        player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200));
                        player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200));
                    }
                    player.clearFire();
                }
            }
        }
    }
}
