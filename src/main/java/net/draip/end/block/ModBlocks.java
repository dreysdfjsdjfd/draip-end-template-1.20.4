package net.draip.end.block;

import net.draip.end.DraipEnd;
import net.draip.end.block.custom.EnderBerryCropBlock;
import net.draip.end.block.custom.SilveriteOreEndstoneBlock;
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


    public static final Block ENDER_BERRY_CROP = Registry.register(Registries.BLOCK, new Identifier(DraipEnd.MOD_ID, "ender_berry_crop"),
            new EnderBerryCropBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH)));



    //public static final Block FLOWER_DESTINATIONAL = registerBlock("flower_destinational",
    //        new FlowerBlock(StatusEffects.HERO_OF_THE_VILLAGE,10,FabricBlockSettings.copyOf(Blocks.SHORT_GRASS).nonOpaque().noCollision()));



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
