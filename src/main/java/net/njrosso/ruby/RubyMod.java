package net.njrosso.ruby;

import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.njrosso.ruby.enchantments.ModEnchantmentEffects;
import net.njrosso.ruby.items.ModItemGroups;
import net.njrosso.ruby.items.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(RubyMod.MODID)
public class RubyMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "ruby";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();
    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public RubyMod(IEventBus modEventBus, ModContainer modContainer)
    {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        ModItems.ITEMS.register(modEventBus);
        ModItemGroups.CREATIVE_MODE_TAB.register(modEventBus);
        ModEnchantmentEffects.register(modEventBus);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    public static final EntityDataAccessor<Boolean> HAS_KATANA =
            SynchedEntityData.defineId(Player.class, EntityDataSerializers.BOOLEAN);
    public static final EntityDataAccessor<Boolean> HAS_KATANA_ENCHANTED =
            SynchedEntityData.defineId(Player.class, EntityDataSerializers.BOOLEAN);

    @SubscribeEvent
    public void onPlayerTick(PlayerTickEvent.Post event) {
        if (event.getEntity() instanceof ServerPlayer serverPlayer) {
            serverPlayer.getEntityData().set(RubyMod.HAS_KATANA, hasItemInInventory(serverPlayer, ModItems.njrs.get()));
        }
        if (event.getEntity() instanceof ServerPlayer serverPlayer) {
            serverPlayer.getEntityData().set(RubyMod.HAS_KATANA_ENCHANTED, isItemInInventoryEnchanted(serverPlayer, ModItems.njrs.get()));
        }
    }

    private static boolean hasItemInInventory(Player player, Item item) {
        for (ItemStack stack : player.getInventory().items) {
            if (stack.is(item)) return true;
        }
        return false;
    }

    private static boolean isItemInInventoryEnchanted(Player player, Item item) {
        for (ItemStack stack : player.getInventory().items) {
            if (stack.is(item)) return stack.isEnchanted();
        }
        return false;
    }
}
