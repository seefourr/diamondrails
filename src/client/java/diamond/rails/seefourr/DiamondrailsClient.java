package diamond.rails.seefourr;

import diamond.rails.seefourr.block.DiamondRailBlock;
import diamond.rails.seefourr.block.EnhancedDiamondRailBlock;
import diamond.rails.seefourr.block.NetheriteRailBlock;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;


public class DiamondrailsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(DiamondRailBlock.DIAMOND_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EnhancedDiamondRailBlock.ENHANCED_DIAMOND_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(NetheriteRailBlock.NETHERITE_RAIL, RenderLayer.getCutout());
    }
}