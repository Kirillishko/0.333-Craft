package org.FarAwayCraft.effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class PenetrationStatusEffect extends StatusEffect {

    public PenetrationStatusEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x56789A);
    }

    @Override
    public String toString() {
        return "penetration";
    }
}
