package github.davido152.opalmod.util.handlers;

import github.davido152.opalmod.blocks.purifier.TileEntityPurifier;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntites()
	{
		GameRegistry.registerTileEntity(TileEntityPurifier.class, "purifier");
	}
}
