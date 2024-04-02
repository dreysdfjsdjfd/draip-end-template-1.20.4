package net.draip.end.sounds;

import net.draip.end.DraipEnd;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent ENDGHOST_TRIGGER = registerSoundEvent("endghost_trigger");
    public static final SoundEvent ENDGHOST_FLICKER_ONE = registerSoundEvent("endghost_flicker_one");
    public static final SoundEvent ENDGHOST_FLICKER_TWO = registerSoundEvent("endghost_flicker_two");
    public static final SoundEvent ENDGHOST_FLICKER_THREE = registerSoundEvent("endghost_flicker_three");



    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(DraipEnd.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        DraipEnd.LOGGER.info("Registering Sounds for " + DraipEnd.MOD_ID);
    }
}
