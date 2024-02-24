package net.draip.end.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public  static  final FoodComponent CHORUS_FRUIT_GOLDEN = new FoodComponent.Builder().hunger(5).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400),1).alwaysEdible().build();
}
