package net.blockpro9.tut.item;

import net.blockpro9.tut.Tut;
import net.blockpro9.tut.item.custom.DowsingRodItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.Tut)));
    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.Tut)));
    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(ModItemGroup.Tut)));
    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.Tut).maxDamage(32)));
    public static final Item TURNIP = registerItem("turnip",
            new Item(new FabricItemSettings().group(ModItemGroup.Tut).food(ModFoodComponents.TURNIP)));
    public static final Item COAL_SLIVER = registerItem("coal_sliver",
            new Item(new FabricItemSettings().group(ModItemGroup.Tut)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Tut.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Tut.LOGGER.info("Registering Mod Items for " + Tut.MOD_ID);
    }
}
