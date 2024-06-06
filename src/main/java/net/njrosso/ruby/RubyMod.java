package net.njrosso.ruby;

import net.fabricmc.api.ModInitializer;

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
	}
}