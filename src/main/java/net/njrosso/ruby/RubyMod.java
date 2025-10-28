package net.njrosso.ruby;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.njrosso.ruby.armor.*;
import net.njrosso.ruby.enchantments.ModEnchants;
import net.njrosso.ruby.items.ModItemGroups;
import net.njrosso.ruby.items.ModItems;
import net.njrosso.ruby.items.custom.katana.sayaModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RubyMod implements ModInitializer {
	public static final String MOD_ID = "ruby";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		ModItemGroups.registerTabs();

		ModEnchants.registerModEnchants();

		//registering model layers
		EntityModelLayerRegistry.registerModelLayer(sayaModel.LAYER_LOCATION, sayaModel::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(chestplate.LAYER_LOCATION, chestplate::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(helmet.LAYER_LOCATION, helmet::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(legs.LAYER_LOCATION, legs::createBodyLayer);
		chestplateRenderer.register();
		helmetRenderer.register();
		leggingsRenderer.register();
		bootsBlankRender.register();

		ServerTickEvents.END_SERVER_TICK.register( world -> {
			for (ServerPlayer player : world.getPlayerList().getPlayers())
			{
				player.getEntityData().set(RubyMod.HAS_KATANA, hasItemInInventory(player, ModItems.njrs));
			}
		});
	}

	public static final EntityDataAccessor<Boolean> HAS_KATANA =
			SynchedEntityData.defineId(Player.class, EntityDataSerializers.BOOLEAN);

	private static boolean hasItemInInventory(Player player, Item item) {
		for (ItemStack stack : player.getInventory().items) {
			if (stack.is(item)) return true;
		}
		return false;
	}
}