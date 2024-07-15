package diamond.rails.seefourr;

import diamond.rails.seefourr.item.ModItemGroup;
import diamond.rails.seefourr.item.DiamondRailItem;
import diamond.rails.seefourr.item.EnhancedDiamondRailItem;
import diamond.rails.seefourr.item.NetheriteRailItem;
import diamond.rails.seefourr.item.BlockItemWithGlint;
import diamond.rails.seefourr.block.DiamondRailBlock;
import diamond.rails.seefourr.block.EnhancedDiamondRailBlock;
import diamond.rails.seefourr.block.NetheriteRailBlock;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Diamondrails implements ModInitializer{
    public static final String MOD_ID = "diamondrails";
    public static final Logger LOGGER = LoggerFactory.getLogger("diamondrails");


    public static final TagKey<Block> TAG_POWERED_RAILS = TagKey.of(
            RegistryKeys.BLOCK, Identifier.of("diamondrails", "powered_rails")
    );

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroups();
        DiamondRailItem.registerModItems();
        EnhancedDiamondRailItem.registerModItems();
        NetheriteRailItem.registerModItems();
        BlockItemWithGlint.registerModItems();
        DiamondRailBlock.registerModBlocks();
        EnhancedDiamondRailBlock.registerModBlocks();
        NetheriteRailBlock.registerModBlocks();
    }
}
