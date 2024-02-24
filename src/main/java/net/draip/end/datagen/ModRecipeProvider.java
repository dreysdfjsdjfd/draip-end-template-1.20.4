package net.draip.end.datagen;

import net.draip.end.block.ModBlocks;
import net.draip.end.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> SILVERITE_SMELTABLES = List.of(ModItems.SILVERITE_DUST,
            ModBlocks.SILVERITE_ORE_ENDSTONE, ModBlocks.SILVERITE_ORE_DEEPER_ENDSTONE);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, SILVERITE_SMELTABLES, RecipeCategory.MISC, ModItems.SILVERITE_DUST,
                0.7f,200,"silverite");
        offerBlasting(exporter, SILVERITE_SMELTABLES, RecipeCategory.MISC, ModItems.SILVERITE_DUST,
                0.7f,100,"silverite");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SILVERITE_INGOT,RecipeCategory.BUILDING_BLOCKS, ModBlocks.SILVERITE_BLOCK);





    }
}
