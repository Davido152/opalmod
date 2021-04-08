package github.davido152.opalmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelLystrosaurus extends ModelBase
{
	private final ModelRenderer body;
	private final ModelRenderer tail;
	private final ModelRenderer thin;
	private final ModelRenderer thinest;
	private final ModelRenderer head;
	private final ModelRenderer beak;
	private final ModelRenderer tusks;
	private final ModelRenderer hidden;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;

	public ModelLystrosaurus() 
	{
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 5.0F, 2.0F);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, -11.0F, -13.0F, 12, 18, 10, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 5.0F, -4.0F);
		body.addChild(tail);
		setRotationAngle(tail, -2.138F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 32, 32, -3.0F, -0.7881F, -0.672F, 6, 5, 7, 0.0F, false));

		thin = new ModelRenderer(this);
		thin.setRotationPoint(0.0F, 0.0F, 5.5F);
		tail.addChild(thin);
		setRotationAngle(thin, 0.2182F, 0.0F, 0.0F);
		thin.cubeList.add(new ModelBox(thin, 39, 23, -2.5F, -0.2696F, -0.6585F, 5, 4, 5, 0.0F, false));

		thinest = new ModelRenderer(this);
		thinest.setRotationPoint(0.0F, 0.0F, 4.5F);
		thin.addChild(thinest);
		setRotationAngle(thinest, 0.1745F, 0.0F, 0.0F);
		thinest.cubeList.add(new ModelBox(thinest, 34, 0, -2.0F, 0.169F, -1.5434F, 4, 3, 7, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 9.0F, -8.0F);
		head.cubeList.add(new ModelBox(head, 0, 28, -4.0F, -2.0F, -9.0F, 8, 8, 8, 0.0F, false));

		beak = new ModelRenderer(this);
		beak.setRotationPoint(0.0F, 3.0F, -8.0F);
		head.addChild(beak);
		setRotationAngle(beak, -0.192F, 0.0F, 0.0F);
		beak.cubeList.add(new ModelBox(beak, 24, 28, -3.0F, -2.8459F, -1.6F, 6, 5, 1, 0.0F, false));

		tusks = new ModelRenderer(this);
		tusks.setRotationPoint(0.0F, 6.0F, -7.0F);
		head.addChild(tusks);
		setRotationAngle(tusks, -0.3491F, 0.0F, 0.0F);
		tusks.cubeList.add(new ModelBox(tusks, 0, 0, 3.25F, -1.8505F, -2.918F, 1, 3, 1, 0.0F, false));
		tusks.cubeList.add(new ModelBox(tusks, 3, 3, -4.25F, -1.8505F, -2.918F, 1, 3, 1, 0.0F, false));

		hidden = new ModelRenderer(this);
		hidden.setRotationPoint(0.0F, -4.0F, -1.0F);
		tusks.addChild(hidden);
		setRotationAngle(hidden, -0.9163F, 0.0F, 0.0F);
		hidden.cubeList.add(new ModelBox(hidden, 48, 50, 3.25F, -1.0F, 0.541F, 1, 4, 1, 0.0F, false));
		hidden.cubeList.add(new ModelBox(hidden, 48, 50, -4.25F, -1.0F, 0.541F, 1, 4, 1, 0.0F, false));

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(-4.0F, 12.0F, 7.0F);
		leg0.cubeList.add(new ModelBox(leg0, 44, 10, -3.0F, 5.0F, -3.0F, 4, 7, 4, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(4.0F, 12.0F, 7.0F);
		leg1.cubeList.add(new ModelBox(leg1, 32, 44, -1.0F, 5.0F, -3.0F, 4, 7, 4, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-4.0F, 12.0F, -6.0F);
		leg2.cubeList.add(new ModelBox(leg2, 16, 44, -3.0F, 5.0F, -2.0F, 4, 7, 4, 0.0F, false));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(4.0F, 12.0F, -6.0F);
		leg3.cubeList.add(new ModelBox(leg3, 0, 44, -1.0F, 5.0F, -2.0F, 4, 7, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
	{
		body.render(f5);
		head.render(f5);
		leg0.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
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
		this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		this.leg0.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + (float)Math.PI) * 1.4f * limbSwingAmount;
		this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + (float)Math.PI) * 1.4f * limbSwingAmount;
		this.tail.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F) * 0.7F * limbSwingAmount;
		this.head.rotateAngleY = netHeadYaw * 0.017453292f;
		this.head.rotateAngleX = headPitch * 0.017453292f;
	}
}