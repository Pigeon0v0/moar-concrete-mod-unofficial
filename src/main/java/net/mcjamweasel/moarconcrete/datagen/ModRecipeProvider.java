package net.mcjamweasel.moarconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mcjamweasel.moarconcrete.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {


    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                //White
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE, 2);
                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Ingredient.of(Blocks.WHITE_CONCRETE));
                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_WALL, Ingredient.of(Blocks.WHITE_CONCRETE));
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);
                stairBuilder(ModBlocks.WHITE_CONCRETE_STAIRS, Ingredient.of(Items.WHITE_CONCRETE));
                fenceBuilder(ModBlocks.WHITE_CONCRETE_FENCE, Ingredient.of(Items.WHITE_CONCRETE));
                fenceGateBuilder(ModBlocks.WHITE_CONCRETE_GATE, Ingredient.of(Items.WHITE_CONCRETE));
                buttonBuilder(ModBlocks.WHITE_CONCRETE_BUTTON, Ingredient.of(Items.WHITE_CONCRETE));

                //Light Gray
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE, 2);
                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE));
                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Ingredient.of(Blocks.LIGHT_GRAY_CONCRETE));
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);
                stairBuilder(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.of(Items.LIGHT_GRAY_CONCRETE));
                fenceBuilder(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE, Ingredient.of(Items.LIGHT_GRAY_CONCRETE));
                fenceGateBuilder(ModBlocks.LIGHT_GRAY_CONCRETE_GATE, Ingredient.of(Items.LIGHT_GRAY_CONCRETE));
                buttonBuilder(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON, Ingredient.of(Items.LIGHT_GRAY_CONCRETE));

                //Gray
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE, 2);
                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Ingredient.of(Blocks.GRAY_CONCRETE));
                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_WALL, Ingredient.of(Blocks.GRAY_CONCRETE));
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);
                stairBuilder(ModBlocks.GRAY_CONCRETE_STAIRS, Ingredient.of(Items.GRAY_CONCRETE));
                fenceBuilder(ModBlocks.GRAY_CONCRETE_FENCE, Ingredient.of(Items.GRAY_CONCRETE));
                fenceGateBuilder(ModBlocks.GRAY_CONCRETE_GATE, Ingredient.of(Items.GRAY_CONCRETE));
                buttonBuilder(ModBlocks.GRAY_CONCRETE_BUTTON, Ingredient.of(Items.GRAY_CONCRETE));

                //Black
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE, 2);
                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Ingredient.of(Blocks.BLACK_CONCRETE));
                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_WALL, Ingredient.of(Blocks.BLACK_CONCRETE));
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);
                stairBuilder(ModBlocks.BLACK_CONCRETE_STAIRS, Ingredient.of(Items.BLACK_CONCRETE));
                fenceBuilder(ModBlocks.BLACK_CONCRETE_FENCE, Ingredient.of(Items.BLACK_CONCRETE));
                fenceGateBuilder(ModBlocks.BLACK_CONCRETE_GATE, Ingredient.of(Items.BLACK_CONCRETE));
                buttonBuilder(ModBlocks.BLACK_CONCRETE_BUTTON, Ingredient.of(Items.BLACK_CONCRETE));

                //Brown
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE, 2);
                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Ingredient.of(Blocks.BROWN_CONCRETE));
                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_WALL, Ingredient.of(Blocks.BROWN_CONCRETE));
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);
                stairBuilder(ModBlocks.BROWN_CONCRETE_STAIRS, Ingredient.of(Items.BROWN_CONCRETE));
                fenceBuilder(ModBlocks.BROWN_CONCRETE_FENCE, Ingredient.of(Items.BROWN_CONCRETE));
                fenceGateBuilder(ModBlocks.BROWN_CONCRETE_GATE, Ingredient.of(Items.BROWN_CONCRETE));
                buttonBuilder(ModBlocks.BROWN_CONCRETE_BUTTON, Ingredient.of(Items.BROWN_CONCRETE));

                //Red
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE, 2);
                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Ingredient.of(Blocks.RED_CONCRETE));
                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_WALL, Ingredient.of(Blocks.RED_CONCRETE));
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);
                stairBuilder(ModBlocks.RED_CONCRETE_STAIRS, Ingredient.of(Items.RED_CONCRETE));
                fenceBuilder(ModBlocks.RED_CONCRETE_FENCE, Ingredient.of(Items.RED_CONCRETE));
                fenceGateBuilder(ModBlocks.RED_CONCRETE_GATE, Ingredient.of(Items.RED_CONCRETE));
                buttonBuilder(ModBlocks.RED_CONCRETE_BUTTON, Ingredient.of(Items.RED_CONCRETE));

                //Orange
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE, 2);
                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Ingredient.of(Blocks.ORANGE_CONCRETE));
                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_WALL, Ingredient.of(Blocks.ORANGE_CONCRETE));
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);
                stairBuilder(ModBlocks.ORANGE_CONCRETE_STAIRS, Ingredient.of(Items.ORANGE_CONCRETE));
                fenceBuilder(ModBlocks.ORANGE_CONCRETE_FENCE, Ingredient.of(Items.ORANGE_CONCRETE));
                fenceGateBuilder(ModBlocks.ORANGE_CONCRETE_GATE, Ingredient.of(Items.ORANGE_CONCRETE));
                buttonBuilder(ModBlocks.ORANGE_CONCRETE_BUTTON, Ingredient.of(Items.ORANGE_CONCRETE));

                //Yellow
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE, 2);
                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Ingredient.of(Blocks.YELLOW_CONCRETE));
                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_WALL, Ingredient.of(Blocks.YELLOW_CONCRETE));
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);
                stairBuilder(ModBlocks.YELLOW_CONCRETE_STAIRS, Ingredient.of(Items.YELLOW_CONCRETE));
                fenceBuilder(ModBlocks.YELLOW_CONCRETE_FENCE, Ingredient.of(Items.YELLOW_CONCRETE));
                fenceGateBuilder(ModBlocks.YELLOW_CONCRETE_GATE, Ingredient.of(Items.YELLOW_CONCRETE));
                buttonBuilder(ModBlocks.YELLOW_CONCRETE_BUTTON, Ingredient.of(Items.YELLOW_CONCRETE));

                //Lime
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE, 2);
                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Ingredient.of(Blocks.LIME_CONCRETE));
                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_WALL, Ingredient.of(Blocks.LIME_CONCRETE));
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);
                stairBuilder(ModBlocks.LIME_CONCRETE_STAIRS, Ingredient.of(Items.LIME_CONCRETE));
                fenceBuilder(ModBlocks.LIME_CONCRETE_FENCE, Ingredient.of(Items.LIME_CONCRETE));
                fenceGateBuilder(ModBlocks.LIME_CONCRETE_GATE, Ingredient.of(Items.LIME_CONCRETE));
                buttonBuilder(ModBlocks.LIME_CONCRETE_BUTTON, Ingredient.of(Items.LIME_CONCRETE));

                //Green
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE, 2);
                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Ingredient.of(Blocks.GREEN_CONCRETE));
                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_WALL, Ingredient.of(Blocks.GREEN_CONCRETE));
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);
                stairBuilder(ModBlocks.GREEN_CONCRETE_STAIRS, Ingredient.of(Items.GREEN_CONCRETE));
                fenceBuilder(ModBlocks.GREEN_CONCRETE_FENCE, Ingredient.of(Items.GREEN_CONCRETE));
                fenceGateBuilder(ModBlocks.GREEN_CONCRETE_GATE, Ingredient.of(Items.GREEN_CONCRETE));
                buttonBuilder(ModBlocks.GREEN_CONCRETE_BUTTON, Ingredient.of(Items.GREEN_CONCRETE));

                //Cyan
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE, 2);
                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Ingredient.of(Blocks.CYAN_CONCRETE));
                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_WALL, Ingredient.of(Blocks.CYAN_CONCRETE));
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);
                stairBuilder(ModBlocks.CYAN_CONCRETE_STAIRS, Ingredient.of(Items.CYAN_CONCRETE));
                fenceBuilder(ModBlocks.CYAN_CONCRETE_FENCE, Ingredient.of(Items.CYAN_CONCRETE));
                fenceGateBuilder(ModBlocks.CYAN_CONCRETE_GATE, Ingredient.of(Items.CYAN_CONCRETE));
                buttonBuilder(ModBlocks.CYAN_CONCRETE_BUTTON, Ingredient.of(Items.CYAN_CONCRETE));

                //Light Blue
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE, 2);
                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE));
                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Ingredient.of(Blocks.LIGHT_BLUE_CONCRETE));
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);
                stairBuilder(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.of(Items.LIGHT_BLUE_CONCRETE));
                fenceBuilder(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE, Ingredient.of(Items.LIGHT_BLUE_CONCRETE));
                fenceGateBuilder(ModBlocks.LIGHT_BLUE_CONCRETE_GATE, Ingredient.of(Items.LIGHT_BLUE_CONCRETE));
                buttonBuilder(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON, Ingredient.of(Items.LIGHT_BLUE_CONCRETE));

                //Blue
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE, 2);
                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Ingredient.of(Blocks.BLUE_CONCRETE));
                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_WALL, Ingredient.of(Blocks.BLUE_CONCRETE));
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);
                stairBuilder(ModBlocks.BLUE_CONCRETE_STAIRS, Ingredient.of(Items.BLUE_CONCRETE));
                fenceBuilder(ModBlocks.BLUE_CONCRETE_FENCE, Ingredient.of(Items.BLUE_CONCRETE));
                fenceGateBuilder(ModBlocks.BLUE_CONCRETE_GATE, Ingredient.of(Items.BLUE_CONCRETE));
                buttonBuilder(ModBlocks.BLUE_CONCRETE_BUTTON, Ingredient.of(Items.BLUE_CONCRETE));

                //Purple
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE, 2);
                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Ingredient.of(Blocks.PURPLE_CONCRETE));
                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_WALL, Ingredient.of(Blocks.PURPLE_CONCRETE));
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);
                stairBuilder(ModBlocks.PURPLE_CONCRETE_STAIRS, Ingredient.of(Items.PURPLE_CONCRETE));
                fenceBuilder(ModBlocks.PURPLE_CONCRETE_FENCE, Ingredient.of(Items.PURPLE_CONCRETE));
                fenceGateBuilder(ModBlocks.PURPLE_CONCRETE_GATE, Ingredient.of(Items.PURPLE_CONCRETE));
                buttonBuilder(ModBlocks.PURPLE_CONCRETE_BUTTON, Ingredient.of(Items.PURPLE_CONCRETE));

                //Magenta
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE, 2);
                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Ingredient.of(Blocks.MAGENTA_CONCRETE));
                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_WALL, Ingredient.of(Blocks.MAGENTA_CONCRETE));
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);
                stairBuilder(ModBlocks.MAGENTA_CONCRETE_STAIRS, Ingredient.of(Items.MAGENTA_CONCRETE));
                fenceBuilder(ModBlocks.MAGENTA_CONCRETE_FENCE, Ingredient.of(Items.MAGENTA_CONCRETE));
                fenceGateBuilder(ModBlocks.MAGENTA_CONCRETE_GATE, Ingredient.of(Items.MAGENTA_CONCRETE));
                buttonBuilder(ModBlocks.MAGENTA_CONCRETE_BUTTON, Ingredient.of(Items.MAGENTA_CONCRETE));

                //Pink
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE, 2);
                slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Ingredient.of(Blocks.PINK_CONCRETE));
                wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_WALL, Ingredient.of(Blocks.PINK_CONCRETE));
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);
                stairBuilder(ModBlocks.PINK_CONCRETE_STAIRS, Ingredient.of(Blocks.PINK_CONCRETE));
                fenceBuilder(ModBlocks.PINK_CONCRETE_FENCE, Ingredient.of(Blocks.PINK_CONCRETE));
                fenceGateBuilder(ModBlocks.PINK_CONCRETE_GATE, Ingredient.of(Blocks.PINK_CONCRETE));
                buttonBuilder(ModBlocks.PINK_CONCRETE_BUTTON, Ingredient.of(Blocks.PINK_CONCRETE));
            }
        };
    }
    @Override
    public String getName() {
        return "";
    }
}
