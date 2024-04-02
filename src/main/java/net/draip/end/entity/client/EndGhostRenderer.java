package net.draip.end.entity.client;

import net.draip.end.DraipEnd;
import net.draip.end.entity.custom.EndGhostEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.feature.SlimeOverlayFeatureRenderer;
import net.minecraft.client.render.entity.feature.WardenFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.entity.model.SlimeEntityModel;
import net.minecraft.client.render.entity.model.WardenEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.WardenEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.math.random.RandomSplitter;
import org.jetbrains.annotations.Nullable;

public class EndGhostRenderer<T extends LivingEntity> extends MobEntityRenderer<EndGhostEntity, EndGhostModel<EndGhostEntity>> {
    private static final Identifier TEXTURE = new Identifier(DraipEnd.MOD_ID, "textures/entity/endghost.png");
    private static final Identifier TEXTURE_LOWIS = new Identifier(DraipEnd.MOD_ID, "textures/entity/endghost_lowis.png");
    private static final Identifier TEXTURE_NOIS = new Identifier(DraipEnd.MOD_ID, "textures/entity/endghost_nois.png");
    private static final Identifier TEXTURE_PURPLE = new Identifier(DraipEnd.MOD_ID, "textures/entity/endghost_purple.png");
    private static final Identifier TEXTURE_BLUE = new Identifier(DraipEnd.MOD_ID, "textures/entity/endghost_blue.png");
    private static final Identifier TEXTURE_RED = new Identifier(DraipEnd.MOD_ID, "textures/entity/endghost_red.png");

    public EndGhostRenderer(EntityRendererFactory.Context context) {
        super(context, new EndGhostModel<>(context.getPart(ModModelLayers.ENDGHOST)), 0.6f);
    }

    int test;

    @Override
    public Identifier getTexture(EndGhostEntity entity) {
        return null;
    }

    @Nullable
    @Override
    protected RenderLayer getRenderLayer(EndGhostEntity entity, boolean showBody, boolean translucent, boolean showOutline) {
        if (entity.isAngry()) {
            if (entity.isTextureSwitch() >= 0) {
                return RenderLayer.getEntityTranslucent(TEXTURE_NOIS);
            } else if (entity.isTextureSwitch() <= 0 && entity.isTextureSwitch() >= -400) {
                return RenderLayer.getEntityTranslucent(TEXTURE_LOWIS);
            } else if (entity.isAngryCount() % 10 == 0 && entity.isAngryCount() != 0) {
                return RenderLayer.getEntityTranslucent(TEXTURE_BLUE);
            } else if (entity.isAngryCount() % 10 == 9) {
                return RenderLayer.getEntityTranslucent(TEXTURE_LOWIS);
            } else if (entity.isAngryCount() % 10 == 8) {
                return RenderLayer.getEntityTranslucent(TEXTURE_PURPLE);
            } else if (entity.isAngryCount() % 10 == 7) {
                return RenderLayer.getEntityTranslucent(TEXTURE_NOIS);
            } else if (entity.isAngryCount() % 10 == 6) {
                return RenderLayer.getEntityTranslucent(TEXTURE_RED);
            } else if (entity.isAngryCount() % 10 == 5) {
                return RenderLayer.getEntityTranslucent(TEXTURE_LOWIS);
            } else if (entity.isAngryCount() % 10 == 4) {
                return RenderLayer.getEntityTranslucent(TEXTURE_PURPLE);
            } else if (entity.isAngryCount() % 10 == 3) {
                return RenderLayer.getEntityTranslucent(TEXTURE_NOIS);
            } else if (entity.isAngryCount() % 10 == 2) {
                return RenderLayer.getEntityTranslucent(TEXTURE_NOIS);
            } else if (entity.isAngryCount() % 10 == 1) {
                return RenderLayer.getEntityTranslucent(TEXTURE_NOIS);
            } else if (entity.isAngryCount() == 0) {
                return RenderLayer.getEntityTranslucent(TEXTURE);
            }

        }
        return RenderLayer.getEntityTranslucent(TEXTURE);
    }

    @Override
    public void render(EndGhostEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
