package com.njrosso.njrs;

import com.mojang.logging.LogUtils;
import com.njrosso.enchantments.EnchantInit;
import com.njrosso.entity.modEntities;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod("njrs")
public class NJRsword {
    public static final String MOD_ID = "njrs";
    private static final Logger LOGGER = LogUtils.getLogger();

    public NJRsword() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(eventBus);
        eventBus.addListener(this::setup);
        EnchantInit.register(eventBus);
        modEntities.register(eventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(FMLCommonSetupEvent event) {
    }
}