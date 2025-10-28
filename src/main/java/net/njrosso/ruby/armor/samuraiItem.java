package net.njrosso.ruby.armor;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class samuraiItem extends ArmorItem {
    public samuraiItem(ArmorMaterial armorMaterial, Type type, Properties properties) {
        super(armorMaterial, type, properties);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }
}
