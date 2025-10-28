package ruby;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class ModTab {

    public static final ItemGroup ruby = new ItemGroup("Ruby")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ruby_sw.get());
        }
    };
}
