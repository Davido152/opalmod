package github.davido152.opalmod.entity.render;

import github.davido152.opalmod.entity.EntityKaprosuchus;
import github.davido152.opalmod.entity.model.ModelKaprosuchus;
import github.davido152.opalmod.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKaprosuchus extends RenderLiving<EntityKaprosuchus>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/kaprosuchus.png");
	
	public RenderKaprosuchus(RenderManager manager) 
	{
		super(manager, new ModelKaprosuchus(), 0.5f);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityKaprosuchus entity)
	{
		return TEXTURES;
	}	
	
	@Override
	protected void applyRotations(EntityKaprosuchus entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
