package net.draip.end.entity.custom;

import net.draip.end.entity.ModEntities;
import net.draip.end.entity.ai.EndGhostAttackGoal;
import net.draip.end.entity.ai.WalkingShulkerAttackGoal;
import net.draip.end.sounds.ModSounds;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.scoreboard.ScoreboardCriterion;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.math.random.RandomSplitter;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EndGhostEntity extends AnimalEntity {
    public EndGhostEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
        this.dataTracker.startTracking(ANGER, false);
        this.dataTracker.startTracking(ANGERCOUNT, -2);
        this.dataTracker.startTracking(TEXTURESWITCH, -500);
    }

    private static final TrackedData<Boolean> ANGER =
            DataTracker.registerData(EndGhostEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    public void setAnger(boolean anger) {
        this.dataTracker.set(ANGER, anger);
    }

    public boolean isAngry() {
        return this.dataTracker.get(ANGER);
    }

    private static final TrackedData<Integer> ANGERCOUNT =
            DataTracker.registerData(EndGhostEntity.class, TrackedDataHandlerRegistry.INTEGER);

    public void setAngerCount(int angercount) {
        this.dataTracker.set(ANGERCOUNT, angercount);
    }

    public int isAngryCount() {
        return this.dataTracker.get(ANGERCOUNT);
    }


    private static final TrackedData<Integer> TEXTURESWITCH =
            DataTracker.registerData(EndGhostEntity.class, TrackedDataHandlerRegistry.INTEGER);

    public void setTextureSwitch(int textureswitch) {
        this.dataTracker.set(TEXTURESWITCH, textureswitch);
    }

    public int isTextureSwitch() {
        return this.dataTracker.get(TEXTURESWITCH);
    }


    private static final TrackedData<Boolean> ATTACKING =
            DataTracker.registerData(EndGhostEntity.class, TrackedDataHandlerRegistry.BOOLEAN);

    long lastTextureSwitchTime = 0;
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public final AnimationState attackAnimationState = new AnimationState();
    public int attackAnimationTimeout = 0;

    public static DefaultAttributeContainer.Builder createEndGhostAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 70)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.5)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 7)
                ;
    }

    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 100;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeout;
        }

        if(this.isAttacking() && attackAnimationTimeout <= 0) {
            attackAnimationTimeout = 40;
            attackAnimationState.start(this.age);
        } else {
            --this.attackAnimationTimeout;
        }

        if(!this.isAttacking()) {
            attackAnimationState.stop();
        }
    }

    public void setAttacking(boolean attacking) {
        this.dataTracker.set(ATTACKING, attacking);
    }

    @Override
    public boolean isAttacking() {
        return this.dataTracker.get(ATTACKING);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(ATTACKING, false);
    }

    @Override
    protected void updateLimbs(float posDelta) {
        float f = this.getPose() == EntityPose.STANDING ? Math.min(posDelta * 5.0f, 1.0f) : 0.0f;
        this.limbAnimator.updateLimbs(f, 0.2f);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.getWorld().isClient()) {
            setupAnimationStates();
        } else {
            if (!isAngry()) {
                ServerWorld world = (ServerWorld) this.getEntityWorld();
                List<ServerPlayerEntity> players = world.getPlayers();
                ServerPlayerEntity nearestPlayer = null;
                double nearestDistance = Double.MAX_VALUE;

                for (ServerPlayerEntity player : players) {
                    double distance = this.getPos().distanceTo(player.getPos());
                    if (distance <= 3.0 && distance < nearestDistance) {
                        nearestPlayer = player;
                        nearestDistance = distance;
                    }
                }

                if (nearestPlayer != null) {
                    setAnger(true);
                    setAttacking(nearestPlayer);
                    setAngerCount(30);
                    playSound(ModSounds.ENDGHOST_TRIGGER, 1, 2);

                }
            } else {
                if (isAngryCount() > 0) {
                    decrementAngerCount();
                    if (isAngryCount() == 20) {
                        playSound(ModSounds.ENDGHOST_FLICKER_TWO, 0.3f, 1);
                    } else if (isAngryCount() == 10) {
                        playSound(ModSounds.ENDGHOST_FLICKER_THREE, 0.3f, 2);
                    } else if (isAngryCount() == 29) {
                        playSound(ModSounds.ENDGHOST_FLICKER_THREE, 0.3f, 1);
                    } else if (isAngryCount() == 1) {
                        setTextureSwitch(50);

                        ServerWorld world = (ServerWorld) this.getEntityWorld();
                        List<ServerPlayerEntity> players = world.getPlayers();
                        ServerPlayerEntity nearestPlayer = null;
                        double nearestDistance = Double.MAX_VALUE;

                        for (ServerPlayerEntity player : players) {
                            double distance = this.getPos().distanceTo(player.getPos());
                            if (distance < nearestDistance) {
                                nearestPlayer = player;
                                nearestDistance = distance;
                            }
                        }

                        if (nearestPlayer != null) {
                            this.teleport(nearestPlayer.getX(), nearestPlayer.getY(), nearestPlayer.getZ());
                        }
                    }
                } else if (isAngryCount() == 0){
                    if (isTextureSwitch() > 0) {
                        decrementTextureCount();
                    } else if (isTextureSwitch() < 0) {
                        incrementTextureCount();
                    } else if (isTextureSwitch() == 0) {
                        randomiseTextureCount();
                        ServerWorld world = (ServerWorld) this.getEntityWorld();
                        List<ServerPlayerEntity> players = world.getPlayers();
                        ServerPlayerEntity nearestPlayer = null;
                        double nearestDistance = Double.MAX_VALUE;

                        for (ServerPlayerEntity player : players) {
                            double distance = this.getPos().distanceTo(player.getPos());
                            if (distance < nearestDistance) {
                                nearestPlayer = player;
                                nearestDistance = distance;
                            }
                        }
                    }
                }
            }
        }
    }
    public void decrementAngerCount() {
        int currentCount = isAngryCount();
        setAngerCount(currentCount - 1);
    }

    public void decrementTextureCount() {
        int currentCount = isTextureSwitch();
        setTextureSwitch(currentCount - 1);
    }

    public void incrementTextureCount() {
        int currentCount = isTextureSwitch();
        setTextureSwitch(currentCount + 1);
    }

    public void randomiseTextureCount() {
        int randomCheck = this.random.nextInt(401) - 200;
        setTextureSwitch(randomCheck);
    }



    public void setAttacking(PlayerEntity target) {
        this.dataTracker.set(ATTACKING, true);
        this.setTarget(target);
    }



    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new EndGhostAttackGoal(this, 1D, true));
        this.goalSelector.add(2, new WanderAroundFarGoal(this, 1D));
        this.goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 4f));
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return ModEntities.ENDGHOST.create(world);
    }

    public long getLastTextureSwitchTime() {
        return lastTextureSwitchTime;
    }

    public void setLastTextureSwitchTime(long lastTextureSwitchTime) {
        this.lastTextureSwitchTime = lastTextureSwitchTime;
    }


}
