package net.mcjamweasel.moarconcrete.block;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTabOutput;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.mcjamweasel.moarconcrete.MoarConcrete;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModBlocks {

//Stairs functions.
    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new StairBlock(Blocks.WHITE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE).setId(blockKey("white_concrete_stairs"))));

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new StairBlock(Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE).setId(blockKey("light_gray_concrete_stairs"))));

    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new StairBlock(Blocks.GRAY_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE).setId(blockKey("gray_concrete_stairs"))));

    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new StairBlock(Blocks.BLACK_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE).setId(blockKey("black_concrete_stairs"))));

    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new StairBlock(Blocks.BROWN_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE).setId(blockKey("brown_concrete_stairs"))));

    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new StairBlock(Blocks.RED_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE).setId(blockKey("red_concrete_stairs"))));

    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new StairBlock(Blocks.ORANGE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE).setId(blockKey("orange_concrete_stairs"))));

    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new StairBlock(Blocks.YELLOW_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE).setId(blockKey("yellow_concrete_stairs"))));

    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new StairBlock(Blocks.LIME_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE).setId(blockKey("lime_concrete_stairs"))));

    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new StairBlock(Blocks.GREEN_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE).setId(blockKey("green_concrete_stairs"))));

    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new StairBlock(Blocks.CYAN_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE).setId(blockKey("cyan_concrete_stairs"))));

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new StairBlock(Blocks.LIGHT_BLUE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE).setId(blockKey("light_blue_concrete_stairs"))));

    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new StairBlock(Blocks.BLUE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE).setId(blockKey("blue_concrete_stairs"))));

    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new StairBlock(Blocks.PURPLE_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE).setId(blockKey("purple_concrete_stairs"))));

    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new StairBlock(Blocks.MAGENTA_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE).setId(blockKey("magenta_concrete_stairs"))));

    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new StairBlock(Blocks.PINK_CONCRETE.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE).setId(blockKey("pink_concrete_stairs"))));


//Slab functions.
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
        new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE).setId(blockKey("white_concrete_slab"))));

    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE).setId(blockKey("light_gray_concrete_slab"))));

    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE).setId(blockKey("gray_concrete_slab"))));

    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE).setId(blockKey("black_concrete_slab"))));

    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE).setId(blockKey("brown_concrete_slab"))));

    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE).setId(blockKey("red_concrete_slab"))));

    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE).setId(blockKey("orange_concrete_slab"))));

    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE).setId(blockKey("yellow_concrete_slab"))));

    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE).setId(blockKey("lime_concrete_slab"))));

    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE).setId(blockKey("green_concrete_slab"))));

    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE).setId(blockKey("cyan_concrete_slab"))));

    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE).setId(blockKey("light_blue_concrete_slab"))));

    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE).setId(blockKey("blue_concrete_slab"))));

    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE).setId(blockKey("purple_concrete_slab"))));

    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE).setId(blockKey("magenta_concrete_slab"))));

    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE).setId(blockKey("pink_concrete_slab"))));


//Wall functions.
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
        new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE).setId(blockKey("white_concrete_wall"))));

    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE).setId(blockKey("light_gray_concrete_wall"))));

    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE).setId(blockKey("gray_concrete_wall"))));

    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE).setId(blockKey("black_concrete_wall"))));

    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE).setId(blockKey("brown_concrete_wall"))));

    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE).setId(blockKey("red_concrete_wall"))));

    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE).setId(blockKey("orange_concrete_wall"))));

    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE).setId(blockKey("yellow_concrete_wall"))));

    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE).setId(blockKey("lime_concrete_wall"))));

    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE).setId(blockKey("green_concrete_wall"))));

    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE).setId(blockKey("cyan_concrete_wall"))));

    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE).setId(blockKey("light_blue_concrete_wall"))));

    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE).setId(blockKey("blue_concrete_wall"))));

    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE).setId(blockKey("purple_concrete_wall"))));

    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE).setId(blockKey("magenta_concrete_wall"))));

    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE).setId(blockKey("pink_concrete_wall"))));


