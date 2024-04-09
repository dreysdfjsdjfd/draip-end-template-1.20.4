package net.draip.end.block.custom;

import net.draip.end.block.entity.DestinationalEnchantmentTableBlockEntity;
import net.draip.end.block.entity.ModBlockEntities;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.EnchantingTableBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.EnchantingTableBlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class DestinationalEnchantmentTableBlock extends EnchantingTableBlock implements BlockEntityProvider {
    public DestinationalEnchantmentTableBlock(Settings settings) {
        super(settings);
    }


    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new DestinationalEnchantmentTableBlockEntity(pos, state);
    }


    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        BlockEntity blockEntity;
        if (itemStack.hasCustomName() && (blockEntity = world.getBlockEntity(pos)) instanceof DestinationalEnchantmentTableBlockEntity) {
            ((EnchantingTableBlockEntity)blockEntity).setCustomName(itemStack.getName());
        }
    }
}
