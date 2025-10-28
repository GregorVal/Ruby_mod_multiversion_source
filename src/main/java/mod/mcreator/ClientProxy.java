package mod.mcreator;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends ServerProxy{

    public void registerRenderInfo() {
        MinecraftForgeClient.registerItemRenderer(njrs.katana, new swordmodelregistry());
        MinecraftForgeClient.registerItemRenderer(njrs.hammer, new hammermodelregister());
    }
}
