package github.davido152.opalmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	
	public static void init( ) 
	{
		GameRegistry.addSmelting(ModBlocks.OPAL_ORE, new ItemStack(ModItems.PURE_OPAL, 1), 1.0f);
		GameRegistry.addSmelting(ModItems.CRUDE_OPAL, new ItemStack(ModItems.PURE_OPAL, 1), 0.8f);
	}
}
