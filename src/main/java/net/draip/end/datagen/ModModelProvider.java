package net.draip.end.datagen;

import net.draip.end.block.ModBlocks;
import net.draip.end.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDSTONE_DEEPER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVERITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVERITE_ORE_DEEPER_ENDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVERITE_ORE_ENDSTONE);

        BlockStateModelGenerator.BlockTexturePool endstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.END_STONE);
        endstonePool.stairs(ModBlocks.ENDSTONE_STAIRS);
        endstonePool.slab(ModBlocks.ENDSTONE_SLAB);
        endstonePool.button(ModBlocks.ENDSTONE_BUTTON);
        endstonePool.pressurePlate(ModBlocks.ENDSTONE_PRESSURE_PLATE);
        endstonePool.wall(ModBlocks.ENDSTONE_WALL);






    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CHORUS_FRUIT_GOLDEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVERITE_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVERITE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.SILVERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVERITE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SILVERITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SILVERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SILVERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SILVERITE_BOOTS));


    }
}
