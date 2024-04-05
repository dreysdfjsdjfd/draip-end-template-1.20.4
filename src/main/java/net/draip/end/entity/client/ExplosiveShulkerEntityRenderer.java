package net.draip.end.entity.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.ShulkerBulletEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.projectile.ShulkerBulletEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

@Environment(value=EnvType.CLIENT)
public class ExplosiveShulkerEntityRenderer
        extends EntityRenderer<ShulkerBulletEntity> {
    private static final Identifier TEXTURE = new Identifier("textures/entity/shulker/spark.png");
    private static final RenderLayer LAYER = RenderLayer.getEntityTranslucent(TEXTURE);
    private final ShulkerBulletEntityModel<ShulkerBulletEntity> model;

    public ExplosiveShulkerEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.model = new ShulkerBulletEntityModel(context.getPart(EntityModelLayers.SHULKER_BULLET));
    }

    @Override
    protected int getBlockLight(ShulkerBulletEntity shulkerBulletEntity, BlockPos blockPos) {
        return 15;
    }

    @Override
    public void render(ShulkerBulletEntity shulkerBulletEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        float h = MathHelper.lerpAngleDegrees(g, shulkerBulletEntity.prevYaw, shulkerBulletEntity.getYaw());
        float j = MathHelper.lerp(g, shulkerBulletEntity.prevPitch, shulkerBulletEntity.getPitch());
        float k = (float)shulkerBulletEntity.age + g;
        matrixStack.translate(0.0f, 0.15f, 0.0f);
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.sin(k * 0.1f) * 180.0f));
        matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(MathHelper.cos(k * 0.1f) * 180.0f));
        matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(MathHelper.sin(k * 0.15f) * 360.0f));
        matrixStack.scale(-0.5f, -0.5f, 0.5f);
        this.model.setAngles(shulkerBulletEntity, 0.0f, 0.0f, 0.0f, h, j);
        VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(this.model.getLayer(TEXTURE));
        this.model.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV, 1.0f, 1.0f, 1.0f, 1.0f);
        matrixStack.scale(1.5f, 1.5f, 1.5f);
        VertexConsumer vertexConsumer2 = vertexConsumerProvider.getBuffer(LAYER);
        this.model.render(matrixStack, vertexConsumer2, i, OverlayTexture.DEFAULT_UV, 1.0f, 1.0f, 1.0f, 0.15f);
        matrixStack.pop();
        super.render(shulkerBulletEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(ShulkerBulletEntity shulkerBulletEntity) {
        return TEXTURE;
    }
}
