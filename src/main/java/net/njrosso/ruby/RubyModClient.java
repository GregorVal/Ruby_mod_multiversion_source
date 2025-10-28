package net.njrosso.ruby;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.njrosso.ruby.armor.samurai.SamuraiChestplateModel;
import net.njrosso.ruby.armor.samurai.SamuraiHelmetModel;
import net.njrosso.ruby.armor.samurai.SamuraiLeggingsModel;
import net.njrosso.ruby.helper.RenderHelper;
import net.njrosso.ruby.items.ModItems;
import net.njrosso.ruby.items.custom.katana.sayaModel;
import net.njrosso.ruby.items.custom.katana.sayaRenderer;


@Mod.EventBusSubscriber(modid = RubyMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
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
        for (String skin : event.getSkins()) {
            PlayerRenderer renderer = event.getPlayerSkin(skin);
            renderer.addLayer(new sayaRenderer(renderer));
            renderer.addLayer(new RenderHelper(renderer, new SamuraiHelmetModel(Minecraft.getInstance().getEntityModels().bakeLayer(SamuraiHelmetModel.LAYER_LOCATION)),
                    new ItemStack(ModItems.njrhelm.get()), EquipmentSlot.HEAD, new ResourceLocation("ruby:textures/models/armor/helmet.png")));
            renderer.addLayer(new RenderHelper(renderer, new SamuraiChestplateModel(Minecraft.getInstance().getEntityModels().bakeLayer(SamuraiChestplateModel.LAYER_LOCATION)),
                    new ItemStack(ModItems.njrchestplate.get()), EquipmentSlot.CHEST, new ResourceLocation("ruby:textures/models/armor/chestplate.png")));
            renderer.addLayer(new RenderHelper(renderer, new SamuraiLeggingsModel(Minecraft.getInstance().getEntityModels().bakeLayer(SamuraiLeggingsModel.LAYER_LOCATION)),
                    new ItemStack(ModItems.njrleg.get()), EquipmentSlot.LEGS, new ResourceLocation("ruby:textures/models/armor/leggings.png")));
        }
    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event)
    {
        event.enqueueWork(() -> {
            // Ensures registration happens on the correct thread
        });
    }
}
