package net.draip.end.util;

import net.draip.end.item.ModItems;
import net.draip.end.item.custom.ShulkerCannonItem;
import net.draip.end.item.custom.ShulkerShellItem;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.entity.projectile.ShulkerBulletEntity;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModModelPredicateProvider {
    public static void RegisterModModels() {
        registerCannon(ModItems.SHULKER_BULLET);
    }

    private static void registerCannon(Item Shulker_Cannon) {
        ModelPredicateProviderRegistry.register(Shulker_Cannon, new Identifier("charged"),
                (stack, world, entity, isCharged) -> ShulkerShellItem.charged == 1 ? 1.0f : 0.0f);
        ModelPredicateProviderRegistry.register(Shulker_Cannon, new Identifier("drop"),
                (stack, world, entity, chargeTime) -> ShulkerShellItem.chargeTime >= 1 ? 1.0f : 0.0f);
        ModelPredicateProviderRegistry.register(Shulker_Cannon, new Identifier("droppercent"),
               (stack, world, entity, chargeTime) -> (ShulkerShellItem.chargeTime / 26.0f));
   }



}
