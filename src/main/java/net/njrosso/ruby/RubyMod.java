package net.njrosso.ruby;

import com.mojang.logging.LogUtils;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.njrosso.ruby.enchantments.EnchantInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.njrosso.ruby.items.ModItems;
import org.slf4j.Logger;

@Mod("ruby")
public class RubyMod {
    public static final String MODID = "ruby";
    private static final Logger LOGGER = LogUtils.getLogger();

    public RubyMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(eventBus);
        eventBus.addListener(this::setup);
        EnchantInit.register(eventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(FMLCommonSetupEvent event) {
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