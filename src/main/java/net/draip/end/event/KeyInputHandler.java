package net.draip.end.event;

import net.draip.end.item.custom.EnchantableArmourItem;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.glfw.GLFW;


public class KeyInputHandler {
    public static final String KEY_CATEGORY_ENCHANTS = "key.category.draip-end.enchants";
    public static final String KEY_DASH_ABILITY = "key.draip-end.dash";

    public static KeyBinding dashKey;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(dashKey.wasPressed()) {
                if (EnchantableArmourItem.isDashCooldown() == 0) {
                    EnchantableArmourItem.CheckForCooldown();

                    if (EnchantableArmourItem.isDashLevel() == 1) {
                        double speed = 1.0;
                        assert client.player != null;
                        double x = -Math.sin(Math.toRadians(client.player.getYaw())) * Math.cos(Math.toRadians(client.player.getPitch())) * speed;
                        double y = -Math.sin(Math.toRadians(client.player.getPitch())) * speed;
                        double z = Math.cos(Math.toRadians(client.player.getYaw())) * Math.cos(Math.toRadians(client.player.getPitch())) * speed;
                        Vec3d velocity = new Vec3d(x, y, z);
                        client.player.addVelocity(velocity);
                    } else if (EnchantableArmourItem.isDashLevel() == 2) {
                        double speed = 2.0;
                        assert client.player != null;
                        double x = -Math.sin(Math.toRadians(client.player.getYaw())) * Math.cos(Math.toRadians(client.player.getPitch())) * speed;
                        double y = -Math.sin(Math.toRadians(client.player.getPitch())) * speed;
                        double z = Math.cos(Math.toRadians(client.player.getYaw())) * Math.cos(Math.toRadians(client.player.getPitch())) * speed;
                        Vec3d velocity = new Vec3d(x, y, z);
                        client.player.addVelocity(velocity);
                    } else if (EnchantableArmourItem.isDashLevel() == 3) {
                        double speed = 3.0;
                        assert client.player != null;
                        double x = -Math.sin(Math.toRadians(client.player.getYaw())) * Math.cos(Math.toRadians(client.player.getPitch())) * speed;
                        double y = -Math.sin(Math.toRadians(client.player.getPitch())) * speed;
                        double z = Math.cos(Math.toRadians(client.player.getYaw())) * Math.cos(Math.toRadians(client.player.getPitch())) * speed;
                        Vec3d velocity = new Vec3d(x, y, z);
                        client.player.addVelocity(velocity);
                    }
                }
            }
        });
    }

    public static void register() {
        dashKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_DASH_ABILITY,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_O,
                KEY_CATEGORY_ENCHANTS
        ));

        registerKeyInputs();
    }
}
