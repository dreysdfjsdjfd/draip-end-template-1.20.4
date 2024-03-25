package net.draip.end.entity.client;

import net.draip.end.DraipEnd;
import net.draip.end.entity.custom.FireFlyEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.feature.WardenFeatureRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.WardenEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.WardenEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.math.random.RandomSplitter;

public class FireFlyRenderer extends MobEntityRenderer<FireFlyEntity, FireFlyModel<FireFlyEntity>> {
    private static final Identifier TEXTURE = new Identifier(DraipEnd.MOD_ID, "textures/entity/firefly_1.png");
    private static final Identifier TEXTURE_TWO = new Identifier(DraipEnd.MOD_ID, "textures/entity/firefly_2.png");
    private boolean currentTexture;
    private long lastTextureSwitchTime;
    private final Random random = new Random() {
        @Override
        public Random split() {
            return null;
        }

        @Override
        public RandomSplitter nextSplitter() {
            return null;
        }

        @Override
        public void setSeed(long seed) {

        }

        @Override
        public int nextInt() {
            return 0;
        }

        @Override
        public int nextInt(int bound) {
            return 0;
        }

        @Override
        public long nextLong() {
            return 0;
        }

        @Override
        public boolean nextBoolean() {
            return false;
        }

        @Override
        public float nextFloat() {
            return 0;
        }

        @Override
        public double nextDouble() {
            return 0;
        }

        @Override
        public double nextGaussian() {
            return 0;
        }
    };
    private final int flickerRate; // The higher the value, the less frequent the flicker

    public FireFlyRenderer(EntityRendererFactory.Context context) {
        super(context, new FireFlyModel<>(context.getPart(ModModelLayers.FIREFLY)), 0.6f);
        this.currentTexture = false; // Start with TEXTURE
        this.flickerRate = 20; // Adjust this value to change the flicker frequency
    }

    @Override
    public Identifier getTexture(FireFlyEntity entity) {
        Random random = entity.getRandom();
        long currentTime = System.currentTimeMillis();
        long lastSwitchTime = entity.getLastTextureSwitchTime();

        // Check if it's time to switch the texture
        if (currentTime - lastSwitchTime >= (2 + random.nextInt(4)) * 1000) {
            // Switch the texture
            entity.setLastTextureSwitchTime(currentTime);
        }

        // Return the current texture
        return (currentTime - lastSwitchTime) % 2000 < 1000 ? TEXTURE : TEXTURE_TWO;
    }



    @Override
    public void render(FireFlyEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if (mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}