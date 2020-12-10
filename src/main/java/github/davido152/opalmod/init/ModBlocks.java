package github.davido152.opalmod.init;

import java.util.ArrayList;
import java.util.List;

import github.davido152.opalmod.blocks.OpalBlock;
import github.davido152.opalmod.blocks.OpalOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks 
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block OPAL_BLOCK = new OpalBlock("opal_block", Material.IRON, CreativeTabs.BUILDING_BLOCKS);
	public static final Block OPAL_ORE = new OpalOre("opal_ore", Material.ROCK, CreativeTabs.BUILDING_BLOCKS);

}
