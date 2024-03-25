package net.draip.end.datagen;

import net.draip.end.block.ModBlocks;
import net.draip.end.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.augrite_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.augrite_ORE_DEEPER_ENDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.augrite_ORE_ENDSTONE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDSTONE_DECAYING);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDSTONE_WARM);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLENTIFUL_MOSS_BLOCK);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAINY_ENDSTONE);

        BlockStateModelGenerator.BlockTexturePool gildedEndstoneGrassFullPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GILDED_ENDSTONE_GRASS_FULL);
        gildedEndstoneGrassFullPool.slab(ModBlocks.GILDED_ENDSTONE_GRASS_FULL_SLAB);
        BlockStateModelGenerator.BlockTexturePool endstoneGrassFullPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDSTONE_GRASS_FULL);
        endstoneGrassFullPool.slab(ModBlocks.ENDSTONE_GRASS_FULL_SLAB);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DESTINATIONAL_FLOWER, ModBlocks.POTTED_DESTINATIONAL_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ENDSTONE_TULIP, ModBlocks.POTTED_ENDSTONE_TULIP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.STAINED_POPPY, ModBlocks.POTTED_STAINED_POPPY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LILY_OF_THE_END, ModBlocks.POTTED_LILY_OF_THE_END, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ENDER_FLOWER, ModBlocks.POTTED_ENDER_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerbed(ModBlocks.ENDER_PETALS);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GRUELING_FLOWER, ModBlocks.POTTED_GRUELING_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);

        BlockStateModelGenerator.BlockTexturePool gildedEndstoneGrassFullBluePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GILDED_ENDSTONE_GRASS_FULL_BLUE);
        gildedEndstoneGrassFullBluePool.slab(ModBlocks.GILDED_ENDSTONE_GRASS_FULL_SLAB_BLUE);
        BlockStateModelGenerator.BlockTexturePool endstoneGrassFullBluePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDSTONE_GRASS_FULL_BLUE);
        endstoneGrassFullBluePool.slab(ModBlocks.ENDSTONE_GRASS_FULL_SLAB_BLUE);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DESTINATIONAL_FLOWER_BLUE, ModBlocks.POTTED_DESTINATIONAL_FLOWER_BLUE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ENDSTONE_TULIP_BLUE, ModBlocks.POTTED_ENDSTONE_TULIP_BLUE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.STAINED_POPPY_BLUE, ModBlocks.POTTED_STAINED_POPPY_BLUE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LILY_OF_THE_END_BLUE, ModBlocks.POTTED_LILY_OF_THE_END_BLUE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ENDER_FLOWER_BLUE, ModBlocks.POTTED_ENDER_FLOWER_BLUE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerbed(ModBlocks.ENDER_PETALS_BLUE);
