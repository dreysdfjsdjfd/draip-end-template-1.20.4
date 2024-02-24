package net.draip.end.datagen;

import net.draip.end.block.ModBlocks;
import net.draip.end.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

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

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CHORUS_FRUIT_GOLDEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVERITE_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVERITE_INGOT, Models.GENERATED);

    }
}
