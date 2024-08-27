package diamond.rails.seefourr.item;

import diamond.rails.seefourr.Diamondrails;
import diamond.rails.seefourr.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    
    public static final Item DIAMONDRAIL = registerItem("diamond_rail",
            new BlockItem(ModBlocks.DIAMOND_RAIL,new FabricItemSettings()));
    
    public static final Item ENHANCEDDIAMONDRAIL = registerItem("enhanced_diamond_rail",
            new BlockItem(ModBlocks.ENHANCED_DIAMOND_RAIL,new FabricItemSettings()));
    
    public static final Item NETHERITE_RAIL = registerItem("netherite_rail",
            new BlockItem(ModBlocks.NETHERITE_RAIL,new  FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DiamondRails.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DiamondRails.LOGGER.info("Registering Mod Items for " + DiamondRails.MOD_ID);
    }
}
