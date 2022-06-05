package com.ikalon.shi;

import com.ikalon.shi.blocks.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SHI implements ModInitializer {
	public static final String MOD_ID = "shi";

	public static final ItemGroup SHI_ITEMGROUP = FabricItemGroupBuilder
			.build(new Identifier(SHI.MOD_ID, "shi_itemgroup"),
					() -> new ItemStack(Items.FURNACE));

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Begin initializing " + MOD_ID);

		ModBlocks.registerModBlocks();

		LOGGER.info("Finished initializing " + MOD_ID);
	}
}
