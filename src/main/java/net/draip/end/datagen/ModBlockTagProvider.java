package net.draip.end.datagen;

import net.draip.end.block.ModBlocks;
import net.draip.end.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.EXPLOSIVE_BLOCKS)
                .add(ModBlocks.SILVERITE_ORE_DEEPER_ENDSTONE)
                .add(ModBlocks.SILVERITE_ORE_ENDSTONE)
                ;

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SILVERITE_BLOCK)
                .add(ModBlocks.SILVERITE_ORE_ENDSTONE)
                .add(ModBlocks.SILVERITE_ORE_DEEPER_ENDSTONE)
                .add(ModBlocks.ENDSTONE_DEEPER)

                .add(ModBlocks.ENDSTONE_BUTTON)
                .add(ModBlocks.ENDSTONE_PRESSURE_PLATE)
                .add(ModBlocks.ENDSTONE_STAIRS)
                .add(ModBlocks.ENDSTONE_SLAB)
                .add(ModBlocks.ENDSTONE_BRICK_PILLAR)
                .add(ModBlocks.PURPUR_WALL)


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






        ;

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
        ;

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SILVERITE_BLOCK)
                .add(ModBlocks.SILVERITE_ORE_DEEPER_ENDSTONE)
                .add(ModBlocks.SILVERITE_ORE_ENDSTONE)

                .add(ModBlocks.ENDSTONE_BUTTON)
                .add(ModBlocks.ENDSTONE_PRESSURE_PLATE)
                .add(ModBlocks.ENDSTONE_STAIRS)
                .add(ModBlocks.ENDSTONE_SLAB)
                .add(ModBlocks.ENDSTONE_BRICK_PILLAR)
                .add(ModBlocks.PURPUR_WALL)

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


        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
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
        ;

    }
}
