package net.njrosso.ruby.items.custom.katana;

import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.njrosso.ruby.RubyMod;
import net.njrosso.ruby.items.ModItems;


public class sayaRenderer<T extends LivingEntity, M extends EntityModel<T>> extends RenderLayer<T, M> {
    public ResourceLocation TEXTURE = new ResourceLocation(RubyMod.MOD_ID, "textures/models/armor/saya.png");
    sayaModel model;

    public sayaRenderer(RenderLayerParent<T, M> context) {
        super(context);
        this.model = null;
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource vertexConsumers, int packedLight, T entity, float limbSwing,
                       float limbSwingAmount, float partialTick, float ageInTicks, float netHeadYaw, float headPitch) {

        if (entity instanceof Player) {
            if(Minecraft.getInstance().getEntityModels() != null)
            {
                model = new sayaModel(Minecraft.getInstance().getEntityModels().bakeLayer(sayaModel.LAYER_LOCATION));
                Player player = (Player) entity;
                if (player.getMainHandItem().getItem() == ModItems.njrs) {
                    //calling setup anim from here just messes things up
                    model.handle.visible = false;
                    model.bb_main.render(poseStack, vertexConsumers.getBuffer(RenderType.armorCutoutNoCull(TEXTURE)), packedLight, 1);
                }
                else {
                    if (player.getEntityData().get(RubyMod.HAS_KATANA)) {
                        model.handle.visible = true;
                        model.bb_main.render(poseStack, vertexConsumers.getBuffer(RenderType.armorCutoutNoCull(TEXTURE)), packedLight, 1);
                        model.handle.render(poseStack, vertexConsumers.getBuffer(RenderType.armorCutoutNoCull(TEXTURE)), packedLight, 1);
                    }
                }
            }
        }
    }
}
