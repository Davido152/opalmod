package github.davido152.opalmod.items.tools;

import github.davido152.opalmod.Main;
import github.davido152.opalmod.init.ModItems;
import github.davido152.opalmod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel 
{
	public ToolAxe(String name, ToolMaterial material, CreativeTabs tab)
	{
		super(material, 9.0f, -3.3f);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
	
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "invemtory");
	}
}