//Fence & Gate functions.
    public static final Block WHITE_CONCRETE_FENCE = registerBlock("white_concrete_fence",
        new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE).setId(blockKey("white_concrete_fence"))));
    public static final Block WHITE_CONCRETE_GATE = registerBlock("white_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE).setId(blockKey("white_concrete_gate"))));

    public static final Block LIGHT_GRAY_CONCRETE_FENCE = registerBlock("light_gray_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE).setId(blockKey("light_gray_concrete_fence"))));
    public static final Block LIGHT_GRAY_CONCRETE_GATE = registerBlock("light_gray_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE).setId(blockKey("light_gray_concrete_gate"))));

    public static final Block GRAY_CONCRETE_FENCE = registerBlock("gray_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE).setId(blockKey("gray_concrete_fence"))));
    public static final Block GRAY_CONCRETE_GATE = registerBlock("gray_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE).setId(blockKey("gray_concrete_gate"))));

    public static final Block BLACK_CONCRETE_FENCE = registerBlock("black_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE).setId(blockKey("black_concrete_fence"))));
    public static final Block BLACK_CONCRETE_GATE = registerBlock("black_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE).setId(blockKey("black_concrete_gate"))));

    public static final Block BROWN_CONCRETE_FENCE = registerBlock("brown_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE).setId(blockKey("brown_concrete_fence"))));
    public static final Block BROWN_CONCRETE_GATE = registerBlock("brown_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE).setId(blockKey("brown_concrete_gate"))));

    public static final Block RED_CONCRETE_FENCE = registerBlock("red_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE).setId(blockKey("red_concrete_fence"))));
    public static final Block RED_CONCRETE_GATE = registerBlock("red_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE).setId(blockKey("red_concrete_gate"))));

    public static final Block ORANGE_CONCRETE_FENCE = registerBlock("orange_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE).setId(blockKey("orange_concrete_fence"))));
    public static final Block ORANGE_CONCRETE_GATE = registerBlock("orange_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE).setId(blockKey("orange_concrete_gate"))));

    public static final Block YELLOW_CONCRETE_FENCE = registerBlock("yellow_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE).setId(blockKey("yellow_concrete_fence"))));
    public static final Block YELLOW_CONCRETE_GATE = registerBlock("yellow_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE).setId(blockKey("yellow_concrete_gate"))));

    public static final Block LIME_CONCRETE_FENCE = registerBlock("lime_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE).setId(blockKey("lime_concrete_fence"))));
    public static final Block LIME_CONCRETE_GATE = registerBlock("lime_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE).setId(blockKey("lime_concrete_gate"))));

    public static final Block GREEN_CONCRETE_FENCE = registerBlock("green_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE).setId(blockKey("green_concrete_fence"))));
    public static final Block GREEN_CONCRETE_GATE = registerBlock("green_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE).setId(blockKey("green_concrete_gate"))));

    public static final Block CYAN_CONCRETE_FENCE = registerBlock("cyan_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE).setId(blockKey("cyan_concrete_fence"))));
    public static final Block CYAN_CONCRETE_GATE = registerBlock("cyan_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE).setId(blockKey("cyan_concrete_gate"))));

    public static final Block LIGHT_BLUE_CONCRETE_FENCE = registerBlock("light_blue_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE).setId(blockKey("light_blue_concrete_fence"))));
    public static final Block LIGHT_BLUE_CONCRETE_GATE = registerBlock("light_blue_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE).setId(blockKey("light_blue_concrete_gate"))));

    public static final Block BLUE_CONCRETE_FENCE = registerBlock("blue_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE).setId(blockKey("blue_concrete_fence"))));
    public static final Block BLUE_CONCRETE_GATE = registerBlock("blue_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE).setId(blockKey("blue_concrete_gate"))));

    public static final Block PURPLE_CONCRETE_FENCE = registerBlock("purple_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE).setId(blockKey("purple_concrete_fence"))));
    public static final Block PURPLE_CONCRETE_GATE = registerBlock("purple_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE).setId(blockKey("purple_concrete_gate"))));

    public static final Block MAGENTA_CONCRETE_FENCE = registerBlock("magenta_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE).setId(blockKey("magenta_concrete_fence"))));
    public static final Block MAGENTA_CONCRETE_GATE = registerBlock("magenta_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE).setId(blockKey("magenta_concrete_gate"))));

    public static final Block PINK_CONCRETE_FENCE = registerBlock("pink_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE).setId(blockKey("pink_concrete_fence"))));
    public static final Block PINK_CONCRETE_GATE = registerBlock("pink_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE).setId(blockKey("pink_concrete_gate"))));

//Button functions
    public static final Block WHITE_CONCRETE_BUTTON = registerBlock("white_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE).setId(blockKey("white_concrete_button"))));

    public static final Block LIGHT_GRAY_CONCRETE_BUTTON = registerBlock("light_gray_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE).setId(blockKey("light_gray_concrete_button"))));

    public static final Block GRAY_CONCRETE_BUTTON = registerBlock("gray_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE).setId(blockKey("gray_concrete_button"))));

    public static final Block BLACK_CONCRETE_BUTTON = registerBlock("black_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE).setId(blockKey("black_concrete_button"))));

    public static final Block BROWN_CONCRETE_BUTTON = registerBlock("brown_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE).setId(blockKey("brown_concrete_button"))));

    public static final Block RED_CONCRETE_BUTTON = registerBlock("red_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE).setId(blockKey("red_concrete_button"))));

    public static final Block ORANGE_CONCRETE_BUTTON = registerBlock("orange_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE).setId(blockKey("orange_concrete_button"))));

    public static final Block YELLOW_CONCRETE_BUTTON = registerBlock("yellow_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE).setId(blockKey("yellow_concrete_button"))));

    public static final Block LIME_CONCRETE_BUTTON = registerBlock("lime_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE).setId(blockKey("lime_concrete_button"))));

    public static final Block GREEN_CONCRETE_BUTTON = registerBlock("green_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE).setId(blockKey("green_concrete_button"))));

    public static final Block CYAN_CONCRETE_BUTTON = registerBlock("cyan_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE).setId(blockKey("cyan_concrete_button"))));

    public static final Block LIGHT_BLUE_CONCRETE_BUTTON = registerBlock("light_blue_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE).setId(blockKey("light_blue_concrete_button"))));

    public static final Block BLUE_CONCRETE_BUTTON = registerBlock("blue_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE).setId(blockKey("blue_concrete_button"))));

    public static final Block PURPLE_CONCRETE_BUTTON = registerBlock("purple_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE).setId(blockKey("purple_concrete_button"))));

    public static final Block MAGENTA_CONCRETE_BUTTON = registerBlock("magenta_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE).setId(blockKey("magenta_concrete_button"))));

    public static final Block PINK_CONCRETE_BUTTON = registerBlock("pink_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE).setId(blockKey("pink_concrete_button"))));


//Panel functions
    public static final Block WHITE_CONCRETE_PANEL = registerBlock("white_concrete_panel",
            new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE).setId(blockKey("white_concrete_panel"))));


//Registry methods
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block){
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, name),
                new BlockItem(block, new Item.Properties().setId(itemKey(name))));
    }

    private static ResourceKey<Block> blockKey(String name){
        return ResourceKey.create(BuiltInRegistries.BLOCK.key(), Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, name));
    }

    private static ResourceKey<Item> itemKey(String name){
        return ResourceKey.create(BuiltInRegistries.ITEM.key(), Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, name));
    }

//Add an entry for each block to add the block to the creative menu coloured blocks category.
    private static void addBlockToGroup(FabricCreativeModeTabOutput entries){

        entries.accept(WHITE_CONCRETE_STAIRS);
        entries.accept(WHITE_CONCRETE_SLAB);
        entries.accept(WHITE_CONCRETE_WALL);
        entries.accept(WHITE_CONCRETE_FENCE);
        entries.accept(WHITE_CONCRETE_GATE);
        entries.accept(WHITE_CONCRETE_PANEL);

        entries.accept(LIGHT_GRAY_CONCRETE_STAIRS);
        entries.accept(LIGHT_GRAY_CONCRETE_SLAB);
        entries.accept(LIGHT_GRAY_CONCRETE_WALL);
        entries.accept(LIGHT_GRAY_CONCRETE_FENCE);
        entries.accept(LIGHT_GRAY_CONCRETE_GATE);

        entries.accept(GRAY_CONCRETE_STAIRS);
        entries.accept(GRAY_CONCRETE_SLAB);
        entries.accept(GRAY_CONCRETE_WALL);
        entries.accept(GRAY_CONCRETE_FENCE);
        entries.accept(GRAY_CONCRETE_GATE);

        entries.accept(BLACK_CONCRETE_STAIRS);
        entries.accept(BLACK_CONCRETE_SLAB);
        entries.accept(BLACK_CONCRETE_WALL);
        entries.accept(BLACK_CONCRETE_FENCE);
        entries.accept(BLACK_CONCRETE_GATE);

        entries.accept(BROWN_CONCRETE_STAIRS);
        entries.accept(BROWN_CONCRETE_SLAB);
        entries.accept(BROWN_CONCRETE_WALL);
        entries.accept(BROWN_CONCRETE_FENCE);
        entries.accept(BROWN_CONCRETE_GATE);

        entries.accept(RED_CONCRETE_STAIRS);
        entries.accept(RED_CONCRETE_SLAB);
        entries.accept(RED_CONCRETE_WALL);
        entries.accept(RED_CONCRETE_FENCE);
        entries.accept(RED_CONCRETE_GATE);

        entries.accept(ORANGE_CONCRETE_STAIRS);
        entries.accept(ORANGE_CONCRETE_SLAB);
        entries.accept(ORANGE_CONCRETE_WALL);
        entries.accept(ORANGE_CONCRETE_FENCE);
        entries.accept(ORANGE_CONCRETE_GATE);

        entries.accept(YELLOW_CONCRETE_STAIRS);
        entries.accept(YELLOW_CONCRETE_SLAB);
        entries.accept(YELLOW_CONCRETE_WALL);
        entries.accept(YELLOW_CONCRETE_FENCE);
        entries.accept(YELLOW_CONCRETE_GATE);

        entries.accept(LIME_CONCRETE_STAIRS);
        entries.accept(LIME_CONCRETE_SLAB);
        entries.accept(LIME_CONCRETE_WALL);
        entries.accept(LIME_CONCRETE_FENCE);
        entries.accept(LIME_CONCRETE_GATE);

        entries.accept(GREEN_CONCRETE_STAIRS);
        entries.accept(GREEN_CONCRETE_SLAB);
        entries.accept(GREEN_CONCRETE_WALL);
        entries.accept(GREEN_CONCRETE_FENCE);
        entries.accept(GREEN_CONCRETE_GATE);

        entries.accept(CYAN_CONCRETE_STAIRS);
        entries.accept(CYAN_CONCRETE_SLAB);
        entries.accept(CYAN_CONCRETE_WALL);
        entries.accept(CYAN_CONCRETE_FENCE);
        entries.accept(CYAN_CONCRETE_GATE);

        entries.accept(LIGHT_BLUE_CONCRETE_STAIRS);
        entries.accept(LIGHT_BLUE_CONCRETE_SLAB);
        entries.accept(LIGHT_BLUE_CONCRETE_WALL);
        entries.accept(LIGHT_BLUE_CONCRETE_FENCE);
        entries.accept(LIGHT_BLUE_CONCRETE_GATE);

        entries.accept(BLUE_CONCRETE_STAIRS);
        entries.accept(BLUE_CONCRETE_SLAB);
        entries.accept(BLUE_CONCRETE_WALL);
        entries.accept(BLUE_CONCRETE_FENCE);
        entries.accept(BLUE_CONCRETE_GATE);

        entries.accept(PURPLE_CONCRETE_STAIRS);
        entries.accept(PURPLE_CONCRETE_SLAB);
        entries.accept(PURPLE_CONCRETE_WALL);
        entries.accept(PURPLE_CONCRETE_FENCE);
        entries.accept(PURPLE_CONCRETE_GATE);

        entries.accept(MAGENTA_CONCRETE_STAIRS);
        entries.accept(MAGENTA_CONCRETE_SLAB);
        entries.accept(MAGENTA_CONCRETE_WALL);
        entries.accept(MAGENTA_CONCRETE_GATE);
        entries.accept(MAGENTA_CONCRETE_FENCE);

        entries.accept(PINK_CONCRETE_STAIRS);
        entries.accept(PINK_CONCRETE_SLAB);
        entries.accept(PINK_CONCRETE_WALL);
        entries.accept(PINK_CONCRETE_FENCE);
        entries.accept(PINK_CONCRETE_GATE);
    }


//Add an entry for each block to add the block to the creative menu redstone blocks category.
    private static void addButtonToGroup(FabricCreativeModeTabOutput entries){

    //Buttons
        entries.accept(WHITE_CONCRETE_BUTTON);
        entries.accept(LIGHT_GRAY_CONCRETE_BUTTON);
        entries.accept(GRAY_CONCRETE_BUTTON);
        entries.accept(BLACK_CONCRETE_BUTTON);
        entries.accept(BROWN_CONCRETE_BUTTON);
        entries.accept(RED_CONCRETE_BUTTON);
        entries.accept(ORANGE_CONCRETE_BUTTON);
        entries.accept(YELLOW_CONCRETE_BUTTON);
        entries.accept(LIME_CONCRETE_BUTTON);
        entries.accept(GREEN_CONCRETE_BUTTON);
        entries.accept(CYAN_CONCRETE_BUTTON);
        entries.accept(LIGHT_BLUE_CONCRETE_BUTTON);
        entries.accept(BLUE_CONCRETE_BUTTON);
        entries.accept(PURPLE_CONCRETE_BUTTON);
        entries.accept(MAGENTA_CONCRETE_BUTTON);
        entries.accept(PINK_CONCRETE_BUTTON);
    }


//Registers the blocks to the creative menus.
    public static void registerModBlocks(){
        MoarConcrete.LOGGER.info("Registering ModBlocks for " + MoarConcrete.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(ModBlocks::addBlockToGroup);
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.REDSTONE_BLOCKS).register(ModBlocks::addButtonToGroup);
    }
}
