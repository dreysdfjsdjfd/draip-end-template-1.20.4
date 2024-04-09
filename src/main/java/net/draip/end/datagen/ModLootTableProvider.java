package net.draip.end.datagen;

import net.draip.end.block.ModBlocks;
import net.draip.end.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.SnowBlock;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.augrite_BLOCK);

        addDrop(ModBlocks.ENDSTONE_STAIRS);
        addDrop(ModBlocks.ENDSTONE_WALL);
        addDrop(ModBlocks.ENDSTONE_BUTTON);
        addDrop(ModBlocks.ENDSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.ENDSTONE_BRICK_PILLAR);
        addDrop(ModBlocks.PURPUR_WALL);

        addDrop(ModBlocks.ENDSTONE_DEEPER);
        addDrop(ModBlocks.ENDSTONE_DEEPER_STAIRS);
        addDrop(ModBlocks.ENDSTONE_DEEPER_BUTTON);
        addDrop(ModBlocks.ENDSTONE_DEEPER_PRESSURE_PLATE);
        addDrop(ModBlocks.ENDSTONE_DEEPER_WALL);
        addDrop(ModBlocks.ENDSTONE_WARM);

        addDrop(ModBlocks.MINTY_ENDSTONE);
        addDrop(ModBlocks.MINTY_ENDSTONE_STAIRS);
        addDrop(ModBlocks.MINTY_ENDSTONE_WALL);
        addDrop(ModBlocks.MINTY_ENDSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.MINTY_ENDSTONE_BUTTON);
        addDrop(ModBlocks.MINTY_ENDSTONE_SLAB, slabDrops(ModBlocks.MINTY_ENDSTONE_SLAB));



        addDrop(ModBlocks.WITHERED_AND_MINTY_ENDSTONE);
        addDrop(ModBlocks.WITHERED_ENDSTONE_STAIRS);
        addDrop(ModBlocks.WITHERED_ENDSTONE_WALL);
        addDrop(ModBlocks.WITHERED_ENDSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.WITHERED_ENDSTONE_BUTTON);
        addDrop(ModBlocks.WITHERED_ENDSTONE_SLAB, slabDrops(ModBlocks.WITHERED_ENDSTONE_SLAB));


        addDrop(ModBlocks.WITHERED_ENDSTONE);
        addDrop(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_STAIRS);
        addDrop(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_WALL);
        addDrop(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_PRESSURE_PLATE);
        addDrop(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_BUTTON);
        addDrop(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_SLAB, slabDrops(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_SLAB));

        addDrop(ModBlocks.BLUE_CRYSTAL);
        addDrop(ModBlocks.BLUE_CRYSTAL_TRANS);
        addDrop(ModBlocks.BLUE_CRYSTAL_TRANS_PANE);
        addDrop(ModBlocks.PURPLE_CRYSTAL);
        addDrop(ModBlocks.PURPLE_CRYSTAL_TRANS);
        addDrop(ModBlocks.PURPLE_CRYSTAL_TRANS_PANE);

        addDrop(ModBlocks.COBBLED_SCYENSITH);
        addDrop(ModBlocks.COBBLED_SCYENSITH_STAIRS);
        addDrop(ModBlocks.COBBLED_SCYENSITH_SLAB, slabDrops(ModBlocks.COBBLED_SCYENSITH_SLAB));



        addDrop(ModBlocks.POLISHED_SCYENSITH);
        addDrop(ModBlocks.POLISHED_SCYENSITH_STAIRS);
        addDrop(ModBlocks.POLISHED_SCYENSITH_SLAB, slabDrops(ModBlocks.POLISHED_SCYENSITH_SLAB));

        addDrop(ModBlocks.CHAINED_STEEL);
        addDrop(ModBlocks.CHAINED_STEEL_STAIRS);
        addDrop(ModBlocks.CHAINED_STEEL_SLAB, slabDrops(ModBlocks.CHAINED_STEEL_SLAB));


        addDrop(ModBlocks.GRUELING_FLOWER);
        addDrop(ModBlocks.PLENTIFUL_MOSS_BLOCK);
        addDrop(ModBlocks.SCYENSITH_PILLAR);
        addDrop(ModBlocks.PLENTIFUL_GRASS_BLOCK);
        addDrop(ModBlocks.PLENTIFUL_GRASS_SHORT);
        addDrop(ModBlocks.PRISTINE_PINK_FLOWERS);
        addPottedPlantDrops(ModBlocks.POTTED_GRUELING_FLOWER);

        addDrop(ModBlocks.GLINTING_PURPLE_GRASS, tallPlantDrops(ModBlocks.GLINTING_PURPLE_GRASS, ModBlocks.GLINTING_PURPLE_GRASS));
        addDrop(ModBlocks.BUTTER_NUT_WEEDS, tallPlantDrops(ModBlocks.BUTTER_NUT_WEEDS, ModBlocks.BUTTER_NUT_WEEDS));


        addDrop(ModBlocks.DESTINATIONAL_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_DESTINATIONAL_FLOWER);
        addDrop(ModBlocks.ENDSTONE_TULIP);
        addPottedPlantDrops(ModBlocks.POTTED_ENDSTONE_TULIP);
        addDrop(ModBlocks.STAINED_POPPY);
        addPottedPlantDrops(ModBlocks.POTTED_STAINED_POPPY);
        addDrop(ModBlocks.LILY_OF_THE_END);
        addPottedPlantDrops(ModBlocks.POTTED_LILY_OF_THE_END);
        addDrop(ModBlocks.ENDER_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_ENDER_FLOWER);
        addVinePlantDrop(ModBlocks.ENDER_VINES, ModBlocks.ENDER_VINES);
        flowerbedDrops(ModBlocks.ENDER_PETALS);
        addDrop(ModBlocks.ENDER_GRASS_SHORT);
        addDrop(ModBlocks.ENDER_GRASS_LONG, tallPlantDrops(ModBlocks.ENDER_GRASS_LONG, ModBlocks.ENDER_GRASS_LONG));
        addDrop(ModBlocks.ENDSTONE_GRASS_SLABMAIN);
        addDrop(ModBlocks.ENDSTONE_GRASS);

        addDrop(ModBlocks.PURE_STEEL_STAIRS);

        addDrop(ModBlocks.SMOOTH_TUNGSTEN_STAIRS);
        addDrop(ModBlocks.SMOOTH_TUNGSTEN);
        addDrop(ModBlocks.GILDED_MAZE_STONE);
        addDrop(ModBlocks.FIZZY_MAZE_STONE);


        addDrop(ModBlocks.MAZE_STONE);
        addDrop(ModBlocks.MAZE_STONE_STAIRS);
        addDrop(ModBlocks.MAZE_STONE_SLAB);
        addDrop(ModBlocks.CIRCULAR_MAZE_STONE);
        addDrop(ModBlocks.RECTANGULAR_MAZE_STONE);
        addDrop(ModBlocks.MAZE_STONE_PILLAR);
        addDrop(ModBlocks.DESTINATIONAL_MAZE_STONE_PILLAR);


        addDrop(ModBlocks.ENDSTONE_GRASS_FULL);
        addDrop(ModBlocks.ENDSTONE_GRASS_FULL_SLAB, slabDrops(ModBlocks.ENDSTONE_GRASS_FULL_SLAB));
        addDrop(ModBlocks.SMOOTH_TUNGSTEN_SLAB, slabDrops(ModBlocks.SMOOTH_TUNGSTEN_SLAB));
        addDrop(ModBlocks.GILDED_ENDSTONE_GRASS_SLABMAIN);
        addDrop(ModBlocks.GILDED_ENDSTONE_GRASS);
        addDrop(ModBlocks.GILDED_ENDSTONE_GRASS_FULL);
        addDrop(ModBlocks.GILDED_ENDSTONE_GRASS_FULL_SLAB, slabDrops(ModBlocks.ENDSTONE_GRASS_FULL_SLAB));
        addDrop(ModBlocks.ENDSTONE_GRASS_SLABMAIN_SLAB, slabDrops(ModBlocks.ENDSTONE_GRASS_SLABMAIN_SLAB));
        addDrop(ModBlocks.GILDED_ENDSTONE_GRASS_SLABMAIN_SLAB, slabDrops(ModBlocks.GILDED_ENDSTONE_GRASS_SLABMAIN_SLAB));


        addDrop(ModBlocks.PURE_STEEL_SLAB, slabDrops(ModBlocks.PURE_STEEL_SLAB));

        addDrop(ModBlocks.DESTINATIONAL_FLOWER_BLUE);
        addDrop(ModBlocks.PLENTIFUL_GRASS_STEM);
        addPottedPlantDrops(ModBlocks.POTTED_DESTINATIONAL_FLOWER_BLUE);
        addDrop(ModBlocks.ENDSTONE_TULIP_BLUE);
        addPottedPlantDrops(ModBlocks.POTTED_ENDSTONE_TULIP_BLUE);
        addDrop(ModBlocks.STAINED_POPPY_BLUE);
        addPottedPlantDrops(ModBlocks.POTTED_STAINED_POPPY_BLUE);
        addDrop(ModBlocks.LILY_OF_THE_END_BLUE);
        addPottedPlantDrops(ModBlocks.POTTED_LILY_OF_THE_END_BLUE);
        addDrop(ModBlocks.ENDER_FLOWER_BLUE);
        addPottedPlantDrops(ModBlocks.POTTED_ENDER_FLOWER_BLUE);
        addVinePlantDrop(ModBlocks.ENDER_VINES, ModBlocks.ENDER_VINES_BLUE);
        flowerbedDrops(ModBlocks.ENDER_PETALS_BLUE);
        addDrop(ModBlocks.ENDER_GRASS_SHORT_BLUE);
        addDrop(ModBlocks.ENDER_GRASS_LONG, tallPlantDrops(ModBlocks.ENDER_GRASS_LONG, ModBlocks.ENDER_GRASS_LONG_BLUE));
        addDrop(ModBlocks.ENDSTONE_GRASS_SLABMAIN_BLUE);
        addDrop(ModBlocks.ENDSTONE_GRASS_BLUE);
        addDrop(ModBlocks.ENDSTONE_GRASS_FULL_BLUE);
        addDrop(ModBlocks.ENDSTONE_GRASS_FULL_SLAB, slabDrops(ModBlocks.ENDSTONE_GRASS_FULL_SLAB_BLUE));
        addDrop(ModBlocks.GILDED_ENDSTONE_GRASS_FULL_BLUE);
        addDrop(ModBlocks.GILDED_ENDSTONE_GRASS_FULL_SLAB, slabDrops(ModBlocks.ENDSTONE_GRASS_FULL_SLAB_BLUE));
        addDrop(ModBlocks.ENDSTONE_GRASS_SLABMAIN_SLAB, slabDrops(ModBlocks.ENDSTONE_GRASS_SLABMAIN_SLAB_BLUE));



        addDrop(ModBlocks.MINTY_TALL_FLOWERS, tallPlantDrops(ModBlocks.MINTY_TALL_FLOWERS, ModBlocks.MINTY_TALL_FLOWERS));
        addDrop(ModBlocks.MINTY_ROSES);
        addDrop(ModBlocks.MINTY_SHORT_GRASS);
        addDrop(ModBlocks.REINFORCED_TUNGSTEN_PLATFORM);
        addDrop(ModBlocks.PURE_STEEL);




        addDrop(ModBlocks.ENDSTONE_DECAYING);
        addDrop(ModBlocks.GRAINY_ENDSTONE);
        addDrop(ModBlocks.PLENTIFUL_GRASS_FLOWER);
        addDrop(ModBlocks.PLENTIFUL_MOSS_PILE);
        addDrop(ModBlocks.MINTY_ENDSTONE_PILE);





        addDrop(ModBlocks.MINTY_ENDSTONE_PILE);


        addDrop(ModBlocks.ENDER_ALVES_WOOD);
        addDrop(ModBlocks.ENDER_ALVES_LOG);
        addDrop(ModBlocks.STRIPPED_ENDER_ALVES_WOOD);
        addDrop(ModBlocks.STRIPPED_ENDER_ALVES_LOG);

        addDrop(ModBlocks.ENDER_ALVES_PLANKS);
        addDrop(ModBlocks.ENDER_ALVES_PLANKS_STAIRS);
        addDrop(ModBlocks.ENDER_ALVES_PLANKS_FENCE);
        addDrop(ModBlocks.ENDER_ALVES_PLANKS_FENCE_GATE);
        addDrop(ModBlocks.ENDER_ALVES_PLANKS_PRESSURE_PLATE);
        addDrop(ModBlocks.ENDER_ALVES_PLANKS_BUTTON);
        addDrop(ModBlocks.ENDER_ALVES_PLANKS_SLAB, slabDrops(ModBlocks.ENDER_ALVES_PLANKS_SLAB));

        addDrop(ModBlocks.ENDER_ALVES_LEAVES, leavesDrops(ModBlocks.ENDER_ALVES_LEAVES, ModBlocks.ENDER_ALVES_LEAVES, 0.005f));
        addDrop(ModBlocks.GILDED_ENDER_ALVES_LEAVES, leavesDrops(ModBlocks.GILDED_ENDER_ALVES_LEAVES, ModBlocks.GILDED_ENDER_ALVES_LEAVES, 0.005f));


        addDrop(ModBlocks.TERMINAL_PINE_WOOD);
        addDrop(ModBlocks.TERMINAL_PINE_LOG);
        addDrop(ModBlocks.STRIPPED_TERMINAL_PINE_WOOD);
        addDrop(ModBlocks.STRIPPED_TERMINAL_PINE_LOG);

        addDrop(ModBlocks.TERMINAL_PINE_PLANKS);
        addDrop(ModBlocks.TERMINAL_PINE_PLANKS_STAIRS);
        addDrop(ModBlocks.TERMINAL_PINE_PLANKS_FENCE);
        addDrop(ModBlocks.TERMINAL_PINE_PLANKS_FENCE_GATE);
        addDrop(ModBlocks.TERMINAL_PINE_PLANKS_PRESSURE_PLATE);
        addDrop(ModBlocks.TERMINAL_PINE_PLANKS_BUTTON);
        addDrop(ModBlocks.TERMINAL_PINE_PLANKS_SLAB, slabDrops(ModBlocks.TERMINAL_PINE_PLANKS_SLAB));

        addDrop(ModBlocks.TERMINAL_PINE_LEAVES, leavesDrops(ModBlocks.TERMINAL_PINE_LEAVES, ModBlocks.TERMINAL_PINE_LEAVES, 0.005f));
        addDrop(ModBlocks.GILDED_TERMINAL_PINE_LEAVES, leavesDrops(ModBlocks.GILDED_TERMINAL_PINE_LEAVES, ModBlocks.GILDED_TERMINAL_PINE_LEAVES, 0.005f));



        addDrop(ModBlocks.BUTTER_NUT_WOOD);
        addDrop(ModBlocks.BUTTER_NUT_LOG);
        addDrop(ModBlocks.STRIPPED_BUTTER_NUT_WOOD);
        addDrop(ModBlocks.STRIPPED_BUTTER_NUT_LOG);

        addDrop(ModBlocks.BUTTER_NUT_PLANKS);
        addDrop(ModBlocks.BUTTER_NUT_PLANKS_STAIRS);
        addDrop(ModBlocks.BUTTER_NUT_PLANKS_FENCE);
        addDrop(ModBlocks.BUTTER_NUT_PLANKS_FENCE_GATE);
        addDrop(ModBlocks.BUTTER_NUT_PLANKS_PRESSURE_PLATE);
        addDrop(ModBlocks.BUTTER_NUT_PLANKS_BUTTON);
        addDrop(ModBlocks.BUTTER_NUT_PLANKS_SLAB, slabDrops(ModBlocks.BUTTER_NUT_PLANKS_SLAB));

        addDrop(ModBlocks.BUTTER_NUT_LEAVES, leavesDrops(ModBlocks.BUTTER_NUT_LEAVES, ModBlocks.BUTTER_NUT_LEAVES, 0.005f));
        addDrop(ModBlocks.GILDED_BUTTER_NUT_LEAVES, leavesDrops(ModBlocks.GILDED_BUTTER_NUT_LEAVES, ModBlocks.GILDED_BUTTER_NUT_LEAVES, 0.005f));




        addDrop(ModBlocks.WINDY_MAPLE_WOOD);
        addDrop(ModBlocks.WINDY_MAPLE_LOG);
        addDrop(ModBlocks.STRIPPED_WINDY_MAPLE_WOOD);
        addDrop(ModBlocks.STRIPPED_WINDY_MAPLE_LOG);



        addDrop(ModBlocks.WINDY_MAPLE_PLANKS);
        addDrop(ModBlocks.WINDY_MAPLE_PLANKS_STAIRS);
        addDrop(ModBlocks.WINDY_MAPLE_PLANKS_FENCE);
        addDrop(ModBlocks.WINDY_MAPLE_PLANKS_FENCE_GATE);
        addDrop(ModBlocks.WINDY_MAPLE_PLANKS_PRESSURE_PLATE);
        addDrop(ModBlocks.WINDY_MAPLE_PLANKS_BUTTON);
        addDrop(ModBlocks.WINDY_MAPLE_PLANKS_SLAB, slabDrops(ModBlocks.WINDY_MAPLE_PLANKS_SLAB));

        addDrop(ModBlocks.WINDY_MAPLE_LEAVES, leavesDrops(ModBlocks.WINDY_MAPLE_LEAVES, ModBlocks.WINDY_MAPLE_LEAVES, 0.005f));
        addDrop(ModBlocks.GILDED_WINDY_MAPLE_LEAVES, leavesDrops(ModBlocks.GILDED_WINDY_MAPLE_LEAVES, ModBlocks.GILDED_WINDY_MAPLE_LEAVES, 0.005f));

        addDrop(ModBlocks.DEEPER_END_STONE_BRICKS);
        addDrop(ModBlocks.DEEPER_END_STONE_BRICKS_STAIRS);
        addDrop(ModBlocks.DEEPER_END_STONE_BRICKS_BUTTON);
        addDrop(ModBlocks.DEEPER_END_STONE_BRICKS_PRESSURE_PLATE);
        addDrop(ModBlocks.DEEPER_END_STONE_BRICKS_WALL);

        addDrop(ModBlocks.DEEPER_END_STONE_BRICKS_SLAB, slabDrops(ModBlocks.DEEPER_END_STONE_BRICKS_SLAB));
        addDrop(ModBlocks.GILDED_PURPUR_BLOCK);
        addDrop(ModBlocks.PURPUR_STONE);
        addDrop(ModBlocks.GILDED_PURPUR_STONE);


        addDrop(ModBlocks.ENDER_ALVES_PLANKS_STAIRS);
        addDrop(ModBlocks.ENDER_ALVES_PLANKS_FENCE);
        addDrop(ModBlocks.ENDER_ALVES_PLANKS_FENCE_GATE);
        addDrop(ModBlocks.ENDER_ALVES_PLANKS_PRESSURE_PLATE);
        addDrop(ModBlocks.ENDER_ALVES_PLANKS_TRAPDOOR);
        addDrop(ModBlocks.ENDER_ALVES_PLANKS_BUTTON);
        addDrop(ModBlocks.ENDER_ALVES_PLANKS_SLAB, slabDrops(ModBlocks.ENDER_ALVES_PLANKS_SLAB));

        addDrop(ModBlocks.DEEPER_ENDSTONE_BRICK_PILLAR);
        addDrop(ModBlocks.ENDER_ALVES_PLANKS_LADDER);


        addDrop(ModBlocks.ENDSTONE_SLAB, slabDrops(ModBlocks.ENDSTONE_SLAB));
        addDrop(ModBlocks.ENDSTONE_DEEPER_SLAB, slabDrops(ModBlocks.ENDSTONE_DEEPER_SLAB));


        addDrop(ModBlocks.augrite_ORE_ENDSTONE);
        addDrop(ModBlocks.augrite_ORE_DEEPER_ENDSTONE);


        addDrop(ModBlocks.auravine_ORE, copperLikeOreDrops(ModBlocks.auravine_ORE, ModItems.auravine_SHARD));
        addDrop(ModBlocks.auravine_ORE_DEEPER, copperLikeOreDrops(ModBlocks.auravine_ORE_DEEPER, ModItems.auravine_SHARD));

    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder) this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(1.0f, 2.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
