package ruby.armor;
// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ArmorStandEntity;

public class chestplate extends BipedModel<LivingEntity> {
	private final ModelRenderer bodyy;
	private final ModelRenderer rightA;
	private final ModelRenderer armplate2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer leftA;
	private final ModelRenderer armplate;
	private final ModelRenderer cube_r2;


	public chestplate(float i) {
		super(i);
        texWidth = 64;
		texHeight = 64;

		bodyy = new ModelRenderer(this);
		bodyy.setPos(0.0F, 0.0F, 0.0F);
		bodyy.texOffs(0, 0).addBox(-4.5F, 0.5F, -3.25F, 9.0F, 9.0F, 6.0F, 0.0F, false);
		bodyy.texOffs(0, 15).addBox(-5.0F, 9.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);

		leftA = new ModelRenderer(this);
		leftA.setPos(1.375F, 6.375F, 0.0F);
		leftA.texOffs(20, 23).addBox(-2.375F, -8.375F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		leftA.texOffs(32, 33).addBox(0.625F, -2.375F, -2.5F, 2.0F, 6.0F, 5.0F, 0.0F, false);
		leftA.texOffs(42, 14).addBox(-2.375F, 1.625F, -2.5F, 3.0F, 1.0F, 5.0F, 0.0F, false);
		leftA.texOffs(41, 29).addBox(-2.375F, -1.375F, -2.5F, 3.0F, 1.0F, 5.0F, 0.0F, false);

		armplate2 = new ModelRenderer(this);
		armplate2.setPos(-8.375F, 19.625F, 0.0F);
		leftA.addChild(armplate2);
		setRotationAngle(armplate2, 0.0F, 3.1416F, 0.0F);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(-11.0F, -24.75F, 0.0F);
		armplate2.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -1.1345F);
		cube_r1.texOffs(39, 7).addBox(-4.0937F, 0.3274F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r1.texOffs(8, 40).addBox(-2.0937F, -0.6726F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r1.texOffs(30, 0).addBox(-0.0937F, -1.6726F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r1.texOffs(0, 44).addBox(3.9063F, -2.6726F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);

		rightA = new ModelRenderer(this);
		rightA.setPos(-1.375F, 6.375F, 0.0F);
		rightA.texOffs(0, 23).addBox(-2.625F, -8.375F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		rightA.texOffs(0, 33).addBox(-2.625F, -2.375F, -2.5F, 2.0F, 6.0F, 5.0F, 0.0F, false);
		rightA.texOffs(40, 23).addBox(-0.625F, 1.625F, -2.5F, 3.0F, 1.0F, 5.0F, 0.0F, false);
		rightA.texOffs(20, 40).addBox(-0.625F, -1.375F, -2.5F, 3.0F, 1.0F, 5.0F, 0.0F, false);

		armplate = new ModelRenderer(this);
		armplate.setPos(8.375F, 19.625F, 0.0F);
		rightA.addChild(armplate);


		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-11.0F, -25.75F, 0.0F);
		armplate.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -1.1345F);
		cube_r2.texOffs(30, 16).addBox(-5.0F, 0.75F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r2.texOffs(14, 33).addBox(-3.0F, -0.25F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r2.texOffs(25, 9).addBox(-1.0F, -1.25F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r2.texOffs(40, 38).addBox(3.0F, -2.25F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
		this.leftArm.addChild(leftA);
		this.rightArm.addChild(rightA);
		this.body.addChild(bodyy);
	}


	@Override
	public void setupAnim(LivingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		if (!(entity instanceof ArmorStandEntity)) {
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			return;
		}

		ArmorStandEntity entityIn = (ArmorStandEntity) entity;
		this.head.xRot = ((float) Math.PI / 180F) * entityIn.getHeadPose().getX();
		this.head.yRot = ((float) Math.PI / 180F) * entityIn.getHeadPose().getY();
		this.head.zRot = ((float) Math.PI / 180F) * entityIn.getHeadPose().getZ();
		this.head.setPos(0.0F, 1.0F, 0.0F);
		this.body.xRot = ((float) Math.PI / 180F) * entityIn.getBodyPose().getX();
		this.body.yRot = ((float) Math.PI / 180F) * entityIn.getBodyPose().getY();
		this.body.zRot = ((float) Math.PI / 180F) * entityIn.getBodyPose().getZ();
		this.leftArm.xRot = ((float) Math.PI / 180F) * entityIn.getLeftArmPose().getX();
		this.leftArm.yRot = ((float) Math.PI / 180F) * entityIn.getLeftArmPose().getY();
		this.leftArm.zRot = ((float) Math.PI / 180F) * entityIn.getLeftArmPose().getZ();
		this.rightArm.xRot = ((float) Math.PI / 180F) * entityIn.getRightArmPose().getX();
		this.rightArm.yRot = ((float) Math.PI / 180F) * entityIn.getRightArmPose().getY();
		this.rightArm.zRot = ((float) Math.PI / 180F) * entityIn.getRightArmPose().getZ();
		this.leftLeg.xRot = ((float) Math.PI / 180F) * entityIn.getLeftLegPose().getX();
		this.leftLeg.yRot = ((float) Math.PI / 180F) * entityIn.getLeftLegPose().getY();
		this.leftLeg.zRot = ((float) Math.PI / 180F) * entityIn.getLeftLegPose().getZ();
		this.leftLeg.setPos(1.9F, 11.0F, 0.0F);
		this.rightLeg.xRot = ((float) Math.PI / 180F) * entityIn.getRightLegPose().getX();
		this.rightLeg.yRot = ((float) Math.PI / 180F) * entityIn.getRightLegPose().getY();
		this.rightLeg.zRot = ((float) Math.PI / 180F) * entityIn.getRightLegPose().getZ();
		this.rightLeg.setPos(-1.9F, 11.0F, 0.0F);
		this.hat.copyFrom(this.head);
	}

	protected void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}