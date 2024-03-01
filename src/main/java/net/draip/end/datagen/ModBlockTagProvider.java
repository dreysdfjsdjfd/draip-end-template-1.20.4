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

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.ENDSTONE_BLOCKS)
                .add(ModBlocks.SILVERITE_ORE_ENDSTONE)
                .add(ModBlocks.SILVERITE_ORE_DEEPER_ENDSTONE)
                .add(ModBlocks.ENDSTONE_DEEPER)
                .add(Blocks.END_STONE)
                .add(ModBlocks.ENDSTONE_DECAYING)
                .add(ModBlocks.ENDSTONE_DEEPER)
                .add(ModBlocks.ENDSTONE_GRASS)
                .add(ModBlocks.ENDSTONE_GRASS_FULL)
                .add(ModBlocks.GILDED_ENDSTONE_GRASS)
                .add(ModBlocks.GILDED_ENDSTONE_GRASS_FULL)
                .add(ModBlocks.GRAINY_ENDSTONE)

                .add(ModBlocks.ENDSTONE_GRASS_BLUE)
                .add(ModBlocks.ENDSTONE_GRASS_FULL_BLUE)
                .add(ModBlocks.GILDED_ENDSTONE_GRASS_FULL_BLUE)
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




        ;

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.ENDER_ALVES_LOG)
                .add(ModBlocks.ENDER_ALVES_WOOD)
                .add(ModBlocks.STRIPPED_ENDER_ALVES_LOG)
                .add(ModBlocks.STRIPPED_ENDER_ALVES_WOOD)

                .add(ModBlocks.WINDY_MAPLE_LOG)
                .add(ModBlocks.WINDY_MAPLE_WOOD)
                .add(ModBlocks.STRIPPED_WINDY_MAPLE_LOG)
                .add(ModBlocks.STRIPPED_WINDY_MAPLE_WOOD);

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
        ;

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.GRAINY_ENDSTONE)
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

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.ENDER_ALVES_PLANKS_FENCE)
                .add(ModBlocks.WINDY_MAPLE_PLANKS_FENCE)
                ;

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.WINDY_MAPLE_PLANKS_FENCE_GATE)
        ;
    }
}
