package net.draip.end.entity.client;

import net.draip.end.entity.animation.ModAnimations;
import net.draip.end.entity.custom.EndGhostEntity;
import net.draip.end.entity.custom.EnderSnailEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class EndGhostModel <T extends EndGhostEntity> extends SinglePartEntityModel<T> {
	private final ModelPart endghost;
	private final ModelPart head;


	public EndGhostModel(ModelPart root) {
		this.endghost = root.getChild("endghost");
		this.head = endghost.getChild("head");

	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData endghost = modelPartData.addChild("endghost", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData body = endghost.addChild("body", ModelPartBuilder.create().uv(0, 46).cuboid(-4.0F, -31.0F, -3.0F, 8.0F, 14.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData legs = endghost.addChild("legs", ModelPartBuilder.create().uv(6, 34).cuboid(-4.0F, -3.5862F, -3.0F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(2, 21).cuboid(-3.0F, -3.5862F, -3.0F, 1.0F, 10.0F, 0.0F, new Dilation(0.0F))
				.uv(24, 8).cuboid(-2.0F, -3.5862F, -3.0F, 1.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(10, 29).cuboid(-1.0F, -3.5862F, -3.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-4.0F, -3.5862F, -3.0F, 8.0F, 0.0F, 6.0F, new Dilation(0.0F))
				.uv(22, 9).cuboid(0.0F, -3.5862F, -3.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
				.uv(22, 24).cuboid(1.0F, -3.5862F, -3.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
				.uv(2, 0).cuboid(2.0F, -3.5862F, -3.0F, 1.0F, 6.0F, 0.0F, new Dilation(0.0F))
				.uv(20, 17).cuboid(3.0F, -3.5862F, -3.0F, 1.0F, 9.0F, 0.0F, new Dilation(0.0F))
				.uv(16, 17).cuboid(4.0F, -3.5862F, -3.0F, 0.0F, 10.0F, 1.0F, new Dilation(0.0F))
				.uv(10, 17).cuboid(4.0F, -3.5862F, -2.0F, 0.0F, 11.0F, 1.0F, new Dilation(0.0F))
				.uv(8, 5).cuboid(4.0F, -3.5862F, -1.0F, 0.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(4.0F, -3.5862F, 0.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 20).cuboid(4.0F, -3.5862F, 1.0F, 0.0F, 9.0F, 1.0F, new Dilation(0.0F))
				.uv(14, 17).cuboid(4.0F, -3.5862F, 2.0F, 0.0F, 10.0F, 1.0F, new Dilation(0.0F))
				.uv(12, 17).cuboid(-4.0F, -3.5862F, -1.0F, 0.0F, 11.0F, 1.0F, new Dilation(0.0F))
				.uv(6, 20).cuboid(-4.0F, -3.5862F, 2.0F, 0.0F, 9.0F, 1.0F, new Dilation(0.0F))
				.uv(24, 21).cuboid(-4.0F, -3.5862F, 1.0F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(22, 16).cuboid(-4.0F, -3.5862F, 0.0F, 0.0F, 7.0F, 1.0F, new Dilation(0.0F))
				.uv(8, 20).cuboid(-4.0F, -3.5862F, -2.0F, 0.0F, 8.0F, 1.0F, new Dilation(0.0F))
				.uv(4, 20).cuboid(-4.0F, -3.5862F, -3.0F, 0.0F, 9.0F, 1.0F, new Dilation(0.0F))
				.uv(20, 6).cuboid(3.0F, -3.5862F, 3.0F, 1.0F, 11.0F, 0.0F, new Dilation(0.0F))
				.uv(24, 0).cuboid(0.0F, -3.5862F, 3.0F, 1.0F, 8.0F, 0.0F, new Dilation(0.0F))
				.uv(18, 18).cuboid(-2.0F, -3.5862F, 3.0F, 1.0F, 11.0F, 0.0F, new Dilation(0.0F))
				.uv(4, 0).cuboid(-3.0F, -3.5862F, 3.0F, 1.0F, 6.0F, 0.0F, new Dilation(0.0F))
				.uv(24, 15).cuboid(-4.0F, -3.5862F, 3.0F, 1.0F, 7.0F, 0.0F, new Dilation(0.0F))
				.uv(4, 34).cuboid(-1.0F, -3.5862F, 3.0F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(22, 0).cuboid(2.0F, -3.5862F, 3.0F, 1.0F, 9.0F, 0.0F, new Dilation(0.0F))
				.uv(16, 28).cuboid(1.0F, -3.5862F, 3.0F, 1.0F, 6.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -13.4127F, 0.0167F));

		ModelPartData left_arm = endghost.addChild("left_arm", ModelPartBuilder.create().uv(10, 6).cuboid(-1.5F, 0.0F, -1.0F, 3.0F, 10.0F, 2.0F, new Dilation(0.0F))
				.uv(18, 29).cuboid(-1.5F, 10.0F, -1.0F, 1.0F, 5.0F, 0.0F, new Dilation(0.0F))
				.uv(8, 28).cuboid(-1.5F, 10.0F, -1.0F, 0.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(2, 30).cuboid(-1.5F, 10.0F, 0.0F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(10, 34).cuboid(-0.5F, 10.0F, -1.0F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(2, 34).cuboid(0.5F, 10.0F, -1.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
				.uv(18, 5).cuboid(1.5F, 10.0F, -1.0F, 0.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(12, 33).cuboid(0.5F, 10.0F, 1.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
				.uv(0, 36).cuboid(-0.5F, 10.0F, 1.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
				.uv(18, 34).cuboid(-1.5F, 10.0F, 1.0F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
				.uv(0, 32).cuboid(1.5F, 10.0F, 0.0F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(5.5F, -31.0F, 0.0F));

		ModelPartData head = endghost.addChild("head", ModelPartBuilder.create().uv(28, 46).cuboid(-4.0F, -3.5F, -3.0F, 8.0F, 7.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -34.5F, 0.0F));

		ModelPartData top_ring = endghost.addChild("top_ring", ModelPartBuilder.create(), ModelTransform.pivot(1.9583F, -35.3442F, 0.0F));

		ModelPartData cube_r1 = top_ring.addChild("cube_r1", ModelPartBuilder.create().uv(0, 26).cuboid(-13.0F, -7.0F, -10.0F, 26.0F, 0.0F, 20.0F, new Dilation(0.0F)), ModelTransform.of(-2.9583F, 6.3442F, 0.0F, 0.0F, 0.0F, 0.4363F));

		ModelPartData bottom_ring = endghost.addChild("bottom_ring", ModelPartBuilder.create(), ModelTransform.pivot(0.9653F, -22.5667F, 0.0F));

		ModelPartData cube_r2 = bottom_ring.addChild("cube_r2", ModelPartBuilder.create().uv(0, 0).cuboid(-13.0F, 5.0F, -13.0F, 35.0F, 0.0F, 26.0F, new Dilation(0.0F)), ModelTransform.of(-1.9653F, -6.4333F, 0.0F, 0.0F, 0.0F, 0.4363F));

		ModelPartData right_arm = endghost.addChild("right_arm", ModelPartBuilder.create().uv(0, 6).cuboid(-1.5F, -0.8677F, -2.133F, 3.0F, 13.0F, 2.0F, new Dilation(0.0F))
				.uv(6, 30).cuboid(-1.5F, 12.1323F, -2.133F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
				.uv(12, 28).cuboid(-1.5F, 12.1323F, -2.133F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(14, 27).cuboid(-1.5F, 12.1323F, -1.133F, 0.0F, 6.0F, 1.0F, new Dilation(0.0F))
				.uv(8, 34).cuboid(-0.5F, 12.1323F, -2.133F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
				.uv(16, 34).cuboid(0.5F, 12.1323F, -2.133F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
				.uv(10, 5).cuboid(1.5F, 12.1323F, -2.133F, 0.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(4, 30).cuboid(0.5F, 12.1323F, -0.133F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-0.5F, 12.1323F, -0.133F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F))
				.uv(14, 34).cuboid(-1.5F, 12.1323F, -0.133F, 1.0F, 2.0F, 0.0F, new Dilation(0.0F))
				.uv(0, 29).cuboid(1.5F, 12.1323F, -1.133F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.5F, -30.1818F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);
	}

	@Override
	public void setAngles(EndGhostEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.ENDGHOST_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.ENDGHOST_IDLE, ageInTicks, 1f);
		this.updateAnimation(entity.attackAnimationState, ModAnimations.ENDGHOST_ATTACK, ageInTicks, 1f);

	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}


	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		endghost.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return endghost;
	}
}