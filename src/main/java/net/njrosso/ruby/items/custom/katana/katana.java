package net.njrosso.ruby.items.custom.katana;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.common.util.NonNullLazy;

import java.util.function.Consumer;

public class katana extends SwordItem {

    public katana(Tier tier, int i, float f, Properties properties) {
        super(tier, i, f, properties);
    }
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.setSecondsOnFire(12);
        return super.hurtEnemy(stack, target, attacker);
    }

    /*
    @Override
    public boolean supportsEnchantment(ItemStack stack, Holder<Enchantment> enchantment) {
        return enchantment == Enchantments.SHARPNESS ||
                enchantment == Enchantments.SWEEPING_EDGE ||
                enchantment == Enchantments.SMITE ||
                enchantment == Enchantments.KNOCKBACK ||
                enchantment == Enchantments.LOOTING ||
                enchantment == Enchantments.BANE_OF_ARTHROPODS;
    }*/
    /*
    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }*/
}