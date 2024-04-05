package net.draip.end;

import net.draip.end.block.ModBlocks;
import net.draip.end.entity.ModEntities;
import net.draip.end.entity.client.*;
import net.draip.end.item.ModItems;
import net.draip.end.item.custom.ShulkerCannonItem;
import net.draip.end.particle.ModParticles;
import net.draip.end.particle.custom.AlvesLeavesParticle;
import net.draip.end.particle.custom.WindyLeavesParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.ShulkerBulletEntityRenderer;
import net.minecraft.util.Identifier;

public class DraipEndClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DESTINATIONAL_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_DESTINATIONAL_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_GRASS_SHORT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PLENTIFUL_GRASS_SHORT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_GRASS_LONG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BUTTER_NUT_WEEDS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_VINES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_PETALS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_BERRY_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDSTONE_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ENDSTONE_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STAINED_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_STAINED_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LILY_OF_THE_END, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_LILY_OF_THE_END, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ENDER_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_ALVES_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GILDED_ENDER_ALVES_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HANGING_BUTTER_NUT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PRISTINE_PINK_FLOWERS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HANGING_BUTTER_NUT_PLANT, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BUTTER_NUT_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GILDED_BUTTER_NUT_LEAVES, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_ALVES_PLANKS_TRAPDOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DESTINATIONAL_FLOWER_BLUE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_DESTINATIONAL_FLOWER_BLUE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_GRASS_SHORT_BLUE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_GRASS_LONG_BLUE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_GRASS_LONG_BLUE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_VINES_BLUE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_PETALS_BLUE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_BERRY_CROP_BLUE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDSTONE_TULIP_BLUE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ENDSTONE_TULIP_BLUE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STAINED_POPPY_BLUE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_STAINED_POPPY_BLUE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LILY_OF_THE_END_BLUE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_LILY_OF_THE_END_BLUE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ENDER_FLOWER_BLUE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ENDER_FLOWER_BLUE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRUELING_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLINTING_PURPLE_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_GRUELING_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PLENTIFUL_GRASS_STEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PLENTIFUL_GRASS_FLOWER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MINTY_SHORT_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MINTY_ROSES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MINTY_TALL_FLOWERS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_CRYSTAL_TRANS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_CRYSTAL_TRANS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_CRYSTAL_TRANS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_CRYSTAL_TRANS_PANE, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHAINED_STEEL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHAINED_STEEL_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHAINED_STEEL_STAIRS, RenderLayer.getCutout());



        EntityRendererRegistry.register(ModEntities.ENDERSNAIL, EnderSnailRenderer::new);
        EntityRendererRegistry.register(ModEntities.FIREFLY, FireFlyRenderer::new);
        EntityRendererRegistry.register(ModEntities.ENDGHOST, EndGhostRenderer::new);
        EntityRendererRegistry.register(ModEntities.WALKINGSHULKER, WalkingShulkerRenderer::new);
        EntityRendererRegistry.register(ModEntities.EXPLOSIVESHULKERBULLET, ExplosiveShulkerEntityRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.ENDERSNAIL, EnderSnailModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.FIREFLY, FireFlyModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.ENDGHOST, EndGhostModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.WALKINGSHULKER, WalkingShulkerModel::getTexturedModelData);

        ParticleFactoryRegistry.getInstance().register(ModParticles.ALVES_LEAVES_PARTICLE, AlvesLeavesParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.WINDY_LEAVES_PARTICLE, WindyLeavesParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.NUT_LEAVES_PARTICLE, WindyLeavesParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(ModParticles.TERMINAL_LEAVES_PARTICLE, WindyLeavesParticle.Factory::new);



    }
}
