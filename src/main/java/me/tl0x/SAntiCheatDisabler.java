package me.tl0x;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

import java.util.ArrayList;
import java.util.List;

public class SAntiCheatDisabler implements DedicatedServerModInitializer  {

    public static List<Text> cancelledReasons = new ArrayList<>();

    @Override
    public void onInitializeServer() {
        AntiCheatDisabler.LOGGER.info("Cancelling Checks");

        this.addLog(new TranslatableText("multiplayer.disconnect.flying"));
        this.addLog(new TranslatableText("multiplayer.disconnect.flying"));
        this.addLog(new TranslatableText("disconnect.timeout"));
        this.addLog(new TranslatableText("multiplayer.disconnect.idling"));
        this.addLog(new TranslatableText("multiplayer.disconnect.invalid_vehicle_movement"));
        this.addLog(new TranslatableText("multiplayer.disconnect.invalid_player_movement"));
        this.addLog(new TranslatableText("multiplayer.requiredTexturePrompt.disconnect"));
        this.addLog(new TranslatableText("multiplayer.disconnect.illegal_characters"));
        this.addLog(new TranslatableText("disconnect.spam"));
        this.addLog(new TranslatableText("multiplayer.disconnect.invalid_entity_attacked"));
        this.addLog(new TranslatableText("disconnect.timeout"));
    }

    public void addLog(TranslatableText text) {
        cancelledReasons.add(text);
        AntiCheatDisabler.LOGGER.info("ADDED: " + text.getKey());
    }
}
