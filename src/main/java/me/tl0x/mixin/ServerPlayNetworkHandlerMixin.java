package me.tl0x.mixin;

import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static me.tl0x.SAntiCheatDisabler.cancelledReasons;

@Mixin(ServerPlayNetworkHandler.class)
public class ServerPlayNetworkHandlerMixin {

    @Inject(method="disconnect", at=@At("HEAD"), cancellable = true)
    public void disconnect(Text reason, CallbackInfo ci) {
        if (cancelledReasons.contains(reason)) {
            ci.cancel();
        }
    }
}
