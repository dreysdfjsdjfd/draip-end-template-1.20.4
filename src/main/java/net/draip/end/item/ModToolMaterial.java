package net.draip.end.item;

import net.draip.end.util.ModTags;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    augrite(MiningLevels.IRON, 250, 6.0f, 2.0f, 14,
            () -> Ingredient.ofItems(ModItems.augrite_INGOT)),
    ENDSTONE(MiningLevels.STONE, 131, 4.0f, 1.0f, 5,
            () -> Ingredient.ofItems(Blocks.END_STONE)),
    auravine(MiningLevels.DIAMOND, 1561, 8.0f, 3.0f, 10,
            () -> Ingredient.ofItems(ModItems.auravine_SHARD));




    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }




    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
