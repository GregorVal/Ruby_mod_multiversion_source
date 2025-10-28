package net.njrosso.ruby.items.custom.katana;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.njrosso.ruby.RubyMod;

public class sayaModel<T extends LivingEntity> extends HumanoidModel<T> {
	public final ModelPart handle;
	public final ModelPart holder;
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(RubyMod.MODID, "textures/models/armor/saya"), "main");

	public sayaModel(ModelPart root) {
        super(root);
		this.handle = root.getChild("handle");
        this.holder = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();


        PartDefinition handle = partdefinition.addOrReplaceChild("handle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = handle.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 28).addBox(-2.0F, -0.5F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 10.5F, -5.5F, 1.1111F, 0.4176F, 0.6863F));

        PartDefinition cube_r2 = handle.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(22, 10).addBox(-0.75F, -2.5F, -0.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 11).addBox(-0.25F, -2.5F, -0.25F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(22, 0).addBox(-0.25F, -2.5F, -0.75F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 0).addBox(-0.75F, -2.5F, -0.75F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 8.25F, -7.5F, 0.9599F, 0.0F, 0.0F));

        PartDefinition cube_r3 = handle.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 25).addBox(-0.5F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 6.6708F, -8.8444F, 1.5708F, 0.6109F, 1.5708F));

        PartDefinition cube_r4 = handle.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 29).addBox(-0.5F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 6.4208F, -9.1944F, 1.5708F, 0.6109F, 1.5708F));

        PartDefinition holder = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r5 = holder.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -7.0F, -0.5F, 3.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, 14.0F, 1.5F, 1.5708F, -0.6109F, -1.5708F));


        CubeDeformation cubeDeformation = CubeDeformation.NONE;
		float p_170683_ = 0.0F;
		partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), PartPose.offset(0.0F, 0.0F + p_170683_, 0.0F));
		partdefinition.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), PartPose.offset(0.0F, 0.0F + p_170683_, 0.0F));
		partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), PartPose.offset(-1.9F, 12.0F + p_170683_, 0.0F));
		partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), PartPose.offset(1.9F, 12.0F + p_170683_, 0.0F));
		partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, cubeDeformation), PartPose.offset(-5.0F, 2.0F + p_170683_, 0.0F));
		partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, cubeDeformation), PartPose.offset(5.0F, 2.0F + p_170683_, 0.0F));


		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T livingEntity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		super.setupAnim(livingEntity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		holder.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        handle.copyFrom(holder);
		handle.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}