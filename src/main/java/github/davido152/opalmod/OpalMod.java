package github.davido152.opalmod;

import github.davido152.opalmod.init.EntityBase;
import github.davido152.opalmod.init.ModBlocks;
import github.davido152.opalmod.init.ModRecipes;
import github.davido152.opalmod.proxy.CommonProxy;
import github.davido152.opalmod.tabs.OpalModTab;
import github.davido152.opalmod.util.Reference;
import github.davido152.opalmod.util.handlers.RegistryHandler;
import github.davido152.opalmod.util.handlers.RenderHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;



@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class OpalMod {

	@Instance
	public static OpalMod Instance;
	
	public static final CreativeTabs opalmodtab = new OpalModTab("opalmodtab");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		//GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
		EntityBase.registerEntities();
		RenderHandler.registerEntityRenders();
		RegistryHandler.otherRegistries();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
		OreDictionary.registerOre("plankWood", ModBlocks.OPALIZED_WOOD_PLANKS);
		OreDictionary.registerOre("logWood", ModBlocks.OPALIZED_WOOD_LOG);
		OreDictionary.registerOre("treeLeaves", ModBlocks.OPALIZED_WOOD_LEAVES);
		OreDictionary.registerOre("treeSapling", ModBlocks.OPALIZED_WOOD_SAPLING);
		OreDictionary.registerOre("dirt", ModBlocks.DUSTY_DIRT);
		OreDictionary.registerOre("wool", ModBlocks.PIG_WOOL);
	}
	
	@EventHandler
	public static void postinit(FMLPostInitializationEvent event)
	{
		
	}	
}