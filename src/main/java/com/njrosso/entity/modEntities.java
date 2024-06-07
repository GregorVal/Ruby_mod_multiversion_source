package com.njrosso.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class modEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES;

    public modEntities() {
    }

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

    static {
        ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, "njrs");
    }
}