package net.blockpro9.tut.block;

import net.blockpro9.tut.Tut;
import net.blockpro9.tut.block.custom.*;
import net.blockpro9.tut.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.Tut);

    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.Tut);

    public static final Block DEEPSLATE_MYTHRIL_ORE = registerBlock("deepslate_mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.Tut);

    public static final Block RAW_MYTHRIL_BLOCK = registerBlock("raw_mythril_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.Tut);

    public static final Block NETHER_MYTHRIL_ORE = registerBlock("nether_mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.Tut);

    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.Tut);

    public static final Block MYTHRIL_STAIRS = registerBlock("mythril_stairs",
            new ModStairsBlock(ModBlocks.MYTHRIL_BLOCK.getDefaultState(),FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.Tut);

    public static final Block MYTHRIL_SLAB = registerBlock("mythril_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.Tut);

    public static final Block MYTHRIL_BUTTON = registerBlock("mythril_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.Tut);

    public static final Block MYTHRIL_PRESSURE_PLATE = registerBlock("mythril_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,FabricBlockSettings
                    .of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.Tut);

    public static final Block MYTHRIL_FENCE = registerBlock("mythril_fence",
            new FenceBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.Tut);

    public static final Block MYTHRIL_FENCE_GATE = registerBlock("mythril_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.Tut);

    public static final Block MYTHRIL_WALL = registerBlock("mythril_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.Tut);

    public static final Block CHERRY_BLOSSOM_DOOR = registerBlock("cherry_blossom_door",
            new ModDoorBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).requiresTool().nonOpaque()), ModItemGroup.Tut);
    // set material to Metal if you want it to be only opened by redstone..
    public static final Block CHERRY_BLOSSOM_TRAPDOOR = registerBlock("cherry_blossom_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(3f).requiresTool().nonOpaque()), ModItemGroup.Tut);
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.Tut);
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.Tut);
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.Tut);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Tut.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Tut.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        Tut.LOGGER.info("Registering ModBlocks for " + Tut.MOD_ID);
    }
}
