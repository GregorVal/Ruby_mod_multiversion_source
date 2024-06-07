package net.njrosso.ruby;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.njrosso.ruby.armor.*;
import net.njrosso.ruby.items.ModItemGroups;
import net.njrosso.ruby.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RubyMod implements ModInitializer {
	public static final String MOD_ID = "ruby";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroups.registerTabs();

		EntityModelLayerRegistry.registerModelLayer(chestplate.LAYER_LOCATION, chestplate::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(helmet.LAYER_LOCATION, helmet::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(legs.LAYER_LOCATION, legs::createBodyLayer);
		chestplateRenderer.register();
		helmetRenderer.register();
		leggingsRenderer.register();
		bootsBlankRender.register();
	}
}