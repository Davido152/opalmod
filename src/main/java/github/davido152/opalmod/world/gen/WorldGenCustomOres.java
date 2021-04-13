package github.davido152.opalmod.world.gen;

import java.util.Random;

import github.davido152.opalmod.init.ModBlocks;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator
{
	private WorldGenerator opal_ore, fire_opal_ore, nether_fire_opal_ore, matrix_opal_ore, diamond_ore;
	
	public WorldGenCustomOres()
	{
		opal_ore = new WorldGenMinable(ModBlocks.OPAL_ORE.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
		fire_opal_ore = new WorldGenMinable(ModBlocks.FIRE_OPAL_ORE.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.STONE));
		nether_fire_opal_ore = new WorldGenMinable(ModBlocks.NETHER_FIRE_OPAL_ORE.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		matrix_opal_ore = new WorldGenMinable(ModBlocks.MATRIX_OPAL_ORE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
		diamond_ore = new WorldGenMinable(Blocks.DIAMOND_ORE.getDefaultState(), 20, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.getDimension())
		{
			case -1:
				
				runGenerator(nether_fire_opal_ore, world, random, chunkX, chunkZ, 9, 8, 250);
				
				break;
			
			case 0:
				
				runGenerator(opal_ore, world, random, chunkX, chunkZ, 5, 9, 26);
				runGenerator(fire_opal_ore, world, random, chunkX, chunkZ, 4, 5, 20);
				runGenerator(matrix_opal_ore, world, random, chunkX, chunkZ, 3, 13, 18);
				runGenerator(diamond_ore, world, random, chunkX, chunkZ, 100, 6, 255);
				
				break;
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds!");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);

			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}
