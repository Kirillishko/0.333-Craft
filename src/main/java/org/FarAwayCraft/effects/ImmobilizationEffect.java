package org.FarAwayCraft.effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ImmobilizationEffect extends StatusEffect {

    protected ImmobilizationEffect() {
        super(StatusEffectCategory.HARMFUL, 0x345678);
    }

    @Override
    public String toString() {
        return "immobilization";
    }
}
