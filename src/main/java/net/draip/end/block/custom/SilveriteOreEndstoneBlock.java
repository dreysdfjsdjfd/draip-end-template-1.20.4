package net.draip.end.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.StructureSpawns;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class SilveriteOreEndstoneBlock extends ExperienceDroppingBlock {

    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        super.onBroken(world, pos, state);
        double x = pos.getX()+0.5;
        double y = pos.getY()+0.5;
        double z = pos.getZ()+0.5;

        // Play explosion particle and sound
        world.addParticle(ParticleTypes.EXPLOSION, x, y, z, 5.0, 5.0, 5.0);
        world.playSound(null, pos, SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.MASTER, 1.0f, 1.0f);

        // Cast WorldAccess to World
        World worldObj = (World) world;

        // Create Vec3d objects for the corners of the box
        Vec3d vec3d1 = new Vec3d(pos.getX() - 1, pos.getY() - 1, pos.getZ() - 1);
        Vec3d vec3d2 = new Vec3d(pos.getX() + 1, pos.getY() + 1, pos.getZ() + 1);

        // Get all players in the world within a 5-block radius of the broken block
        Box box = new Box(vec3d1, vec3d2);
        Iterable<PlayerEntity> players = worldObj.getEntitiesByClass(PlayerEntity.class, box, playerEntity -> true);

        // Iterate over players and do something with their positions
        for (PlayerEntity player : players) {
            double xPlayer = player.getX();
            double yPlayer = player.getY();
            double zPlayer = player.getZ();
            // Do something with the player's position
            // For example, print the position
            System.out.println("Player position: " + xPlayer + ", " + yPlayer + ", " + zPlayer);
        }
    }

    public SilveriteOreEndstoneBlock(Settings settings) {
        super(UniformIntProvider.create(4, 7), settings);
    }
}
