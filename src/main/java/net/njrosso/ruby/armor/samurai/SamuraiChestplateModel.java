package net.njrosso.ruby.armor.samurai;

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

public class SamuraiChestplateModel<T extends LivingEntity> extends HumanoidModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "chestplate"), "main");
    private final ModelPart bb_main;
    private final ModelPart rightA;
    private final ModelPart leftA;

    public SamuraiChestplateModel(ModelPart root) {
        super(root);
        this.bb_main = root.getChild("body");
        this.rightA = root.getChild("right_arm");
        this.leftA = root.getChild("left_arm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        partdefinition.addOrReplaceChild("body", CubeListBuilder.create()
                .texOffs(0, 0).addBox(-4.5F, 0.5F, -3.25F, 9.0F, 9.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 15).addBox(-5.0F, 9.0F, -2.5F, 10.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition leftA = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create()
                .texOffs(20, 23).addBox(-0.875F, -2.375F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(32, 33).addBox(2.125F, 3.625F, -2.5F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(42, 14).addBox(-0.875F, 7.625F, -2.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(41, 29).addBox(-0.875F, 4.625F, -2.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(5.875F, 0.375F, 0.0F));
        PartDefinition armplate2 = leftA.addOrReplaceChild("armplate2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.875F, 25.625F, 0.0F, 0.0F, 3.1416F, 0.0F));

        armplate2.addOrReplaceChild("cube_r1", CubeListBuilder.create()
                .texOffs(39, 7).addBox(-4.0937F, 0.3274F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(8, 40).addBox(-2.0937F, -0.6726F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(30, 0).addBox(-0.0937F, -1.6726F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 44).addBox(3.9063F, -2.6726F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, -24.75F, 0.0F, 0.0F, 0.0F, -1.1345F));

        PartDefinition rightA = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create()
                .texOffs(0, 23).addBox(-4.125F, -2.375F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 33).addBox(-4.125F, 3.625F, -2.5F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(40, 23).addBox(-2.125F, 7.625F, -2.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(20, 40).addBox(-2.125F, 4.625F, -2.5F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.875F, 0.375F, 0.0F));

        PartDefinition armplate = rightA.addOrReplaceChild("armplate", CubeListBuilder.create(), PartPose.offset(6.875F, 25.625F, 0.0F));

        armplate.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(30, 16).addBox(-5.0F, 0.75F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(14, 33).addBox(-3.0F, -0.25F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(25, 9).addBox(-1.0F, -1.25F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(40, 38).addBox(3.0F, -2.25F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, -25.75F, 0.0F, 0.0F, 0.0F, -1.1345F));

        float yOffset = 0.0F;
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), PartPose.offset(0.0F, 0.0F + yOffset, 0.0F));
        partdefinition.addOrReplaceChild("hat", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), PartPose.offset(0.0F, 0.0F + yOffset, 0.0F));
        partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), PartPose.offset(-1.9F, 12.0F + yOffset, 0.0F));
        partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), PartPose.offset(1.9F, 12.0F + yOffset, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightA.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftA.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
