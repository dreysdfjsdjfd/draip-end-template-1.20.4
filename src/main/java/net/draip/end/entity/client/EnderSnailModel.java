package net.draip.end.entity.client;

import net.draip.end.entity.animation.ModAnimations;
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
public class EnderSnailModel<T extends EnderSnailEntity> extends SinglePartEntityModel<T> {
	private final ModelPart endersnail;
	private final ModelPart head;


	public EnderSnailModel(ModelPart root) {
		this.endersnail = root.getChild("endersnail");
		this.head = endersnail.getChild("body").getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData endersnail = modelPartData.addChild("endersnail", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData body = endersnail.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData shell = body.addChild("shell", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = shell.addChild("cube_r1", ModelPartBuilder.create().uv(0, 11).cuboid(-2.0F, -2.0F, -3.0F, 4.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		ModelPartData main = body.addChild("main", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -2.0F, -5.0F, 2.0F, 2.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -3.0F, -5.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData left_eye = head.addChild("left_eye", ModelPartBuilder.create(), ModelTransform.pivot(-0.409F, -3.11F, -4.6964F));

		ModelPartData cube_r2 = left_eye.addChild("cube_r2", ModelPartBuilder.create().uv(4, 3).cuboid(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -1.0F, 0.0F, 0.1745F, 0.0F, 0.2618F));

		ModelPartData right_eye = head.addChild("right_eye", ModelPartBuilder.create(), ModelTransform.pivot(-0.8053F, -3.0734F, -4.6964F));

		ModelPartData cube_r3 = right_eye.addChild("cube_r3", ModelPartBuilder.create().uv(0, 3).cuboid(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.1745F, 0.0F, -0.2618F));
		return TexturedModelData.of(modelData, 32, 32);
	}

	@Override
	public void setAngles(EnderSnailEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);

		this.animateMovement(ModAnimations.ENDERSNAIL_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.ENDERSNAIL_IDLE, ageInTicks, 1f);
	}

	@Override
	public ModelPart getPart() {
		return endersnail;
	}
}