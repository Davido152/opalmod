package github.davido152.opalmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelWoolyPig extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
    protected float childYOffset = 8.0F;
    protected float childZOffset = 4.0F;

	public ModelWoolyPig() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 11.0F, 2.0F);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -5.0F, -10.0F, -7.0F, 10, 16, 8, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 32, 35, 5.01F, -9.0F, -11.0F, 0, 15, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 32, 20, -5.01F, -9.0F, -11.0F, 0, 15, 4, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 12.0F, -6.0F);
		head.cubeList.add(new ModelBox(head, 0, 24, -4.0F, -4.0F, -8.0F, 8, 8, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 28, 0, -2.0F, 0.0F, -9.0F, 4, 3, 1, 0.0F, false));

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(-3.0F, 18.0F, 7.0F);
		leg0.cubeList.add(new ModelBox(leg0, 16, 40, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(3.0F, 18.0F, 7.0F);
		leg1.cubeList.add(new ModelBox(leg1, 0, 40, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-3.0F, 18.0F, -5.0F);
		leg2.cubeList.add(new ModelBox(leg2, 36, 10, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, false));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(3.0F, 18.0F, -5.0F);
		leg3.cubeList.add(new ModelBox(leg3, 36, 0, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
	{
        if (this.isChild)
        {
            float f = 2.0F;
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0F, this.childYOffset * scale, this.childZOffset * scale);
            this.head.render(scale);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 24.0F * scale, 0.0F);
            this.body.render(scale);
            this.leg0.render(scale);
            this.leg1.render(scale);
            this.leg2.render(scale);
            this.leg3.render(scale);
            GlStateManager.popMatrix();
        }
        else {
        
        	body.render(scale);
			head.render(scale);
			leg0.render(scale);
			leg1.render(scale);
			leg2.render(scale);
			leg3.render(scale);
        }
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) 
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
	{
		 this.head.rotateAngleX = headPitch * 0.017453292F;
	     this.head.rotateAngleY = netHeadYaw * 0.017453292F;
	     this.body.rotateAngleX = ((float)Math.PI / 2F);
	     this.leg0.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	     this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	     this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	     this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	}
}