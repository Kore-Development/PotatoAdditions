package pw.pqtato.potatoadditions.items;

import net.minecraft.item.Item;
import pw.pqtato.potatoadditions.PotatoAdditionsMod;

public class StoneCoinItem extends Item {
	public StoneCoinItem() {
		super(new Item.Properties()
				.group(PotatoAdditionsMod.setup.itemGroup));
		setRegistryName("stone_coin");
	}
	
}
