package github.davido152.opalmod.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityLystrosaurus extends EntityCow
{
	public EntityLystrosaurus(World worldIn) 
	{
		super(worldIn);
		this.setSize(0.9f, 1.0f);
	}
	
	@Override
	protected void applyEntityAttributes() 
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.15D);
	}
	
	@Override
	public float getEyeHeight() 
	{ 
		return 0.8f;
	}
	
	@Override
	public EntityLystrosaurus createChild(EntityAgeable aegable)
	{
		return new EntityLystrosaurus(world);
	}
    
	protected SoundEvent getAmbientSound() 
	{
		return SoundEvents.ENTITY_COW_AMBIENT;
	}
	
	protected SoundEvent getHurtSound(DamageSource source) 
	{
		return SoundEvents.ENTITY_COW_HURT;
	}
	
	protected SoundEvent getDeathSound()
	{
		return SoundEvents.ENTITY_COW_DEATH;
	}
}
