package com.njrosso.armor.samurai;

import com.njrosso.njrs.ModItems;
import java.util.function.Consumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.IItemRenderProperties;

public class helmetItem extends ArmorItem {
    public helmetItem(ArmorMaterial material, EquipmentSlot equipmentSlot, Item.Properties properties) {
        super(material, equipmentSlot, properties);
    }

    @Override
    public void initializeClient(Consumer<IItemRenderProperties> consumer) {
        consumer.accept(new ModelSupplier());
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return "njrs:textures/models/armor/helmet.png";
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        if (!level.isClientSide) {
            boolean fullSet = player.getItemBySlot(EquipmentSlot.HEAD).getItem() == ModItems.njrs_helmet.get() &&
                    player.getItemBySlot(EquipmentSlot.CHEST).getItem() == ModItems.njrs_chestplate.get() &&
                    player.getItemBySlot(EquipmentSlot.LEGS).getItem() == ModItems.njrs_legs.get() &&
                    player.getItemBySlot(EquipmentSlot.FEET).getItem() == ModItems.njrs_boots.get();
            if (fullSet && player.getRemainingFireTicks() > 0) {
                player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200));
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 2));
            }
        }

    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

    static class ModelSupplier implements IItemRenderProperties {
        helmet INSTANCE;

        ModelSupplier() {
        }

        @Override
        public HumanoidModel<?> getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, HumanoidModel<?> _default) {
            if (this.INSTANCE == null) {
                this.INSTANCE = new helmet(Minecraft.getInstance().getEntityModels().bakeLayer(helmet.LAYER_LOCATION));
            }

            return this.INSTANCE;
        }
    }
}