package github.davido152.opalmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ModelKaprosuchus extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer teeth;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer lowerjaw;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer body;
	private final ModelRenderer legs;
	private final ModelRenderer tail;

	public ModelKaprosuchus() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(-2.0F, 15.0F, -2.25F);
		head.cubeList.add(new ModelBox(head, 46, 20, -2.0F, -2.0F, -13.0F, 4, 2, 10, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -2.0F, -2.0F, -3.0F, 4, 4, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -1.5F, -5.5F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3054F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 4, -2.0F, -2.0F, -1.5F, 1, 1, 3, 0.005F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 15, 1.0F, -2.0F, -1.5F, 1, 1, 3, 0.005F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, -2.0F, -1.0F, -1.5F, 4, 1, 3, 0.005F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, -13.0F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 7, -2.0F, 0.0F, 0.0F, 4, 2, 0, 0.0F, false));

		teeth = new ModelRenderer(this);
		teeth.setRotationPoint(2.0F, 9.0F, 2.0F);
		head.addChild(teeth);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.0F, -8.0F, -5.0F);
		teeth.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.0436F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -2.0F, -1.0F, -10.0F, 0, 1, 10, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.0F, -8.0F, -5.0F);
		teeth.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.0436F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 1, 2.0F, -1.0F, -10.0F, 0, 1, 10, 0.0F, false));

		lowerjaw = new ModelRenderer(this);
		lowerjaw.setRotationPoint(-0.0013F, 0.667F, -3.0F);
		head.addChild(lowerjaw);
		lowerjaw.cubeList.add(new ModelBox(lowerjaw, 32, 0, -1.9987F, -0.667F, -10.0F, 4, 2, 10, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0013F, -0.667F, 0.0F);
		lowerjaw.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.0436F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 2, -2.0F, -1.0F, -10.0F, 0, 1, 10, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0013F, -0.667F, 0.0F);
		lowerjaw.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.0436F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 2.0F, -1.0F, -10.0F, 0, 1, 10, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0013F, -0.667F, 0.0F);
		lowerjaw.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.0873F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 0, -2.0F, -3.0F, -10.0F, 0, 3, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0013F, -0.667F, 0.0F);
		lowerjaw.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.0873F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 0, 2.0F, -3.0F, -10.0F, 0, 3, 1, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(-2.0F, 16.5F, 6.5F);
		setRotationAngle(body, 0.0873F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -4.5F, -9.2385F, 6, 5, 20, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 8, 2.0F, -5.8038F, -9.3257F, 0, 2, 19, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 6, -2.0F, -5.8038F, -9.3257F, 0, 2, 19, 0.0F, false));

		legs = new ModelRenderer(this);
		legs.setRotationPoint(2.0F, 7.0368F, -6.0579F);
		body.addChild(legs);
		setRotationAngle(legs, -0.0873F, 0.0F, 0.0F);
		legs.cubeList.add(new ModelBox(legs, 24, 48, -6.0F, -8.0399F, -1.0F, 3, 8, 3, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 12, 48, -1.0F, -8.0399F, -1.0F, 3, 8, 3, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 0, 48, -1.0F, -10.0399F, 12.0F, 3, 10, 3, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 0, 29, -6.0F, -10.0399F, 12.0F, 3, 10, 3, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 24.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 24, 25, -4.0F, -13.0F, 16.0F, 4, 5, 14, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 32, 3, -1.0F, -16.0F, 16.0F, 0, 3, 14, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 32, 0, -3.0F, -16.0F, 16.0F, 0, 3, 14, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 0, 30, -3.0F, -12.5F, 29.0F, 2, 4, 14, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 32, 31, -2.0F, -16.5F, 30.0F, 0, 4, 13, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		tail.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
	{
		this.legs.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		this.tail.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 0.2F * limbSwingAmount;
		this.head.rotateAngleY = netHeadYaw * 0.017453292f;
		this.head.rotateAngleX = headPitch * 0.017453292f;
	}
}