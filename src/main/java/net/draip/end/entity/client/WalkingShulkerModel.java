package net.draip.end.entity.client;

import net.draip.end.entity.animation.ModAnimations;
import net.draip.end.entity.custom.FireFlyEntity;
import net.draip.end.entity.custom.WalkingShulkerEntity;
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
public class WalkingShulkerModel<T extends WalkingShulkerEntity> extends SinglePartEntityModel<T> {
	private final ModelPart walkingshulker;
	private final ModelPart head;

	public WalkingShulkerModel(ModelPart root) {
		this.walkingshulker = root.getChild("walkingshulker");
		this.head = root.getChild("walkingshulker").getChild("main").getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData walkingshulker = modelPartData.addChild("walkingshulker", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData main = walkingshulker.addChild("main", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -5.0F, 0.0F));

		ModelPartData lowerbody = main.addChild("lowerbody", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, 0.0F, -8.0F, 16.0F, 0.0F, 16.0F, new Dilation(0.0F))
		.uv(0, 48).cuboid(-8.0F, -4.0F, -8.0F, 4.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(8, 0).cuboid(-8.0F, -4.0F, -8.0F, 0.0F, 4.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 8).cuboid(-8.0F, -4.0F, 4.0F, 0.0F, 4.0F, 4.0F, new Dilation(0.0F))
		.uv(8, 0).cuboid(-8.0F, -4.0F, 8.0F, 4.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(4.0F, -4.0F, 8.0F, 4.0F, 4.0F, 0.0F, new Dilation(0.0F))
		.uv(0, 4).cuboid(8.0F, -4.0F, 4.0F, 0.0F, 4.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(8.0F, -4.0F, -8.0F, 0.0F, 4.0F, 4.0F, new Dilation(0.0F))
		.uv(52, 52).cuboid(7.0F, -8.0F, -4.0F, 1.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(48, 0).cuboid(-8.0F, -8.0F, -4.0F, 1.0F, 8.0F, 8.0F, new Dilation(0.0F))
		.uv(0, 60).cuboid(-4.0F, -8.0F, -8.0F, 8.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(56, 25).cuboid(-4.0F, -8.0F, 7.0F, 8.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(46, 47).cuboid(4.0F, -4.0F, -8.0F, 4.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = main.addChild("head", ModelPartBuilder.create().uv(16, 38).cuboid(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -6.0F, 0.0F));

		ModelPartData upperbody = main.addChild("upperbody", ModelPartBuilder.create().uv(46, 38).cuboid(-8.0F, -16.0F, 7.0F, 16.0F, 8.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 16).cuboid(-7.0F, -16.0F, -7.0F, 14.0F, 1.0F, 14.0F, new Dilation(0.0F))
		.uv(30, 38).cuboid(-8.0F, -16.0F, -7.0F, 1.0F, 8.0F, 14.0F, new Dilation(0.0F))
		.uv(5, 23).cuboid(-8.0F, -8.0F, 4.0F, 1.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 19).cuboid(-8.0F, -8.0F, -7.0F, 1.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(5, 15).cuboid(7.0F, -8.0F, -7.0F, 1.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(8, 8).cuboid(7.0F, -8.0F, 4.0F, 1.0F, 4.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 38).cuboid(7.0F, -16.0F, -7.0F, 1.0F, 8.0F, 14.0F, new Dilation(0.0F))
		.uv(0, 43).cuboid(4.0F, -8.0F, 7.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 38).cuboid(4.0F, -8.0F, -8.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 25).cuboid(-8.0F, -8.0F, 7.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(34, 38).cuboid(-8.0F, -8.0F, -8.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(42, 16).cuboid(-8.0F, -16.0F, -8.0F, 16.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData legs = walkingshulker.addChild("legs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData right_leg = legs.addChild("right_leg", ModelPartBuilder.create().uv(1, 1).cuboid(-0.5F, 0.25F, 0.25F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(-4, -4).cuboid(-1.5F, 5.25F, -3.75F, 3.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(3.5F, -5.25F, -0.35F));

		ModelPartData left_leg = legs.addChild("left_leg", ModelPartBuilder.create().uv(1, 1).cuboid(-0.5F, 0.25F, -0.75F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(-4, -4).cuboid(-1.5F, 5.25F, -4.75F, 3.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.5F, -5.25F, 0.75F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(WalkingShulkerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);

		this.animateMovement(ModAnimations.WALKINGSHULKER_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.WALKINGSHULKER_IDLE, ageInTicks, 1f);
		this.updateAnimation(entity.attackAnimationState, ModAnimations.WALKINGSHULKER_ATTACK, ageInTicks, 1f);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		walkingshulker.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}


	@Override
	public ModelPart getPart() {
		return walkingshulker;
	}
}