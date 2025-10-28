package net.njrosso.ruby.items.custom.katana;

import com.mojang.blaze3d.vertex.PoseStack;

import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.njrosso.ruby.RubyMod;
import net.njrosso.ruby.items.ModItems;


public class sayaRenderer<T extends LivingEntity, M extends HumanoidModel<T>> extends RenderLayer<T, M> {
    public ResourceLocation TEXTURE = new ResourceLocation(RubyMod.MODID, "textures/models/armor/saya.png");
    sayaModel model;

    public sayaRenderer(RenderLayerParent<T, M> parent) {
        super(parent);
        this.model = new sayaModel(Minecraft.getInstance().getEntityModels().bakeLayer(sayaModel.LAYER_LOCATION));
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource vertexConsumers, int packedLight, T entity, float limbSwing,
                       float limbSwingAmount, float partialTick, float ageInTicks, float netHeadYaw, float headPitch) {
        if (entity instanceof Player) {
            Player player = (Player) entity;
            this.getParentModel().copyPropertiesTo(model);
            model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

            boolean enchanted = player.getEntityData().get(RubyMod.HAS_KATANA_ENCHANTED);
            VertexConsumer vertexConsumer = ItemRenderer.getFoilBuffer(vertexConsumers, model.renderType(TEXTURE), false, enchanted);

            if (player.getMainHandItem().getItem() == ModItems.njrs.get()) {
                model.handle.visible = false;
                model.renderToBuffer(poseStack, vertexConsumer, packedLight, OverlayTexture.NO_OVERLAY, 1f, 1f, 1f, 1f);
            }
            else if (player.getEntityData().get(RubyMod.HAS_KATANA)) {
                model.handle.visible = true;
                model.renderToBuffer(poseStack, vertexConsumer, packedLight, OverlayTexture.NO_OVERLAY, 1f, 1f, 1f, 1f);
            }
        }
    }
}