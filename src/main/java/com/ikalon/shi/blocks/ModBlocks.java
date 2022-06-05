package com.ikalon.shi.blocks;

import com.ikalon.shi.SHI;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block IRIDIUM_ORE =
            registerBlock("iridium_ore",
                    new Block(FabricBlockSettings.copy(Blocks.DIAMOND_ORE)));


    private static Block registerBlock(String name, Block block) {
        Registry.register(Registry.ITEM,
                new Identifier(SHI.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(SHI.SHI_ITEMGROUP)));

        return Registry.register(Registry.BLOCK,
                new Identifier(SHI.MOD_ID, name),
                block);
    }

    public static void registerModBlocks() {
        SHI.LOGGER.info("Registering Blocks");
    }


}
