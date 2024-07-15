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

public class EnhancedDiamondRailBlock {
    public static Block register (Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(Diamondrails.MOD_ID, name);
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static final Block ENHANCED_DIAMOND_RAIL = register(
            new PoweredRailBlock(AbstractBlock.Settings.copy(Blocks.RAIL).sounds(BlockSoundGroup.METAL).strength(5.0f).noCollision()),
            "enhanced_diamond_rail",
            true
    );
    public static void registerModBlocks() {
        Diamondrails.LOGGER.info("Registering Enhanced Diamond Rail block for " + Diamondrails.MOD_ID);
    }
}