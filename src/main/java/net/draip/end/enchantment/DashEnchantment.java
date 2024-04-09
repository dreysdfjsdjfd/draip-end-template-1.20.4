package net.draip.end.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class DashEnchantment extends Enchantment {
    protected DashEnchantment(Rarity rarity, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(rarity, target, slotTypes);
    }


    @Override
    public int getMaxLevel() {
        return 3;
    }


}
