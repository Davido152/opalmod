package github.davido152.opalmod.init;

import github.davido152.opalmod.Main;
import github.davido152.opalmod.entity.EntityLystrosaurus;
import github.davido152.opalmod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityBase 
{
	public static void registerEntities()
	{
		registerEntity("lystrosaurus", EntityLystrosaurus.class, Reference.ENTITY_LYSTROSAURUS, 50, 6580564, 7168094);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.Instance, range, 1, true, color1, color2);
	}
}
