package net.draip.end.datagen;

import net.draip.end.block.ModBlocks;
import net.draip.end.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.augrite_HELMET,ModItems.augrite_CHESTPLATE,ModItems.augrite_LEGGINGS,ModItems.augrite_BOOTS)
                .add(ModItems.auravine_HELMET,ModItems.auravine_CHESTPLATE,ModItems.auravine_LEGGINGS,ModItems.auravine_BOOTS)
                .add(ModItems.auravine_CHESTPLATE);


        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.ENDER_ALVES_PLANKS.asItem())
                .add(ModBlocks.WINDY_MAPLE_PLANKS.asItem())
                .add(ModBlocks.BUTTER_NUT_PLANKS.asItem())
        ;

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.ENDER_ALVES_LOG.asItem())
                .add(ModBlocks.ENDER_ALVES_WOOD.asItem())
                .add(ModBlocks.STRIPPED_ENDER_ALVES_LOG.asItem())
                .add(ModBlocks.STRIPPED_ENDER_ALVES_WOOD.asItem())

                .add(ModBlocks.WINDY_MAPLE_LOG.asItem())
                .add(ModBlocks.WINDY_MAPLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_WINDY_MAPLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_WINDY_MAPLE_WOOD.asItem())

                .add(ModBlocks.BUTTER_NUT_LOG.asItem())
                .add(ModBlocks.BUTTER_NUT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BUTTER_NUT_LOG.asItem())
                .add(ModBlocks.STRIPPED_BUTTER_NUT_WOOD.asItem())

        ;
        }

    }
