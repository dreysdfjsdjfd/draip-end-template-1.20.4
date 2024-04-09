package net.draip.end.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class augriteOreEndstoneBlock extends ExperienceDroppingBlock {

    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        super.onBroken(world, pos, state);
        double x = pos.getX()+0.5;
        double y = pos.getY()+0.5;
        double z = pos.getZ()+0.5;

        System.out.println("x: " + x + ", y: " + y + ", z: " + z);

        double yCorrected = y -= 1;
        world.addParticle(ParticleTypes.EXPLOSION, x, y, z, 5.0, 5.0, 5.0);

        world.playSound(null, pos, SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.MASTER, 1.0f, 1.0f);
        world.playSound(null, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_BREAK, SoundCategory.MASTER, 1.0f, 1.0f);

        World worldObj = (World) world;

        Vec3d vec3d1 = new Vec3d(pos.getX() - 3, pos.getY() - 3, pos.getZ() - 3);
        Vec3d vec3d2 = new Vec3d(pos.getX() + 3, pos.getY() + 3, pos.getZ() + 3);

        Box box = new Box(vec3d1, vec3d2);
        Iterable<PlayerEntity> players = worldObj.getEntitiesByClass(PlayerEntity.class, box, playerEntity -> true);

        for (PlayerEntity player : players) {
            double xPlayer = player.getX();
            double yPlayer = player.getY();
            double zPlayer = player.getZ();

            xPlayer -= x;
            yPlayer -= yCorrected;
            zPlayer -= z;

            if (xPlayer > 0.000) {
                xPlayer -= 3;
                xPlayer *= -1;
            } else {
                xPlayer +=3;
                xPlayer *= -1;
            }

            if (yPlayer > 0.000) {
                yPlayer -= 3;
                yPlayer *= -1;
            } else {
                yPlayer +=3;
                yPlayer *= -1;
            }

            if (zPlayer > 0.000) {
                zPlayer -= 3;
                zPlayer *= -1;
            } else {
                zPlayer +=3;
                zPlayer *= -1;
            }

            xPlayer /= 4;
            yPlayer /= 3;
            zPlayer /= 4;

            player.addVelocity(xPlayer, yPlayer, zPlayer);

            System.out.println("Player position: " + xPlayer + ", " + yPlayer + ", " + zPlayer);
        }
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        double x = pos.getX()+0.5;
        double y = pos.getY()+0.5;
        double z = pos.getZ()+0.5;


        System.out.println("x: " + x + ", y: " + y + ", z: " + z);


        double yCorrected = y -= 1;
        world.addParticle(ParticleTypes.EXPLOSION, x, y, z, 5.0, 5.0, 5.0);

        world.playSound(null, pos, SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.MASTER, 1.0f, 1.0f);
        world.playSound(null, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_BREAK, SoundCategory.MASTER, 1.0f, 1.0f);


        World worldObj = (World) world;

        Vec3d vec3d1 = new Vec3d(pos.getX() - 3, pos.getY() - 3, pos.getZ() - 3);
        Vec3d vec3d2 = new Vec3d(pos.getX() + 3, pos.getY() + 3, pos.getZ() + 3);

        Box box = new Box(vec3d1, vec3d2);
        Iterable<PlayerEntity> players = worldObj.getEntitiesByClass(PlayerEntity.class, box, playerEntity -> true);

        for (PlayerEntity player : players) {
            double xPlayer = player.getX();
            double yPlayer = player.getY();
            double zPlayer = player.getZ();

            xPlayer -= x;
            yPlayer -= yCorrected;
            zPlayer -= z;

            if (xPlayer > 0.000) {
                xPlayer -= 3;
                xPlayer *= -1;
            } else {
                xPlayer += 3;
                xPlayer *= -1;
            }

            if (yPlayer > 0.000) {
                yPlayer -= 3;
                yPlayer *= -1;
            } else {
                yPlayer += 3;
                yPlayer *= -1;
            }

            if (zPlayer > 0.000) {
                zPlayer -= 3;
                zPlayer *= -1;
            } else {
                zPlayer += 3;
                zPlayer *= -1;
            }

            xPlayer /= 2;
            yPlayer /= 2;
            zPlayer /= 2;

            player.addVelocity(xPlayer, yPlayer, zPlayer);
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(Text.translatable("tooltip.draip-end.augrite_ore_explosion").formatted(Formatting.DARK_GRAY));
        super.appendTooltip(stack, world, tooltip, options);
    }

    public augriteOreEndstoneBlock(Settings settings) {
        super(UniformIntProvider.create(4, 7), settings);
    }
}
