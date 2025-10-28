package mod.mcreator;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class swordmodelregistry implements IItemRenderer {

    public final ResourceLocation texture = new ResourceLocation("katana model:katana.png");
    public IModelCustom model = AdvancedModelLoader.loadModel(new ResourceLocation("katana model:katana.obj"));

    public swordmodelregistry(){}


    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        switch(type){
            case EQUIPPED:
                return true;
            case EQUIPPED_FIRST_PERSON:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    public void renderItem(ItemRenderType type, ItemStack stack, Object... data) {
        switch(type){
            case EQUIPPED:
                GL11.glPushMatrix();
                Minecraft.getMinecraft().renderEngine.bindTexture(texture);
                model.renderAll();
                GL11.glPopMatrix();
                break;
            case EQUIPPED_FIRST_PERSON:{
                GL11.glPushMatrix();
                Minecraft.getMinecraft().renderEngine.bindTexture(texture);
                GL11.glRotatef(-87.0F, 0.0F, 1.0F, 0.0F); //ruota sull'asse y (l'asse che va dall'alto verso il basso)
                GL11.glRotatef(34.0F, 1.0F, 0.0F, 0.0F);//ruota sull'asse che va da sinistra a destra
                GL11.glRotatef(-50.0F, 0F, 0.0F, 1.0F);//va dall'alto verso il basso (gli assi sono relativi al modello 3d)
                GL11.glTranslatef(-0.8F, 0F, -1.3F);
                GL11.glScalef(0.8F,0.8F,0.8F);
                model.renderAll();
                GL11.glPopMatrix();
            }
            default:
                break;
        }
    }
}