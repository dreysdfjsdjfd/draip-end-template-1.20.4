package net.draip.end.datagen;

import net.draip.end.block.ModBlocks;
import net.draip.end.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
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
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDSTONE_DEEPER_SLAB, ModBlocks.ENDSTONE_DEEPER);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDER_ALVES_PLANKS_SLAB, ModBlocks.ENDER_ALVES_PLANKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WINDY_MAPLE_PLANKS_SLAB, ModBlocks.WINDY_MAPLE_PLANKS);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDSTONE_WALL, Blocks.END_STONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ENDSTONE_DEEPER_WALL, ModBlocks.ENDSTONE_DEEPER);

        offerPressurePlateRecipe(exporter, ModBlocks.ENDSTONE_PRESSURE_PLATE, Blocks.END_STONE);
        offerPressurePlateRecipe(exporter, ModBlocks.ENDSTONE_DEEPER_PRESSURE_PLATE, ModBlocks.ENDSTONE_DEEPER);
        offerPressurePlateRecipe(exporter, ModBlocks.ENDER_ALVES_PLANKS_PRESSURE_PLATE, ModBlocks.ENDER_ALVES_PLANKS);
        offerPressurePlateRecipe(exporter, ModBlocks.WINDY_MAPLE_PLANKS_PRESSURE_PLATE, ModBlocks.WINDY_MAPLE_PLANKS);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK);

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

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ENDSTONE_BRICK_PILLAR, 1)
                .pattern("RR")
                .pattern("RR")
                .input('R', Blocks.END_STONE_BRICKS)
                .criterion(hasItem(Blocks.END_STONE_BRICKS), conditionsFromItem(Blocks.END_STONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ENDSTONE_BRICK_PILLAR)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SUNSTONE_PICKAXE, 1)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', ModItems.SUNSTONE_SHARD)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SUNSTONE_SHARD), conditionsFromItem(ModItems.SUNSTONE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SUNSTONE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SUNSTONE_AXE, 1)
                .pattern("RR")
                .pattern("SR")
                .pattern("S ")
                .input('S', Items.STICK)
                .input('R', ModItems.SUNSTONE_SHARD)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SUNSTONE_SHARD), conditionsFromItem(ModItems.SUNSTONE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SUNSTONE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SUNSTONE_SHOVEL, 1)
                .pattern("R")
                .pattern("S")
                .pattern("S")
                .input('S', Items.STICK)
                .input('R', ModItems.SUNSTONE_SHARD)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SUNSTONE_SHARD), conditionsFromItem(ModItems.SUNSTONE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SUNSTONE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SUNSTONE_SWORD, 1)
                .pattern("R")
                .pattern("R")
                .pattern("S")
                .input('S', Items.STICK)
                .input('R', ModItems.SUNSTONE_SHARD)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SUNSTONE_SHARD), conditionsFromItem(ModItems.SUNSTONE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SUNSTONE_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SUNSTONE_HOE, 1)
                .pattern("RR")
                .pattern("S ")
                .pattern("S ")
                .input('S', Items.STICK)
                .input('R', ModItems.SUNSTONE_SHARD)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SUNSTONE_SHARD), conditionsFromItem(ModItems.SUNSTONE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SUNSTONE_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDSTONE_PICKAXE, 1)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', Items.END_STONE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.END_STONE), conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDSTONE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDSTONE_AXE, 1)
                .pattern("RR")
                .pattern("SR")
                .pattern("S ")
                .input('S', Items.STICK)
                .input('R', Items.END_STONE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.END_STONE), conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDSTONE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDSTONE_SHOVEL, 1)
                .pattern("R")
                .pattern("S")
                .pattern("S")
                .input('S', Items.STICK)
                .input('R', Items.END_STONE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.END_STONE), conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDSTONE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDSTONE_SWORD, 1)
                .pattern("R")
                .pattern("R")
                .pattern("S")
                .input('S', Items.STICK)
                .input('R', Items.END_STONE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.END_STONE), conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDSTONE_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDSTONE_HOE, 1)
                .pattern("RR")
                .pattern("S ")
                .pattern("S ")
                .input('S', Items.STICK)
                .input('R', Items.END_STONE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.END_STONE), conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ENDSTONE_HOE)));



    }
}
