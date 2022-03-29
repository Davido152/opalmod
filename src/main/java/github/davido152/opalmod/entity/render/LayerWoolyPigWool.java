package github.davido152.opalmod.entity.render;

import github.davido152.opalmod.entity.EntityWoolyPig;
import github.davido152.opalmod.entity.model.ModelWoolyPigWool;
import github.davido152.opalmod.util.Reference;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.datafix.DataFixer;

public class LayerWoolyPigWool implements LayerRenderer<EntityWoolyPig>
{	
	private static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MOD_ID + ":textures/entity/wooly_pig/wooly_pig_wool.png");
    private final RenderWoolyPig woolyPigRenderer;
    private final ModelWoolyPigWool woolyPigModel = new ModelWoolyPigWool();
    
    public LayerWoolyPigWool(RenderWoolyPig woolyPigRendererIn) 
    {
    	this.woolyPigRenderer = woolyPigRendererIn;
	}
    
    public void doRenderLayer(EntityWoolyPig entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) 
    {
    	if (!entitylivingbaseIn.getSheared() && !entitylivingbaseIn.isInvisible())
    	{
    		this.woolyPigRenderer.bindTexture(TEXTURE);
    		
    		this.woolyPigModel.setModelAttributes(this.woolyPigRenderer.getMainModel());
    		this.woolyPigModel.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks);
    		this.woolyPigModel.render(entitylivingbaseIn, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
    	}
    	else
    	{
    		return;
    	}
    }
    
    public boolean shouldCombineTextures() 
    {
    	return true;
    }
}
