package net.njrosso.ruby.armor;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.njrosso.ruby.RubyMod;
import net.njrosso.ruby.items.ModItems;

public class leggingsRenderer implements ArmorRenderer {
    legs model;

    public leggingsRenderer() {
        this.model = null;
    }

    public static void register() {
        ArmorRenderer.register(new leggingsRenderer(), ModItems.njrleg);
    }

    @Override
    public void render(PoseStack matrices, MultiBufferSource vertexConsumers, ItemStack stack, LivingEntity entity, EquipmentSlot slot, int light, HumanoidModel<LivingEntity> contextModel) {
        if(this.model == null){
            this.model = new legs(Minecraft.getInstance().getEntityModels().bakeLayer(legs.LAYER_LOCATION));
        }
        contextModel.copyPropertiesTo(model);
        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(RenderType.armorCutoutNoCull(new ResourceLocation(RubyMod.MOD_ID, "textures/models/armor/leggings.png")));
        model.renderToBuffer(matrices, vertexConsumer, light, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);

    }
}
