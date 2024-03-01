package net.draip.end.block.custom;

import net.draip.end.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerbedBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class EnderPetalsBlock extends FlowerbedBlock {
    public EnderPetalsBlock(Settings settings) {
        super(settings);
    }


    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        if (floor.isIn(ModTags.Blocks.ENDSTONE_BLOCKS)) {
            return true;
        }
        return super.canPlantOnTop(floor, world, pos);
    }
}
