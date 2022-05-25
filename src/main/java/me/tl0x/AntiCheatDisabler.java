package me.tl0x;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AntiCheatDisabler implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("atd");

	@Override
	public void onInitialize() {
		LOGGER.info("Main ModInitalizer");
	}
}
