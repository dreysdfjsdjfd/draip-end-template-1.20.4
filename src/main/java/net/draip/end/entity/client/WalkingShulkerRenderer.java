package net.draip.end.entity.client;

import net.draip.end.DraipEnd;
import net.draip.end.entity.custom.EndGhostEntity;
import net.draip.end.entity.custom.FireFlyEntity;
import net.draip.end.entity.custom.WalkingShulkerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class WalkingShulkerRenderer extends MobEntityRenderer<WalkingShulkerEntity, WalkingShulkerModel<WalkingShulkerEntity>> {
    private static final Identifier TEXTURE = new Identifier(DraipEnd.MOD_ID,"textures/entity/walkingshulker.png");


    public WalkingShulkerRenderer(EntityRendererFactory.Context context) {
        super(context, new WalkingShulkerModel<>(context.getPart(ModModelLayers.WALKINGSHULKER)),0.6f);
    }

    @Override
    public Identifier getTexture(WalkingShulkerEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(WalkingShulkerEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (mobEntity.isBaby()) {
            matrixStack.scale(0.5f,0.5f,0.5f);
        } else {
            matrixStack.scale(1f,1f,1f);
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
