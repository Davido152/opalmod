package github.davido152.opalmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MatrixOpalBlock extends BlockBase
{
	public MatrixOpalBlock(String name, Material material, CreativeTabs tab) 
	{
		super(name, material, tab);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.2f);
	}
}
