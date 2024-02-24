package net.draip.end.block;

import net.draip.end.DraipEnd;
import net.draip.end.block.custom.SilveriteOreEndstoneBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block SILVERITE_BLOCK = registerBlock("silverite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block ENDSTONE_DEEPER = registerBlock("endstone_deeper",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block SILVERITE_ORE_DEEPER_ENDSTONE = registerBlock("silverite_ore_deeper_endstone",
            new SilveriteOreEndstoneBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(4f)));
    public static final Block SILVERITE_ORE_ENDSTONE = registerBlock("silverite_ore_endstone",
            new SilveriteOreEndstoneBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(4f)));


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
