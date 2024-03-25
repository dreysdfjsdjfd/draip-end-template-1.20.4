package net.draip.end.entity.client;

import net.draip.end.DraipEnd;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer ENDERSNAIL =
            new EntityModelLayer(new Identifier(DraipEnd.MOD_ID, "endersnail"), "main");

    public static final EntityModelLayer FIREFLY =
            new EntityModelLayer(new Identifier(DraipEnd.MOD_ID, "firefly"), "main");
}