package net.njrosso.ruby.enchantments;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.njrosso.ruby.RubyMod;
import net.njrosso.ruby.enchantments.custom.fieryEdge;
import net.njrosso.ruby.enchantments.custom.fieryThorns;

import java.util.function.Supplier;

public class ModEnchantmentEffects {
    public static final DeferredRegister<MapCodec<? extends EnchantmentEntityEffect>> ENTITY_ENCHANTMENT_EFFECTS =
            DeferredRegister.create(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, RubyMod.MODID);


    public static final Supplier<MapCodec<? extends EnchantmentEntityEffect>> FIERY_SWEEP =
            ENTITY_ENCHANTMENT_EFFECTS.register("fiery_sweep", () -> fieryEdge.CODEC);

    public static final Supplier<MapCodec<? extends EnchantmentEntityEffect>> FIERY_THORNS =
            ENTITY_ENCHANTMENT_EFFECTS.register("fiery_thorns", () -> fieryThorns.CODEC);

    public static void register(IEventBus eventBus){
        ENTITY_ENCHANTMENT_EFFECTS.register(eventBus);
    }

}
