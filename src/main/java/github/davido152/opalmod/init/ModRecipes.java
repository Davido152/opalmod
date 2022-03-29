package github.davido152.opalmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	
	public static void init( ) 
	{
		GameRegistry.addSmelting(ModBlocks.OPAL_ORE, new ItemStack(ModItems.PURE_OPAL, 1), 1.0f);
		GameRegistry.addSmelting(ModItems.CRUDE_OPAL, new ItemStack(ModItems.PURE_OPAL, 1), 0.8f);
		GameRegistry.addSmelting(ModBlocks.FIRE_OPAL_ORE, new ItemStack(ModItems.PURE_FIRE_OPAL, 1), 1.0f);
		GameRegistry.addSmelting(ModBlocks.NETHER_FIRE_OPAL_ORE, new ItemStack(ModItems.PURE_FIRE_OPAL, 1), 1.1f);
		GameRegistry.addSmelting(ModItems.CRUDE_FIRE_OPAL, new ItemStack(ModItems.PURE_FIRE_OPAL, 1), 0.8f);
		GameRegistry.addSmelting(ModBlocks.MATRIX_OPAL_ORE, new ItemStack(ModItems.PURE_MATRIX_OPAL, 1), 1.0f);
		GameRegistry.addSmelting(ModItems.CRUDE_MATRIX_OPAL, new ItemStack(ModItems.PURE_MATRIX_OPAL, 1), 1.0f);
	}
}
