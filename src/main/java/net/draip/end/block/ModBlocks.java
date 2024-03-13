package net.draip.end.block;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.draip.end.DraipEnd;
import net.draip.end.block.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block ENDSTONE_DEEPER = registerBlock("endstone_deeper",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block DEEPER_END_STONE_BRICKS = registerBlock("deeper_end_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block DEEPER_END_STONE_BRICKS_STAIRS = registerBlock("deeper_end_stone_bricks_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block DEEPER_END_STONE_BRICKS_SLAB = registerBlock("deeper_end_stone_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block DEEPER_END_STONE_BRICKS_BUTTON = registerBlock("deeper_end_stone_bricks_button",
            new ButtonBlock(BlockSetType.STONE, 10, FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block DEEPER_END_STONE_BRICKS_PRESSURE_PLATE = registerBlock("deeper_end_stone_bricks_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block DEEPER_END_STONE_BRICKS_WALL = registerBlock("deeper_end_stone_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDSTONE_DECAYING = registerBlock("endstone_decaying",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block augrite_ORE_DEEPER_ENDSTONE = registerBlock("augrite_ore_deeper_endstone",
            new augriteOreEndstoneBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(4f)));
    public static final Block augrite_ORE_ENDSTONE = registerBlock("augrite_ore_endstone",
            new augriteOreEndstoneBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(4f)));
    public static final Block augrite_BLOCK = registerBlock("augrite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block auravine_ORE_DEEPER = registerBlock("auravine_ore_deeper",
            new auravineOreBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(4f)));
    public static final Block auravine_ORE = registerBlock("auravine_ore",
            new auravineOreBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(4f)));

    public static final Block ENDSTONE_STAIRS = registerBlock("endstone_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDSTONE_SLAB = registerBlock("endstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDSTONE_BUTTON = registerBlock("endstone_button",
            new ButtonBlock(BlockSetType.STONE, 10, FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDSTONE_PRESSURE_PLATE = registerBlock("endstone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDSTONE_WALL = registerBlock("endstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));


    public static final Block ENDSTONE_DEEPER_STAIRS = registerBlock("endstone_deeper_stairs",
            new StairsBlock(Blocks.END_STONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDSTONE_DEEPER_SLAB = registerBlock("endstone_deeper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDSTONE_DEEPER_BUTTON = registerBlock("endstone_deeper_button",
            new ButtonBlock(BlockSetType.STONE, 10, FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDSTONE_DEEPER_PRESSURE_PLATE = registerBlock("endstone_deeper_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE,FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDSTONE_DEEPER_WALL = registerBlock("endstone_deeper_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));

    public static final Block ENDSTONE_BRICK_PILLAR = registerBlock("endstone_brick_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block DEEPER_ENDSTONE_BRICK_PILLAR = registerBlock("deeper_endstone_brick_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));



    public static final Block PURPUR_WALL = registerBlock("purpur_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));

    public static final Block ENDER_ALVES_LOG = registerBlock("ender_alves_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block ENDER_ALVES_WOOD = registerBlock("ender_alves_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_ENDER_ALVES_LOG = registerBlock("stripped_ender_alves_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_ENDER_ALVES_WOOD = registerBlock("stripped_ender_alves_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block ENDER_ALVES_PLANKS = registerBlock("ender_alves_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ENDER_ALVES_PLANKS_STAIRS = registerBlock("ender_alves_planks_stairs",
            new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ENDER_ALVES_PLANKS_SLAB = registerBlock("ender_alves_planks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ENDER_ALVES_PLANKS_BUTTON = registerBlock("ender_alves_planks_button",
            new ButtonBlock(BlockSetType.OAK, 10, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ENDER_ALVES_PLANKS_PRESSURE_PLATE = registerBlock("ender_alves_planks_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ENDER_ALVES_PLANKS_FENCE = registerBlock("ender_alves_planks_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ENDER_ALVES_PLANKS_FENCE_GATE = registerBlock("ender_alves_planks_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block ENDER_ALVES_PLANKS_TRAPDOOR = registerBlock("ender_alves_planks_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block ENDER_ALVES_PLANKS_LADDER = registerBlock("ender_alves_planks_ladder",
            new LadderBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Block ENDER_ALVES_LEAVES = registerBlock("ender_alves_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block GILDED_ENDER_ALVES_LEAVES = registerBlock("gilded_ender_alves_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));

    public static final Block WINDY_MAPLE_LOG = registerBlock("windy_maple_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block WINDY_MAPLE_WOOD = registerBlock("windy_maple_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_WINDY_MAPLE_LOG = registerBlock("stripped_windy_maple_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_WINDY_MAPLE_WOOD = registerBlock("stripped_windy_maple_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block WINDY_MAPLE_PLANKS = registerBlock("windy_maple_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WINDY_MAPLE_PLANKS_STAIRS = registerBlock("windy_maple_planks_stairs",
            new StairsBlock(Blocks.OAK_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WINDY_MAPLE_PLANKS_SLAB = registerBlock("windy_maple_planks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WINDY_MAPLE_PLANKS_BUTTON = registerBlock("windy_maple_planks_button",
            new ButtonBlock(BlockSetType.OAK, 10, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WINDY_MAPLE_PLANKS_PRESSURE_PLATE = registerBlock("windy_maple_planks_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WINDY_MAPLE_PLANKS_FENCE = registerBlock("windy_maple_planks_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WINDY_MAPLE_PLANKS_FENCE_GATE = registerBlock("windy_maple_planks_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block WINDY_MAPLE_LEAVES = registerBlock("windy_maple_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block GILDED_WINDY_MAPLE_LEAVES = registerBlock("gilded_windy_maple_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));

    public static final Block GRAINY_ENDSTONE = registerBlock("grainy_endstone",
            new FallingBlock(FabricBlockSettings.copyOf(Blocks.SAND)) {
                @Override
                protected MapCodec<? extends FallingBlock> getCodec() {
                    return null;
                }
            });


    public static final Block ENDER_VINES = registerBlock("ender_vines",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE)));
    public static final Block ENDER_PETALS = registerBlock("ender_petals",
            new EnderPetalsBlock(FabricBlockSettings.copyOf(Blocks.PINK_PETALS)));
    public static final Block ENDER_BERRY_CROP = registerBlock("ender_berry_crop",
            new EnderBerryCropBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH)));
    public static final Block ENDSTONE_GRASS = registerBlock("endstone_grass",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDSTONE_GRASS_FULL = registerBlock("endstone_grass_full",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDSTONE_GRASS_FULL_SLAB = registerBlock("endstone_grass_full_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDSTONE_GRASS_SLABMAIN = registerBlock("endstone_grass_slabmain",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDSTONE_GRASS_SLABMAIN_SLAB = registerBlock("endstone_grass_slabmain_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block GILDED_ENDSTONE_GRASS = registerBlock("gilded_endstone_grass",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block GILDED_ENDSTONE_GRASS_FULL = registerBlock("gilded_endstone_grass_full",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block GILDED_ENDSTONE_GRASS_FULL_SLAB = registerBlock("gilded_endstone_grass_full_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block GILDED_ENDSTONE_GRASS_SLABMAIN = registerBlock("gilded_endstone_grass_slabmain",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block GILDED_ENDSTONE_GRASS_SLABMAIN_SLAB = registerBlock("gilded_endstone_grass_slabmain_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDER_GRASS_SHORT = registerBlock("ender_grass_short",
            new EnderGrassBlock(FabricBlockSettings.copyOf(Blocks.SHORT_GRASS).nonOpaque().noCollision()));
    public static final Block ENDER_GRASS_LONG = registerBlock("ender_grass_long",
            new EnderGrassLongBlock(FabricBlockSettings.copyOf(Blocks.TALL_GRASS).nonOpaque().noCollision()));
    public static final Block DESTINATIONAL_FLOWER = registerBlock("destinational_flower",
            new EndStoneFlowerBlock(StatusEffects.LEVITATION, 10,
                    FabricBlockSettings.copyOf(Blocks.WARPED_FUNGUS).nonOpaque().noCollision()));
    public static final Block POTTED_DESTINATIONAL_FLOWER = Registry.register(Registries.BLOCK, new Identifier(DraipEnd.MOD_ID, "potted_destinational_flower"),
            new FlowerPotBlock(DESTINATIONAL_FLOWER, FabricBlockSettings.copyOf(Blocks.POTTED_WARPED_FUNGUS).nonOpaque()));
    public static final Block ENDSTONE_TULIP = registerBlock("endstone_tulip",
            new EndStoneFlowerBlock(StatusEffects.LEVITATION, 10,
                    FabricBlockSettings.copyOf(Blocks.RED_TULIP).nonOpaque().noCollision()));
    public static final Block POTTED_ENDSTONE_TULIP = Registry.register(Registries.BLOCK, new Identifier(DraipEnd.MOD_ID, "potted_endstone_tulip"),
            new FlowerPotBlock(ENDSTONE_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP).nonOpaque()));
    public static final Block STAINED_POPPY = registerBlock("stained_poppy",
            new EndStoneFlowerBlock(StatusEffects.LEVITATION, 10,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_STAINED_POPPY = Registry.register(Registries.BLOCK, new Identifier(DraipEnd.MOD_ID, "potted_stained_poppy"),
            new FlowerPotBlock(STAINED_POPPY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block LILY_OF_THE_END = registerBlock("lily_of_the_end",
            new EndStoneFlowerBlock(StatusEffects.LEVITATION, 10,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_LILY_OF_THE_END = Registry.register(Registries.BLOCK, new Identifier(DraipEnd.MOD_ID, "potted_lily_of_the_end"),
            new FlowerPotBlock(LILY_OF_THE_END, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));
    public static final Block ENDER_FLOWER = registerBlock("ender_flower",
            new EndStoneFlowerBlock(StatusEffects.LEVITATION, 10,
                    FabricBlockSettings.copyOf(Blocks.CORNFLOWER).nonOpaque().noCollision()));
    public static final Block POTTED_ENDER_FLOWER = Registry.register(Registries.BLOCK, new Identifier(DraipEnd.MOD_ID, "potted_ender_flower"),
            new FlowerPotBlock(ENDER_FLOWER, FabricBlockSettings.copyOf(Blocks.POTTED_CORNFLOWER).nonOpaque()));


    public static final Block ENDER_VINES_BLUE = registerBlock("ender_vines_blue",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE)));
    public static final Block ENDER_PETALS_BLUE = registerBlock("ender_petals_blue",
            new EnderPetalsBlock(FabricBlockSettings.copyOf(Blocks.PINK_PETALS)));
    public static final Block ENDER_BERRY_CROP_BLUE = registerBlock("ender_berry_crop_blue",
            new EnderBerryCropBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH)));
    public static final Block ENDSTONE_GRASS_BLUE = registerBlock("endstone_grass_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDSTONE_GRASS_FULL_BLUE = registerBlock("endstone_grass_full_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDSTONE_GRASS_FULL_SLAB_BLUE = registerBlock("endstone_grass_full_slab_blue",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDSTONE_GRASS_SLABMAIN_BLUE = registerBlock("endstone_grass_slabmain_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDSTONE_GRASS_SLABMAIN_SLAB_BLUE = registerBlock("endstone_grass_slabmain_slab_blue",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block GILDED_ENDSTONE_GRASS_FULL_BLUE = registerBlock("gilded_endstone_grass_full_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block GILDED_ENDSTONE_GRASS_FULL_SLAB_BLUE = registerBlock("gilded_endstone_grass_full_slab_blue",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDER_GRASS_SHORT_BLUE = registerBlock("ender_grass_short_blue",
            new EnderGrassBlock(FabricBlockSettings.copyOf(Blocks.SHORT_GRASS).nonOpaque().noCollision()));
    public static final Block ENDER_GRASS_LONG_BLUE = registerBlock("ender_grass_long_blue",
            new EnderGrassLongBlock(FabricBlockSettings.copyOf(Blocks.TALL_GRASS).nonOpaque().noCollision()));
    public static final Block DESTINATIONAL_FLOWER_BLUE = registerBlock("destinational_flower_blue",
            new EndStoneFlowerBlock(StatusEffects.LEVITATION, 10,
                    FabricBlockSettings.copyOf(Blocks.WARPED_FUNGUS).nonOpaque().noCollision()));
    public static final Block POTTED_DESTINATIONAL_FLOWER_BLUE = Registry.register(Registries.BLOCK, new Identifier(DraipEnd.MOD_ID, "potted_destinational_flower_blue"),
            new FlowerPotBlock(DESTINATIONAL_FLOWER, FabricBlockSettings.copyOf(Blocks.POTTED_WARPED_FUNGUS).nonOpaque()));
    public static final Block ENDSTONE_TULIP_BLUE = registerBlock("endstone_tulip_blue",
            new EndStoneFlowerBlock(StatusEffects.LEVITATION, 10,
                    FabricBlockSettings.copyOf(Blocks.RED_TULIP).nonOpaque().noCollision()));
    public static final Block POTTED_ENDSTONE_TULIP_BLUE = Registry.register(Registries.BLOCK, new Identifier(DraipEnd.MOD_ID, "potted_endstone_tulip_blue"),
            new FlowerPotBlock(ENDSTONE_TULIP, FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP).nonOpaque()));
    public static final Block STAINED_POPPY_BLUE = registerBlock("stained_poppy_blue",
            new EndStoneFlowerBlock(StatusEffects.LEVITATION, 10,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_STAINED_POPPY_BLUE = Registry.register(Registries.BLOCK, new Identifier(DraipEnd.MOD_ID, "potted_stained_poppy_blue"),
            new FlowerPotBlock(STAINED_POPPY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block LILY_OF_THE_END_BLUE = registerBlock("lily_of_the_end_blue",
            new EndStoneFlowerBlock(StatusEffects.LEVITATION, 10,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_LILY_OF_THE_END_BLUE = Registry.register(Registries.BLOCK, new Identifier(DraipEnd.MOD_ID, "potted_lily_of_the_end_blue"),
            new FlowerPotBlock(LILY_OF_THE_END, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));
    public static final Block ENDER_FLOWER_BLUE = registerBlock("ender_flower_blue",
            new EndStoneFlowerBlock(StatusEffects.LEVITATION, 10,
                    FabricBlockSettings.copyOf(Blocks.CORNFLOWER).nonOpaque().noCollision()));
    public static final Block POTTED_ENDER_FLOWER_BLUE = Registry.register(Registries.BLOCK, new Identifier(DraipEnd.MOD_ID, "potted_ender_flower_blue"),
            new FlowerPotBlock(ENDER_FLOWER, FabricBlockSettings.copyOf(Blocks.POTTED_CORNFLOWER).nonOpaque()));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(DraipEnd.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(DraipEnd.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        DraipEnd.LOGGER.info("Registering mod blocks for " + DraipEnd.MOD_ID);
    }
}
