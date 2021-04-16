package github.davido152.opalmod.util.handlers;

import github.davido152.opalmod.blocks.purifier.ContainerPurifier;
import github.davido152.opalmod.blocks.purifier.GuiPurifier;
import github.davido152.opalmod.blocks.purifier.TileEntityPurifier;
import github.davido152.opalmod.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_PURIFIER) return new ContainerPurifier(player.inventory, (TileEntityPurifier)world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_PURIFIER) return new GuiPurifier(player.inventory, (TileEntityPurifier)world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}
}
