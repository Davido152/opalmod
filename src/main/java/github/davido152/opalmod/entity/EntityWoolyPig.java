package github.davido152.opalmod.entity;

import github.davido152.opalmod.init.ModBlocks;
import github.davido152.opalmod.util.handlers.LootTableHandler;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityWoolyPig extends EntityPig
{
	public EntityWoolyPig(World worldIn) 
	{
		super(worldIn);
		this.setSize(0.9f, 0.9f);
	}
	
	public EntityWoolyPig(World world, double x, double y, double z) 
	{
		this(world);
		this.setPosition(x, y, z);
	}
	
	@Override
	protected void applyEntityAttributes() 
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(12.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
	}
	
	@Override
	public float getEyeHeight() 
	{
		return 0.8f;
	}
	
	@Override
	public EntityWoolyPig createChild(EntityAgeable ageable) 
	{
		return new EntityWoolyPig(world); 
	}
	
	@Override
	protected ResourceLocation getLootTable()
	{
		return LootTableHandler.WOOLY_PIG;
	}

	protected SoundEvent getAmbientSound() 
	{
		return SoundEvents.ENTITY_PIG_AMBIENT;
	}
	
	protected SoundEvent getHurtSound(DamageSource source) 
	{
		return SoundEvents.ENTITY_PIG_HURT;
	}
	
	protected SoundEvent getDeathSound()
	{
		return SoundEvents.ENTITY_PIG_DEATH;
	}
}