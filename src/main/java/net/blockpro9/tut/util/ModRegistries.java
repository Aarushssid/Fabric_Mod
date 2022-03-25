package net.blockpro9.tut.util;

import net.blockpro9.tut.Tut;
import net.blockpro9.tut.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        System.out.println("Registering Fuels for + " + Tut.MOD_ID);

        FuelRegistry registry = FuelRegistry.INSTANCE;

        //400/20 = 20 seconds
        registry.add(ModItems.COAL_SLIVER, 400);
    }

}
