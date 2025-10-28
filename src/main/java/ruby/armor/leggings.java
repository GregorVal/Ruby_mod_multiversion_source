package ruby.armor;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ArmorStandEntity;

public class leggings extends BipedModel<LivingEntity>  {
	private final ModelRenderer leftLA;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer b1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r3;
	private final ModelRenderer rightLA;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r4;
	private final ModelRenderer b2;
	private final ModelRenderer cube_r5;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r6;

	public leggings(float i) {
		super(i);
		texWidth = 128;
		texHeight = 128;

		leftLA = new ModelRenderer(this);
		leftLA.setPos(3.0F, 24.0F, 0.0F);


		bone = new ModelRenderer(this);
		bone.setPos(-2.5167F, -7.4167F, -2.15F);
		leftLA.addChild(bone);
		setRotationAngle(bone, 0.0F, -1.5708F, 0.0F);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(-0.3333F, -0.0833F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -1.2654F);
		cube_r1.texOffs(56, 58).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.texOffs(11, 53).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.texOffs(40, 11).addBox(8.9446F, -3.3585F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r1.texOffs(40, 16).addBox(10.9446F, -3.8585F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r1.texOffs(40, 21).addBox(12.9446F, -4.6085F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r1.texOffs(0, 54).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.texOffs(61, 5).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.texOffs(22, 54).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.texOffs(40, 26).addBox(8.9446F, -3.3585F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r1.texOffs(30, 40).addBox(10.9446F, -3.8585F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r1.texOffs(40, 31).addBox(12.9446F, -4.6085F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r1.texOffs(36, 54).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.texOffs(9, 61).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.texOffs(50, 54).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.texOffs(40, 36).addBox(8.9446F, -3.3585F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r1.texOffs(10, 41).addBox(10.9446F, -3.8585F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r1.texOffs(40, 41).addBox(12.9446F, -4.6085F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r1.texOffs(56, 0).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		b1 = new ModelRenderer(this);
		b1.setPos(-4.5167F, -7.4167F, 2.15F);
		leftLA.addChild(b1);
		setRotationAngle(b1, 0.0F, 1.5708F, 0.0F);


		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-0.3333F, -0.0833F, 0.0F);
		b1.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -1.2654F);
		cube_r2.texOffs(20, 58).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r2.texOffs(32, 46).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r2.texOffs(0, 10).addBox(8.9446F, -3.3585F, 0.4F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r2.texOffs(10, 11).addBox(10.9446F, -3.8585F, 0.4F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r2.texOffs(20, 37).addBox(12.9446F, -4.6085F, 0.4F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r2.texOffs(46, 46).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r2.texOffs(32, 58).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r2.texOffs(11, 49).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r2.texOffs(12, 1).addBox(8.9446F, -3.3585F, 0.4F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r2.texOffs(12, 6).addBox(10.9446F, -3.8585F, 0.4F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r2.texOffs(0, 40).addBox(12.9446F, -4.6085F, 0.4F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r2.texOffs(0, 50).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r2.texOffs(44, 58).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r2.texOffs(50, 4).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r2.texOffs(0, 15).addBox(8.9446F, -3.3585F, 0.4F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r2.texOffs(10, 16).addBox(10.9446F, -3.8585F, 0.4F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r2.texOffs(40, 6).addBox(12.9446F, -4.6085F, 0.4F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r2.texOffs(50, 11).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setPos(-0.2819F, -7.173F, 0.0F);
		leftLA.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 3.1416F, 0.0F);


		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0319F, -0.077F, 0.0F);
		bone4.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -1.1781F);
		cube_r3.texOffs(30, 35).addBox(7.3366F, -4.0922F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r3.texOffs(10, 36).addBox(9.3366F, -5.0922F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r3.texOffs(0, 5).addBox(11.3366F, -6.0922F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		rightLA = new ModelRenderer(this);
		rightLA.setPos(-3.0F, 24.0F, 0.0F);


		bone2 = new ModelRenderer(this);
		bone2.setPos(4.3833F, -7.4167F, -2.15F);
		rightLA.addChild(bone2);
		setRotationAngle(bone2, 0.0F, -1.5708F, 0.0F);


		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(-0.3333F, -0.0833F, 0.0F);
		bone2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -1.2654F);
		cube_r4.texOffs(61, 9).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r4.texOffs(50, 26).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r4.texOffs(30, 10).addBox(8.9446F, -3.3585F, 0.4F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r4.texOffs(30, 15).addBox(10.9446F, -3.8585F, 0.4F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r4.texOffs(30, 20).addBox(12.9446F, -4.6085F, 0.4F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r4.texOffs(50, 31).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r4.texOffs(61, 13).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r4.texOffs(36, 50).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r4.texOffs(30, 25).addBox(8.9446F, -3.3585F, 0.4F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r4.texOffs(30, 30).addBox(10.9446F, -3.8585F, 0.4F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r4.texOffs(10, 31).addBox(12.9446F, -4.6085F, 0.4F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r4.texOffs(50, 36).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r4.texOffs(61, 17).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r4.texOffs(50, 41).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r4.texOffs(32, 1).addBox(8.9446F, -3.3585F, 0.4F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r4.texOffs(20, 32).addBox(10.9446F, -3.8585F, 0.4F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r4.texOffs(0, 35).addBox(12.9446F, -4.6085F, 0.4F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r4.texOffs(50, 50).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		b2 = new ModelRenderer(this);
		b2.setPos(2.6333F, -7.7928F, 2.3464F);
		rightLA.addChild(b2);
		setRotationAngle(b2, 0.0F, 1.5708F, 0.0F);


		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(-0.1797F, 0.2928F, -0.25F);
		b2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -1.2654F);
		cube_r5.texOffs(11, 57).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r5.texOffs(50, 16).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r5.texOffs(20, 17).addBox(8.9446F, -3.3585F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r5.texOffs(10, 21).addBox(10.9446F, -3.8585F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r5.texOffs(22, 0).addBox(12.9446F, -4.6085F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r5.texOffs(42, 0).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r5.texOffs(57, 45).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r5.texOffs(50, 21).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r5.texOffs(22, 5).addBox(8.9446F, -3.3585F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r5.texOffs(20, 22).addBox(10.9446F, -3.8585F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r5.texOffs(0, 25).addBox(12.9446F, -4.6085F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r5.texOffs(21, 45).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r5.texOffs(0, 58).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r5.texOffs(22, 50).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r5.texOffs(10, 26).addBox(8.9446F, -3.3585F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r5.texOffs(20, 27).addBox(10.9446F, -3.8585F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r5.texOffs(0, 30).addBox(12.9446F, -4.6085F, -2.5F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r5.texOffs(0, 46).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setPos(-0.0833F, -7.25F, 0.0F);
		rightLA.addChild(bone3);


		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(0.0833F, -12.0F, 0.0F);
		bone3.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -1.1781F);
		cube_r6.texOffs(0, 20).addBox(-3.75F, 0.5F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r6.texOffs(20, 12).addBox(-1.75F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r6.texOffs(0, 0).addBox(0.25F, -1.5F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

		this.rightLeg.addChild(rightLA);
		this.leftLeg.addChild(leftLA);
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