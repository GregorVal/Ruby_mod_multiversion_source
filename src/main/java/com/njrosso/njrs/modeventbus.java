package com.njrosso.njrs;

import com.njrosso.armor.samurai.chestplate;
import com.njrosso.armor.samurai.helmet;
import com.njrosso.armor.samurai.legs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(
        modid = "njrs",
        bus = Bus.MOD,
        value = {Dist.CLIENT}
)
public class modeventbus {
    public modeventbus() {
    }

    @SubscribeEvent
    public static void layers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(helmet.LAYER_LOCATION, helmet::createBodyLayer);
        event.registerLayerDefinition(legs.LAYER_LOCATION, legs::createBodyLayer);
        event.registerLayerDefinition(chestplate.LAYER_LOCATION, chestplate::createBodyLayer);
    }
}