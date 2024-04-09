package net.draip.end.client;

import com.mojang.blaze3d.systems.RenderSystem;
import net.draip.end.DraipEnd;
import net.draip.end.item.custom.EnchantableArmourItem;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Identifier;

public class DashHudOverlay implements HudRenderCallback {
    private static final Identifier DASH_READY = new Identifier(DraipEnd.MOD_ID,
            "textures/customhuds/dash_ability_ready.png");
    private static final Identifier DASH_UNREADY_1 = new Identifier(DraipEnd.MOD_ID,
            "textures/customhuds/dash_ability_unready_1.png");
    private static final Identifier DASH_UNREADY_2 = new Identifier(DraipEnd.MOD_ID,
            "textures/customhuds/dash_ability_unready_2.png");
    private static final Identifier DASH_UNREADY_3 = new Identifier(DraipEnd.MOD_ID,
            "textures/customhuds/dash_ability_unready_3.png");
    private static final Identifier DASH_UNREADY_4 = new Identifier(DraipEnd.MOD_ID,
            "textures/customhuds/dash_ability_unready_4.png");
    private static final Identifier DASH_UNREADY_5 = new Identifier(DraipEnd.MOD_ID,
            "textures/customhuds/dash_ability_unready_5.png");
    private static final Identifier DASH_UNREADY_6 = new Identifier(DraipEnd.MOD_ID,
            "textures/customhuds/dash_ability_unready_6.png");
    private static final Identifier DASH_UNREADY_7 = new Identifier(DraipEnd.MOD_ID,
            "textures/customhuds/dash_ability_unready_7.png");
    private static final Identifier DASH_UNREADY_8 = new Identifier(DraipEnd.MOD_ID,
            "textures/customhuds/dash_ability_unready_8.png");
    private static final Identifier DASH_UNREADY_9 = new Identifier(DraipEnd.MOD_ID,
            "textures/customhuds/dash_ability_unready_9.png");
    private static final Identifier DASH_UNREADY_10 = new Identifier(DraipEnd.MOD_ID,
            "textures/customhuds/dash_ability_unready_10.png");
    private static final Identifier DASH_UNREADY_11 = new Identifier(DraipEnd.MOD_ID,
            "textures/customhuds/dash_ability_unready_11.png");
    private static final Identifier DASH_UNREADY_12 = new Identifier(DraipEnd.MOD_ID,
            "textures/customhuds/dash_ability_unready_12.png");
    private static final Identifier DASH_UNREADY_13 = new Identifier(DraipEnd.MOD_ID,
            "textures/customhuds/dash_ability_unready_13.png");
    private static final Identifier DASH_UNREADY_14 = new Identifier(DraipEnd.MOD_ID,
            "textures/customhuds/dash_ability_unready_14.png");
    private static final Identifier DASH_UNREADY_15 = new Identifier(DraipEnd.MOD_ID,
            "textures/customhuds/dash_ability_unready_15.png");
    private static final Identifier DASH_UNREADY_16 = new Identifier(DraipEnd.MOD_ID,
            "textures/customhuds/dash_ability_unready_16.png");

    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {
        int x = 0;
        int y = 0;
        MinecraftClient client = MinecraftClient.getInstance();
        if (client != null) {
            int width = client.getWindow().getScaledWidth();
            int height = client.getWindow().getScaledHeight();

            x = width;
            y = height;

            if (EnchantableArmourItem.isDashLevel() == 1) {
                RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);


                int unready = EnchantableArmourItem.isDashCooldown() -1;

                if (unready <= 0) {

                    RenderSystem.setShaderTexture(0, DASH_READY);
                    drawContext.drawTexture(DASH_READY,x - 336 ,y -24,0,0,29,24,
                            29,24);
                }

                if (unready > 0) {
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

                    RenderSystem.setShaderTexture(0, DASH_UNREADY_1);
                    drawContext.drawTexture(DASH_UNREADY_1,x - 336 ,y -23,0,0,29,24,
                            29,24);
                }
                if (unready >= 4) {
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

                    RenderSystem.setShaderTexture(0, DASH_UNREADY_2);
                    drawContext.drawTexture(DASH_UNREADY_2,x - 336 ,y -23,0,0,29,24,
                            29,24);
                }
                if (unready >= 8) {
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

                    RenderSystem.setShaderTexture(0, DASH_UNREADY_3);
                    drawContext.drawTexture(DASH_UNREADY_3,x - 336 ,y -23,0,0,29,24,
                            29,24);
                }
                if (unready >= 12) {
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

                    RenderSystem.setShaderTexture(0, DASH_UNREADY_4);
                    drawContext.drawTexture(DASH_UNREADY_4,x - 336 ,y -23,0,0,29,24,
                            29,24);
                }
                if (unready >= 16) {
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

                    RenderSystem.setShaderTexture(0, DASH_UNREADY_5);
                    drawContext.drawTexture(DASH_UNREADY_5,x - 336 ,y -23,0,0,29,24,
                            29,24);
                }
                if (unready >= 20) {
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

                    RenderSystem.setShaderTexture(0, DASH_UNREADY_6);
                    drawContext.drawTexture(DASH_UNREADY_6,x - 336 ,y -23,0,0,29,24,
                            29,24);
                }
                if (unready >= 24) {
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

                    RenderSystem.setShaderTexture(0, DASH_UNREADY_7);
                    drawContext.drawTexture(DASH_UNREADY_7,x - 336 ,y -23,0,0,29,24,
                            29,24);
                }
                if (unready >= 28) {
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

                    RenderSystem.setShaderTexture(0, DASH_UNREADY_8);
                    drawContext.drawTexture(DASH_UNREADY_8,x - 336 ,y -23,0,0,29,24,
                            29,24);
                }
                if (unready >= 32) {
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

                    RenderSystem.setShaderTexture(0, DASH_UNREADY_9);
                    drawContext.drawTexture(DASH_UNREADY_9,x - 336 ,y -23,0,0,29,24,
                            29,24);
                }
                if (unready >= 36) {
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

                    RenderSystem.setShaderTexture(0, DASH_UNREADY_10);
                    drawContext.drawTexture(DASH_UNREADY_10,x - 336 ,y -23,0,0,29,24,
                            29,24);
                }
                if (unready >= 40) {
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

                    RenderSystem.setShaderTexture(0, DASH_UNREADY_11);
                    drawContext.drawTexture(DASH_UNREADY_11,x - 336 ,y -23,0,0,29,24,
                            29,24);
                }
                if (unready >= 44) {
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

                    RenderSystem.setShaderTexture(0, DASH_UNREADY_12);
                    drawContext.drawTexture(DASH_UNREADY_12,x - 336 ,y -23,0,0,29,24,
                            29,24);
                }
                if (unready >= 48) {
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

                    RenderSystem.setShaderTexture(0, DASH_UNREADY_13);
                    drawContext.drawTexture(DASH_UNREADY_13,x - 336 ,y -23,0,0,29,24,
                            29,24);
                }
                if (unready >= 52) {
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

                    RenderSystem.setShaderTexture(0, DASH_UNREADY_14);
                    drawContext.drawTexture(DASH_UNREADY_14,x - 336 ,y -23,0,0,29,24,
                            29,24);
                }
                if (unready >= 56) {
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

                    RenderSystem.setShaderTexture(0, DASH_UNREADY_15);
                    drawContext.drawTexture(DASH_UNREADY_15,x - 336 ,y -23,0,0,29,24,
                            29,24);
                }
                if (unready >= 60) {
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

                    RenderSystem.setShaderTexture(0, DASH_UNREADY_16);
                    drawContext.drawTexture(DASH_UNREADY_16,x - 336 ,y -23,0,0,29,24,
                            29,24);
                }
                if (unready >= 64) {
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

                    RenderSystem.setShaderTexture(0, DASH_UNREADY_16);
                    drawContext.drawTexture(DASH_UNREADY_16,x - 336 ,y -23,0,0,29,24,
                            29,24);
                }
            }


        }


        }
    }

