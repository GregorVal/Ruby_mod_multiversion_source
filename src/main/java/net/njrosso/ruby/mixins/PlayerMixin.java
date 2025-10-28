package net.njrosso.ruby.mixins;

import net.minecraft.world.entity.player.Player;
import net.njrosso.ruby.RubyMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Player.class)
public class PlayerMixin {
    @Inject(
            method = "defineSynchedData",
            at = @At("TAIL")
    )
    private void ruby$injectCustomData(CallbackInfo ci) {
        Player player = (Player) (Object) this;
        player.getEntityData().define(RubyMod.HAS_KATANA, false);
    }
}