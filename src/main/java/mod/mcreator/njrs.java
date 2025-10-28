package mod.mcreator;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

@Mod(modid = njrs.MODID, name = "NJ_ROSSO's katana", version = "1.0")

public class njrs {

    @SidedProxy(clientSide = mod.mcreator.njrs.CLIENTSIDE, serverSide = mod.mcreator.njrs.SERVERSIDE)

    public static ServerProxy proxy;

    public static final String MODID = "njrs";
    public static final String CLIENTSIDE = "mod.mcreator.ClientProxy";
    public static final String SERVERSIDE = "mod.mcreator.ServerProxy";



    public static Item katana;
    public static Item hammer;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        katana = new katana();
        katana.setUnlocalizedName("katana").setCreativeTab(mod.mcreator.njrs.njrs).setTextureName("njrs:katana");
        GameRegistry.registerItem(katana, katana.getUnlocalizedName());

        hammer = new hammer();
        hammer.setUnlocalizedName("hammer").setCreativeTab(mod.mcreator.njrs.njrs).setTextureName("njrs:hammer");
        GameRegistry.registerItem(hammer, hammer.getUnlocalizedName());

        proxy.registerRenderInfo();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.addRecipe(new ItemStack(katana, 1), new Object[]{"BS ", "BA ", " R ", 'B', Items.blaze_powder, 'R', Items.blaze_rod, 'S', Items.diamond_sword, 'A', Items.diamond_axe});
        GameRegistry.addRecipe(new ItemStack(hammer, 1), new Object[]{"QNQ", " R ", " R ", 'Q', Blocks.diamond_block, 'N', Items.nether_star, 'R', Items.blaze_rod});
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

    public static CreativeTabs njrs = new CreativeTabs("katana") {
        @Override
        public Item getTabIconItem() {
            return new ItemStack(mod.mcreator.njrs.katana).getItem();
        }
    };
}
