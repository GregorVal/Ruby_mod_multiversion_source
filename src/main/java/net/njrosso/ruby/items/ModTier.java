package net.njrosso.ruby.items;


import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.njrosso.ruby.datagen.ModTags;


public class ModTier {
    //incorrectblockfordrops, uses, speed, attack, enchantability, repair
    public static final Tier NJRS = new SimpleTier(ModTags.Blocks.EMPTY, 1000, 5, 7, 25, () -> Ingredient.of(ModItems.njingot));
}
