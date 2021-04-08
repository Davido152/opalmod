package github.davido152.opalmod.entity.render;

import github.davido152.opalmod.entity.EntityLystrosaurus;
import github.davido152.opalmod.entity.model.ModelLystrosaurus;
import github.davido152.opalmod.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLystrosaurus extends RenderLiving<EntityLystrosaurus>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/lystrosaurus.png");
	
	public RenderLystrosaurus(RenderManager manager) 
	{
		super(manager, new ModelLystrosaurus(), 0.5f);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityLystrosaurus entity)
	{
		return TEXTURES;
	}	
	
	@Override
	protected void applyRotations(EntityLystrosaurus entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
