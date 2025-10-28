package net.njrosso.ruby.armor;

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

public class legs<T extends LivingEntity> extends HumanoidModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "legs"), "main");
    private final ModelPart leftLA;
    private final ModelPart rightLA;

    public legs(ModelPart root) {
        super(root);
        this.leftLA = root.getChild("left_leg");
        this.rightLA = root.getChild("right_leg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        
        PartDefinition leftLA = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(2.0F, 0.0F, 0.0F));
        
        PartDefinition bone = leftLA.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4833F, 16.5833F, -2.15F, 0.0F, -1.5708F, 0.0F));
        
        bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 58).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(11, 53).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 11).addBox(8.9446F, -3.3585F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 16).addBox(10.9446F, -3.8585F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 21).addBox(12.9446F, -4.6085F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 54).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(61, 5).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 54).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 26).addBox(8.9446F, -3.3585F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 40).addBox(10.9446F, -3.8585F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 31).addBox(12.9446F, -4.6085F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 54).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(9, 61).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 54).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 36).addBox(8.9446F, -3.3585F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 41).addBox(10.9446F, -3.8585F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 41).addBox(12.9446F, -4.6085F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 0).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3333F, -0.0833F, 0.0F, 0.0F, 0.0F, -1.2654F));
        
        PartDefinition b1 = leftLA.addOrReplaceChild("b1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5167F, 16.5833F, 2.15F, 0.0F, 1.5708F, 0.0F));
        
        b1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 58).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 46).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 10).addBox(8.9446F, -3.3585F, 0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 11).addBox(10.9446F, -3.8585F, 0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 37).addBox(12.9446F, -4.6085F, 0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 46).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 58).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(11, 49).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 1).addBox(8.9446F, -3.3585F, 0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 6).addBox(10.9446F, -3.8585F, 0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 40).addBox(12.9446F, -4.6085F, 0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 50).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 58).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 4).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(8.9446F, -3.3585F, 0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 16).addBox(10.9446F, -3.8585F, 0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 6).addBox(12.9446F, -4.6085F, 0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 11).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3333F, -0.0833F, 0.0F, 0.0F, 0.0F, -1.2654F));
        
        PartDefinition bone4 = leftLA.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7181F, 16.827F, 0.0F, 0.0F, 3.1416F, 0.0F));
        
        bone4.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(30, 35).addBox(7.3366F, -4.0922F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 36).addBox(9.3366F, -5.0922F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 5).addBox(11.3366F, -6.0922F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0319F, -0.077F, 0.0F, 0.0F, 0.0F, -1.1781F));
        
        PartDefinition rightLA = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-2.0F, 0.0F, 0.0F));
        
        PartDefinition bone2 = rightLA.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3833F, 16.5833F, -2.15F, 0.0F, -1.5708F, 0.0F));
        
        bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(61, 9).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 26).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 10).addBox(8.9446F, -3.3585F, 0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 15).addBox(10.9446F, -3.8585F, 0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 20).addBox(12.9446F, -4.6085F, 0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 31).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(61, 13).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 50).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 25).addBox(8.9446F, -3.3585F, 0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 30).addBox(10.9446F, -3.8585F, 0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 31).addBox(12.9446F, -4.6085F, 0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 36).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(61, 17).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 41).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 1).addBox(8.9446F, -3.3585F, 0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 32).addBox(10.9446F, -3.8585F, 0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 35).addBox(12.9446F, -4.6085F, 0.4F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 50).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3333F, -0.0833F, 0.0F, 0.0F, 0.0F, -1.2654F));
        
        PartDefinition b2 = rightLA.addOrReplaceChild("b2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3667F, 16.2072F, 2.3464F, 0.0F, 1.5708F, 0.0F));
        
        b2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(11, 57).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 16).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 17).addBox(8.9446F, -3.3585F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 21).addBox(10.9446F, -3.8585F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 0).addBox(12.9446F, -4.6085F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 0).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(57, 45).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 21).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 5).addBox(8.9446F, -3.3585F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 22).addBox(10.9446F, -3.8585F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 25).addBox(12.9446F, -4.6085F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(21, 45).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 58).addBox(6.9446F, -3.3585F, -0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 50).addBox(8.9446F, -4.1085F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(10, 26).addBox(8.9446F, -3.3585F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 27).addBox(10.9446F, -3.8585F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(12.9446F, -4.6085F, -2.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 46).addBox(11.9446F, -4.8585F, -0.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1797F, 0.2928F, -0.25F, 0.0F, 0.0F, -1.2654F));
        
        PartDefinition bone3 = rightLA.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-3.0833F, 16.75F, 0.0F));
        
        bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 20).addBox(-3.75F, 0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 12).addBox(-1.75F, -0.5F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(0.25F, -1.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0833F, -12.0F, 0.0F, 0.0F, 0.0F, -1.1781F));

        CubeDeformation cubeDeformation = CubeDeformation.NONE;
        
        float p_170683_ = 0.0F;
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), PartPose.offset(0.0F, 0.0F + p_170683_, 0.0F));
        partdefinition.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), PartPose.offset(0.0F, 0.0F + p_170683_, 0.0F));
        partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, cubeDeformation), PartPose.offset(-5.0F, 2.0F + p_170683_, 0.0F));
        partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, cubeDeformation), PartPose.offset(5.0F, 2.0F + p_170683_, 0.0F));
        partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F), PartPose.offset(0.0F, 0.0F + p_170683_, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.leftLA.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightLA.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}