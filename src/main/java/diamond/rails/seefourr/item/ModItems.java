package diamond.rails.seefourr.item;

import diamond.rails.seefourr.Diamondrails;
import diamond.rails.seefourr.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    
    public static final Item DIAMOND_RAIL = registerItem("diamond_rail",
            new BlockItem(ModBlocks.DIAMONDRAIL,new FabricItemSettings()));
    
    public static final Item ENHANCED_DIAMOND_RAIL = registerItem("enhanced_diamond_rail",
            new BlockItemWithGlint(ModBlocks.ENHANCEDDIAMONDRAIL,new FabricItemSettings()));
    
    public static final Item NETHERITE_RAIL = registerItem("netherite_rail",
            new BlockItem(ModBlocks.NETHERITERAIL,new  FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Diamondrails.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Diamondrails.LOGGER.info("Registering Mod Items for " + Diamondrails.MOD_ID);
    }
}
