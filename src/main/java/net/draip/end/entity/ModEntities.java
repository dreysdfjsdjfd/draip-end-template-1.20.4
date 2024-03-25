package net.draip.end.entity;

import net.draip.end.DraipEnd;
import net.draip.end.entity.custom.EnderSnailEntity;
import net.draip.end.entity.custom.FireFlyEntity;
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


}
