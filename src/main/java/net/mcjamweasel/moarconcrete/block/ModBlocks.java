package net.mcjamweasel.moarconcrete.block;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTabOutput;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.mcjamweasel.moarconcrete.MoarConcrete;
import net.mcjamweasel.moarconcrete.ModBlockGroups;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
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
import java.util.List;

public class ModBlocks {

//Stairs functions.

    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new StairBlock(Blocks.CONCRETE.white().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.white()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "white_concrete_stairs")))));

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new StairBlock(Blocks.CONCRETE.lightGray().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.lightGray()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_gray_concrete_stairs")))));

    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new StairBlock(Blocks.CONCRETE.gray().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.gray()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "gray_concrete_stairs")))));

    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new StairBlock(Blocks.CONCRETE.black().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.black()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "black_concrete_stairs")))));

    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new StairBlock(Blocks.CONCRETE.brown().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.brown()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "brown_concrete_stairs")))));

    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new StairBlock(Blocks.CONCRETE.red().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.red()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "red_concrete_stairs")))));

    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new StairBlock(Blocks.CONCRETE.orange().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.orange()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "orange_concrete_stairs")))));

    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new StairBlock(Blocks.CONCRETE.yellow().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.yellow()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "yellow_concrete_stairs")))));

    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new StairBlock(Blocks.CONCRETE.lime().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.lime()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "lime_concrete_stairs")))));

    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new StairBlock(Blocks.CONCRETE.green().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.green()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "green_concrete_stairs")))));

    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new StairBlock(Blocks.CONCRETE.cyan().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.cyan()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "cyan_concrete_stairs")))));

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new StairBlock(Blocks.CONCRETE.lightBlue().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.lightBlue()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_blue_concrete_stairs")))));

    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new StairBlock(Blocks.CONCRETE.blue().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.blue()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "blue_concrete_stairs")))));

    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new StairBlock(Blocks.CONCRETE.purple().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.purple()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "purple_concrete_stairs")))));

    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new StairBlock(Blocks.CONCRETE.magenta().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.magenta()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "magenta_concrete_stairs")))));

    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new StairBlock(Blocks.CONCRETE.pink().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "pink_concrete_stairs")))));


//Slab functions.
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
        new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.white()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "white_concrete_slab")))));

    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.lightGray()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_gray_concrete_slab")))));

    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.gray()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "gray_concrete_slab")))));

    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.black()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "black_concrete_slab")))));

    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.brown()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "brown_concrete_slab")))));

    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.red()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "red_concrete_slab")))));

    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.orange()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "orange_concrete_slab")))));

    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.yellow()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "yellow_concrete_slab")))));

    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.lime()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "lime_concrete_slab")))));

    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.green()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "green_concrete_slab")))));

    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.cyan()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "cyan_concrete_slab")))));

    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.lightBlue()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_blue_concrete_slab")))));

    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.blue()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "blue_concrete_slab")))));

    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.purple()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "purple_concrete_slab")))));

    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.magenta()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "magenta_concrete_slab")))));

    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "pink_concrete_slab")))));


//Wall functions.
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.white()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "white_concrete_wall")))));

    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.lightGray()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_gray_concrete_wall")))));

    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.gray()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "gray_concrete_wall")))));

    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.black()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "black_concrete_wall")))));

    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.brown()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "brown_concrete_wall")))));

    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.red()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "red_concrete_wall")))));

    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.orange()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "orange_concrete_wall")))));

    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.yellow()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "yellow_concrete_wall")))));

    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.lime()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "lime_concrete_wall")))));

    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.green()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "green_concrete_wall")))));

    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.cyan()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "cyan_concrete_wall")))));

    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.lightBlue()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_blue_concrete_wall")))));

    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.blue()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "blue_concrete_wall")))));

    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.purple()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "purple_concrete_wall")))));

    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.magenta()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "magenta_concrete_wall")))));

    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "pink_concrete_wall")))));


