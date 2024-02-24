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
                        entries.add(ModBlocks.SILVERITE_BLOCK);

                        entries.add(ModBlocks.ENDSTONE_DEEPER);

                        entries.add(ModBlocks.SILVERITE_ORE_DEEPER_ENDSTONE);
                        entries.add(ModBlocks.SILVERITE_ORE_ENDSTONE);

                    }).build());
    public  static  void registerItemGroups() {
        DraipEnd.LOGGER.info("Registering item groups for " +DraipEnd.MOD_ID);


    }
}
