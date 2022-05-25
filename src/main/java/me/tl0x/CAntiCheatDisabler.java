package me.tl0x;

import net.fabricmc.api.ClientModInitializer;

import javax.swing.*;

public class CAntiCheatDisabler implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        AntiCheatDisabler.LOGGER.warn("This Mod is not meant to be used on a client.");
    }
}
