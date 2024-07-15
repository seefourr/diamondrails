package diamond.rails.seefourr.item;

import diamond.rails.seefourr.Diamondrails;
import diamond.rails.seefourr.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(Diamondrails.MOD_ID, id);
        Item registeredItem;
        registeredItem = Registry.register(Registries.ITEM, itemID, item);
        return registeredItem;
    }

    public static final Item DIAMOND_RAIL = register(
            new BlockItem(ModBlocks.DIAMONDRAIL, new Item.Settings()),
            "diamond_rail"
    );

    public static final Item ENHANCED_DIAMOND_RAIL = register(
            new BlockItemWithGlint(ModBlocks.ENHANCEDDIAMONDRAIL, new Item.Settings()),
            "enhanced_diamond_rail"
    );

    public static final Item NETHERITE_RAIL = register(
            new BlockItem(ModBlocks.NETHERITERAIL, new Item.Settings()),
            "netherite_rail"
    );

    public static void registerModItems() {
        Diamondrails.LOGGER.info("Registering items for " + Diamondrails.MOD_ID);
    }
}