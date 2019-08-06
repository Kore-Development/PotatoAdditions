package pw.pqtato.potatoadditions.items;

import net.minecraft.item.Item;
import pw.pqtato.potatoadditions.PotatoAdditionsMod;

public class GoldCoinItem extends Item {
	public GoldCoinItem() {
		super(new Item.Properties()
				.group(PotatoAdditionsMod.setup.itemGroup));
		setRegistryName("gold_coin");
	}
	
}
