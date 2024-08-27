package diamond.rails.seefourr.block;

import diamond.rails.seefourr.Diamondrails;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PoweredRailBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

    public static final Block DIAMONDRAIL = Registry.register(Registries.BLOCK, new Identifier(DiamondRails.MOD_ID, "diamond_rail"),
            new PoweredRailBlock(FabricBlockSettings.copyOf(Blocks.RAIL).sounds(BlockSoundGroup.METAL).strength(3.0f).noCollision()));
    public static final Block ENHANCEDDIAMONDRAIL = Registry.register(Registries.BLOCK, new Identifier(DiamondRails.MOD_ID, "enhanced_diamond_rail"),
            new PoweredRailBlock(FabricBlockSettings.copyOf(Blocks.RAIL).sounds(BlockSoundGroup.METAL).strength(5.0f).noCollision()));
    public static final Block NETHERITERAIL = Registry.register(Registries.BLOCK, new Identifier(DiamondRails.MOD_ID, "netherite_rail"),
            new PoweredRailBlock(FabricBlockSettings.copyOf(Blocks.RAIL).sounds(BlockSoundGroup.METAL).strength(15.0f).noCollision()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(DiamondRails.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(DiamondRails.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerModBlocks() {
        DiamondRails.LOGGER.info("Registering Mod Blocks for " + DiamondRails.MOD_ID);
    }
}
