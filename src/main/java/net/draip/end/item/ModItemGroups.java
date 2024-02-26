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
                    .icon(() -> new ItemStack(ModItems.SILVERITE_DUST)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SILVERITE_DUST);
                        entries.add(ModItems.SILVERITE_INGOT);
                        entries.add(ModItems.CHORUS_FRUIT_GOLDEN);
                        entries.add(ModBlocks.SILVERITE_BLOCK);

                        entries.add(ModBlocks.ENDSTONE_DEEPER);

                        entries.add(ModBlocks.SILVERITE_ORE_DEEPER_ENDSTONE);
                        entries.add(ModBlocks.SILVERITE_ORE_ENDSTONE);

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

                        entries.add(ModItems.SILVERITE_PICKAXE);
                        entries.add(ModItems.SILVERITE_AXE);
                        entries.add(ModItems.SILVERITE_SHOVEL);
                        entries.add(ModItems.SILVERITE_SWORD);
                        entries.add(ModItems.SILVERITE_HOE);

                        entries.add(ModItems.SILVERITE_HELMET);
                        entries.add(ModItems.SILVERITE_CHESTPLATE);
                        entries.add(ModItems.SILVERITE_LEGGINGS);
                        entries.add(ModItems.SILVERITE_BOOTS);

                        entries.add(ModBlocks.ENDSTONE_BRICK_PILLAR);
                        entries.add(ModBlocks.PURPUR_WALL);

                        entries.add(ModBlocks.ENDSTONE_DECAYING);
                        entries.add(ModBlocks.ENDSTONE_GRASS);
                        entries.add(ModBlocks.ENDSTONE_GRASS_FULL);
                        entries.add(ModBlocks.ENDSTONE_GRASS_FULL_SLAB);
                        entries.add(ModBlocks.ENDSTONE_GRASS_SLABMAIN_SLAB);


                    }).build());
    public  static  void registerItemGroups() {
        DraipEnd.LOGGER.info("Registering item groups for " +DraipEnd.MOD_ID);


    }
}
