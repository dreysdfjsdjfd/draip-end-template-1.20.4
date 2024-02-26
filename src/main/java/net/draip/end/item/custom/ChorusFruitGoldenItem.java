package net.draip.end.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class ChorusFruitGoldenItem extends Item {


    private void teleportRandomly(World world, PlayerEntity player) {
        Random random = world.random;
        double x = player.getX() + (random.nextDouble() - 0.5) * 8.0;
        double y = player.getY() + (double) (random.nextInt(16) - 8);
        double z = player.getZ() + (random.nextDouble() - 0.5) * 8.0;

        BlockPos.Mutable blockPos = new BlockPos.Mutable(x, y, z);
        while (!world.getBlockState(blockPos).isAir() && !world.getBlockState(blockPos).isReplaceable()) {
            y++;
            if (y >= 256) {
                y = 1;
            }
            blockPos.set(x, y, z);
        }

         BlockPos solidBlockPos = findNearestSolidBlockBelow(world, blockPos);

        if (player.hasVehicle()) {
            player.stopRiding();
        }

        player.teleport(solidBlockPos.getX() + 0.5, solidBlockPos.getY() + 1, solidBlockPos.getZ() + 0.5, true);
    }

    private BlockPos findNearestSolidBlockBelow(World world, BlockPos.Mutable blockPos) {
        BlockPos.Mutable pos = new BlockPos.Mutable(blockPos.getX(), blockPos.getY(), blockPos.getZ());

        while (pos.getY() > 0 && !world.getBlockState(pos.down()).isSolidBlock(world, pos.down())) {
            pos.move(Direction.DOWN);
        }

        return pos.toImmutable();
    }




    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) user;
            // Teleport the player to a random location
            teleportRandomly(world, player);
            // Play teleportation sound
            world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, SoundCategory.PLAYERS, 1.0F, 1.0F);
            player.playSound(SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, 1.0F, 1.0F);
            // Consume the chorus fruit
            stack.decrement(1);
        }
        return super.finishUsing(stack, world, user);
    }
    public ChorusFruitGoldenItem(Settings settings) {
        super(settings);
    }

}
