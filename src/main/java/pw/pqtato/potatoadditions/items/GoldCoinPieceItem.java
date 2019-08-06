package pw.pqtato.potatoadditions.items;

import net.minecraft.item.Item;
import pw.pqtato.potatoadditions.PotatoAdditionsMod;

public class GoldCoinPieceItem extends Item {
	public GoldCoinPieceItem() {
		super(new Item.Properties()
				.group(PotatoAdditionsMod.setup.itemGroup));
		setRegistryName("gold_coin_piece");
	}
	
}
