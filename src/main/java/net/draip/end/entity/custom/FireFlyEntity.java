package net.draip.end.entity.custom;


import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.FlyingEntity;
import net.minecraft.entity.mob.GhastEntity;
import net.minecraft.entity.mob.MobEntity;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.system.Pointer;

import java.util.EnumSet;

public class FireFlyEntity extends FlyingEntity{

    public FireFlyEntity(EntityType<? extends FlyingEntity> entityType, World world) {
        super(entityType, world);
    }
    long lastTextureSwitchTime = 0;

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(4, new FlyRandomlyGoal(this));
    }

    public static DefaultAttributeContainer.Builder createFireFlyAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 2)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1f)
                .add(EntityAttributes.GENERIC_FLYING_SPEED, 1f);
    }

    static class FlyRandomlyGoal
            extends Goal {
        private final FireFlyEntity firefly;

        public FlyRandomlyGoal(FireFlyEntity firefly) {
            this.firefly = firefly;
            this.setControls(EnumSet.of(Control.MOVE));
        }

        @Override
        public boolean canStart() {
            double f;
            double e;
            MoveControl moveControl = this.firefly.getMoveControl();
            if (!moveControl.isMoving()) {
                return true;
            }
            double d = moveControl.getTargetX() - this.firefly.getX();
            double g = d * d + (e = moveControl.getTargetY() - this.firefly.getY()) * e + (f = moveControl.getTargetZ() - this.firefly.getZ()) * f;
            return g < 1.0 || g > 3600.0;
        }

        @Override
        public boolean shouldContinue() {
            return false;
        }

        @Override
        public void start() {
            Random random = this.firefly.getRandom();
            double d = this.firefly.getX() + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
            double e = this.firefly.getY() + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
            double f = this.firefly.getZ() + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
            this.firefly.getMoveControl().moveTo(d, e, f, 1.0);
        }

    }

    public long getLastTextureSwitchTime() {
        return lastTextureSwitchTime;
    }

    public void setLastTextureSwitchTime(long lastTextureSwitchTime) {
        this.lastTextureSwitchTime = lastTextureSwitchTime;
    }
}

