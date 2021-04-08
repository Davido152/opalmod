package github.davido152.opalmod.util.handlers;

import github.davido152.opalmod.entity.EntityLystrosaurus;
import github.davido152.opalmod.entity.render.RenderLystrosaurus;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityLystrosaurus.class, new IRenderFactory<EntityLystrosaurus>()
		{
			@Override
			public Render<? super EntityLystrosaurus> createRenderFor(RenderManager manager) 
			{
				return new RenderLystrosaurus(manager);
			}	
		});
	}
}
