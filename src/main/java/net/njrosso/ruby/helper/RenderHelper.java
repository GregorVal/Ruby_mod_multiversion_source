package net.njrosso.ruby.helper;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public class RenderHelper<T extends LivingEntity, M extends HumanoidModel<T>> extends RenderLayer<T, M> {
    private final M model;
    private final ItemStack item;
    private final EquipmentSlot slot;
    private final ResourceLocation TEXTURE;
    public RenderHelper(RenderLayerParent<T, M> parent, M setmodel, ItemStack setitem, EquipmentSlot setslot, ResourceLocation settexture) {
        super(parent);
        item = setitem;
        model = setmodel;
        slot = setslot;
        TEXTURE = settexture;
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource multiBufferSource, int packedLight, T entity, float limbSwing,
                       float limbSwingAmount, float partialTick, float ageInTicks, float netHeadYaw, float headPitch) {
        if (entity.getItemBySlot(slot).is(item.getItem()))
        {
            boolean enchanted = entity.getItemBySlot(slot).isEnchanted();
            VertexConsumer vertex = ItemRenderer.getFoilBuffer(multiBufferSource, model.renderType(TEXTURE), false, enchanted);
            this.getParentModel().copyPropertiesTo(model);
            model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
            model.renderToBuffer(poseStack, vertex, packedLight, OverlayTexture.NO_OVERLAY, 1f, 1f, 1f, 1f);
        }
    }
}
