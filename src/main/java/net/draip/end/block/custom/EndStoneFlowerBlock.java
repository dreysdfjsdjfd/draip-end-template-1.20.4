package net.draip.end.block.custom;

import net.draip.end.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class EndStoneFlowerBlock extends FlowerBlock {
    public EndStoneFlowerBlock(StatusEffect stewEffect, int duration, Settings settings) {
        super(stewEffect, duration, settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        if (floor.isIn(ModTags.Blocks.ENDSTONE_BLOCKS)) {
            return true;
        }
        return super.canPlantOnTop(floor, world, pos);
    }
}
