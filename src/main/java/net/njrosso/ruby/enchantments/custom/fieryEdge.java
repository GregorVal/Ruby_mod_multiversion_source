package net.njrosso.ruby.enchantments.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.decoration.ItemFrame;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.EnchantedItemInUse;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.njrosso.ruby.RubyMod;
import net.njrosso.ruby.items.ModItems;

import java.util.Iterator;
import java.util.List;

public record fieryEdge() implements EnchantmentEntityEffect {
    public static final MapCodec<fieryEdge> CODEC = MapCodec.unit(fieryEdge::new);

    @Override
    public void apply(ServerLevel serverLevel, int enchantLevel, EnchantedItemInUse enchantedItemInUse, Entity entity, Vec3 vec3) {
        multiE(entity);
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> codec() {
        return CODEC;
    }

    public static void multiE(Entity entityStart) {
        Level world1 = entityStart.level();
        double range = 3.0;
        List<Entity> entities = world1.getEntities(entityStart, entityStart.getBoundingBox().inflate(range));
        RubyMod.LOGGER.info(entities.toString());
        Iterator iterator = entities.iterator();

        while(iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof LivingEntity && !(entity instanceof ItemEntity) && !(entity instanceof ArmorStand) && !(entity instanceof ItemFrame)) {
                if (entity instanceof Player) {
                    Player player = (Player) entity;
                    if (player.getMainHandItem().getItem() == ModItems.njrs.get()){}
                    else player.igniteForSeconds(5);
                }
                else entity.igniteForSeconds(5);
            }
        }
    }
}
