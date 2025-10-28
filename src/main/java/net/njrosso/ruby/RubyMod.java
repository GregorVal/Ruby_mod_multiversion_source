package net.njrosso.ruby;

import com.mojang.logging.LogUtils;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.njrosso.ruby.items.ModItemGroups;
import net.njrosso.ruby.items.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RubyMod.MODID)
public class RubyMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "ruby";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();
    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public RubyMod(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        ModItems.ITEMS.register(modEventBus);
        ModItemGroups.CREATIVE_MODE_TAB.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    public static final EntityDataAccessor<Boolean> HAS_KATANA =
            SynchedEntityData.defineId(Player.class, EntityDataSerializers.BOOLEAN);
    public static final EntityDataAccessor<Boolean> HAS_KATANA_ENCHANTED =
            SynchedEntityData.defineId(Player.class, EntityDataSerializers.BOOLEAN);

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END && event.player instanceof ServerPlayer serverPlayer) {
            serverPlayer.getEntityData().set(RubyMod.HAS_KATANA, hasItemInInventory(serverPlayer, ModItems.njrs.get()));
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