//Fence & Gate functions.
    public static final Block WHITE_CONCRETE_FENCE = registerBlock("white_concrete_fence",
        new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.white()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "white_concrete_fence")))));
    public static final Block WHITE_CONCRETE_GATE = registerBlock("white_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.white()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "white_concrete_gate")))));

    public static final Block LIGHT_GRAY_CONCRETE_FENCE = registerBlock("light_gray_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.lightGray()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_gray_concrete_fence")))));
    public static final Block LIGHT_GRAY_CONCRETE_GATE = registerBlock("light_gray_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.lightGray()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_gray_concrete_gate")))));

    public static final Block GRAY_CONCRETE_FENCE = registerBlock("gray_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.gray()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "gray_concrete_fence")))));
    public static final Block GRAY_CONCRETE_GATE = registerBlock("gray_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.gray()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "gray_concrete_gate")))));

    public static final Block BLACK_CONCRETE_FENCE = registerBlock("black_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.black()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "black_concrete_fence")))));
    public static final Block BLACK_CONCRETE_GATE = registerBlock("black_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.black()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "black_concrete_gate")))));

    public static final Block BROWN_CONCRETE_FENCE = registerBlock("brown_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.brown()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "brown_concrete_fence")))));
    public static final Block BROWN_CONCRETE_GATE = registerBlock("brown_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.brown()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "brown_concrete_gate")))));

    public static final Block RED_CONCRETE_FENCE = registerBlock("red_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.red()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "red_concrete_fence")))));
    public static final Block RED_CONCRETE_GATE = registerBlock("red_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.red()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "red_concrete_gate")))));

    public static final Block ORANGE_CONCRETE_FENCE = registerBlock("orange_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.orange()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "orange_concrete_fence")))));
    public static final Block ORANGE_CONCRETE_GATE = registerBlock("orange_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.orange()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "orange_concrete_gate")))));

    public static final Block YELLOW_CONCRETE_FENCE = registerBlock("yellow_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.yellow()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "yellow_concrete_fence")))));
    public static final Block YELLOW_CONCRETE_GATE = registerBlock("yellow_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.yellow()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "yellow_concrete_gate")))));

    public static final Block LIME_CONCRETE_FENCE = registerBlock("lime_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.lime()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "lime_concrete_fence")))));
    public static final Block LIME_CONCRETE_GATE = registerBlock("lime_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.lime()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "lime_concrete_gate")))));

    public static final Block GREEN_CONCRETE_FENCE = registerBlock("green_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.green()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "green_concrete_fence")))));
    public static final Block GREEN_CONCRETE_GATE = registerBlock("green_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.green()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "green_concrete_gate")))));

    public static final Block CYAN_CONCRETE_FENCE = registerBlock("cyan_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.cyan()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "cyan_concrete_fence")))));
    public static final Block CYAN_CONCRETE_GATE = registerBlock("cyan_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.cyan()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "cyan_concrete_gate")))));

    public static final Block LIGHT_BLUE_CONCRETE_FENCE = registerBlock("light_blue_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.lightBlue()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_blue_concrete_fence")))));
    public static final Block LIGHT_BLUE_CONCRETE_GATE = registerBlock("light_blue_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.lightBlue()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_blue_concrete_gate")))));

    public static final Block BLUE_CONCRETE_FENCE = registerBlock("blue_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.blue()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "blue_concrete_fence")))));
    public static final Block BLUE_CONCRETE_GATE = registerBlock("blue_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.blue()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "blue_concrete_gate")))));

    public static final Block PURPLE_CONCRETE_FENCE = registerBlock("purple_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.purple()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "purple_concrete_fence")))));
    public static final Block PURPLE_CONCRETE_GATE = registerBlock("purple_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.purple()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "purple_concrete_gate")))));

    public static final Block MAGENTA_CONCRETE_FENCE = registerBlock("magenta_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.magenta()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "magenta_concrete_fence")))));
    public static final Block MAGENTA_CONCRETE_GATE = registerBlock("magenta_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.magenta()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "magenta_concrete_gate")))));

    public static final Block PINK_CONCRETE_FENCE = registerBlock("pink_concrete_fence",
            new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "pink_concrete_fence")))));
    public static final Block PINK_CONCRETE_GATE = registerBlock("pink_concrete_gate",
            new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "pink_concrete_gate")))));

//Button functions
    public static final Block WHITE_CONCRETE_BUTTON = registerBlock("white_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.white()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "white_concrete_button")))));

    public static final Block LIGHT_GRAY_CONCRETE_BUTTON = registerBlock("light_gray_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.lightGray()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_gray_concrete_button")))));

    public static final Block GRAY_CONCRETE_BUTTON = registerBlock("gray_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.gray()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "gray_concrete_button")))));

    public static final Block BLACK_CONCRETE_BUTTON = registerBlock("black_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.black()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "black_concrete_button")))));

    public static final Block BROWN_CONCRETE_BUTTON = registerBlock("brown_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.brown()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "brown_concrete_button")))));

    public static final Block RED_CONCRETE_BUTTON = registerBlock("red_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.red()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "red_concrete_button")))));

    public static final Block ORANGE_CONCRETE_BUTTON = registerBlock("orange_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.orange()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "orange_concrete_button")))));

    public static final Block YELLOW_CONCRETE_BUTTON = registerBlock("yellow_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.yellow()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "yellow_concrete_button")))));

    public static final Block LIME_CONCRETE_BUTTON = registerBlock("lime_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.lime()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "lime_concrete_button")))));

    public static final Block GREEN_CONCRETE_BUTTON = registerBlock("green_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.green()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "green_concrete_button")))));

    public static final Block CYAN_CONCRETE_BUTTON = registerBlock("cyan_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.cyan()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "cyan_concrete_button")))));

    public static final Block LIGHT_BLUE_CONCRETE_BUTTON = registerBlock("light_blue_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.lightBlue()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_blue_concrete_button")))));

    public static final Block BLUE_CONCRETE_BUTTON = registerBlock("blue_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.blue()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "blue_concrete_button")))));

    public static final Block PURPLE_CONCRETE_BUTTON = registerBlock("purple_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.purple()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "purple_concrete_button")))));

    public static final Block MAGENTA_CONCRETE_BUTTON = registerBlock("magenta_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.magenta()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "magenta_concrete_button")))));

    public static final Block PINK_CONCRETE_BUTTON = registerBlock("pink_concrete_button",
            new ButtonBlock(BlockSetType.STONE, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "pink_concrete_button")))));


//Bricks functions
    public static final Block WHITE_CONCRETE_BRICKS = registerBlock("white_concrete_bricks",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "white_concrete_bricks")))));

    public static final Block LIGHT_GRAY_CONCRETE_BRICKS = registerBlock("light_gray_concrete_bricks",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_gray_concrete_bricks")))));

    public static final Block GRAY_CONCRETE_BRICKS = registerBlock("gray_concrete_bricks",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "gray_concrete_bricks")))));

    public static final Block BLACK_CONCRETE_BRICKS = registerBlock("black_concrete_bricks",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "black_concrete_bricks")))));

    public static final Block BROWN_CONCRETE_BRICKS = registerBlock("brown_concrete_bricks",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "brown_concrete_bricks")))));

    public static final Block RED_CONCRETE_BRICKS = registerBlock("red_concrete_bricks",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "red_concrete_bricks")))));

    public static final Block ORANGE_CONCRETE_BRICKS = registerBlock("orange_concrete_bricks",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "orange_concrete_bricks")))));

    public static final Block YELLOW_CONCRETE_BRICKS = registerBlock("yellow_concrete_bricks",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "yellow_concrete_bricks")))));

    public static final Block LIME_CONCRETE_BRICKS = registerBlock("lime_concrete_bricks",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "lime_concrete_bricks")))));

    public static final Block GREEN_CONCRETE_BRICKS = registerBlock("green_concrete_bricks",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "green_concrete_bricks")))));

    public static final Block CYAN_CONCRETE_BRICKS = registerBlock("cyan_concrete_bricks",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "cyan_concrete_bricks")))));

    public static final Block LIGHT_BLUE_CONCRETE_BRICKS = registerBlock("light_blue_concrete_bricks",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_blue_concrete_bricks")))));

    public static final Block BLUE_CONCRETE_BRICKS = registerBlock("blue_concrete_bricks",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "blue_concrete_bricks")))));

    public static final Block PURPLE_CONCRETE_BRICKS = registerBlock("purple_concrete_bricks",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "purple_concrete_bricks")))));

    public static final Block MAGENTA_CONCRETE_BRICKS = registerBlock("magenta_concrete_bricks",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "magenta_concrete_bricks")))));

    public static final Block PINK_CONCRETE_BRICKS = registerBlock("pink_concrete_bricks",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "pink_concrete_bricks")))));


