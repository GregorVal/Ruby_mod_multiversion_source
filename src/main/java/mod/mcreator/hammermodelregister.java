package mod.mcreator;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class hammermodelregister implements IItemRenderer {

    public final ResourceLocation texture = new ResourceLocation("hammer model:hammer.png");
    public IModelCustom model = AdvancedModelLoader.loadModel(new ResourceLocation("hammer model:hammer.obj"));

    public hammermodelregister(){}


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
                GL11.glRotatef(-80.0F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(10.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(-20.0F, 0F, 0.0F, 1.0F);
                GL11.glTranslatef(-0.5F, 0.3F, -1.0F);
                model.renderAll();
                GL11.glPopMatrix();
            }
            default:
                break;
        }
    }
}