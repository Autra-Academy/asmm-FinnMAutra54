package net.autra.submerged;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutraSubmerged implements ModInitializer {
	public static final String MOD_ID = "submerged";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Welcome to Autra Academy's Submerged Minecraft Modding Epic Project!");

	}
}