package net.draip.end.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class augriteSwordItem extends Item {
    public augriteSwordItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);
        if (stack.getItem() == this && player.isSneaking()) {
            if (!world.isClient) {
                // Reduce durability by 25
                stack.damage(25, player, p -> p.sendToolBreakStatus(hand));
            }
        }

        return super.use(world, player, hand);
    }

}

