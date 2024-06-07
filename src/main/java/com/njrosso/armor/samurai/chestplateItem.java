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

public class chestplateItem extends ArmorItem {
    public chestplateItem(ArmorMaterial material, EquipmentSlot slot, Item.Properties properties) {
        super(material, slot, properties);
    }

    @Override
    public void initializeClient(Consumer<IItemRenderProperties> consumer) {
        consumer.accept(new ModelSupplier());
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return "njrs:textures/models/armor/chestplate.png";
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

    static class ModelSupplier implements IItemRenderProperties {
        chestplate INSTANCE;

        ModelSupplier() {
        }

        @Override
        public HumanoidModel<?> getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, HumanoidModel<?> _default) {
            if (this.INSTANCE == null) {
                this.INSTANCE = new chestplate(Minecraft.getInstance().getEntityModels().bakeLayer(chestplate.LAYER_LOCATION));
            }

            return this.INSTANCE;
        }
    }
}