package pw.pqtato.potatoadditions.blocks;

import net.minecraftforge.registries.ObjectHolder;
import pw.pqtato.potatoadditions.Reference;

public class ModBlocks {

	@ObjectHolder(Reference.MOD_ID + ":lamp")
	public static LampBlock LAMP;
	
	@ObjectHolder(Reference.MOD_ID + ":table")
	public static TableBlock TABLE;
	
	@ObjectHolder(Reference.MOD_ID + ":ceiling_light")
	public static CeilingLightBlock CEILING_LIGHT;
}
