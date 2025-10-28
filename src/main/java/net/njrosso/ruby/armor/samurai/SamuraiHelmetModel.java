package net.njrosso.ruby.armor.samurai;
// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class SamuraiHelmetModel<T extends LivingEntity> extends HumanoidModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("modid", "helmet"), "main");
	private final ModelPart headd;
	private final ModelPart detail;

	public SamuraiHelmetModel(ModelPart root) {
                super(root);
		this.headd = root.getChild("head");
		this.detail = this.headd.getChild("detail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition headd = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -9.0F, -4.5F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(23, 24).addBox(-4.0F, -6.0F, -5.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = headd.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(27, 0).addBox(-1.5F, 1.0F, -1.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6561F, -4.4976F, -6.0F, 1.0472F, 0.0F, 2.0944F));

		PartDefinition cube_r2 = headd.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 13).addBox(-3.4019F, -1.933F, -4.5F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.8481F, -3.567F, 0.0F, 0.0F, 0.0F, 2.0944F));

		PartDefinition cube_r3 = headd.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(27, 4).addBox(-1.5F, -2.0F, -1.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6519F, -4.433F, -6.0F, -1.0472F, 0.0F, 1.0472F));

		PartDefinition cube_r4 = headd.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 14).addBox(-2.0F, 2.5F, -4.5F, 5.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.5F, -5.5F, 0.0F, 0.0F, 0.0F, 1.0472F));

		PartDefinition cube_r5 = headd.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 24).addBox(-4.5F, -0.15F, -2.25F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6281F, 5.0578F, -1.2654F, 0.0F, 0.0F));

		PartDefinition detail = headd.addOrReplaceChild("detail", CubeListBuilder.create().texOffs(5, 18).addBox(-4.5F, -1.7667F, -0.4583F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-3.5F, -0.7667F, -0.4583F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(-1.0F, -0.4667F, -0.7083F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.5F, -0.9667F, -0.4583F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 4).addBox(1.5F, -0.7667F, -0.4583F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(5, 6).addBox(3.5F, -1.7667F, -0.4583F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0333F, -4.5417F, -0.2182F, 0.0F, 0.0F));


        CubeDeformation cubeDeformation = CubeDeformation.NONE;
        float yOffset = 0.0F;

        partdefinition.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), PartPose.offset(0.0F, yOffset, 0.0F));

        partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F), PartPose.offset(0.0F, yOffset, 0.0F));

        partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), PartPose.offset(-1.9F, 12.0F + yOffset, 0.0F));

        partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), PartPose.offset(1.9F, 12.0F + yOffset, 0.0F));

        partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, cubeDeformation), PartPose.offset(-5.0F, 2.0F + yOffset, 0.0F));

        partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, cubeDeformation), PartPose.offset(5.0F, 2.0F + yOffset, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
        public void renderToBuffer(PoseStack arg0, VertexConsumer arg1, int arg2, int arg3, int arg4) {
                this.headd.render(arg0, arg1, arg2, arg3, arg4);
        }
}