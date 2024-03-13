package net.draip.end.item;

import net.draip.end.DraipEnd;
import net.draip.end.block.ModBlocks;
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

                        entries.add(ModItems.evil_CHESTPLATE);

                        entries.add(ModBlocks.ENDSTONE_BRICK_PILLAR);
                        entries.add(ModBlocks.PURPUR_WALL);

                        entries.add(ModBlocks.ENDSTONE_DECAYING);

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
