package github.davido152.opalmod.world;

import java.util.Random;

import github.davido152.opalmod.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		if (world.provider.getDimension() == 0) 
		{
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		
		if (world.provider.getDimension() == -1) 
		{
			generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		generateOre(ModBlocks.OPAL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 9, 26, 3 + random.nextInt(5), 5);
		generateOre(ModBlocks.FIRE_OPAL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 20, 1 + random.nextInt(5), 4);
		generateOre(ModBlocks.MATRIX_OPAL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 14, 17, 1 + random.nextInt(4), 3);
	}
	
	private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		generateOre(ModBlocks.NETHER_FIRE_OPAL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 28, 95, 3 + random.nextInt(5), 8);
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances)
	{
		int deltaY = maxY - minY;

		for(int i = 0; i < chances; i++)
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
}
