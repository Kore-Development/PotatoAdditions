package pw.pqtato.potatoadditions.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class IconItem extends Item {
	public static final Food food = (new Food.Builder()).hunger(20).saturation(10.0F).build();
	
	public IconItem() {
		super(new Item.Properties()
				.food(food));
		setRegistryName("icon");
	}
	
}
