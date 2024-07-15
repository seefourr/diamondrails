package diamond.rails.seefourr.item;

import diamond.rails.seefourr.Diamondrails;
import diamond.rails.seefourr.block.EnhancedDiamondRailBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EnhancedDiamondRailItem {

    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(Diamondrails.MOD_ID, id);
        Item registeredItem;
        registeredItem = Registry.register(Registries.ITEM, itemID, item);
        return registeredItem;
    }

    public static final Item ENHANCEDDIAMONDRAIL = register(
            new BlockItemWithGlint(EnhancedDiamondRailBlock.ENHANCED_DIAMOND_RAIL, new Item.Settings()),
            "enhanced_diamond_rail"
    );

    public static void registerModItems() {
        Diamondrails.LOGGER.info("Registering Enhanced Diamond Rail Item for " + Diamondrails.MOD_ID);
    }
}