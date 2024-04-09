package net.draip.end.enchantment;

import net.draip.end.DraipEnd;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {
    public static Enchantment DASH = register("dash", new DashEnchantment(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.ARMOR_LEGS));


    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(DraipEnd.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering Enchantments for " + DraipEnd.MOD_ID);
    }
}