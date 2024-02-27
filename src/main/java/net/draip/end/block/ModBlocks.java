package net.draip.end.block;

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
    public static final Block ENDSTONE_DECAYING = registerBlock("endstone_decaying",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block SILVERITE_ORE_DEEPER_ENDSTONE = registerBlock("silverite_ore_deeper_endstone",
            new SilveriteOreEndstoneBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(4f)));
    public static final Block SILVERITE_ORE_ENDSTONE = registerBlock("silverite_ore_endstone",
            new SilveriteOreEndstoneBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(4f)));
    public static final Block SILVERITE_BLOCK = registerBlock("silverite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

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

    public static final Block ENDSTONE_GRASS = registerBlock("endstone_grass",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block ENDSTONE_GRASS_FULL = registerBlock("endstone_grass_full",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));

    public static final Block ENDSTONE_GRASS_FULL_SLAB = registerBlock("endstone_grass_full_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));

    public static final Block PURPUR_WALL = registerBlock("purpur_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));

    public static final Block ENDSTONE_GRASS_SLABMAIN = registerBlock("endstone_grass_slabmain",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));

    public static final Block ENDSTONE_GRASS_SLABMAIN_SLAB = registerBlock("endstone_grass_slabmain_slab",
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
