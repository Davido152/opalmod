package github.davido152.opalmod.world.biome;

import java.util.Random;

import github.davido152.opalmod.init.ModBlocks;
import github.davido152.opalmod.world.tree.WorldGenCharredOpalizedTree;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.BiomeManager;

public class BiomeAshyForest extends Biome
{

	protected static final WorldGenAbstractTree TREE = new WorldGenCharredOpalizedTree();
	
	public BiomeAshyForest() 
	{
		super(new BiomeProperties("Ashy Forest").setBaseHeight(0.125f).setHeightVariation(0.05f).setTemperature(0.9f).setRainDisabled());
		
		topBlock = ModBlocks.DUSTY_DIRT.getDefaultState();
		fillerBlock = Blocks.DIRT.getDefaultState();
		
		this.decorator.treesPerChunk = 3;
        this.decorator.flowersPerChunk = 0;
        this.decorator.grassPerChunk = 0;
        
		this.spawnableCreatureList.clear();
	}	
	
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	{
		return TREE;
	}
}