package net.draip.end.particle.custom;

import net.minecraft.client.particle.CherryLeavesParticle;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;

public class AlvesLeaves extends CherryLeavesParticle {

    protected AlvesLeaves(ClientWorld world, double x, double y, double z, SpriteProvider spriteProvider) {
        super(world, x, y, z, spriteProvider);
    }
}
