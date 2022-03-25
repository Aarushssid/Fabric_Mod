package net.blockpro9.tut;

import net.blockpro9.tut.block.ModBlocks;
import net.blockpro9.tut.item.ModItems;
import net.blockpro9.tut.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tut implements ModInitializer {
	public static final String MOD_ID = "tut";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();
	}
}
