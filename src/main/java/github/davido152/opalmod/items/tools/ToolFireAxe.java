package github.davido152.opalmod.items.tools;

import github.davido152.opalmod.Main;
import github.davido152.opalmod.init.ModItems;
import github.davido152.opalmod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ToolFireAxe extends ItemAxe implements IHasModel
{
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) 
	{
	    if (!((Entity) (player)).world.isRemote && (!(entity instanceof EntityPlayer))) 
	    {
	        entity.setFire(5);
	    }
	    return super.onLeftClickEntity(stack, player, entity);
	}
	public ToolFireAxe(String name, ToolMaterial material, CreativeTabs tab)
	{
		super(material, 9.0f, -3.1f);
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
