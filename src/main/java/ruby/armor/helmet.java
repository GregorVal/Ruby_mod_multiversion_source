package ruby.armor;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ArmorStandEntity;

public class helmet extends BipedModel<LivingEntity> {
	private final ModelRenderer headd;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer detail;

	public helmet(float i) {
		super(i);
		texWidth = 64;
		texHeight = 64;


		headd = new ModelRenderer(this);
		headd.setPos(0.0F, 0.0F, 0.0F);
		headd.texOffs(0, 0).addBox(-4.5F, -9.0F, -4.5F, 9.0F, 4.0F, 9.0F, 0.0F, false);
		headd.texOffs(23, 24).addBox(-4.0F, -6.0F, -5.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(-4.6561F, -4.4976F, -6.0F);
		headd.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.0472F, 0.0F, 2.0944F);
		cube_r1.texOffs(27, 0).addBox(-1.5F, 1.0F, -1.9F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-6.8481F, -3.567F, 0.0F);
		headd.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 2.0944F);
		cube_r2.texOffs(0, 13).addBox(-3.4019F, -1.933F, -4.5F, 5.0F, 1.0F, 9.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(4.6519F, -4.433F, -6.0F);
		headd.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.0472F, 0.0F, 1.0472F);
		cube_r3.texOffs(27, 4).addBox(-1.5F, -2.0F, -1.9F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(7.5F, -5.5F, 0.0F);
		headd.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 1.0472F);
		cube_r4.texOffs(19, 14).addBox(-2.0F, 2.5F, -4.5F, 5.0F, 1.0F, 9.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, -3.6281F, 5.0578F);
		headd.addChild(cube_r5);
		setRotationAngle(cube_r5, -1.2654F, 0.0F, 0.0F);
		cube_r5.texOffs(0, 24).addBox(-4.5F, -0.15F, -2.25F, 9.0F, 1.0F, 5.0F, 0.0F, false);

		detail = new ModelRenderer(this);
		detail.setPos(0.0F, -10.0333F, -4.5417F);
		headd.addChild(detail);
		setRotationAngle(detail, -0.2182F, 0.0F, 0.0F);
		detail.texOffs(5, 18).addBox(-4.5F, -1.7667F, -0.4583F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		detail.texOffs(0, 16).addBox(-3.5F, -0.7667F, -0.4583F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		detail.texOffs(0, 13).addBox(-1.0F, -0.4667F, -0.7083F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		detail.texOffs(0, 0).addBox(-1.5F, -0.9667F, -0.4583F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		detail.texOffs(0, 4).addBox(1.5F, -0.7667F, -0.4583F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		detail.texOffs(5, 6).addBox(3.5F, -1.7667F, -0.4583F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		this.head.addChild(headd);
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

	@Override
	public void setAllVisible(boolean p_178719_1_) {
		super.setAllVisible(false);
	}
}