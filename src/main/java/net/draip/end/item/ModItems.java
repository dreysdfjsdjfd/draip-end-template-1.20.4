package net.draip.end.item;

import net.draip.end.DraipEnd;
import net.draip.end.item.custom.ChorusFruitGoldenItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SILVERITE_DUST = registerItem("silverite_dust", new Item(new FabricItemSettings()));
    public static final Item SILVERITE_INGOT = registerItem("silverite_ingot", new Item(new FabricItemSettings()));
    public static final Item SILVERITE_PICKAXE = registerItem("silverite_pickaxe", new PickaxeItem(ModToolMaterial.SILVERITE, 1, -2.8f,new FabricItemSettings()));
    public static final Item SILVERITE_AXE = registerItem("silverite_axe", new AxeItem(ModToolMaterial.SILVERITE, 6, -3.1f,new FabricItemSettings()));
    public static final Item SILVERITE_SHOVEL = registerItem("silverite_shovel", new ShovelItem(ModToolMaterial.SILVERITE, 1, -3f,new FabricItemSettings()));
    public static final Item SILVERITE_SWORD = registerItem("silverite_sword", new SwordItem(ModToolMaterial.SILVERITE, 3, -2.4f,new FabricItemSettings()));
    public static final Item SILVERITE_HOE = registerItem("silverite_hoe", new HoeItem(ModToolMaterial.SILVERITE, -2, -1f,new FabricItemSettings()));

    public static final Item SILVERITE_HELMET = registerItem("silverite_helmet", new ArmorItem(ModArmorMaterials.SILVERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SILVERITE_CHESTPLATE = registerItem("silverite_chestplate", new ArmorItem(ModArmorMaterials.SILVERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SILVERITE_LEGGINGS = registerItem("silverite_leggings", new ArmorItem(ModArmorMaterials.SILVERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SILVERITE_BOOTS = registerItem("silverite_boots", new ArmorItem(ModArmorMaterials.SILVERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));



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
