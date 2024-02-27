package net.draip.end.datagen;

import net.draip.end.block.ModBlocks;
import net.draip.end.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
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

        addDrop(ModBlocks.SILVERITE_BLOCK);

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


        addDrop(ModBlocks.DESTINATIONAL_FLOWER);
        addPottedPlantDrops(ModBlocks.POTTED_DESTINATIONAL_FLOWER);

        addDrop(ModBlocks.ENDSTONE_TULIP);
        addPottedPlantDrops(ModBlocks.POTTED_ENDSTONE_TULIP);

        addDrop(ModBlocks.STAINED_POPPY);
        addPottedPlantDrops(ModBlocks.POTTED_STAINED_POPPY);

        addDrop(ModBlocks.LILY_OF_THE_END);
        addPottedPlantDrops(ModBlocks.POTTED_LILY_OF_THE_END);


        addDrop(ModBlocks.ENDER_GRASS_SHORT);
        addDrop(ModBlocks.ENDER_GRASS_LONG, tallPlantDrops(ModBlocks.ENDER_GRASS_LONG, ModBlocks.ENDER_GRASS_LONG));



        addDrop(ModBlocks.ENDSTONE_DECAYING);
        addDrop(ModBlocks.ENDSTONE_GRASS);
        addDrop(ModBlocks.ENDSTONE_GRASS_FULL);

        addDrop(ModBlocks.ENDSTONE_GRASS_SLABMAIN);


        addDrop(ModBlocks.ENDSTONE_SLAB, slabDrops(ModBlocks.ENDSTONE_SLAB));
        addDrop(ModBlocks.ENDSTONE_GRASS_FULL_SLAB, slabDrops(ModBlocks.ENDSTONE_GRASS_FULL_SLAB));
        addDrop(ModBlocks.ENDSTONE_DEEPER_SLAB, slabDrops(ModBlocks.ENDSTONE_DEEPER_SLAB));
        addDrop(ModBlocks.ENDSTONE_GRASS_SLABMAIN_SLAB, slabDrops(ModBlocks.ENDSTONE_GRASS_SLABMAIN_SLAB));




        addDrop(ModBlocks.SILVERITE_ORE_ENDSTONE, copperLikeOreDrops(ModBlocks.SILVERITE_ORE_ENDSTONE, ModItems.SILVERITE_DUST));
        addDrop(ModBlocks.SILVERITE_ORE_DEEPER_ENDSTONE, copperLikeOreDrops(ModBlocks.SILVERITE_ORE_DEEPER_ENDSTONE, ModItems.SILVERITE_DUST));

    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder) this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction
                                        .builder(UniformLootNumberProvider
                                                .create(1.0f, 4.0f))))
                        .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
