package ruby.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ruby.rubymod;

public class EnchantInit {
    public static final DeferredRegister<Enchantment> Enchants = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, rubymod.MOD_ID);

    public static final RegistryObject<Enchantment> fire_sweep = Enchants.register("fire_sweep", fire_sweep::new);
    public static final RegistryObject<Enchantment> fire_thorns = Enchants.register("fire_thorns", fire_thorns::new);
}