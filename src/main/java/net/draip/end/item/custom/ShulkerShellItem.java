package net.draip.end.item.custom;

import net.draip.end.entity.ModEntities;
import net.draip.end.entity.custom.ExplosiveShulkerBulletEntity;
import net.draip.end.item.ModItems;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ShulkerShellItem extends Item {
    public ShulkerShellItem(Settings settings) {
        super(settings);
    }

    private static final int MAX_USE_TIME = 200;
    public static float charged = 0;

    public void setCharged(float charged) {
        ShulkerShellItem.charged = charged;
    }

    public float isCharged() {
        return charged;
    }


    public static float chargeTime = 0;

    public void setChargeTime(float chargeTime) {
        ShulkerShellItem.chargeTime = chargeTime;
    }

    public float isChargeTime() {
        return chargeTime;
    }

    public static float antiCharge = 0;

    public void setAntiCharge(float antiCharge) {
        ShulkerShellItem.antiCharge = antiCharge;
    }

    public float isAntiCharge() {
        return antiCharge;
    }

    public static float chargeTimeOne = (charged /= 9);

    public float isChargeTimeOne() {
        return chargeTimeOne;
    }


    public void incrementChargeTime() {
        float currentCount = isChargeTime();
        setChargeTime(currentCount + 1);
    }

    public void decrimentAntiCharge() {
        float currentCount = isAntiCharge();
        setAntiCharge(currentCount - 1);
    }


    @Override
    public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {
        if (user instanceof ServerPlayerEntity serverPlayerEntity) {
            if (isCharged() == 1) {
                setCharged(0);
                setAntiCharge(8);
            } else if (isCharged() == 0) {
                if (isAntiCharge() != 0) {
                    decrimentAntiCharge();
                } else if (isAntiCharge() == 0) {
                    incrementChargeTime();
                    if (chargeTime == 9) {
                        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SHULKER_HURT_CLOSED, SoundCategory.NEUTRAL, 0.5f, 1.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));
                    } else if (chargeTime == 18) {
                        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SHULKER_HURT_CLOSED, SoundCategory.NEUTRAL, 0.5f, 1.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));
                    } else if (chargeTime == 27) {
                        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SHULKER_HURT_CLOSED, SoundCategory.NEUTRAL, 0.5f, 2f / (world.getRandom().nextFloat() * 0.4f + 0.8f));

                    }
                }
            }
        }
        super.usageTick(world, user, stack, remainingUseTicks);
    }


    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 200;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        PlayerEntity user = MinecraftClient.getInstance().player;

        if (user == null) {
            return UseAction.NONE;
        }
        if (isCharged() == 1) {
            return UseAction.NONE;
        }

        if (isAntiCharge() != 0) {
            return UseAction.NONE;
        } else if (isAntiCharge() == 0) {

            return UseAction.BOW;
        } else
            return UseAction.BOW;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (isCharged() == 1) {
            shulkerRemove(user);

            world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SHULKER_SHOOT, SoundCategory.NEUTRAL, 0.5f, 0.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));
            if (!world.isClient) {
                ExplosiveShulkerBulletEntity explosiveShulkerBulletEntity = new ExplosiveShulkerBulletEntity(ModEntities.EXPLOSIVESHULKERBULLET, world);
                explosiveShulkerBulletEntity.setPos(user.getX(), user.getY() + 1.7, user.getZ());
                world.spawnEntity(explosiveShulkerBulletEntity);
                explosiveShulkerBulletEntity.setVelocity(user, user.getPitch() + -3, user.getYaw(), 0.0f, 1.5f, 1.0f);
            }

        } else if (isCharged() == 0) {
            setChargeTime(1);
        }
        System.out.println("test");
        return ItemUsage.consumeHeldItem(world, user, hand);
    }

    public void shulkerRemove(LivingEntity entity) {
        if (entity instanceof PlayerEntity player) {
            PlayerInventory inventory = player.getInventory();
            for (int i = 0; i < inventory.size(); i++) {
                ItemStack stack = inventory.getStack(i);
                if (stack.getItem() == ModItems.SHULKER_BULLET) {
                    stack.decrement(1); // Decrease the stack size by 1
                    if (stack.isEmpty()) {
                        inventory.removeStack(i); // Remove the stack if it's empty
                    }
                    break;
                }
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.charge_with_shulker_bullets").formatted(Formatting.DARK_GRAY));
        super.appendTooltip(stack, world, tooltip, context);
    }


    @Override
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {

        System.out.println(chargeTime);
        if (chargeTime >= 26) {
            setCharged(1);
            setChargeTime(0);
            world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SHULKER_SHOOT, SoundCategory.NEUTRAL, 0.5f, 1.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));
        } else if (chargeTime < 26) {
            setChargeTime(0);
            setAntiCharge(0);
        }
        super.onStoppedUsing(stack, world, user, remainingUseTicks);
    }

}