//Brick Slab functions
    public static final Block WHITE_CONCRETE_BRICK_SLAB = registerBlock("white_concrete_brick_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "white_concrete_brick_slab")))));

    public static final Block LIGHT_GRAY_CONCRETE_BRICK_SLAB = registerBlock("light_gray_concrete_brick_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_gray_concrete_brick_slab")))));

    public static final Block GRAY_CONCRETE_BRICK_SLAB = registerBlock("gray_concrete_brick_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "gray_concrete_brick_slab")))));

    public static final Block BLACK_CONCRETE_BRICK_SLAB = registerBlock("black_concrete_brick_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "black_concrete_brick_slab")))));

    public static final Block BROWN_CONCRETE_BRICK_SLAB = registerBlock("brown_concrete_brick_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "brown_concrete_brick_slab")))));

    public static final Block RED_CONCRETE_BRICK_SLAB = registerBlock("red_concrete_brick_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "red_concrete_brick_slab")))));

    public static final Block ORANGE_CONCRETE_BRICK_SLAB = registerBlock("orange_concrete_brick_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "orange_concrete_brick_slab")))));

    public static final Block YELLOW_CONCRETE_BRICK_SLAB = registerBlock("yellow_concrete_brick_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "yellow_concrete_brick_slab")))));

    public static final Block LIME_CONCRETE_BRICK_SLAB = registerBlock("lime_concrete_brick_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "lime_concrete_brick_slab")))));

    public static final Block GREEN_CONCRETE_BRICK_SLAB = registerBlock("green_concrete_brick_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "green_concrete_brick_slab")))));

    public static final Block CYAN_CONCRETE_BRICK_SLAB = registerBlock("cyan_concrete_brick_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "cyan_concrete_brick_slab")))));

    public static final Block LIGHT_BLUE_CONCRETE_BRICK_SLAB = registerBlock("light_blue_concrete_brick_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_blue_concrete_brick_slab")))));

    public static final Block BLUE_CONCRETE_BRICK_SLAB = registerBlock("blue_concrete_brick_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "blue_concrete_brick_slab")))));

    public static final Block PURPLE_CONCRETE_BRICK_SLAB = registerBlock("purple_concrete_brick_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "purple_concrete_brick_slab")))));

    public static final Block MAGENTA_CONCRETE_BRICK_SLAB = registerBlock("magenta_concrete_brick_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "magenta_concrete_brick_slab")))));

    public static final Block PINK_CONCRETE_BRICK_SLAB = registerBlock("pink_concrete_brick_slab",
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "pink_concrete_brick_slab")))));


//Panel functions. Need one texture block and one panel block for each colour. The texture block is only used to set the texture for the panel, it is not available as a block in game.
    
    public static final Block WHITE_CONCRETE_TEXTURE = registerBlock("white_concrete_texture",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "white_concrete_texture")))));
    public static final Block WHITE_CONCRETE_PANEL = registerBlock("white_concrete_panel",
            new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "white_concrete_panel")))));
    
    public static final Block LIGHT_GRAY_CONCRETE_TEXTURE = registerBlock("light_gray_concrete_texture",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_gray_concrete_texture")))));
    public static final Block LIGHT_GRAY_CONCRETE_PANEL = registerBlock("light_gray_concrete_panel",
            new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_gray_concrete_panel")))));

    public static final Block GRAY_CONCRETE_TEXTURE = registerBlock("gray_concrete_texture",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "gray_concrete_texture")))));
    public static final Block GRAY_CONCRETE_PANEL = registerBlock("gray_concrete_panel",
            new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "gray_concrete_panel")))));

    public static final Block BLACK_CONCRETE_TEXTURE = registerBlock("black_concrete_texture",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "black_concrete_texture")))));
    public static final Block BLACK_CONCRETE_PANEL = registerBlock("black_concrete_panel",
            new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "black_concrete_panel")))));

    public static final Block BROWN_CONCRETE_TEXTURE = registerBlock("brown_concrete_texture",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "brown_concrete_texture")))));
    public static final Block BROWN_CONCRETE_PANEL = registerBlock("brown_concrete_panel",
            new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "brown_concrete_panel")))));

    public static final Block RED_CONCRETE_TEXTURE = registerBlock("red_concrete_texture",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "red_concrete_texture")))));
    public static final Block RED_CONCRETE_PANEL = registerBlock("red_concrete_panel",
            new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "red_concrete_panel")))));

    public static final Block ORANGE_CONCRETE_TEXTURE = registerBlock("orange_concrete_texture",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "orange_concrete_texture")))));
    public static final Block ORANGE_CONCRETE_PANEL = registerBlock("orange_concrete_panel",
            new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "orange_concrete_panel")))));

    public static final Block YELLOW_CONCRETE_TEXTURE = registerBlock("yellow_concrete_texture",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "yellow_concrete_texture")))));
    public static final Block YELLOW_CONCRETE_PANEL = registerBlock("yellow_concrete_panel",
            new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "yellow_concrete_panel")))));

    public static final Block LIME_CONCRETE_TEXTURE = registerBlock("lime_concrete_texture",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "lime_concrete_texture")))));
    public static final Block LIME_CONCRETE_PANEL = registerBlock("lime_concrete_panel",
            new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "lime_concrete_panel")))));

    public static final Block GREEN_CONCRETE_TEXTURE = registerBlock("green_concrete_texture",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "green_concrete_texture")))));
    public static final Block GREEN_CONCRETE_PANEL = registerBlock("green_concrete_panel",
            new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "green_concrete_panel")))));

    public static final Block CYAN_CONCRETE_TEXTURE = registerBlock("cyan_concrete_texture",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "cyan_concrete_texture")))));
    public static final Block CYAN_CONCRETE_PANEL = registerBlock("cyan_concrete_panel",
            new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "cyan_concrete_panel")))));

    public static final Block LIGHT_BLUE_CONCRETE_TEXTURE = registerBlock("light_blue_concrete_texture",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_blue_concrete_texture")))));
    public static final Block LIGHT_BLUE_CONCRETE_PANEL = registerBlock("light_blue_concrete_panel",
            new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "light_blue_concrete_panel")))));

    public static final Block BLUE_CONCRETE_TEXTURE = registerBlock("blue_concrete_texture",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "blue_concrete_texture")))));
    public static final Block BLUE_CONCRETE_PANEL = registerBlock("blue_concrete_panel",
            new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "blue_concrete_panel")))));

    public static final Block PURPLE_CONCRETE_TEXTURE = registerBlock("purple_concrete_texture",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "purple_concrete_texture")))));
    public static final Block PURPLE_CONCRETE_PANEL = registerBlock("purple_concrete_panel",
            new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "purple_concrete_panel")))));

    public static final Block MAGENTA_CONCRETE_TEXTURE = registerBlock("magenta_concrete_texture",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "magenta_concrete_texture")))));
    public static final Block MAGENTA_CONCRETE_PANEL = registerBlock("magenta_concrete_panel",
            new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "magenta_concrete_panel")))));

    public static final Block PINK_CONCRETE_TEXTURE = registerBlock("pink_concrete_texture",
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "pink_concrete_texture")))));
    public static final Block PINK_CONCRETE_PANEL = registerBlock("pink_concrete_panel",
            new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CONCRETE.pink()).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, "pink_concrete_panel")))));
    

