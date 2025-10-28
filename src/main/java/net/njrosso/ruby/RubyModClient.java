package net.njrosso.ruby;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.njrosso.ruby.armor.samurai.SamuraiChestplateModel;
import net.njrosso.ruby.armor.samurai.SamuraiHelmetModel;
import net.njrosso.ruby.armor.samurai.SamuraiLeggingsModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.njrosso.ruby.helper.RenderHelper;
import net.njrosso.ruby.items.ModItems;
import net.njrosso.ruby.items.custom.katana.sayaModel;
import net.njrosso.ruby.items.custom.katana.sayaRenderer;

@EventBusSubscriber(modid = RubyMod.MODID, bus = Bus.MOD, value = {Dist.CLIENT}
)
public class RubyModClient {
    public RubyModClient() {
    }

    @SubscribeEvent
    public static void layers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(sayaModel.LAYER_LOCATION, sayaModel::createBodyLayer);
        event.registerLayerDefinition(SamuraiHelmetModel.LAYER_LOCATION, SamuraiHelmetModel::createBodyLayer);
        event.registerLayerDefinition(SamuraiLeggingsModel.LAYER_LOCATION, SamuraiLeggingsModel::createBodyLayer);
        event.registerLayerDefinition(SamuraiChestplateModel.LAYER_LOCATION, SamuraiChestplateModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void onAddLayers(EntityRenderersEvent.AddLayers event)
    {
        for (String skin : event.getSkins())
        {
            PlayerRenderer renderer = event.getSkin(skin);
            renderer.addLayer(new sayaRenderer(renderer));
            renderer.addLayer(new RenderHelper(renderer, new SamuraiHelmetModel(Minecraft.getInstance().getEntityModels().bakeLayer(SamuraiHelmetModel.LAYER_LOCATION)),
                    new ItemStack(ModItems.njrhelm.get()), EquipmentSlot.HEAD, new ResourceLocation("ruby:textures/models/armor/helmet.png")));
            renderer.addLayer(new RenderHelper(renderer, new SamuraiChestplateModel(Minecraft.getInstance().getEntityModels().bakeLayer(SamuraiChestplateModel.LAYER_LOCATION)),
                    new ItemStack(ModItems.njrchestplate.get()), EquipmentSlot.CHEST, new ResourceLocation("ruby:textures/models/armor/chestplate.png")));
            renderer.addLayer(new RenderHelper(renderer, new SamuraiLeggingsModel(Minecraft.getInstance().getEntityModels().bakeLayer(SamuraiLeggingsModel.LAYER_LOCATION)),
                    new ItemStack(ModItems.njrleg.get()), EquipmentSlot.LEGS, new ResourceLocation("ruby:textures/models/armor/leggings.png")));
        }
    }
}