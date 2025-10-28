package net.njrosso.ruby;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.njrosso.ruby.items.custom.katana.sayaRenderer;

public class RubyModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        LivingEntityFeatureRendererRegistrationCallback.EVENT.register(
            (entityType, entityRenderer, registrationHelper, context) -> {
                if (entityRenderer instanceof PlayerRenderer playerRenderer) {
                    registrationHelper.register(
                            new sayaRenderer<>(playerRenderer)
                    );
                }
            });
    }
}
