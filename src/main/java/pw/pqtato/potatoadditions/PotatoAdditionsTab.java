package pw.pqtato.potatoadditions;

// import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import pw.pqtato.potatoadditions.items.ModItems;

public class PotatoAdditionsTab extends ItemGroup {

	public PotatoAdditionsTab() {
		super("potatoadditions");
		this.setBackgroundImageName("potatoadditions.png");
	}

	@Override
	public ItemStack createIcon() {
		ItemStack stack = new ItemStack(ModItems.ICONITEM);
		// stack.addEnchantment(Enchantment.getEnchantmentByID(0), 1);
		return stack;
	}

}
