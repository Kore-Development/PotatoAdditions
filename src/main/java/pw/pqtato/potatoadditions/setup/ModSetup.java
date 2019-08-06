package pw.pqtato.potatoadditions.setup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import pw.pqtato.potatoadditions.blocks.ModBlocks;

public class ModSetup {
	
	public ItemGroup itemGroup = new ItemGroup("potatoadditions") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(ModBlocks.LAMP);
		}
	};
	
	public void init() {
		
	}
}
