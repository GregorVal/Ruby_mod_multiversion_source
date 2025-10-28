package net.njrosso.ruby;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.resources.PlayerSkin;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.njrosso.ruby.armor.samurai.SamuraiChestplateModel;
import net.njrosso.ruby.armor.samurai.SamuraiHelmetModel;
import net.njrosso.ruby.armor.samurai.SamuraiLeggingsModel;
import net.njrosso.ruby.helper.RenderHelper;
import net.njrosso.ruby.items.ModItems;
import net.njrosso.ruby.items.custom.katana.sayaModel;
import net.njrosso.ruby.items.custom.katana.sayaRenderer;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Neo's config APIs
@EventBusSubscriber(modid = RubyMod.MODID, bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RubyModClient
{
    //register here all the layers for armor and saya
    @SubscribeEvent
    public static void layers(EntityRenderersEvent.RegisterLayerDefinitions event)
    {
        event.registerLayerDefinition(SamuraiHelmetModel.LAYER_LOCATION, SamuraiHelmetModel::createBodyLayer);
        event.registerLayerDefinition(SamuraiChestplateModel.LAYER_LOCATION, SamuraiChestplateModel::createBodyLayer);
        event.registerLayerDefinition(SamuraiLeggingsModel.LAYER_LOCATION, SamuraiLeggingsModel::createBodyLayer);
        event.registerLayerDefinition(sayaModel.LAYER_LOCATION, sayaModel::createBodyLayer);
    }


    @SubscribeEvent
    public static void onAddLayers(EntityRenderersEvent.AddLayers event)
    {
        for (PlayerSkin.Model skin : event.getSkins())
        {
            PlayerRenderer renderer = event.getSkin(skin);
            renderer.addLayer(new sayaRenderer(renderer));
            renderer.addLayer(new RenderHelper(renderer, new SamuraiHelmetModel(Minecraft.getInstance().getEntityModels().bakeLayer(SamuraiHelmetModel.LAYER_LOCATION)),
                    new ItemStack(ModItems.njrhelm.get()), EquipmentSlot.HEAD, ResourceLocation.fromNamespaceAndPath(RubyMod.MODID, "textures/models/armor/helmet.png")));
            renderer.addLayer(new RenderHelper(renderer, new SamuraiChestplateModel(Minecraft.getInstance().getEntityModels().bakeLayer(SamuraiChestplateModel.LAYER_LOCATION)),
                    new ItemStack(ModItems.njrchestplate.get()), EquipmentSlot.CHEST, ResourceLocation.fromNamespaceAndPath(RubyMod.MODID, "textures/models/armor/chestplate.png")));
            renderer.addLayer(new RenderHelper(renderer, new SamuraiLeggingsModel(Minecraft.getInstance().getEntityModels().bakeLayer(SamuraiLeggingsModel.LAYER_LOCATION)),
                    new ItemStack(ModItems.njrleg.get()), EquipmentSlot.LEGS, ResourceLocation.fromNamespaceAndPath(RubyMod.MODID, "textures/models/armor/leggings.png")));
        }
    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event)
    {
    }
}
