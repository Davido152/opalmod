package github.davido152.opalmod.entity.render;

import github.davido152.opalmod.entity.EntityWoolyPig;
import github.davido152.opalmod.entity.model.ModelWoolyPig;
import github.davido152.opalmod.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWoolyPig extends RenderLiving<EntityWoolyPig>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/wooly_pig.png");
	
	public RenderWoolyPig(RenderManager manager) 
	{
		super(manager, new ModelWoolyPig(), 0.5f);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityWoolyPig entity)
	{
		return TEXTURES;
	}	
	
	@Override
	protected void applyRotations(EntityWoolyPig entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
