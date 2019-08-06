package pw.pqtato.potatoadditions.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

public class TableBlock extends Block {
	public TableBlock() {
		super(Properties.create(Material.WOOD)
				.sound(SoundType.WOOD)
				.hardnessAndResistance(0.5f)
		);
		setRegistryName("table");
	}
	
	public BlockRenderLayer getRenderLayer() {
		return BlockRenderLayer.CUTOUT_MIPPED;
	}

}