//Registry methods
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, name), block);
    }


    private static void registerBlockItem(String name, Block block){
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, name),
                new BlockItem(block, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, name))).useBlockDescriptionPrefix()));
    }


//Add an entry for each block to add the block to the creative menu coloured blocks category.
    private static void addBLockToGroup(FabricCreativeModeTabOutput entries){

        for (List<ModBlockGroups.MCBlock> group : ModBlockGroups.mcGroups) {
            //For each Block in the group
            if (group == ModBlockGroups.MC_BUTTON) {
                continue; // skip this group
            }

            for (ModBlockGroups.MCBlock block : group) {
                entries.accept(block.customBlock());
            }
        }
    }


//Add an entry for each block to add the block to the creative menu redstone blocks category.
    private static void addButtonToGroup(FabricCreativeModeTabOutput entries){

    //Buttons

        for (ModBlockGroups.MCBlock block : ModBlockGroups.MC_BUTTON){
            entries.accept(block.customBlock());
        }
    }


//Registers the blocks to the creative menus.
    public static void registerModBlocks(){
        MoarConcrete.LOGGER.info("Registering ModBlocks for " + MoarConcrete.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COLORED_BLOCKS).register(ModBlocks::addBLockToGroup);
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.REDSTONE_BLOCKS).register(ModBlocks::addButtonToGroup);
    }
}
