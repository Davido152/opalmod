package github.davido152.opalmod.items.items;

import github.davido152.opalmod.Main;
import github.davido152.opalmod.init.ModItems;
import github.davido152.opalmod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;

public class PureFireOpal extends Item implements IHasModel

{		
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) 
	{
	    if (!((Entity) (player)).world.isRemote && (!(entity instanceof EntityPlayer))) 
	    {
	        entity.setFire(2);
	    }
	    return super.onLeftClickEntity(stack, player, entity);
	}
	public PureFireOpal(String name, CreativeTabs tab) 
	{		
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