package net.draip.end.item;

import net.draip.end.DraipEnd;
import net.draip.end.block.ModBlocks;
import net.draip.end.enchantment.ModEnchantments;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.draip.end.DraipEnd;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CUSTOM_END_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DraipEnd.MOD_ID, "custom_end"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.custom_end"))
                    .icon(() -> new ItemStack(ModItems.augrite_DUST)).entries((displayContext, entries) -> {
                        entries.add(ModItems.augrite_DUST);
                        entries.add(ModItems.augrite_INGOT);
                        entries.add(ModItems.CHORUS_FRUIT_GOLDEN);
                        entries.add(ModBlocks.augrite_BLOCK);

                        entries.add(ModBlocks.ENDSTONE_DEEPER);

                        entries.add(ModBlocks.augrite_ORE_DEEPER_ENDSTONE);
                        entries.add(ModBlocks.augrite_ORE_ENDSTONE);

                        entries.add(ModBlocks.ENDSTONE_STAIRS);
                        entries.add(ModBlocks.ENDSTONE_SLAB);
                        entries.add(ModBlocks.ENDSTONE_BUTTON);
                        entries.add(ModBlocks.ENDSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.ENDSTONE_WALL);

                        entries.add(ModBlocks.ENDSTONE_DEEPER_STAIRS);
                        entries.add(ModBlocks.ENDSTONE_DEEPER_SLAB);
                        entries.add(ModBlocks.ENDSTONE_DEEPER_BUTTON);
                        entries.add(ModBlocks.ENDSTONE_DEEPER_PRESSURE_PLATE);
                        entries.add(ModBlocks.ENDSTONE_DEEPER_WALL);

                        entries.add(ModItems.augrite_PICKAXE);
                        entries.add(ModItems.augrite_AXE);
                        entries.add(ModItems.augrite_SHOVEL);
                        entries.add(ModItems.augrite_SWORD);
                        entries.add(ModItems.augrite_HOE);

                        entries.add(ModItems.ENDSTONE_PICKAXE);
                        entries.add(ModItems.ENDSTONE_AXE);
                        entries.add(ModItems.ENDSTONE_SHOVEL);
                        entries.add(ModItems.ENDSTONE_SWORD);
                        entries.add(ModItems.ENDSTONE_HOE);

                        entries.add(ModItems.auravine_PICKAXE);
                        entries.add(ModItems.auravine_AXE);
                        entries.add(ModItems.auravine_SHOVEL);
                        entries.add(ModItems.auravine_SWORD);
                        entries.add(ModItems.auravine_HOE);

                        entries.add(ModItems.augrite_HELMET);
                        entries.add(ModItems.augrite_CHESTPLATE);
                        entries.add(ModItems.augrite_LEGGINGS);
                        entries.add(ModItems.augrite_BOOTS);

                        entries.add(ModItems.auravine_HELMET);
                        entries.add(ModItems.auravine_CHESTPLATE);
                        entries.add(ModItems.auravine_LEGGINGS);
                        entries.add(ModItems.auravine_BOOTS);

                        entries.add(ModItems.leafy_ENDER_HELMET);
                        entries.add(ModItems.leafy_ENDER_CHESTPLATE);
                        entries.add(ModItems.leafy_ENDER_LEGGINGS);
                        entries.add(ModItems.leafy_ENDER_BOOTS);

                        entries.add(ModItems.evil_CHESTPLATE);
                        //entries.add(ModItems.SHULKER_CANNON);
                        entries.add(ModItems.SHULKER_BULLET);

                        entries.add(ModBlocks.ENDSTONE_BRICK_PILLAR);
                        entries.add(ModBlocks.PURPUR_WALL);
                        entries.add(ModBlocks.GILDED_PURPUR_BLOCK);
                        entries.add(ModBlocks.PURPUR_STONE);
                        entries.add(ModBlocks.GILDED_PURPUR_STONE);

                        entries.add(ModBlocks.ENDSTONE_DECAYING);
                        entries.add(ModBlocks.ENDSTONE_WARM);
                        entries.add(ModBlocks.PLENTIFUL_MOSS_BLOCK);
                        entries.add(ModBlocks.PLENTIFUL_GRASS_BLOCK);
                        entries.add(ModBlocks.PLENTIFUL_GRASS_STEM);
                        entries.add(ModBlocks.PLENTIFUL_GRASS_FLOWER);
                        entries.add(ModBlocks.PLENTIFUL_MOSS_PILE);


                        entries.add(ModBlocks.MINTY_ENDSTONE);
                        entries.add(ModBlocks.MINTY_ENDSTONE_SLAB);
                        entries.add(ModBlocks.MINTY_ENDSTONE_STAIRS);
                        entries.add(ModBlocks.MINTY_ENDSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.MINTY_ENDSTONE_BUTTON);
                        entries.add(ModBlocks.MINTY_ENDSTONE_WALL);


                        entries.add(ModBlocks.WITHERED_ENDSTONE);
                        entries.add(ModBlocks.WITHERED_ENDSTONE_SLAB);
                        entries.add(ModBlocks.WITHERED_ENDSTONE_STAIRS);
                        entries.add(ModBlocks.WITHERED_ENDSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.WITHERED_ENDSTONE_BUTTON);
                        entries.add(ModBlocks.WITHERED_ENDSTONE_WALL);


                        entries.add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE);
                        entries.add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_SLAB);
                        entries.add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_STAIRS);
                        entries.add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_PRESSURE_PLATE);
                        entries.add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_BUTTON);
                        entries.add(ModBlocks.WITHERED_AND_MINTY_ENDSTONE_WALL);

                        entries.add(ModBlocks.MINTY_ENDSTONE_PILE);



                        entries.add(ModBlocks.COBBLED_SCYENSITH);
                        entries.add(ModBlocks.COBBLED_SCYENSITH_SLAB);
                        entries.add(ModBlocks.COBBLED_SCYENSITH_STAIRS);
                        entries.add(ModBlocks.POLISHED_SCYENSITH);
                        entries.add(ModBlocks.POLISHED_SCYENSITH_SLAB);
                        entries.add(ModBlocks.POLISHED_SCYENSITH_STAIRS);

                        entries.add(ModBlocks.CHAINED_STEEL);
                        entries.add(ModBlocks.CHAINED_STEEL_SLAB);



                        entries.add(ModBlocks.BLUE_CRYSTAL);
                        entries.add(ModBlocks.BLUE_CRYSTAL_TRANS);
                        entries.add(ModBlocks.BLUE_CRYSTAL_TRANS_PANE);
                        entries.add(ModBlocks.PURPLE_CRYSTAL);
                        entries.add(ModBlocks.PURPLE_CRYSTAL_TRANS);
                        entries.add(ModBlocks.PURPLE_CRYSTAL_TRANS_PANE);

                        entries.add(ModBlocks.GRUELING_FLOWER);
                        entries.add(ModBlocks.GLINTING_PURPLE_GRASS);

                        entries.add(ModBlocks.ENDSTONE_GRASS);
                        entries.add(ModBlocks.ENDSTONE_GRASS_FULL);
                        entries.add(ModBlocks.ENDSTONE_GRASS_FULL_SLAB);
                        entries.add(ModBlocks.ENDSTONE_GRASS_SLABMAIN_SLAB);
                        entries.add(ModBlocks.GILDED_ENDSTONE_GRASS);
                        entries.add(ModBlocks.GILDED_ENDSTONE_GRASS_FULL);
                        entries.add(ModBlocks.GILDED_ENDSTONE_GRASS_FULL_SLAB);
                        entries.add(ModBlocks.GILDED_ENDSTONE_GRASS_SLABMAIN_SLAB);
                        entries.add(ModBlocks.DESTINATIONAL_FLOWER);
                        entries.add(ModBlocks.ENDSTONE_TULIP);
                        entries.add(ModBlocks.STAINED_POPPY);
                        entries.add(ModBlocks.LILY_OF_THE_END);
                        entries.add(ModBlocks.ENDER_FLOWER);
                        entries.add(ModBlocks.ENDER_GRASS_LONG);
                        entries.add(ModBlocks.ENDER_GRASS_SHORT);
                        entries.add(ModBlocks.ENDER_VINES);
                        entries.add(ModBlocks.ENDER_PETALS);

                        entries.add(ModBlocks.ENDSTONE_GRASS_BLUE);
                        entries.add(ModBlocks.ENDSTONE_GRASS_FULL_BLUE);
                        entries.add(ModBlocks.ENDSTONE_GRASS_FULL_SLAB_BLUE);
                        entries.add(ModBlocks.ENDSTONE_GRASS_SLABMAIN_SLAB_BLUE);
                        entries.add(ModBlocks.GILDED_ENDSTONE_GRASS_FULL_BLUE);
                        entries.add(ModBlocks.GILDED_ENDSTONE_GRASS_FULL_SLAB_BLUE);
                        entries.add(ModBlocks.DESTINATIONAL_FLOWER_BLUE);
                        entries.add(ModBlocks.ENDSTONE_TULIP_BLUE);
                        entries.add(ModBlocks.STAINED_POPPY_BLUE);
                        entries.add(ModBlocks.LILY_OF_THE_END_BLUE);
                        entries.add(ModBlocks.ENDER_FLOWER_BLUE);
                        entries.add(ModBlocks.ENDER_GRASS_LONG_BLUE);
                        entries.add(ModBlocks.ENDER_GRASS_SHORT_BLUE);
                        entries.add(ModBlocks.ENDER_VINES_BLUE);
                        entries.add(ModBlocks.ENDER_PETALS_BLUE);

                        entries.add(ModItems.ENDERSNAIL_SPAWN_EGG);

                        entries.add(ModBlocks.ENDER_ALVES_LOG);
                        entries.add(ModBlocks.ENDER_ALVES_WOOD);
                        entries.add(ModBlocks.STRIPPED_ENDER_ALVES_LOG);
                        entries.add(ModBlocks.STRIPPED_ENDER_ALVES_WOOD);
                        entries.add(ModBlocks.ENDER_ALVES_LEAVES);
                        entries.add(ModBlocks.GILDED_ENDER_ALVES_LEAVES);

                        entries.add(ModBlocks.ENDER_ALVES_PLANKS);
                        entries.add(ModBlocks.ENDER_ALVES_PLANKS_BUTTON);
                        entries.add(ModBlocks.ENDER_ALVES_PLANKS_FENCE);
                        entries.add(ModBlocks.ENDER_ALVES_PLANKS_FENCE_GATE);
                        entries.add(ModBlocks.ENDER_ALVES_PLANKS_STAIRS);
                        entries.add(ModBlocks.ENDER_ALVES_PLANKS_SLAB);
                        entries.add(ModBlocks.ENDER_ALVES_PLANKS_PRESSURE_PLATE);
                        entries.add(ModBlocks.ENDER_ALVES_PLANKS_TRAPDOOR);


                        entries.add(ModBlocks.TERMINAL_PINE_LOG);
                        entries.add(ModBlocks.TERMINAL_PINE_WOOD);
                        entries.add(ModBlocks.STRIPPED_TERMINAL_PINE_LOG);
                        entries.add(ModBlocks.STRIPPED_TERMINAL_PINE_WOOD);
                        entries.add(ModBlocks.TERMINAL_PINE_LEAVES);
                        entries.add(ModBlocks.GILDED_TERMINAL_PINE_LEAVES);

                        entries.add(ModBlocks.TERMINAL_PINE_PLANKS);
                        entries.add(ModBlocks.TERMINAL_PINE_PLANKS_BUTTON);
                        entries.add(ModBlocks.TERMINAL_PINE_PLANKS_FENCE);
                        entries.add(ModBlocks.TERMINAL_PINE_PLANKS_FENCE_GATE);
                        entries.add(ModBlocks.TERMINAL_PINE_PLANKS_STAIRS);
                        entries.add(ModBlocks.TERMINAL_PINE_PLANKS_SLAB);
                        entries.add(ModBlocks.TERMINAL_PINE_PLANKS_PRESSURE_PLATE);


                        entries.add(ModBlocks.REINFORCED_TUNGSTEN_PLATFORM);
                        entries.add(ModBlocks.PURE_STEEL);
                        entries.add(ModBlocks.PURE_STEEL_SLAB);
                        entries.add(ModBlocks.PURE_STEEL_STAIRS);

                        entries.add(ModBlocks.SMOOTH_TUNGSTEN);
                        entries.add(ModBlocks.SMOOTH_TUNGSTEN_SLAB);
                        entries.add(ModBlocks.SMOOTH_TUNGSTEN_STAIRS);

                        entries.add(ModBlocks.MINTY_TALL_FLOWERS);
                        entries.add(ModBlocks.MINTY_ROSES);
                        entries.add(ModBlocks.MINTY_SHORT_GRASS);

                        entries.add(ModBlocks.MAZE_STONE);
                        entries.add(ModBlocks.MAZE_STONE_SLAB);
                        entries.add(ModBlocks.MAZE_STONE_STAIRS);
                        entries.add(ModBlocks.FIZZY_MAZE_STONE);
                        entries.add(ModBlocks.GILDED_MAZE_STONE);
                        entries.add(ModBlocks.CIRCULAR_MAZE_STONE);
                        entries.add(ModBlocks.RECTANGULAR_MAZE_STONE);
                        entries.add(ModBlocks.MAZE_STONE_PILLAR);
                        entries.add(ModBlocks.DESTINATIONAL_MAZE_STONE_PILLAR);


                        entries.add(ModBlocks.BUTTER_NUT_LOG);
                        entries.add(ModBlocks.BUTTER_NUT_WOOD);
                        entries.add(ModBlocks.STRIPPED_BUTTER_NUT_LOG);
                        entries.add(ModBlocks.STRIPPED_BUTTER_NUT_WOOD);
                        entries.add(ModBlocks.BUTTER_NUT_LEAVES);
                        entries.add(ModBlocks.GILDED_BUTTER_NUT_LEAVES);

                        entries.add(ModBlocks.BUTTER_NUT_PLANKS);
                        entries.add(ModBlocks.BUTTER_NUT_PLANKS_BUTTON);
                        entries.add(ModBlocks.BUTTER_NUT_PLANKS_FENCE);
                        entries.add(ModBlocks.BUTTER_NUT_PLANKS_FENCE_GATE);
                        entries.add(ModBlocks.BUTTER_NUT_PLANKS_STAIRS);
                        entries.add(ModBlocks.BUTTER_NUT_PLANKS_SLAB);
                        entries.add(ModBlocks.BUTTER_NUT_PLANKS_PRESSURE_PLATE);
                        entries.add(ModBlocks.BUTTER_NUT_WEEDS);
                        entries.add(ModBlocks.PLENTIFUL_GRASS_SHORT);
                        entries.add(ModBlocks.HANGING_BUTTER_NUT);
                        entries.add(ModItems.BUTTER_NUT_BERRY);
                        entries.add(ModBlocks.PRISTINE_PINK_FLOWERS);
                        entries.add(ModBlocks.SCYENSITH_PILLAR);




                        entries.add(ModBlocks.WINDY_MAPLE_LOG);
                        entries.add(ModBlocks.WINDY_MAPLE_WOOD);
                        entries.add(ModBlocks.STRIPPED_WINDY_MAPLE_LOG);
                        entries.add(ModBlocks.STRIPPED_WINDY_MAPLE_WOOD);
                        entries.add(ModBlocks.WINDY_MAPLE_LEAVES);
                        entries.add(ModBlocks.GILDED_WINDY_MAPLE_LEAVES);

                        entries.add(ModBlocks.WINDY_MAPLE_PLANKS);
                        entries.add(ModBlocks.WINDY_MAPLE_PLANKS_BUTTON);
                        entries.add(ModBlocks.WINDY_MAPLE_PLANKS_FENCE);
                        entries.add(ModBlocks.WINDY_MAPLE_PLANKS_FENCE_GATE);
                        entries.add(ModBlocks.WINDY_MAPLE_PLANKS_STAIRS);
                        entries.add(ModBlocks.WINDY_MAPLE_PLANKS_SLAB);
                        entries.add(ModBlocks.WINDY_MAPLE_PLANKS_PRESSURE_PLATE);

                        entries.add(ModBlocks.GRAINY_ENDSTONE);

                        entries.add(ModBlocks.ENDER_BERRY_CROP);
                        entries.add(ModBlocks.ENDER_BERRY_CROP_BLUE);
                        entries.add(ModItems.ENDER_BERRIES);


                        entries.add(ModItems.auravine_SHARD);
                        entries.add(ModItems.GHOST_SHARD);
                        entries.add(ModItems.END_MUSIC_DISC);

                       // entries.add(ModBlocks.DESTINATIONAL_ENCHANTING_TABLE);
                        entries.add(ModItems.POWERED_ENDER_PEARL);

                        entries.add(ModBlocks.auravine_ORE);
                        entries.add(ModBlocks.auravine_ORE_DEEPER);

                        entries.add(ModBlocks.DEEPER_END_STONE_BRICKS);
                        entries.add(ModBlocks.DEEPER_END_STONE_BRICKS_BUTTON);
                        entries.add(ModBlocks.DEEPER_END_STONE_BRICKS_SLAB);
                        entries.add(ModBlocks.DEEPER_END_STONE_BRICKS_STAIRS);
                        entries.add(ModBlocks.DEEPER_END_STONE_BRICKS_WALL);
                        entries.add(ModBlocks.DEEPER_END_STONE_BRICKS_PRESSURE_PLATE);
                        entries.add(ModBlocks.DEEPER_ENDSTONE_BRICK_PILLAR);





                    }).build());
    public  static  void registerItemGroups() {
        DraipEnd.LOGGER.info("Registering item groups for " +DraipEnd.MOD_ID);


    }
}
