package net.draip.end.entity.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.projectile.ShulkerBulletEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.entity.damage.DamageSource;


import java.util.List;

public class ExplosiveShulkerBulletEntity extends ShulkerBulletEntity {
    public ExplosiveShulkerBulletEntity(EntityType<ExplosiveShulkerBulletEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        super.onBlockHit(blockHitResult);

        BlockPos hitPos = blockHitResult.getBlockPos();
        World world = this.getWorld();
        List<Entity> entities = world.getEntitiesByClass(Entity.class, new Box(hitPos).expand(5.0D), entity -> true);

        for (Entity entity : entities) {
            if (entity instanceof LivingEntity) {
                Vec3d entityPos = entity.getPos();
                Vec3d shulkerPos = this.getPos().subtract(0, 1, 0);
                Vec3d motion = entityPos.subtract(shulkerPos).normalize().multiply(1);
                entity.addVelocity(motion.x, motion.y*2, motion.z);
            }
            ((ServerWorld)this.getWorld()).spawnParticles(ParticleTypes.EXPLOSION, this.getX(), this.getY(), this.getZ(), 1, 0.5, 0.5, 0.5, 3);

        }
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);

        BlockPos hitPos = entityHitResult.getEntity().getSteppingPos();
        World world = this.getWorld();
        List<Entity> entities = world.getEntitiesByClass(Entity.class, new Box(hitPos).expand(5.0D), entity -> true);

        for (Entity entity : entities) {
            if (entity instanceof LivingEntity livingEntity) {

                Vec3d entityPos = entity.getPos();
                Vec3d shulkerPos = this.getPos().subtract(0, 1, 0);
                Vec3d motion = entityPos.subtract(shulkerPos).normalize().multiply(1);
                entity.addVelocity(motion.x, motion.y*2, motion.z);
            }
            ((ServerWorld)this.getWorld()).spawnParticles(ParticleTypes.EXPLOSION, this.getX(), this.getY(), this.getZ(), 1, 0.5, 0.5, 0.5, 3);

        }
    }
}
