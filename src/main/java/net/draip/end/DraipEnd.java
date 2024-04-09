package net.draip.end;

import net.draip.end.block.ModBlocks;
import net.draip.end.enchantment.ModEnchantments;
import net.draip.end.entity.ModEntities;
import net.draip.end.entity.custom.*;
import net.draip.end.item.ModItemGroups;
import net.draip.end.item.ModItems;
import net.draip.end.particle.ModParticles;
import net.draip.end.sounds.ModSounds;
//import net.draip.end.util.ModModelPredicateProvider;
import net.draip.end.util.ModModelPredicateProvider;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.TransparentBlock;
import net.minecraft.entity.projectile.ShulkerBulletEntity;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DraipEnd implements ModInitializer {
	public static final String MOD_ID = "draip-end";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final DefaultParticleType ALVES_LEAVES = FabricParticleTypes.simple();


	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
		ModEnchantments.registerModEnchantments();
		ModModelPredicateProvider.RegisterModModels();




		FabricDefaultAttributeRegistry.register(ModEntities.ENDERSNAIL, EnderSnailEntity.createEnderSnailAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.FIREFLY, FireFlyEntity.createFireFlyAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.ENDGHOST, EndGhostEntity.createEndGhostAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.WALKINGSHULKER, WalkingShulkerEntity.createWalkingShulkerAttributes());

		StrippableBlockRegistry.register(ModBlocks.ENDER_ALVES_LOG, ModBlocks.STRIPPED_ENDER_ALVES_LOG);
		StrippableBlockRegistry.register(ModBlocks.ENDER_ALVES_WOOD, ModBlocks.STRIPPED_ENDER_ALVES_WOOD);

		ModParticles.registerParticles();
	}
}