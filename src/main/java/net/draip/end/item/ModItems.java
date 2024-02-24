package net.draip.end.item;

import net.draip.end.DraipEnd;
import net.draip.end.item.custom.ChorusFruitGoldenItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SILVERITE_DUST = registerItem("silverite_dust", new Item(new FabricItemSettings()));
    public static final Item SILVERITE_INGOT = registerItem("silverite_ingot", new Item(new FabricItemSettings()));
    public static final Item CHORUS_FRUIT_GOLDEN = registerItem("chorus_fruit_golden", new ChorusFruitGoldenItem(new FabricItemSettings().food(ModFoodComponents.CHORUS_FRUIT_GOLDEN)));

    private static void addItemsToIngredientTabItemGrouo(FabricItemGroupEntries entries) {
        entries.add(SILVERITE_DUST);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DraipEnd.MOD_ID, name), item);
    }
    public static void registerModItems () {
        DraipEnd.LOGGER.info("Registering Mod Items for " + DraipEnd.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGrouo);

    }
}
