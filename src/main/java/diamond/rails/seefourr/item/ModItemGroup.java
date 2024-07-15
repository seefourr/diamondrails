package diamond.rails.seefourr.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class ModItemGroup {
    public static void registerItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {
            entries.add(DiamondRailItem.DIAMONDRAIL);
            entries.add(EnhancedDiamondRailItem.ENHANCEDDIAMONDRAIL);
            entries.add(NetheriteRailItem.NETHERITERAIL);
        });
    }
}
