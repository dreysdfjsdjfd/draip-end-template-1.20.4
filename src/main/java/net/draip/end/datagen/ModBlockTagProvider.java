package net.draip.end.datagen;

import net.draip.end.block.ModBlocks;
import net.draip.end.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class  ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.ENDSTONE_BLOCKS)
                .add(ModBlocks.augrite_ORE_ENDSTONE)
                .add(ModBlocks.augrite_ORE_DEEPER_ENDSTONE)
                .add(ModBlocks.ENDSTONE_DEEPER)
                .add(Blocks.END_STONE)
                .add(ModBlocks.ENDSTONE_DECAYING)
                .add(ModBlocks.ENDSTONE_DEEPER)
                .add(ModBlocks.ENDSTONE_WARM)
                .add(ModBlocks.ENDSTONE_GRASS)
                .add(ModBlocks.ENDSTONE_GRASS_FULL)
                .add(ModBlocks.GILDED_ENDSTONE_GRASS)
                .add(ModBlocks.GILDED_ENDSTONE_GRASS_FULL)
                .add(ModBlocks.GRAINY_ENDSTONE)

                .add(ModBlocks.ENDSTONE_GRASS_BLUE)
                .add(ModBlocks.ENDSTONE_GRASS_FULL_BLUE)
                .add(ModBlocks.GILDED_ENDSTONE_GRASS_FULL_BLUE)


                .add(ModBlocks.PLENTIFUL_GRASS_BLOCK)
                .add(ModBlocks.PLENTIFUL_MOSS_BLOCK)

                .add(ModBlocks.DEEPER_END_STONE_BRICKS)
                .add(ModBlocks.DEEPER_ENDSTONE_BRICK_PILLAR)

                .add(ModBlocks.MINTY_ENDSTONE)
                .add(ModBlocks.MINTY_ENDSTONE_STAIRS)
                .add(ModBlocks.MINTY_ENDSTONE_SLAB)
                .add(ModBlocks.MINTY_ENDSTONE_PRESSURE_PLATE)
                .add(ModBlocks.MINTY_ENDSTONE_BUTTON)
                .add(ModBlocks.MINTY_ENDSTONE_WALL)



                .add(ModBlocks.WITHERED_ENDSTONE)
                .add(ModBlocks.WITHERED_ENDSTONE_STAIRS)
                .add(ModBlocks.WITHERED_ENDSTONE_SLAB)
                .add(ModBlocks.WITHERED_ENDSTONE_PRESSURE_PLATE)
                .add(ModBlocks.WITHERED_ENDSTONE_BUTTON)
                .add(ModBlocks.WITHERED_ENDSTONE_WALL)


                .add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE)
                .add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_STAIRS)
                .add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_SLAB)
                .add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_PRESSURE_PLATE)
                .add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_BUTTON)
                .add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_WALL)

                .add(ModBlocks.auravine_ORE)
                .add(ModBlocks.auravine_ORE_DEEPER)
                ;

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.augrite_BLOCK)
                .add(ModBlocks.augrite_ORE_ENDSTONE)
                .add(ModBlocks.augrite_ORE_DEEPER_ENDSTONE)
                .add(ModBlocks.ENDSTONE_DEEPER)

                .add(ModBlocks.GILDED_PURPUR_BLOCK)
                .add(ModBlocks.PURPUR_STONE)
                .add(ModBlocks.ENDSTONE_WARM)


                .add(ModBlocks.SMOOTH_TUNGSTEN)
                .add(ModBlocks.SMOOTH_TUNGSTEN_SLAB)
                .add(ModBlocks.SMOOTH_TUNGSTEN_STAIRS)


                .add(ModBlocks.PURE_STEEL)
                .add(ModBlocks.PURE_STEEL_SLAB)
                .add(ModBlocks.PURE_STEEL_STAIRS)

                .add(ModBlocks.REINFORCED_TUNGSTEN_PLATFORM)


                .add(ModBlocks.MINTY_ENDSTONE)
                .add(ModBlocks.MINTY_ENDSTONE_STAIRS)
                .add(ModBlocks.MINTY_ENDSTONE_SLAB)
                .add(ModBlocks.MINTY_ENDSTONE_PRESSURE_PLATE)
                .add(ModBlocks.MINTY_ENDSTONE_BUTTON)
                .add(ModBlocks.MINTY_ENDSTONE_WALL)



                .add(ModBlocks.WITHERED_ENDSTONE)
                .add(ModBlocks.WITHERED_ENDSTONE_STAIRS)
                .add(ModBlocks.WITHERED_ENDSTONE_SLAB)
                .add(ModBlocks.WITHERED_ENDSTONE_PRESSURE_PLATE)
                .add(ModBlocks.WITHERED_ENDSTONE_BUTTON)
                .add(ModBlocks.WITHERED_ENDSTONE_WALL)


                .add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE)
                .add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_STAIRS)
                .add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_SLAB)
                .add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_PRESSURE_PLATE)
                .add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_BUTTON)
                .add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_WALL)


                .add(ModBlocks.COBBLED_SCYENSITH)
                .add(ModBlocks.COBBLED_SCYENSITH_SLAB)
                .add(ModBlocks.COBBLED_SCYENSITH_STAIRS)

                .add(ModBlocks.POLISHED_SCYENSITH)
                .add(ModBlocks.POLISHED_SCYENSITH_SLAB)
                .add(ModBlocks.POLISHED_SCYENSITH_STAIRS)

                .add(ModBlocks.CHAINED_STEEL)
                .add(ModBlocks.CHAINED_STEEL_SLAB)
                .add(ModBlocks.CHAINED_STEEL_STAIRS)


                .add(ModBlocks.ENDSTONE_BUTTON)
                .add(ModBlocks.ENDSTONE_PRESSURE_PLATE)
                .add(ModBlocks.ENDSTONE_STAIRS)
                .add(ModBlocks.ENDSTONE_SLAB)
                .add(ModBlocks.ENDSTONE_BRICK_PILLAR)
                .add(ModBlocks.PURPUR_WALL)

                .add(ModBlocks.auravine_ORE)
                .add(ModBlocks.auravine_ORE_DEEPER)
                .add(ModBlocks.GILDED_PURPUR_STONE)



                .add(ModBlocks.ENDSTONE_DEEPER_BUTTON)
                .add(ModBlocks.ENDSTONE_DEEPER_PRESSURE_PLATE)
                .add(ModBlocks.ENDSTONE_DEEPER_STAIRS)
                .add(ModBlocks.ENDSTONE_DEEPER_SLAB)
                .add(ModBlocks.ENDSTONE_DEEPER_WALL)

                .add(ModBlocks.ENDSTONE_DECAYING)

                .add(ModBlocks.ENDSTONE_GRASS)
                .add(ModBlocks.ENDSTONE_GRASS_FULL)
                .add(ModBlocks.ENDSTONE_GRASS_FULL_SLAB)

                .add(ModBlocks.ENDSTONE_GRASS_SLABMAIN)
                .add(ModBlocks.ENDSTONE_GRASS_SLABMAIN_SLAB)

                .add(ModBlocks.GILDED_ENDSTONE_GRASS)
                .add(ModBlocks.GILDED_ENDSTONE_GRASS_FULL)
                .add(ModBlocks.GILDED_ENDSTONE_GRASS_FULL_SLAB)

                .add(ModBlocks.GILDED_ENDSTONE_GRASS_SLABMAIN)
                .add(ModBlocks.GILDED_ENDSTONE_GRASS_SLABMAIN_SLAB)

                .add(ModBlocks.ENDSTONE_GRASS_BLUE)
                .add(ModBlocks.ENDSTONE_GRASS_FULL_BLUE)
                .add(ModBlocks.ENDSTONE_GRASS_FULL_SLAB_BLUE)
                .add(ModBlocks.ENDSTONE_GRASS_SLABMAIN_BLUE)
                .add(ModBlocks.ENDSTONE_GRASS_SLABMAIN_SLAB_BLUE)
                .add(ModBlocks.GILDED_ENDSTONE_GRASS_FULL_BLUE)
                .add(ModBlocks.GILDED_ENDSTONE_GRASS_FULL_SLAB_BLUE)

                .add(ModBlocks.DEEPER_END_STONE_BRICKS)
                .add(ModBlocks.DEEPER_ENDSTONE_BRICK_PILLAR)
                .add(ModBlocks.DEEPER_END_STONE_BRICKS_PRESSURE_PLATE)
                .add(ModBlocks.DEEPER_END_STONE_BRICKS_WALL)
                .add(ModBlocks.DEEPER_END_STONE_BRICKS_BUTTON)
                .add(ModBlocks.DEEPER_END_STONE_BRICKS_SLAB)
                .add(ModBlocks.DEEPER_END_STONE_BRICKS_STAIRS)

                .add(ModBlocks.BLUE_CRYSTAL)
                .add(ModBlocks.BLUE_CRYSTAL_TRANS)
                .add(ModBlocks.PURPLE_CRYSTAL)
                .add(ModBlocks.PURPLE_CRYSTAL_TRANS)

                .add(ModBlocks.PLENTIFUL_MOSS_BLOCK)
                .add(ModBlocks.PLENTIFUL_GRASS_BLOCK)
                .add(ModBlocks.PLENTIFUL_GRASS_SHORT)
                .add(ModBlocks.PRISTINE_PINK_FLOWERS)
                .add(ModBlocks.SCYENSITH_PILLAR)


                .add(ModBlocks.MAZE_STONE)
                .add(ModBlocks.MAZE_STONE_SLAB)
                .add(ModBlocks.MAZE_STONE_STAIRS)
                .add(ModBlocks.CIRCULAR_MAZE_STONE)
                .add(ModBlocks.RECTANGULAR_MAZE_STONE)
                .add(ModBlocks.MAZE_STONE_PILLAR)
                .add(ModBlocks.DESTINATIONAL_MAZE_STONE_PILLAR)





        ;

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.ENDER_ALVES_LOG)
                .add(ModBlocks.ENDER_ALVES_WOOD)
                .add(ModBlocks.STRIPPED_ENDER_ALVES_LOG)
                .add(ModBlocks.STRIPPED_ENDER_ALVES_WOOD)

                .add(ModBlocks.WINDY_MAPLE_LOG)
                .add(ModBlocks.WINDY_MAPLE_WOOD)
                .add(ModBlocks.STRIPPED_WINDY_MAPLE_LOG)
                .add(ModBlocks.STRIPPED_WINDY_MAPLE_WOOD)

                .add(ModBlocks.BUTTER_NUT_LOG)
                .add(ModBlocks.BUTTER_NUT_WOOD)
                .add(ModBlocks.STRIPPED_BUTTER_NUT_LOG)
                .add(ModBlocks.STRIPPED_BUTTER_NUT_WOOD)
        ;

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.ENDER_ALVES_PLANKS)
                .add(ModBlocks.ENDER_ALVES_PLANKS_PRESSURE_PLATE)
                .add(ModBlocks.ENDER_ALVES_PLANKS_STAIRS)
                .add(ModBlocks.ENDER_ALVES_PLANKS_SLAB)
                .add(ModBlocks.ENDER_ALVES_PLANKS_BUTTON)
                .add(ModBlocks.ENDER_ALVES_PLANKS_FENCE_GATE)
                .add(ModBlocks.ENDER_ALVES_PLANKS_FENCE)

                .add(ModBlocks.WINDY_MAPLE_PLANKS)
                .add(ModBlocks.WINDY_MAPLE_PLANKS_PRESSURE_PLATE)
                .add(ModBlocks.WINDY_MAPLE_PLANKS_STAIRS)
                .add(ModBlocks.WINDY_MAPLE_PLANKS_SLAB)
                .add(ModBlocks.WINDY_MAPLE_PLANKS_BUTTON)
                .add(ModBlocks.WINDY_MAPLE_PLANKS_FENCE_GATE)
                .add(ModBlocks.WINDY_MAPLE_PLANKS_FENCE)

                .add(ModBlocks.BUTTER_NUT_PLANKS)
                .add(ModBlocks.BUTTER_NUT_PLANKS_PRESSURE_PLATE)
                .add(ModBlocks.BUTTER_NUT_PLANKS_STAIRS)
                .add(ModBlocks.BUTTER_NUT_PLANKS_SLAB)
                .add(ModBlocks.BUTTER_NUT_PLANKS_BUTTON)
                .add(ModBlocks.BUTTER_NUT_PLANKS_FENCE_GATE)
                .add(ModBlocks.BUTTER_NUT_PLANKS_FENCE)


                .add(ModBlocks.TERMINAL_PINE_PLANKS)
                .add(ModBlocks.TERMINAL_PINE_PLANKS_PRESSURE_PLATE)
                .add(ModBlocks.TERMINAL_PINE_PLANKS_STAIRS)
                .add(ModBlocks.TERMINAL_PINE_PLANKS_SLAB)
                .add(ModBlocks.TERMINAL_PINE_PLANKS_BUTTON)
                .add(ModBlocks.TERMINAL_PINE_PLANKS_FENCE_GATE)
                .add(ModBlocks.TERMINAL_PINE_PLANKS_FENCE)

                .add(ModBlocks.ENDER_ALVES_PLANKS_LADDER)
                .add(ModBlocks.ENDER_ALVES_PLANKS_TRAPDOOR)

        ;

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.GRAINY_ENDSTONE)
                .add(ModBlocks.PLENTIFUL_MOSS_PILE)
                .add(ModBlocks.MINTY_ENDSTONE_PILE)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.augrite_BLOCK)
                .add(ModBlocks.augrite_ORE_DEEPER_ENDSTONE)
                .add(ModBlocks.augrite_ORE_ENDSTONE)

                .add(ModBlocks.SMOOTH_TUNGSTEN)
                .add(ModBlocks.SMOOTH_TUNGSTEN_SLAB)
                .add(ModBlocks.SMOOTH_TUNGSTEN_STAIRS)

                .add(ModBlocks.MAZE_STONE_SLAB)
                .add(ModBlocks.MAZE_STONE_STAIRS)

                .add(ModBlocks.MAZE_STONE)
                .add(ModBlocks.FIZZY_MAZE_STONE)
                .add(ModBlocks.GILDED_MAZE_STONE)
                .add(ModBlocks.CIRCULAR_MAZE_STONE)
                .add(ModBlocks.RECTANGULAR_MAZE_STONE)
                .add(ModBlocks.MAZE_STONE_PILLAR)
                .add(ModBlocks.DESTINATIONAL_MAZE_STONE_PILLAR)

                .add(ModBlocks.ENDSTONE_BUTTON)
                .add(ModBlocks.ENDSTONE_PRESSURE_PLATE)
                .add(ModBlocks.ENDSTONE_STAIRS)
                .add(ModBlocks.ENDSTONE_SLAB)
                .add(ModBlocks.ENDSTONE_BRICK_PILLAR)
                .add(ModBlocks.PURPUR_WALL)
                .add(ModBlocks.PURPUR_STONE)
                .add(ModBlocks.GILDED_PURPUR_STONE)


                .add(ModBlocks.PURE_STEEL)
                .add(ModBlocks.PURE_STEEL_SLAB)
                .add(ModBlocks.PURE_STEEL_STAIRS)



                .add(ModBlocks.REINFORCED_TUNGSTEN_PLATFORM)

                .add(ModBlocks.PLENTIFUL_GRASS_BLOCK)


                .add(ModBlocks.CHAINED_STEEL)
                .add(ModBlocks.CHAINED_STEEL_SLAB)
                .add(ModBlocks.CHAINED_STEEL_STAIRS)
                .add(ModBlocks.ENDSTONE_WARM)

                .add(ModBlocks.PLENTIFUL_MOSS_BLOCK)



                .add(ModBlocks.ENDSTONE_DEEPER_BUTTON)
                .add(ModBlocks.ENDSTONE_DEEPER_PRESSURE_PLATE)
                .add(ModBlocks.ENDSTONE_DEEPER_STAIRS)
                .add(ModBlocks.ENDSTONE_DEEPER_SLAB)
                .add(ModBlocks.ENDSTONE_DEEPER_WALL)

                .add(ModBlocks.ENDSTONE_DECAYING)

                .add(ModBlocks.COBBLED_SCYENSITH)
                .add(ModBlocks.COBBLED_SCYENSITH_SLAB)
                .add(ModBlocks.COBBLED_SCYENSITH_STAIRS)


                .add(ModBlocks.POLISHED_SCYENSITH)
                .add(ModBlocks.POLISHED_SCYENSITH_SLAB)
                .add(ModBlocks.POLISHED_SCYENSITH_STAIRS)


                .add(ModBlocks.ENDSTONE_GRASS)
                .add(ModBlocks.ENDSTONE_GRASS_FULL)
                .add(ModBlocks.ENDSTONE_GRASS_FULL_SLAB)
                .add(ModBlocks.ENDSTONE_GRASS_SLABMAIN)
                .add(ModBlocks.ENDSTONE_GRASS_SLABMAIN_SLAB)

                .add(ModBlocks.GILDED_ENDSTONE_GRASS)
                .add(ModBlocks.GILDED_ENDSTONE_GRASS_FULL)
                .add(ModBlocks.GILDED_ENDSTONE_GRASS_FULL_SLAB)
                .add(ModBlocks.GILDED_ENDSTONE_GRASS_SLABMAIN)
                .add(ModBlocks.GILDED_ENDSTONE_GRASS_SLABMAIN_SLAB)

                .add(ModBlocks.ENDSTONE_GRASS_BLUE)
                .add(ModBlocks.ENDSTONE_GRASS_FULL_BLUE)
                .add(ModBlocks.ENDSTONE_GRASS_FULL_SLAB_BLUE)
                .add(ModBlocks.ENDSTONE_GRASS_SLABMAIN_BLUE)
                .add(ModBlocks.ENDSTONE_GRASS_SLABMAIN_SLAB_BLUE)
                .add(ModBlocks.GILDED_ENDSTONE_GRASS_FULL_BLUE)
                .add(ModBlocks.GILDED_ENDSTONE_GRASS_FULL_SLAB_BLUE)

                .add(ModBlocks.DEEPER_END_STONE_BRICKS)
                .add(ModBlocks.DEEPER_ENDSTONE_BRICK_PILLAR)
                .add(ModBlocks.DEEPER_END_STONE_BRICKS_PRESSURE_PLATE)
                .add(ModBlocks.DEEPER_END_STONE_BRICKS_WALL)
                .add(ModBlocks.DEEPER_END_STONE_BRICKS_BUTTON)
                .add(ModBlocks.DEEPER_END_STONE_BRICKS_SLAB)
                .add(ModBlocks.DEEPER_END_STONE_BRICKS_STAIRS)

                .add(ModBlocks.GILDED_PURPUR_BLOCK)



        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)

                .add(ModBlocks.auravine_ORE)
                .add(ModBlocks.auravine_ORE_DEEPER)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
        ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric","needs_tool_level_4")))
        ;

        getOrCreateTagBuilder(BlockTags.FENCES)
        ;

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.ENDSTONE_WALL)
                .add(ModBlocks.PURPUR_WALL)
                .add(ModBlocks.ENDSTONE_DEEPER_WALL)
                .add(ModBlocks.DEEPER_END_STONE_BRICKS_WALL)
                .add(ModBlocks.MINTY_ENDSTONE_WALL)
                .add(ModBlocks.WITHERED_ENDSTONE_WALL)
                .add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.ENDER_ALVES_PLANKS_FENCE)
                .add(ModBlocks.WINDY_MAPLE_PLANKS_FENCE)
                .add(ModBlocks.BUTTER_NUT_PLANKS_FENCE)
                .add(ModBlocks.TERMINAL_PINE_PLANKS_FENCE)
                ;

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.ENDER_ALVES_PLANKS_FENCE_GATE)
                .add(ModBlocks.WINDY_MAPLE_PLANKS_FENCE_GATE)
                .add(ModBlocks.BUTTER_NUT_PLANKS_FENCE_GATE)
                .add(ModBlocks.TERMINAL_PINE_PLANKS_FENCE_GATE)
        ;
    }
}
