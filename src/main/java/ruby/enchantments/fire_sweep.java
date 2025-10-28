package ruby.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import ruby.SpItem.ruby_sw;

import java.util.List;

public class fire_sweep extends Enchantment {
    public fire_sweep() {
        super(Enchantment.Rarity.RARE, EnchantmentType.WEAPON, new EquipmentSlotType[]{EquipmentSlotType.MAINHAND});
    }

    public static void multiE(LivingEntity entity, double range) {
        World world = entity.level;
        AxisAlignedBB bb = entity.getBoundingBox().inflate(range);
        List<Entity> entities = world.getEntities(entity, bb);
        for (Entity e : entities) {
            if (e instanceof LivingEntity && e != entity) {
                ((LivingEntity) e).setSecondsOnFire(12); // Adjust duration as needed
            }
        }
    }

    @Override
    public void doPostAttack(LivingEntity attacker, Entity target, int level) {
        super.doPostAttack(attacker, target, level);
        System.out.println("doPostAttack called"); // Add this line for debugging
        PlayerEntity player = (PlayerEntity) attacker;
        if (attacker instanceof PlayerEntity) {
            multiE(attacker, 3.0);
        }
    }


    @Override
    public int getMinLevel() {
        return 1;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return stack.getItem() instanceof ruby_sw;
    }



}