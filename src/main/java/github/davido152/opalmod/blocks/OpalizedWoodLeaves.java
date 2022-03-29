package github.davido152.opalmod.blocks;

import java.util.Random;

import github.davido152.opalmod.init.ModBlocks;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class OpalizedWoodLeaves extends BlockLeavesBase
{

	public OpalizedWoodLeaves(String name) 
	{
		super(name);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return Item.getItemFromBlock(ModBlocks.OPALIZED_WOOD_SAPLING);
	}
}
