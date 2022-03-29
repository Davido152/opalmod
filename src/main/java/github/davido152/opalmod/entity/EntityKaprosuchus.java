package github.davido152.opalmod.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityKaprosuchus extends EntityCow
{
	public EntityKaprosuchus(World worldIn) 
	{
		super(worldIn);
		this.setSize(0.9f, 1.0f);
	}
	
	public EntityKaprosuchus(World world, double x, double y, double z) 
	{
		this(world);
		this.setPosition(x, y, z);
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
	public EntityKaprosuchus createChild(EntityAgeable aegable)
	{
		return new EntityKaprosuchus(world);
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
