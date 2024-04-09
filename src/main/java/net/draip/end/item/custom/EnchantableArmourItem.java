package net.draip.end.item.custom;

import net.draip.end.enchantment.ModEnchantments;
import net.draip.end.item.ModItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtElement;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Map;

public class EnchantableArmourItem extends ArmorItem {


    public EnchantableArmourItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    static int dashCooldown = 60;
    static int fallDistanceReset = 0;
    static int dashLevel = 0;


    public static int isDashCooldown() {
        return dashCooldown;
    }

    public static int isDashLevel() {
        return dashLevel;
    }

    public static void CheckForCooldown() {
        if (dashCooldown == 0) {
            dashCooldown = 65;
            fallDistanceReset = 1;

        }
    }

    @Override
    public TypedActionResult<ItemStack> equipAndSwap(Item item, World world, PlayerEntity user, Hand hand) {
        dashLevel = 0;
        return super.equipAndSwap(item, world, user, hand);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof PlayerEntity player && stack.getItem() instanceof ArmorItem armor && armor.getSlotType() == EquipmentSlot.LEGS) {

            boolean isLeggingsEquipped = player.getEquippedStack(EquipmentSlot.LEGS).getItem() == stack.getItem();


            if (isLeggingsEquipped) {
                boolean hasDashEnchantment = false;
                Map<Enchantment, Integer> enchantments = EnchantmentHelper.get(stack);
                if (enchantments.containsKey(ModEnchantments.DASH)) {
                    hasDashEnchantment = true;
                }

                if (!hasDashEnchantment) {
                    dashLevel = 0;
                } else {
                    if (enchantments.containsKey(ModEnchantments.DASH)) {

                        if (dashCooldown >= 1) {
                            dashCooldown--;

                        }

                        if (fallDistanceReset == 1) {

                            player.fallDistance = 0;

                            if (player.isOnGround()) {
                                fallDistanceReset = 0;

                            }
                        }
                        if (enchantments.containsKey(ModEnchantments.DASH) && enchantments.get(ModEnchantments.DASH) == 1) {
                            dashLevel = 1;
                        } else if (enchantments.containsKey(ModEnchantments.DASH) && enchantments.get(ModEnchantments.DASH) == 2) {
                            dashLevel = 2;
                        } else if (enchantments.containsKey(ModEnchantments.DASH) && enchantments.get(ModEnchantments.DASH) == 3) {
                            dashLevel = 3;
                        }
                    }
                }
            } else {
                dashLevel = 0;
            }


            }
            super.inventoryTick(stack, world, entity, slot, selected);
    }
}