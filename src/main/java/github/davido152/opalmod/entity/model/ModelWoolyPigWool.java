package github.davido152.opalmod.entity.model;

import github.davido152.opalmod.entity.EntityWoolyPig;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ModelWoolyPigWool extends ModelBase 
{
	private final ModelRenderer wool;
	
    protected float childYOffset = 4.0F;
    protected float childZOffset = 4.0F;
    
	public ModelWoolyPigWool()
	{
		textureWidth = 64;
		textureHeight = 64;

		wool = new ModelRenderer(this);
		wool.setRotationPoint(0.0F, 11.0F, 2.0F);
		setRotationAngle(wool, 1.5708F, 0.0F, 0.0F);
		wool.cubeList.add(new ModelBox(wool, 0, 0, -5.0F, -10.0F, -7.0F, 10, 16, 8, 0.55F, false));
	}

    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);

        if (this.isChild)
        {
            float f = 2.0F;
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0F, this.childYOffset * scale, this.childZOffset * scale);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 24.0F * scale, 0.0F);
            this.wool.render(scale);
            GlStateManager.popMatrix();
        }
        else
        {
            this.wool.render(scale);
        }
    }
	
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
    
	public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime)
    {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        this.wool.rotateAngleX = ((float)Math.PI / 2F);
    }
}