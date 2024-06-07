package com.njrosso.armor.samurai;

import java.util.function.Consumer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.IItemRenderProperties;

public class leggingsItem extends ArmorItem {
    public leggingsItem(ArmorMaterial material, EquipmentSlot slot, Item.Properties properties) {
        super(material, slot, properties);
    }

    @Override
    public void initializeClient(Consumer<IItemRenderProperties> consumer) {
        consumer.accept(new ModelSupplier());
    }

    static class ModelSupplier implements IItemRenderProperties {
        legs INSTANCE;

        ModelSupplier() {
        }

        @Override
        public HumanoidModel<?> getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, HumanoidModel<?> _default) {
            if (this.INSTANCE == null) {
                this.INSTANCE = new legs(Minecraft.getInstance().getEntityModels().bakeLayer(legs.LAYER_LOCATION));
            }

            return this.INSTANCE;
        }
    }


    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return "njrs:textures/models/armor/leggings.png";
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }
}