//
        BlockStateModelGenerator.BlockTexturePool endstoneDeeperPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDSTONE_DEEPER);
        endstoneDeeperPool.stairs(ModBlocks.ENDSTONE_DEEPER_STAIRS);
        endstoneDeeperPool.slab(ModBlocks.ENDSTONE_DEEPER_SLAB);
        endstoneDeeperPool.button(ModBlocks.ENDSTONE_DEEPER_BUTTON);
        endstoneDeeperPool.pressurePlate(ModBlocks.ENDSTONE_DEEPER_PRESSURE_PLATE);
        endstoneDeeperPool.wall(ModBlocks.ENDSTONE_DEEPER_WALL);


        BlockStateModelGenerator.BlockTexturePool endstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.END_STONE);
        endstonePool.stairs(ModBlocks.ENDSTONE_STAIRS);
        endstonePool.slab(ModBlocks.ENDSTONE_SLAB);
        endstonePool.button(ModBlocks.ENDSTONE_BUTTON);
        endstonePool.pressurePlate(ModBlocks.ENDSTONE_PRESSURE_PLATE);
        endstonePool.wall(ModBlocks.ENDSTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool purpurPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPUR_BLOCK);
        purpurPool.wall(ModBlocks.PURPUR_WALL);


        BlockStateModelGenerator.BlockTexturePool cobbledScy = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COBBLED_SCYENSITH);
        cobbledScy.stairs(ModBlocks.COBBLED_SCYENSITH_STAIRS);
        cobbledScy.slab(ModBlocks.COBBLED_SCYENSITH_SLAB);

        BlockStateModelGenerator.BlockTexturePool polishedScy = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_SCYENSITH);
        polishedScy.stairs(ModBlocks.POLISHED_SCYENSITH_STAIRS);
        polishedScy.slab(ModBlocks.POLISHED_SCYENSITH_SLAB);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_CRYSTAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_CRYSTAL_TRANS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_CRYSTAL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_CRYSTAL_TRANS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.auravine_ORE_DEEPER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.auravine_ORE);

        blockStateModelGenerator.registerLog(ModBlocks.ENDER_ALVES_LOG).log(ModBlocks.ENDER_ALVES_LOG).wood(ModBlocks.ENDER_ALVES_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ENDER_ALVES_LOG).log(ModBlocks.STRIPPED_ENDER_ALVES_LOG).wood(ModBlocks.STRIPPED_ENDER_ALVES_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDER_ALVES_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GILDED_ENDER_ALVES_LEAVES);

        BlockStateModelGenerator.BlockTexturePool enderAlvesPlanks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDER_ALVES_PLANKS);
        enderAlvesPlanks.stairs(ModBlocks.ENDER_ALVES_PLANKS_STAIRS);
        enderAlvesPlanks.slab(ModBlocks.ENDER_ALVES_PLANKS_SLAB);
        enderAlvesPlanks.button(ModBlocks.ENDER_ALVES_PLANKS_BUTTON);
        enderAlvesPlanks.pressurePlate(ModBlocks.ENDER_ALVES_PLANKS_PRESSURE_PLATE);
        enderAlvesPlanks.fence(ModBlocks.ENDER_ALVES_PLANKS_FENCE);
        enderAlvesPlanks.fenceGate(ModBlocks.ENDER_ALVES_PLANKS_FENCE_GATE);


        blockStateModelGenerator.registerLog(ModBlocks.BUTTER_NUT_LOG).log(ModBlocks.BUTTER_NUT_LOG).wood(ModBlocks.BUTTER_NUT_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BUTTER_NUT_LOG).log(ModBlocks.STRIPPED_BUTTER_NUT_LOG).wood(ModBlocks.STRIPPED_BUTTER_NUT_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BUTTER_NUT_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GILDED_BUTTER_NUT_LEAVES);

        BlockStateModelGenerator.BlockTexturePool butterNutPlanks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BUTTER_NUT_PLANKS);
        butterNutPlanks.stairs(ModBlocks.BUTTER_NUT_PLANKS_STAIRS);
        butterNutPlanks.slab(ModBlocks.BUTTER_NUT_PLANKS_SLAB);
        butterNutPlanks.button(ModBlocks.BUTTER_NUT_PLANKS_BUTTON);
        butterNutPlanks.pressurePlate(ModBlocks.BUTTER_NUT_PLANKS_PRESSURE_PLATE);
        butterNutPlanks.fence(ModBlocks.BUTTER_NUT_PLANKS_FENCE);
        butterNutPlanks.fenceGate(ModBlocks.BUTTER_NUT_PLANKS_FENCE_GATE);








        blockStateModelGenerator.registerTrapdoor(ModBlocks.ENDER_ALVES_PLANKS_TRAPDOOR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GILDED_PURPUR_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPUR_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GILDED_PURPUR_STONE);

        blockStateModelGenerator.registerLog(ModBlocks.WINDY_MAPLE_LOG).log(ModBlocks.WINDY_MAPLE_LOG).wood(ModBlocks.WINDY_MAPLE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_WINDY_MAPLE_LOG).log(ModBlocks.STRIPPED_WINDY_MAPLE_LOG).wood(ModBlocks.STRIPPED_WINDY_MAPLE_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WINDY_MAPLE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GILDED_WINDY_MAPLE_LEAVES);

        BlockStateModelGenerator.BlockTexturePool windyMaplePlanks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WINDY_MAPLE_PLANKS);
        windyMaplePlanks.stairs(ModBlocks.WINDY_MAPLE_PLANKS_STAIRS);
        windyMaplePlanks.slab(ModBlocks.WINDY_MAPLE_PLANKS_SLAB);
        windyMaplePlanks.button(ModBlocks.WINDY_MAPLE_PLANKS_BUTTON);
        windyMaplePlanks.pressurePlate(ModBlocks.WINDY_MAPLE_PLANKS_PRESSURE_PLATE);
        windyMaplePlanks.fence(ModBlocks.WINDY_MAPLE_PLANKS_FENCE);
        windyMaplePlanks.fenceGate(ModBlocks.WINDY_MAPLE_PLANKS_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool deeperEndstoneBricks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPER_END_STONE_BRICKS);
        deeperEndstoneBricks.stairs(ModBlocks.DEEPER_END_STONE_BRICKS_STAIRS);
        deeperEndstoneBricks.slab(ModBlocks.DEEPER_END_STONE_BRICKS_SLAB);
        deeperEndstoneBricks.button(ModBlocks.DEEPER_END_STONE_BRICKS_BUTTON);
        deeperEndstoneBricks.pressurePlate(ModBlocks.DEEPER_END_STONE_BRICKS_PRESSURE_PLATE);
        deeperEndstoneBricks.wall(ModBlocks.DEEPER_END_STONE_BRICKS_WALL);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CHORUS_FRUIT_GOLDEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_BERRIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.augrite_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.augrite_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.augrite_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.augrite_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.augrite_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.augrite_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.augrite_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ENDSTONE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDSTONE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDSTONE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDSTONE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDSTONE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.auravine_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.auravine_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.auravine_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.auravine_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.auravine_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.augrite_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.augrite_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.augrite_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.augrite_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.auravine_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.auravine_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.auravine_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.auravine_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.evil_CHESTPLATE));


        itemModelGenerator.register(ModItems.auravine_SHARD, Models.GENERATED);

        itemModelGenerator.register(ModItems.ENDERSNAIL_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));


    }

}

