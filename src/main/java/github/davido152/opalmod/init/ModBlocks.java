package github.davido152.opalmod.init;

import java.util.ArrayList;
import java.util.List;

import github.davido152.opalmod.blocks.CharredOpalizedWoodLog;
import github.davido152.opalmod.blocks.DustyDirt;
import github.davido152.opalmod.blocks.FireOpalBlock;
import github.davido152.opalmod.blocks.FireOpalOre;
import github.davido152.opalmod.blocks.MatrixOpalBlock;
import github.davido152.opalmod.blocks.MatrixOpalOre;
import github.davido152.opalmod.blocks.NetherFireOpalOre;
import github.davido152.opalmod.blocks.OpalBlock;
import github.davido152.opalmod.blocks.OpalOre;
import github.davido152.opalmod.blocks.OpalizedWoodLeaves;
import github.davido152.opalmod.blocks.OpalizedWoodLog;
import github.davido152.opalmod.blocks.OpalizedWoodPlanks;
import github.davido152.opalmod.blocks.OpalizedWoodSapling;
import github.davido152.opalmod.blocks.PigWool;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block OPAL_BLOCK = new OpalBlock("opal_block", Material.IRON);	
	public static final Block FIRE_OPAL_BLOCK = new FireOpalBlock("fire_opal_block", Material.IRON);
	public static final Block MATRIX_OPAL_BLOCK = new MatrixOpalBlock("matrix_opal_block", Material.IRON);
    public static final Block PIG_WOOL = new PigWool("pig_wool", Material.CLOTH);
    public static final Block DUSTY_DIRT = new DustyDirt("dusty_dirt", Material.GROUND);
    
    //Ores
    public static final Block OPAL_ORE = new OpalOre("opal_ore", Material.ROCK);
    public static final Block FIRE_OPAL_ORE = new FireOpalOre("fire_opal_ore", Material.ROCK);
    public static final Block NETHER_FIRE_OPAL_ORE = new NetherFireOpalOre("nether_fire_opal_ore", Material.ROCK);
    public static final Block MATRIX_OPAL_ORE = new MatrixOpalOre("matrix_opal_ore", Material.ROCK);
    
    //Tree   
    public static final Block OPALIZED_WOOD_LOG = new OpalizedWoodLog("opalized_wood_log", Material.WOOD);
    public static final Block OPALIZED_WOOD_PLANKS = new OpalizedWoodPlanks("opalized_wood_planks", Material.WOOD);
    public static final Block OPALIZED_WOOD_LEAVES = new OpalizedWoodLeaves("opalized_wood_leaves");
    public static final Block OPALIZED_WOOD_SAPLING = new OpalizedWoodSapling("opalized_wood_sapling", Material.PLANTS);
    public static final Block CHARRED_OPALIZED_WOOD_LOG = new CharredOpalizedWoodLog("charred_opalized_wood_log", Material.WOOD); 
}