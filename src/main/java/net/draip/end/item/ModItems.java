package net.draip.end.item;

import net.draip.end.DraipEnd;
import net.draip.end.block.custom.EnderBerryCropBlock;
import net.draip.end.entity.ModEntities;
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

    public static final Item ENDSTONE_PICKAXE = registerItem("endstone_pickaxe", new PickaxeItem(ModToolMaterial.ENDSTONE, 1, -2.8f,new FabricItemSettings()));
    public static final Item ENDSTONE_AXE = registerItem("endstone_axe", new AxeItem(ModToolMaterial.ENDSTONE, 6, -3.1f,new FabricItemSettings()));
    public static final Item ENDSTONE_SHOVEL = registerItem("endstone_shovel", new ShovelItem(ModToolMaterial.ENDSTONE, 1, -3f,new FabricItemSettings()));
    public static final Item ENDSTONE_SWORD = registerItem("endstone_sword", new SwordItem(ModToolMaterial.ENDSTONE, 3, -2.4f,new FabricItemSettings()));
    public static final Item ENDSTONE_HOE = registerItem("endstone_hoe", new HoeItem(ModToolMaterial.ENDSTONE, -2, -1f,new FabricItemSettings()));

    public static final Item SILVERITE_PICKAXE = registerItem("silverite_pickaxe", new PickaxeItem(ModToolMaterial.SILVERITE, 1, -2.8f,new FabricItemSettings()));
    public static final Item SILVERITE_AXE = registerItem("silverite_axe", new AxeItem(ModToolMaterial.SILVERITE, 6, -3.1f,new FabricItemSettings()));
    public static final Item SILVERITE_SHOVEL = registerItem("silverite_shovel", new ShovelItem(ModToolMaterial.SILVERITE, 1, -3f,new FabricItemSettings()));
    public static final Item SILVERITE_SWORD = registerItem("silverite_sword", new SwordItem(ModToolMaterial.SILVERITE, 3, -2.4f,new FabricItemSettings()));
    public static final Item SILVERITE_HOE = registerItem("silverite_hoe", new HoeItem(ModToolMaterial.SILVERITE, -2, -1f,new FabricItemSettings()));

    public static final Item SILVERITE_HELMET = registerItem("silverite_helmet", new ArmorItem(ModArmorMaterials.SILVERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SILVERITE_CHESTPLATE = registerItem("silverite_chestplate", new ArmorItem(ModArmorMaterials.SILVERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SILVERITE_LEGGINGS = registerItem("silverite_leggings", new ArmorItem(ModArmorMaterials.SILVERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SILVERITE_BOOTS = registerItem("silverite_boots", new ArmorItem(ModArmorMaterials.SILVERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item SUNSTONE_SHARD = registerItem("sunstone_shard", new Item(new FabricItemSettings()));

    public static final Item SUNSTONE_PICKAXE = registerItem("sunstone_pickaxe", new PickaxeItem(ModToolMaterial.SUNSTONE, 1, -2.8f,new FabricItemSettings()));
    public static final Item SUNSTONE_AXE = registerItem("sunstone_axe", new AxeItem(ModToolMaterial.SUNSTONE, 6, -3.1f,new FabricItemSettings()));
    public static final Item SUNSTONE_SHOVEL = registerItem("sunstone_shovel", new ShovelItem(ModToolMaterial.SUNSTONE, 1, -3f,new FabricItemSettings()));
    public static final Item SUNSTONE_SWORD = registerItem("sunstone_sword", new SwordItem(ModToolMaterial.SUNSTONE, 3, -2.4f,new FabricItemSettings()));
    public static final Item SUNSTONE_HOE = registerItem("sunstone_hoe", new HoeItem(ModToolMaterial.SUNSTONE, -2, -1f,new FabricItemSettings()));



    public static final Item ENDERSNAIL_SPAWN_EGG = registerItem("endersnail_spawn_egg",
            new SpawnEggItem(ModEntities.ENDERSNAIL,0xa86518,0x3b260f, new FabricItemSettings()));


    public static final Item CHORUS_FRUIT_GOLDEN = registerItem("chorus_fruit_golden", new ChorusFruitGoldenItem(new FabricItemSettings().food(ModFoodComponents.CHORUS_FRUIT_GOLDEN)));
    public static final Item ENDER_BERRIES = registerItem("ender_berries", new Item(new FabricItemSettings().food(ModFoodComponents.ENDER_BERRIES)));


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
