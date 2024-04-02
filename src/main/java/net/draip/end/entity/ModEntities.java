package net.draip.end.entity;

import net.draip.end.DraipEnd;
import net.draip.end.entity.custom.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<EnderSnailEntity> ENDERSNAIL = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(DraipEnd.MOD_ID,"endersnail"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,EnderSnailEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f,0.4f)).build());

    public static final EntityType<FireFlyEntity> FIREFLY = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(DraipEnd.MOD_ID,"firefly"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FireFlyEntity::new)
                    .dimensions(EntityDimensions.fixed(0.2f,0.2f)).build());

    public static final EntityType<EndGhostEntity> ENDGHOST = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(DraipEnd.MOD_ID,"endghost"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, EndGhostEntity::new)
                    .dimensions(EntityDimensions.fixed(1f,2.2f)).build());

    public static final EntityType<WalkingShulkerEntity> WALKINGSHULKER = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(DraipEnd.MOD_ID,"walkingshulker"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, WalkingShulkerEntity::new)
                    .dimensions(EntityDimensions.fixed(1.0f,1.0f)).build());

    public static final EntityType<ExplosiveShulkerShellProjectile> EXPLOSIVE_SHULKER_SHELL = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(DraipEnd.MOD_ID, "explosive_shulker_shell"),
            FabricEntityTypeBuilder.<ExplosiveShulkerShellProjectile>create(SpawnGroup.MISC, ExplosiveShulkerShellProjectile::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());


}
