package net.laneboyandrew.tutorialmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 1000), 1f).build();
}
