package org.FarAwayCraft.effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.FarAwayCraft.FarAwayCraft;

public class Effects {

    public static final StatusEffect Penetration = new PenetrationStatusEffect();

    private static void registerEffect(StatusEffect effect) {
        Registry.register(Registries.STATUS_EFFECT, new Identifier(FarAwayCraft.MOD_ID, effect.toString()), effect);
    }

    public static void registerEffects() {
        registerEffect(Penetration);
        FarAwayCraft.LOGGER.debug("Initialized");
    }
}
