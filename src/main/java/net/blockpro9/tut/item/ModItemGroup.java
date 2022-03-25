package net.blockpro9.tut.item;

import net.blockpro9.tut.Tut;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup Tut = FabricItemGroupBuilder.build(new Identifier(net.blockpro9.tut.Tut.MOD_ID, "tut"),
            () -> new ItemStack(ModItems.MYTHRIL_INGOT));
}
