package ruby;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ruby.enchantments.EnchantInit;
import ruby.modTier.ModItemTier;

@Mod(rubymod.MOD_ID)
public class rubymod {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "ruby";

    public rubymod() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);

        ModItems.ITEMS.register(modEventBus);
        EnchantInit.Enchants.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }
}
