package net.draip.end.particle;


import net.draip.end.DraipEnd;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {


    public static final DefaultParticleType WINDY_LEAVES_PARTICLE = registerParticle("windy_leaves", FabricParticleTypes.simple());
    public static final DefaultParticleType ALVES_LEAVES_PARTICLE = registerParticle("alves_leaves", FabricParticleTypes.simple());
    public static final DefaultParticleType NUT_LEAVES_PARTICLE = registerParticle("nut_leaves", FabricParticleTypes.simple());

    private static DefaultParticleType registerParticle(String name, DefaultParticleType particleType) {
        Identifier id = new Identifier(DraipEnd.MOD_ID, name);
        return Registry.register(Registries.PARTICLE_TYPE, id, particleType);
    }




    public static void registerParticles() {
        DraipEnd.LOGGER.info("Registering Mod Particles for " + DraipEnd.MOD_ID);
    }
}

