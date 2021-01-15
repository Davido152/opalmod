package github.davido152.opalmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OpalizedWoodLog extends BlockBase
{
	public OpalizedWoodLog(String name, Material material, CreativeTabs tab) 
	{
		super(name, material, tab);
		
		setSoundType(SoundType.WOOD);
		setHardness(2.5f);
		setResistance(11.0f);
		setHarvestLevel("axe", 0);
	}
}
