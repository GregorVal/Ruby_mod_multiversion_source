package net.njrosso.ruby.items;

import java.util.function.Supplier;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.njrosso.ruby.RubyMod;

public class ModItemGroups {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB  =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RubyMod.MODID);

    public static final Supplier<CreativeModeTab> Ruby = CREATIVE_MODE_TAB.register("ruby",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.Ruby"))
                    .icon(() -> new ItemStack(ModItems.njrs.get())).displayItems(((displayContext, entries) -> {
                        entries.accept(ModItems.njingot.get());
                        entries.accept(ModItems.njrs.get());
                        entries.accept(ModItems.njrhelm.get());
                        entries.accept(ModItems.njrchestplate.get());
                        entries.accept(ModItems.njrleg.get());
                        entries.accept(ModItems.njrboots.get());
                        entries.accept(ModItems.master_katana.get());
                    })).build());


    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TAB.register(modEventBus);
    }
}
