package github.davido152.opalmod.tabs;

import github.davido152.opalmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class OpalModTab extends CreativeTabs
{
	public OpalModTab(String label) 
	{
		super("opalmodtab");
	}
	
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.PURE_OPAL);
	}
}
