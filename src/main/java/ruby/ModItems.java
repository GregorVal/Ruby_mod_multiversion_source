package ruby;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ruby.SpItem.ruby_sw;
import ruby.armor.bootsItem;
import ruby.armor.chestplateItem;
import ruby.armor.helmetItem;
import ruby.armor.leggingsItem;
import ruby.modTier.ModArmorMaterials;
import ruby.modTier.ModItemTier;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, rubymod.MOD_ID);


    public static final RegistryObject<Item> ruby_sw = ITEMS.register("ruby_sw",
            () -> new ruby_sw(ModItemTier.ruby, 0,-2.4F, new Item.Properties().tab(ModTab.ruby)));

    static final RegistryObject<Item> mcd_master_katana = ITEMS.register("mcd_master_katana",
            () -> new ruby_sw(ModItemTier.ruby, 0,-2.4F, new Item.Properties().tab(ModTab.ruby)));

    public static final RegistryObject<Item> njrsingot = ITEMS.register("njrsingot",
            () -> new Item(new Item.Properties().tab(ModTab.ruby)));


    //ARMOR

    public static final RegistryObject<Item> NJRShelmet = ITEMS.register("njrshelm",
            () -> new helmetItem(ModArmorMaterials.njrsarmor, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModTab.ruby)));

    public static final RegistryObject<Item> NJRSchestplate = ITEMS.register("njrschest",
            () -> new chestplateItem(ModArmorMaterials.njrsarmor, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModTab.ruby)));

    public static final RegistryObject<Item> NJRleg = ITEMS.register("njrsleg",
            () -> new leggingsItem(ModArmorMaterials.njrsarmor, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModTab.ruby)));

    public static final RegistryObject<Item> NJRboots = ITEMS.register("njrsboot",
            () -> new bootsItem(ModArmorMaterials.njrsarmor, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModTab.ruby)));
}