package net.draip.end.entity.client;

import net.draip.end.DraipEnd;
import net.draip.end.entity.custom.EnderSnailEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class EnderSnailRenderer extends MobEntityRenderer<EnderSnailEntity, EnderSnailModel<EnderSnailEntity>> {
    private static final Identifier TEXTURE = new Identifier(DraipEnd.MOD_ID,"textures/entity/endersnail.png");


    public EnderSnailRenderer(EntityRendererFactory.Context context) {
        super(context, new EnderSnailModel<>(context.getPart(ModModelLayers.ENDERSNAIL)),0.6f);
    }

    @Override
    public Identifier getTexture(EnderSnailEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(EnderSnailEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (mobEntity.isBaby()) {
            matrixStack.scale(0.5f,0.5f,0.5f);
        } else {
            matrixStack.scale(1f,1f,1f);
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
