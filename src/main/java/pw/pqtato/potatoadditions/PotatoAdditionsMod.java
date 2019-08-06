package pw.pqtato.potatoadditions;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import pw.pqtato.potatoadditions.blocks.CeilingLightBlock;
import pw.pqtato.potatoadditions.blocks.LampBlock;
import pw.pqtato.potatoadditions.blocks.ModBlocks;
import pw.pqtato.potatoadditions.blocks.TableBlock;
import pw.pqtato.potatoadditions.items.GoldCoinItem;
import pw.pqtato.potatoadditions.items.GoldCoinPieceItem;
import pw.pqtato.potatoadditions.items.IconItem;
import pw.pqtato.potatoadditions.items.IronCoinItem;
import pw.pqtato.potatoadditions.items.IronCoinPieceItem;
import pw.pqtato.potatoadditions.items.RainbowCoinItem;
import pw.pqtato.potatoadditions.items.RainbowCoinPieceItem;
import pw.pqtato.potatoadditions.items.StoneCoinItem;
import pw.pqtato.potatoadditions.setup.ClientProxy;
import pw.pqtato.potatoadditions.setup.IProxy;
import pw.pqtato.potatoadditions.setup.ModSetup;
import pw.pqtato.potatoadditions.setup.ServerProxy;

import javax.annotation.Nullable;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MOD_ID)
public class PotatoAdditionsMod {
	String modid = Reference.MOD_ID;
	String modname = Reference.NAME;

	public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
	
	public static ModSetup setup = new ModSetup();
	
	private static final Logger LOGGER = LogManager.getLogger();

	public PotatoAdditionsMod() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
	}

	private void setup(final FMLCommonSetupEvent event) {
		setup.init();
		LOGGER.info(getModName(modid) + " loaded");
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
			event.getRegistry().register(new LampBlock());
			event.getRegistry().register(new TableBlock());
			event.getRegistry().register(new CeilingLightBlock());
		}
		
		@SubscribeEvent
		public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
			Item.Properties properties = new Item.Properties()
					.group(setup.itemGroup);
			event.getRegistry().register(new BlockItem(ModBlocks.LAMP, properties).setRegistryName("lamp"));
			event.getRegistry().register(new BlockItem(ModBlocks.TABLE, properties).setRegistryName("table"));
			event.getRegistry().register(new BlockItem(ModBlocks.CEILING_LIGHT, properties).setRegistryName("ceiling_light"));
			
			event.getRegistry().register(new IconItem());
			event.getRegistry().register(new RainbowCoinItem());
			event.getRegistry().register(new GoldCoinItem());
			event.getRegistry().register(new IronCoinItem());
			event.getRegistry().register(new StoneCoinItem());
			event.getRegistry().register(new RainbowCoinPieceItem());
			event.getRegistry().register(new GoldCoinPieceItem());
			event.getRegistry().register(new IronCoinPieceItem());
		}
	}
	
	// Function to get mod name from mod id
	@Nullable
	public static String getModName(String modId) {
		if (modId != null) {
			return ModList.get().getModContainerById(modId)
					.map(modContainer -> modContainer.getModInfo().getDisplayName())
					.orElse(StringUtils.capitalize(modId));
		}
		return null;
	}
}
