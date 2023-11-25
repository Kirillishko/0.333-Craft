package org.FarAwayCraft.effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class PenetrationStatusEffect extends StatusEffect {

    public PenetrationStatusEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x56789A);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }

    @Override
    public String toString() {
        return "penetration";
    }
}
