package github.davido152.opalmod.util.handlers;

import github.davido152.opalmod.entity.EntityKaprosuchus;
import github.davido152.opalmod.entity.EntityLystrosaurus;
import github.davido152.opalmod.entity.EntityWoolyPig;
import github.davido152.opalmod.entity.render.RenderKaprosuchus;
import github.davido152.opalmod.entity.render.RenderLystrosaurus;
import github.davido152.opalmod.entity.render.RenderWoolyPig;
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
		RenderingRegistry.registerEntityRenderingHandler(EntityWoolyPig.class, new IRenderFactory<EntityWoolyPig>()
		{
			@Override
			public Render<? super EntityWoolyPig> createRenderFor(RenderManager manager) 
			{
				return new RenderWoolyPig(manager);
			}	
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityKaprosuchus.class, new IRenderFactory<EntityKaprosuchus>()
		{
			@Override
			public Render<? super EntityKaprosuchus> createRenderFor(RenderManager manager) 
			{
				return new RenderKaprosuchus(manager);
			}	
		});
	}
}
