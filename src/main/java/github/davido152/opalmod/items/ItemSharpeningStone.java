package github.davido152.opalmod.items;

import github.davido152.opalmod.init.ItemBase;
import net.minecraft.creativetab.CreativeTabs;

public class ItemSharpeningStone extends ItemBase
{

	public ItemSharpeningStone(String name, CreativeTabs tab) 
	{
		super(name, tab);
	}
	
	@Override
	public int getItemStackLimit()
	{
		return 1;
	}
}
