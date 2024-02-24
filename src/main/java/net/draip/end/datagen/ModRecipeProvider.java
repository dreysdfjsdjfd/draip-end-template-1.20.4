package net.draip.end.datagen;

import net.draip.end.block.ModBlocks;
import net.draip.end.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

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

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDSTONE_SLAB, Blocks.END_STONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDSTONE_WALL, Blocks.END_STONE);
        offerPressurePlateRecipe(exporter, ModBlocks.ENDSTONE_PRESSURE_PLATE, Blocks.END_STONE);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVERITE_PICKAXE, 1)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', ModItems.SILVERITE_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SILVERITE_INGOT), conditionsFromItem(ModItems.SILVERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SILVERITE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVERITE_AXE, 1)
                .pattern("RR")
                .pattern("SR")
                .pattern("S ")
                .input('S', Items.STICK)
                .input('R', ModItems.SILVERITE_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SILVERITE_INGOT), conditionsFromItem(ModItems.SILVERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SILVERITE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVERITE_SHOVEL, 1)
                .pattern("R")
                .pattern("S")
                .pattern("S")
                .input('S', Items.STICK)
                .input('R', ModItems.SILVERITE_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SILVERITE_INGOT), conditionsFromItem(ModItems.SILVERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SILVERITE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVERITE_SWORD, 1)
                .pattern("R")
                .pattern("R")
                .pattern("S")
                .input('S', Items.STICK)
                .input('R', ModItems.SILVERITE_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SILVERITE_INGOT), conditionsFromItem(ModItems.SILVERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SILVERITE_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVERITE_HOE, 1)
                .pattern("RR")
                .pattern("S ")
                .pattern("S ")
                .input('S', Items.STICK)
                .input('R', ModItems.SILVERITE_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SILVERITE_INGOT), conditionsFromItem(ModItems.SILVERITE_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SILVERITE_HOE)));







    }
}
