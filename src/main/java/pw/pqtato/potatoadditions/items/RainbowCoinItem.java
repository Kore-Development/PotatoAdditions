package pw.pqtato.potatoadditions.items;

import net.minecraft.item.Item;
import pw.pqtato.potatoadditions.PotatoAdditionsMod;

public class RainbowCoinItem extends Item {
	public RainbowCoinItem() {
		super(new Item.Properties()
				.group(PotatoAdditionsMod.setup.itemGroup));
		setRegistryName("rainbow_coin");
	}
	
}
