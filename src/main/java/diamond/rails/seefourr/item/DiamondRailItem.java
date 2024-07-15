package diamond.rails.seefourr.item;

import diamond.rails.seefourr.Diamondrails;
import diamond.rails.seefourr.block.DiamondRailBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DiamondRailItem {

    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(Diamondrails.MOD_ID, id);
        Item registeredItem;
        registeredItem = Registry.register(Registries.ITEM, itemID, item);
        return registeredItem;
    }

    public static final Item DIAMONDRAIL = register(
            new BlockItem(DiamondRailBlock.DIAMOND_RAIL, new Item.Settings()),
            "diamond_rail"
    );

    public static void registerModItems() {
        Diamondrails.LOGGER.info("Registering Diamond Rail Item for " + Diamondrails.MOD_ID);
    }
}