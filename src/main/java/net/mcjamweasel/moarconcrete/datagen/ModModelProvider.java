package net.mcjamweasel.moarconcrete.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.mcjamweasel.moarconcrete.block.ModBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.world.level.block.Blocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    //Creates a texture pool for each colour then assigns the model to each block. One set per colour.
    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

        BlockModelGenerators.BlockFamilyProvider whitePool = blockStateModelGenerator.family(Blocks.WHITE_CONCRETE);
        whitePool.stairs(ModBlocks.WHITE_CONCRETE_STAIRS);
        whitePool.slab(ModBlocks.WHITE_CONCRETE_SLAB);
        whitePool.wall(ModBlocks.WHITE_CONCRETE_WALL);
        whitePool.fence(ModBlocks.WHITE_CONCRETE_FENCE);
        whitePool.fenceGate(ModBlocks.WHITE_CONCRETE_GATE);
        whitePool.button(ModBlocks.WHITE_CONCRETE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider lightGrayPool = blockStateModelGenerator.family(Blocks.LIGHT_GRAY_CONCRETE);
        lightGrayPool.stairs(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        lightGrayPool.slab(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        lightGrayPool.wall(ModBlocks.LIGHT_GRAY_CONCRETE_WALL);
        lightGrayPool.fence(ModBlocks.LIGHT_GRAY_CONCRETE_FENCE);
        lightGrayPool.fenceGate(ModBlocks.LIGHT_GRAY_CONCRETE_GATE);
        lightGrayPool.button(ModBlocks.LIGHT_GRAY_CONCRETE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider grayPool = blockStateModelGenerator.family(Blocks.GRAY_CONCRETE);
        grayPool.stairs(ModBlocks.GRAY_CONCRETE_STAIRS);
        grayPool.slab(ModBlocks.GRAY_CONCRETE_SLAB);
        grayPool.wall(ModBlocks.GRAY_CONCRETE_WALL);
        grayPool.fence(ModBlocks.GRAY_CONCRETE_FENCE);
        grayPool.fenceGate(ModBlocks.GRAY_CONCRETE_GATE);
        grayPool.button(ModBlocks.GRAY_CONCRETE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider blackPool = blockStateModelGenerator.family(Blocks.BLACK_CONCRETE);
        blackPool.stairs(ModBlocks.BLACK_CONCRETE_STAIRS);
        blackPool.slab(ModBlocks.BLACK_CONCRETE_SLAB);
        blackPool.wall(ModBlocks.BLACK_CONCRETE_WALL);
        blackPool.fence(ModBlocks.BLACK_CONCRETE_FENCE);
        blackPool.fenceGate(ModBlocks.BLACK_CONCRETE_GATE);
        blackPool.button(ModBlocks.BLACK_CONCRETE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider brownPool = blockStateModelGenerator.family(Blocks.BROWN_CONCRETE);
        brownPool.stairs(ModBlocks.BROWN_CONCRETE_STAIRS);
        brownPool.slab(ModBlocks.BROWN_CONCRETE_SLAB);
        brownPool.wall(ModBlocks.BROWN_CONCRETE_WALL);
        brownPool.fence(ModBlocks.BROWN_CONCRETE_FENCE);
        brownPool.fenceGate(ModBlocks.BROWN_CONCRETE_GATE);
        brownPool.button(ModBlocks.BROWN_CONCRETE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider redPool = blockStateModelGenerator.family(Blocks.RED_CONCRETE);
        redPool.stairs(ModBlocks.RED_CONCRETE_STAIRS);
        redPool.slab(ModBlocks.RED_CONCRETE_SLAB);
        redPool.wall(ModBlocks.RED_CONCRETE_WALL);
        redPool.fence(ModBlocks.RED_CONCRETE_FENCE);
        redPool.fenceGate(ModBlocks.RED_CONCRETE_GATE);
        redPool.button(ModBlocks.RED_CONCRETE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider orangePool = blockStateModelGenerator.family(Blocks.ORANGE_CONCRETE);
        orangePool.stairs(ModBlocks.ORANGE_CONCRETE_STAIRS);
        orangePool.slab(ModBlocks.ORANGE_CONCRETE_SLAB);
        orangePool.wall(ModBlocks.ORANGE_CONCRETE_WALL);
        orangePool.fence(ModBlocks.ORANGE_CONCRETE_FENCE);
        orangePool.fenceGate(ModBlocks.ORANGE_CONCRETE_GATE);
        orangePool.button(ModBlocks.ORANGE_CONCRETE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider yellowPool = blockStateModelGenerator.family(Blocks.YELLOW_CONCRETE);
        yellowPool.stairs(ModBlocks.YELLOW_CONCRETE_STAIRS);
        yellowPool.slab(ModBlocks.YELLOW_CONCRETE_SLAB);
        yellowPool.wall(ModBlocks.YELLOW_CONCRETE_WALL);
        yellowPool.fence(ModBlocks.YELLOW_CONCRETE_FENCE);
        yellowPool.fenceGate(ModBlocks.YELLOW_CONCRETE_GATE);
        yellowPool.button(ModBlocks.YELLOW_CONCRETE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider limePool = blockStateModelGenerator.family(Blocks.LIME_CONCRETE);
        limePool.stairs(ModBlocks.LIME_CONCRETE_STAIRS);
        limePool.slab(ModBlocks.LIME_CONCRETE_SLAB);
        limePool.wall(ModBlocks.LIME_CONCRETE_WALL);
        limePool.fence(ModBlocks.LIME_CONCRETE_FENCE);
        limePool.fenceGate(ModBlocks.LIME_CONCRETE_GATE);
        limePool.button(ModBlocks.LIME_CONCRETE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider greenPool = blockStateModelGenerator.family(Blocks.GREEN_CONCRETE);
        greenPool.stairs(ModBlocks.GREEN_CONCRETE_STAIRS);
        greenPool.slab(ModBlocks.GREEN_CONCRETE_SLAB);
        greenPool.wall(ModBlocks.GREEN_CONCRETE_WALL);
        greenPool.fence(ModBlocks.GREEN_CONCRETE_FENCE);
        greenPool.fenceGate(ModBlocks.GREEN_CONCRETE_GATE);
        greenPool.button(ModBlocks.GREEN_CONCRETE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider lightBluePool = blockStateModelGenerator.family(Blocks.LIGHT_BLUE_CONCRETE);
        lightBluePool.stairs(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        lightBluePool.slab(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        lightBluePool.wall(ModBlocks.LIGHT_BLUE_CONCRETE_WALL);
        lightBluePool.fence(ModBlocks.LIGHT_BLUE_CONCRETE_FENCE);
        lightBluePool.fenceGate(ModBlocks.LIGHT_BLUE_CONCRETE_GATE);
        lightBluePool.button(ModBlocks.LIGHT_BLUE_CONCRETE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider bluePool = blockStateModelGenerator.family(Blocks.BLUE_CONCRETE);
        bluePool.stairs(ModBlocks.BLUE_CONCRETE_STAIRS);
        bluePool.slab(ModBlocks.BLUE_CONCRETE_SLAB);
        bluePool.wall(ModBlocks.BLUE_CONCRETE_WALL);
        bluePool.fence(ModBlocks.BLUE_CONCRETE_FENCE);
        bluePool.fenceGate(ModBlocks.BLUE_CONCRETE_GATE);
        bluePool.button(ModBlocks.BLUE_CONCRETE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider cyanPool = blockStateModelGenerator.family(Blocks.CYAN_CONCRETE);
        cyanPool.stairs(ModBlocks.CYAN_CONCRETE_STAIRS);
        cyanPool.slab(ModBlocks.CYAN_CONCRETE_SLAB);
        cyanPool.wall(ModBlocks.CYAN_CONCRETE_WALL);
        cyanPool.fence(ModBlocks.CYAN_CONCRETE_FENCE);
        cyanPool.fenceGate(ModBlocks.CYAN_CONCRETE_GATE);
        cyanPool.button(ModBlocks.CYAN_CONCRETE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider purplePool = blockStateModelGenerator.family(Blocks.PURPLE_CONCRETE);
        purplePool.stairs(ModBlocks.PURPLE_CONCRETE_STAIRS);
        purplePool.slab(ModBlocks.PURPLE_CONCRETE_SLAB);
        purplePool.wall(ModBlocks.PURPLE_CONCRETE_WALL);
        purplePool.fence(ModBlocks.PURPLE_CONCRETE_FENCE);
        purplePool.fenceGate(ModBlocks.PURPLE_CONCRETE_GATE);
        purplePool.button(ModBlocks.PURPLE_CONCRETE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider magentaPool = blockStateModelGenerator.family(Blocks.MAGENTA_CONCRETE);
        magentaPool.stairs(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        magentaPool.slab(ModBlocks.MAGENTA_CONCRETE_SLAB);
        magentaPool.wall(ModBlocks.MAGENTA_CONCRETE_WALL);
        magentaPool.fence(ModBlocks.MAGENTA_CONCRETE_FENCE);
        magentaPool.fenceGate(ModBlocks.MAGENTA_CONCRETE_GATE);
        magentaPool.button(ModBlocks.MAGENTA_CONCRETE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider pinkPool = blockStateModelGenerator.family(Blocks.PINK_CONCRETE);
        pinkPool.stairs(ModBlocks.PINK_CONCRETE_STAIRS);
        pinkPool.slab(ModBlocks.PINK_CONCRETE_SLAB);
        pinkPool.wall(ModBlocks.PINK_CONCRETE_WALL);
        pinkPool.fence(ModBlocks.PINK_CONCRETE_FENCE);
        pinkPool.fenceGate(ModBlocks.PINK_CONCRETE_GATE);
        pinkPool.button(ModBlocks.PINK_CONCRETE_BUTTON);
    }


//No idea.
    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

    }

}
