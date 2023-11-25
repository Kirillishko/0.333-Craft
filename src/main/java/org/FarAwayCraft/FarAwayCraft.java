package org.FarAwayCraft;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.FarAwayCraft.effects.EffectsLoader;

public class FarAwayCraft implements ModInitializer {
	public static final String MOD_ID = "farawaycraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		EffectsLoader.registerEffects();
		LOGGER.info("Hello Fabric world!");
	}
}