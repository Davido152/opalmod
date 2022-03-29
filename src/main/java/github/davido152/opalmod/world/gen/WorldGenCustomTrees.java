package github.davido152.opalmod.world.gen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import github.davido152.opalmod.init.ModBlocks;
import github.davido152.opalmod.world.biome.BiomeAshyForest;
import github.davido152.opalmod.world.tree.WorldGenCharredOpalizedTree;
import github.davido152.opalmod.world.tree.WorldGenOpalizedTree;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomTrees implements IWorldGenerator
{
	private final WorldGenerator OPALIZED_TREE = new WorldGenOpalizedTree();
	private final WorldGenerator CHARRED_OPALIZED_TREE = new WorldGenCharredOpalizedTree();
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 1:
			
			break;
			
		case 0:
			
			//runGenerator(OPALIZED_TREE, world, random, chunkX, chunkZ, 22, Blocks.GRASS, BiomeForest.class);
			runGenerator(CHARRED_OPALIZED_TREE, world, random, chunkX, chunkZ, 10, ModBlocks.DUSTY_DIRT, BiomeAshyForest.class);
			
			break;
			
		case -1:
			
			break;
		}
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chance, Block topBlock, Class<?>... classes)
	{
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		
		int x = (chunkX * 16) + random.nextInt(15);
		int z = (chunkZ * 16) + random.nextInt(15);
		int y = calculateGenerationHeight(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x,y,z);
		
		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		if(world.getWorldType() != WorldType.FLAT)
		{
			if(classesList.contains(biome))
			{
				if(random.nextInt(chance) == 0)
				{
					generator.generate(world, random, pos);
				}
			}
		}
	}
	
	private static int calculateGenerationHeight(World world, int x, int z, Block topBlock)
	{
		int y = world.getHeight();
		boolean foundGround = false;
		
		while(!foundGround && y-- >= 0)
		{
			Block block = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround = block == topBlock;
		}
		
		return y;
	}
}
