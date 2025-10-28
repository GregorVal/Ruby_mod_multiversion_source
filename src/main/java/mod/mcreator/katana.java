package mod.mcreator;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;


public class katana extends ItemSword {
    public katana() {
        super(toolmaterialist.katana);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        target.setFire(6);
        return super.hitEntity(stack, target, attacker);
    }

}
