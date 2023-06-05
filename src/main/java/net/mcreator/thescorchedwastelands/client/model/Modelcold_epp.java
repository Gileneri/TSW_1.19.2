package net.mcreator.thescorchedwastelands.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcold_epp<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("the_scorched_wastelands", "modelcold_epp"), "main");
	public final ModelPart body;
	public final ModelPart arms1;
	public final ModelPart arms2;
	public final ModelPart head;

	public Modelcold_epp(ModelPart root) {
		this.body = root.getChild("body");
		this.arms1 = root.getChild("arms1");
		this.arms2 = root.getChild("arms2");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 27).addBox(-4.0F, 14.0F, 3.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 11).addBox(-4.0F, 11.0F, 8.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 6)
						.addBox(-5.0F, 13.0F, 3.0F, 10.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(-3.0F, 7.0F, 8.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-4.0F, 13.0F, 7.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 9).addBox(-2.0F, 2.0F, 9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 43)
						.addBox(-1.0F, 11.0F, 9.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 23).addBox(1.0F, 5.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 40)
						.addBox(-2.0F, 12.0F, 9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 2).addBox(-2.0F, 9.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-2.0F, 5.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 34).addBox(1.0F, 3.0F, 11.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 37)
						.addBox(-1.0F, 4.0F, 10.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 21).addBox(1.0F, 9.0F, 10.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 43)
						.addBox(1.0F, 2.0F, 9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(17, 6).addBox(-4.0F, 6.0F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 37)
						.addBox(-2.0F, 3.0F, 11.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 21).addBox(-4.0F, 6.0F, 8.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 28)
						.addBox(3.0F, 8.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27).addBox(3.0F, 6.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 5)
						.addBox(-4.0F, 5.0F, 5.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 34).addBox(-4.0F, 6.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-4.0F, 8.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 0).addBox(-4.0F, -1.0F, 3.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 40)
						.addBox(3.0F, 9.0F, 5.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 40).addBox(3.0F, 5.0F, 5.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 32)
						.addBox(3.0F, 7.0F, 5.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 29).addBox(-4.0F, 9.0F, 5.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 32)
						.addBox(-5.0F, 1.0F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.0F, 12.0F, 3.0F, 10.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(21, 22)
						.addBox(-4.0F, 11.0F, 3.0F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 32).addBox(-5.0F, 0.0F, 0.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(4.0F, 1.0F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 23).addBox(-5.0F, 0.0F, 4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-3.0F, 3.0F, 3.0F, 6.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 32).addBox(4.0F, 0.0F, 0.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 11)
						.addBox(-3.0F, -7.0F, 4.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 19).addBox(4.0F, 0.0F, 4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-4.0F, 2.0F, 3.0F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 28).addBox(-4.0F, 1.0F, 8.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, 6.0F, 4.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 14).addBox(-4.0F, 0.0F, 3.0F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(2.0F, -7.0F, 4.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 32).addBox(-4.0F, 7.0F, 5.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(6, 44)
						.addBox(-1.0F, 6.0F, 11.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6).addBox(3.0F, 6.0F, 8.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 40)
						.addBox(1.0F, 12.0F, 9.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 33).addBox(-1.0F, 3.0F, 9.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.0F, 0.0F));
		PartDefinition arms1 = partdefinition.addOrReplaceChild("arms1", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition arms2 = partdefinition.addOrReplaceChild("arms2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arms1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arms2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
