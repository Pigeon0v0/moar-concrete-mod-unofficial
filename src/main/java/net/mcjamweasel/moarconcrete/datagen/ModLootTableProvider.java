package net.mcjamweasel.moarconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.mcjamweasel.moarconcrete.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootSubProvider {
    public ModLootTableProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        dropSelf(ModBlocks.WHITE_CONCRETE_STAIRS);
        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        dropSelf(ModBlocks.GRAY_CONCRETE_STAIRS);
        dropSelf(ModBlocks.BLACK_CONCRETE_STAIRS);
        dropSelf(ModBlocks.BROWN_CONCRETE_STAIRS);
        dropSelf(ModBlocks.RED_CONCRETE_STAIRS);
        dropSelf(ModBlocks.ORANGE_CONCRETE_STAIRS);
        dropSelf(ModBlocks.YELLOW_CONCRETE_STAIRS);
        dropSelf(ModBlocks.LIME_CONCRETE_STAIRS);
        dropSelf(ModBlocks.GREEN_CONCRETE_STAIRS);
        dropSelf(ModBlocks.CYAN_CONCRETE_STAIRS);
        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        dropSelf(ModBlocks.BLUE_CONCRETE_STAIRS);
        dropSelf(ModBlocks.PURPLE_CONCRETE_STAIRS);
        dropSelf(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        dropSelf(ModBlocks.PINK_CONCRETE_STAIRS);

        add(ModBlocks.WHITE_CONCRETE_SLAB, createSlabItemTable(ModBlocks.WHITE_CONCRETE_SLAB));
        add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, createSlabItemTable(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB));
        add(ModBlocks.GRAY_CONCRETE_SLAB, createSlabItemTable(ModBlocks.GRAY_CONCRETE_SLAB));
        add(ModBlocks.BLACK_CONCRETE_SLAB, createSlabItemTable(ModBlocks.BLACK_CONCRETE_SLAB));
        add(ModBlocks.BROWN_CONCRETE_SLAB, createSlabItemTable(ModBlocks.BROWN_CONCRETE_SLAB));
        add(ModBlocks.RED_CONCRETE_SLAB, createSlabItemTable(ModBlocks.RED_CONCRETE_SLAB));
        add(ModBlocks.ORANGE_CONCRETE_SLAB, createSlabItemTable(ModBlocks.ORANGE_CONCRETE_SLAB));
        add(ModBlocks.YELLOW_CONCRETE_SLAB, createSlabItemTable(ModBlocks.YELLOW_CONCRETE_SLAB));
        add(ModBlocks.LIME_CONCRETE_SLAB, createSlabItemTable(ModBlocks.LIME_CONCRETE_SLAB));
        add(ModBlocks.GREEN_CONCRETE_SLAB, createSlabItemTable(ModBlocks.GREEN_CONCRETE_SLAB));
        add(ModBlocks.CYAN_CONCRETE_SLAB, createSlabItemTable(ModBlocks.CYAN_CONCRETE_SLAB));
        add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, createSlabItemTable(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB));
        add(ModBlocks.BLUE_CONCRETE_SLAB, createSlabItemTable(ModBlocks.BLUE_CONCRETE_SLAB));
        add(ModBlocks.PURPLE_CONCRETE_SLAB, createSlabItemTable(ModBlocks.PURPLE_CONCRETE_SLAB));
        add(ModBlocks.MAGENTA_CONCRETE_SLAB, createSlabItemTable(ModBlocks.MAGENTA_CONCRETE_SLAB));
        add(ModBlocks.PINK_CONCRETE_SLAB, createSlabItemTable(ModBlocks.PINK_CONCRETE_SLAB));

        dropSelf(ModBlocks.WHITE_CONCRETE_WALL);
        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);
        dropSelf(ModBlocks.GRAY_CONCRETE_WALL);
        dropSelf(ModBlocks.BLACK_CONCRETE_WALL);
        dropSelf(ModBlocks.BROWN_CONCRETE_WALL);
        dropSelf(ModBlocks.RED_CONCRETE_WALL);
        dropSelf(ModBlocks.ORANGE_CONCRETE_WALL);
        dropSelf(ModBlocks.YELLOW_CONCRETE_WALL);
        dropSelf(ModBlocks.LIME_CONCRETE_WALL);
        dropSelf(ModBlocks.GREEN_CONCRETE_WALL);
        dropSelf(ModBlocks.CYAN_CONCRETE_WALL);
        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);
        dropSelf(ModBlocks.BLUE_CONCRETE_WALL);
        dropSelf(ModBlocks.PURPLE_CONCRETE_WALL);
        dropSelf(ModBlocks.MAGENTA_CONCRETE_WALL);
        dropSelf(ModBlocks.PINK_CONCRETE_WALL);

        dropSelf(ModBlocks.WHITE_CONCRETE_FENCE);
        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE);
        dropSelf(ModBlocks.GRAY_CONCRETE_FENCE);
        dropSelf(ModBlocks.BLACK_CONCRETE_FENCE);
        dropSelf(ModBlocks.BROWN_CONCRETE_FENCE);
        dropSelf(ModBlocks.RED_CONCRETE_FENCE);
        dropSelf(ModBlocks.ORANGE_CONCRETE_FENCE);
        dropSelf(ModBlocks.YELLOW_CONCRETE_FENCE);
        dropSelf(ModBlocks.LIME_CONCRETE_FENCE);
        dropSelf(ModBlocks.GREEN_CONCRETE_FENCE);
        dropSelf(ModBlocks.CYAN_CONCRETE_FENCE);
        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE);
        dropSelf(ModBlocks.BLUE_CONCRETE_FENCE);
        dropSelf(ModBlocks.PURPLE_CONCRETE_FENCE);
        dropSelf(ModBlocks.MAGENTA_CONCRETE_FENCE);
        dropSelf(ModBlocks.PINK_CONCRETE_FENCE);

        dropSelf(ModBlocks.WHITE_CONCRETE_GATE);
        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_GATE);
        dropSelf(ModBlocks.GRAY_CONCRETE_GATE);
        dropSelf(ModBlocks.BLACK_CONCRETE_GATE);
        dropSelf(ModBlocks.BROWN_CONCRETE_GATE);
        dropSelf(ModBlocks.RED_CONCRETE_GATE);
        dropSelf(ModBlocks.ORANGE_CONCRETE_GATE);
        dropSelf(ModBlocks.YELLOW_CONCRETE_GATE);
        dropSelf(ModBlocks.LIME_CONCRETE_GATE);
        dropSelf(ModBlocks.GREEN_CONCRETE_GATE);
        dropSelf(ModBlocks.CYAN_CONCRETE_GATE);
        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_GATE);
        dropSelf(ModBlocks.BLUE_CONCRETE_GATE);
        dropSelf(ModBlocks.PURPLE_CONCRETE_GATE);
        dropSelf(ModBlocks.MAGENTA_CONCRETE_GATE);
        dropSelf(ModBlocks.PINK_CONCRETE_GATE);
        
        dropSelf(ModBlocks.WHITE_CONCRETE_BUTTON);
        dropSelf(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON);
        dropSelf(ModBlocks.GRAY_CONCRETE_BUTTON);
        dropSelf(ModBlocks.BLACK_CONCRETE_BUTTON);
        dropSelf(ModBlocks.BROWN_CONCRETE_BUTTON);
        dropSelf(ModBlocks.RED_CONCRETE_BUTTON);
        dropSelf(ModBlocks.ORANGE_CONCRETE_BUTTON);
        dropSelf(ModBlocks.YELLOW_CONCRETE_BUTTON);
        dropSelf(ModBlocks.LIME_CONCRETE_BUTTON);
        dropSelf(ModBlocks.GREEN_CONCRETE_BUTTON);
        dropSelf(ModBlocks.CYAN_CONCRETE_BUTTON);
        dropSelf(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON);
        dropSelf(ModBlocks.BLUE_CONCRETE_BUTTON);
        dropSelf(ModBlocks.PURPLE_CONCRETE_BUTTON);
        dropSelf(ModBlocks.MAGENTA_CONCRETE_BUTTON);
        dropSelf(ModBlocks.PINK_CONCRETE_BUTTON);
    }
}
