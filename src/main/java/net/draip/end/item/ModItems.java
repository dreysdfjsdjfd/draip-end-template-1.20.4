package net.draip.end.item;

import net.draip.end.DraipEnd;
import net.draip.end.block.custom.EnderBerryCropBlock;
import net.draip.end.entity.ModEntities;
import net.draip.end.item.custom.ChorusFruitGoldenItem;
import net.draip.end.item.custom.ShulkerCannonItem;
import net.draip.end.item.custom.ShulkerShellItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item augrite_DUST = registerItem("augrite_dust", new Item(new FabricItemSettings()));
    public static final Item augrite_INGOT = registerItem("augrite_ingot", new Item(new FabricItemSettings()));
    public static final Item SHULKER_BULLET = registerItem("shulker_bullet", new Item(new FabricItemSettings()));
    //public static final Item SHULKER_CANNON = registerItem("shulker_cannon", new ShulkerCannonItem(new FabricItemSettings().maxCount(1)));

    public static final Item ENDSTONE_PICKAXE = registerItem("endstone_pickaxe", new PickaxeItem(ModToolMaterial.ENDSTONE, 1, -2.8f,new FabricItemSettings()));
    public static final Item ENDSTONE_AXE = registerItem("endstone_axe", new AxeItem(ModToolMaterial.ENDSTONE, 6, -3.1f,new FabricItemSettings()));
    public static final Item ENDSTONE_SHOVEL = registerItem("endstone_shovel", new ShovelItem(ModToolMaterial.ENDSTONE, 1, -3f,new FabricItemSettings()));
    public static final Item ENDSTONE_SWORD = registerItem("endstone_sword", new SwordItem(ModToolMaterial.ENDSTONE, 3, -2.4f,new FabricItemSettings()));
    public static final Item ENDSTONE_HOE = registerItem("endstone_hoe", new HoeItem(ModToolMaterial.ENDSTONE, -2, -1f,new FabricItemSettings()));

    public static final Item augrite_PICKAXE = registerItem("augrite_pickaxe", new PickaxeItem(ModToolMaterial.augrite, 1, -2.8f,new FabricItemSettings()));
    public static final Item augrite_AXE = registerItem("augrite_axe", new AxeItem(ModToolMaterial.augrite, 6, -3.1f,new FabricItemSettings()));
    public static final Item augrite_SHOVEL = registerItem("augrite_shovel", new ShovelItem(ModToolMaterial.augrite, 1, -3f,new FabricItemSettings()));
    public static final Item augrite_SWORD = registerItem("augrite_sword", new SwordItem(ModToolMaterial.augrite, 3, -2.4f,new FabricItemSettings()));
    public static final Item augrite_HOE = registerItem("augrite_hoe", new HoeItem(ModToolMaterial.augrite, -2, -1f,new FabricItemSettings()));

    public static final Item augrite_HELMET = registerItem("augrite_helmet", new ArmorItem(ModArmorMaterials.augrite, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item augrite_CHESTPLATE = registerItem("augrite_chestplate", new ArmorItem(ModArmorMaterials.augrite, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item augrite_LEGGINGS = registerItem("augrite_leggings", new ArmorItem(ModArmorMaterials.augrite, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item augrite_BOOTS = registerItem("augrite_boots", new ArmorItem(ModArmorMaterials.augrite, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item auravine_SHARD = registerItem("auravine_shard", new Item(new FabricItemSettings()));

    public static final Item auravine_PICKAXE = registerItem("auravine_pickaxe", new PickaxeItem(ModToolMaterial.auravine, 1, -2.8f,new FabricItemSettings()));
    public static final Item auravine_AXE = registerItem("auravine_axe", new AxeItem(ModToolMaterial.auravine, 6, -3.1f,new FabricItemSettings()));
    public static final Item auravine_SHOVEL = registerItem("auravine_shovel", new ShovelItem(ModToolMaterial.auravine, 1, -3f,new FabricItemSettings()));
    public static final Item auravine_SWORD = registerItem("auravine_sword", new SwordItem(ModToolMaterial.auravine, 3, -2.4f,new FabricItemSettings()));
    public static final Item auravine_HOE = registerItem("auravine_hoe", new HoeItem(ModToolMaterial.auravine, -2, -1f,new FabricItemSettings()));

    public static final Item auravine_HELMET = registerItem("auravine_helmet", new ArmorItem(ModArmorMaterials.auravine, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item auravine_CHESTPLATE = registerItem("auravine_chestplate", new ArmorItem(ModArmorMaterials.auravine, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item auravine_LEGGINGS = registerItem("auravine_leggings", new ArmorItem(ModArmorMaterials.auravine, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item auravine_BOOTS = registerItem("auravine_boots", new ArmorItem(ModArmorMaterials.auravine, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item evil_CHESTPLATE = registerItem("evil_chestplate", new ArmorItem(ModArmorMaterials.evil, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item leafy_ENDER_HELMET = registerItem("leafy_ender_helmet", new ArmorItem(ModArmorMaterials.leafy, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item leafy_ENDER_CHESTPLATE = registerItem("leafy_ender_chestplate", new ArmorItem(ModArmorMaterials.leafy, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item leafy_ENDER_LEGGINGS = registerItem("leafy_ender_leggings", new ArmorItem(ModArmorMaterials.leafy, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item leafy_ENDER_BOOTS = registerItem("leafy_ender_boots", new ArmorItem(ModArmorMaterials.leafy, ArmorItem.Type.BOOTS, new FabricItemSettings()));




    public static final Item ENDERSNAIL_SPAWN_EGG = registerItem("endersnail_spawn_egg",
            new SpawnEggItem(ModEntities.ENDERSNAIL,0xa86518,0x3b260f, new FabricItemSettings()));


    public static final Item CHORUS_FRUIT_GOLDEN = registerItem("chorus_fruit_golden", new ChorusFruitGoldenItem(new FabricItemSettings().food(ModFoodComponents.CHORUS_FRUIT_GOLDEN)));
    public static final Item ENDER_BERRIES = registerItem("ender_berries", new Item(new FabricItemSettings().food(ModFoodComponents.ENDER_BERRIES)));
    public static final Item BUTTER_NUT_BERRY = registerItem("butter_nut_berry", new Item(new FabricItemSettings().food(ModFoodComponents.BUTTER_NUT_BERRY)));


    private static void addItemsToIngredientTabItemGrouo(FabricItemGroupEntries entries) {
        entries.add(augrite_DUST);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DraipEnd.MOD_ID, name), item);
    }
    public static void registerModItems () {
        DraipEnd.LOGGER.info("Registering Mod Items for " + DraipEnd.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGrouo);

    }
}
