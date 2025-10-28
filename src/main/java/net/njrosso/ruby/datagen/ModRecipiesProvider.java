package net.njrosso.ruby.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.njrosso.ruby.items.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipiesProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipiesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.njrhelm.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("   ")
                .define('X', ModItems.njingot.get())
                .unlockedBy("has_njingot", has(ModItems.njingot.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.njrchestplate.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.njingot.get())
                .unlockedBy("has_njingot", has(ModItems.njingot.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.njrleg.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', ModItems.njingot.get())
                .unlockedBy("has_njingot", has(ModItems.njingot.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.njrboots.get())
                .pattern("X X")
                .pattern("X X")
                .pattern("   ")
                .define('X', ModItems.njingot.get())
                .unlockedBy("has_njingot", has(ModItems.njingot.get())).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.njrs.get())
                .pattern(" X ")
                .pattern(" X ")
                .pattern(" Y ")
                .define('X', ModItems.njingot.get())
                .define('Y', Items.NETHERITE_SWORD)
                .unlockedBy("has_njingot", has(ModItems.njingot.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.njingot.get())
                .requires(Items.NETHERITE_SCRAP)
                .requires(Items.BLAZE_POWDER)
                .unlockedBy("has_blaze_powder", has(Items.BLAZE_POWDER))
                .unlockedBy("has_netherite_scrap", has(Items.NETHERITE_SCRAP)).save(recipeOutput /* pass here a name to avoid conflicts */);
    }
}
