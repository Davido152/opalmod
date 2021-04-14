package github.davido152.opalmod.items.tools;

import github.davido152.opalmod.OpalMod;
import github.davido152.opalmod.init.ModItems;
import github.davido152.opalmod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.event.world.BlockEvent;

public class ToolFireSpade extends ItemSpade implements IHasModel
{
	public ToolFireSpade(String name, ToolMaterial material, CreativeTabs tab)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
	
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		OpalMod.proxy.registerItemRenderer(this, 0, "invemtory");
	}
}
