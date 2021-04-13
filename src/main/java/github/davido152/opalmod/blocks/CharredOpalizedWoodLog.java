package github.davido152.opalmod.blocks;

import java.util.Random;

import github.davido152.opalmod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class CharredOpalizedWoodLog extends BlockLogBase 
{
	public CharredOpalizedWoodLog(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.WOOD);
		setHardness(2.0f);
		setResistance(9.5f);
		setHarvestLevel("axe", 0);
	}
	
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ModItems.OPALIZED_WOOD;
    }
}
