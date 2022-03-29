package github.davido152.opalmod.util.compat;

import github.davido152.opalmod.init.ModBlocks;
import github.davido152.opalmod.init.ModItems;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat 
{
	public static void registerOres()
	{
		OreDictionary.registerOre("plankWood", ModBlocks.OPALIZED_WOOD_PLANKS);
		OreDictionary.registerOre("logWood", ModBlocks.OPALIZED_WOOD_LOG);
		OreDictionary.registerOre("treeLeaves", ModBlocks.OPALIZED_WOOD_LEAVES);
		OreDictionary.registerOre("treeSapling", ModBlocks.OPALIZED_WOOD_SAPLING);
		OreDictionary.registerOre("dirt", ModBlocks.DUSTY_DIRT);
		OreDictionary.registerOre("wool", ModBlocks.PIG_WOOL);
		OreDictionary.registerOre("gemOpal", ModItems.PURE_FIRE_OPAL);
		OreDictionary.registerOre("gemOpal", ModItems.PURE_MATRIX_OPAL);
		OreDictionary.registerOre("gemOpal", ModItems.PURE_OPAL);
	}
}
