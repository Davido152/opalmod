package github.davido152.opalmod.blocks;

import github.davido152.opalmod.init.BlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PigWool extends BlockBase
{

	public PigWool(String name, Material material) 
	{
		super(name, material);
		
        setSoundType(SoundType.CLOTH);
        setHardness(0.8f);
        setResistance(4.5f);
        setHarvestLevel("shears", 0);
	}
}
