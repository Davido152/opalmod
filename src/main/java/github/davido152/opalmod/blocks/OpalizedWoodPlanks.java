package github.davido152.opalmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OpalizedWoodPlanks extends BlockBase
{
	public OpalizedWoodPlanks(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.WOOD);
		setHardness(2.5f);
		setResistance(16.0f);
		setHarvestLevel("axe", 0);
	}
}
