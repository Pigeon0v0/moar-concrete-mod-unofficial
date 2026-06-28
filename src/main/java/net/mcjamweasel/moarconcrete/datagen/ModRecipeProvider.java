package net.mcjamweasel.moarconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mcjamweasel.moarconcrete.ModBlockGroups;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {


    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }


//Creates the recipes for each block, one set per colour.
//Stone cutting for stairs, slabs, walls, bricks, panels.
//Crafting table for all.
    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider wrapperLookup, RecipeOutput recipeExporter) {
        return new RecipeProvider(wrapperLookup, recipeExporter) {
            @Override
            public void buildRecipes() {

                //Create stairs recipes
                for (ModBlockGroups.MCBlock coloredBlock : ModBlockGroups.MC_STAIRS) {
                    stonecutterResultFromBase(
                            RecipeCategory.BUILDING_BLOCKS,
                            coloredBlock.customBlock(),
                            coloredBlock.vanillaSource()
                    );

                    shaped(RecipeCategory.BUILDING_BLOCKS, coloredBlock.customBlock(), 4)
                            .pattern("C  ")
                            .pattern("CC ")
                            .pattern("CCC")
                            .define('C', Ingredient.of(coloredBlock.vanillaSource()))
                            .unlockedBy(getHasName(coloredBlock.vanillaSource()), has(coloredBlock.vanillaSource()))
                            .save(output);
                }


                //Create Slab recipes
                for (List<ModBlockGroups.MCBlock> group : ModBlockGroups.mcSlabDropGroup) {
                    for (ModBlockGroups.MCBlock coloredBlock : group) {
                        stonecutterResultFromBase(
                            RecipeCategory.BUILDING_BLOCKS,
                            coloredBlock.customBlock(),
                            coloredBlock.vanillaSource(),
                            2);

                        slab(
                            RecipeCategory.BUILDING_BLOCKS,
                            coloredBlock.customBlock(),
                            coloredBlock.vanillaSource());
                    }
                }


                //Create wall recipes
                for (ModBlockGroups.MCBlock coloredBlock : ModBlockGroups.MC_WALL) {
                    wall(
                            RecipeCategory.BUILDING_BLOCKS,
                            coloredBlock.customBlock(),
                            coloredBlock.vanillaSource());

                    stonecutterResultFromBase(
                            RecipeCategory.BUILDING_BLOCKS,
                            coloredBlock.customBlock(),
                            coloredBlock.vanillaSource());
                }


                //Create fence recipes
                for (ModBlockGroups.MCBlock coloredBlock : ModBlockGroups.MC_FENCE) {
                    shaped(RecipeCategory.BUILDING_BLOCKS, coloredBlock.customBlock(), 3)
                            .pattern("CIC")
                            .pattern("CIC")
                            .pattern("   ")
                            .define('C', Ingredient.of(coloredBlock.vanillaSource()))
                            .define('I', Ingredient.of(Items.IRON_BARS))
                            .unlockedBy(getHasName(coloredBlock.vanillaSource()), has(coloredBlock.vanillaSource()))
                            .unlockedBy(getHasName(Items.IRON_BARS), has(Items.IRON_BARS))
                            .save(output);
                }


                //Create fence gate recipes
                for (ModBlockGroups.MCBlock coloredBlock : ModBlockGroups.MC_GATE) {
                    shaped(RecipeCategory.BUILDING_BLOCKS, coloredBlock.customBlock(), 1)
                            .pattern("ICI")
                            .pattern("ICI")
                            .pattern("   ")
                            .define('C', Ingredient.of(coloredBlock.vanillaSource()))
                            .define('I', Ingredient.of(Items.IRON_BARS))
                            .unlockedBy(getHasName(coloredBlock.vanillaSource()), has(coloredBlock.vanillaSource()))
                            .unlockedBy(getHasName(Items.IRON_BARS), has(Items.IRON_BARS))
                            .save(output);
                }


                //Create button recipes
                for (ModBlockGroups.MCBlock coloredBlock : ModBlockGroups.MC_BUTTON) {
                    shapeless(RecipeCategory.REDSTONE, coloredBlock.customBlock(), 1)
                            .requires(coloredBlock.vanillaSource())
                            .group("concrete_buttons")
                            .unlockedBy(getHasName(coloredBlock.vanillaSource()), has(coloredBlock.vanillaSource()))
                            .save(output);
                }

                //Create panel recipes
                for (ModBlockGroups.MCBlock coloredBlock : ModBlockGroups.MC_PANEL) {
                    stainedGlassPaneFromStainedGlass(coloredBlock.customBlock(), coloredBlock.vanillaSource());

                    stonecutterResultFromBase(
                            RecipeCategory.BUILDING_BLOCKS,
                            coloredBlock.customBlock(),
                            coloredBlock.vanillaSource(),
                            4);
                }

                //Create bricks recipes
                for (ModBlockGroups.MCBlock coloredBlock : ModBlockGroups.MC_BRICKS) {
                    stonecutterResultFromBase(
                            RecipeCategory.BUILDING_BLOCKS,
                            coloredBlock.customBlock(),
                            coloredBlock.vanillaSource());

                    shaped(RecipeCategory.BUILDING_BLOCKS, coloredBlock.customBlock(), 4)
                            .pattern("CC ")
                            .pattern("CC ")
                            .pattern("   ")
                            .define('C', Ingredient.of(coloredBlock.vanillaSource()))
                            .unlockedBy(getHasName(coloredBlock.vanillaSource()), has(coloredBlock.vanillaSource()))
                            .save(output);
                }
            }
        };
    }


    @Override
    public String getName() {
            return "MoarConcrete Recipes";
        }
}
