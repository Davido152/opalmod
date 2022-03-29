package github.davido152.opalmod.entity;

import github.davido152.opalmod.init.ModBlocks;
import github.davido152.opalmod.util.handlers.LootTableHandler;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityWoolyPig extends EntityPig implements net.minecraftforge.common.IShearable
{
	private boolean sheared;
    private int pigTimer;
    private EntityAIEatGrass entityAIEatGrass;
	
	@Override
	protected void initEntityAI() 
	{
		super.initEntityAI();
        this.entityAIEatGrass = new EntityAIEatGrass(this);
        this.tasks.addTask(5, this.entityAIEatGrass);
	}
	
    protected void updateAITasks()
    {
        this.pigTimer = this.entityAIEatGrass.getEatingGrassTimer();
        super.updateAITasks();
    }
    
    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        if (this.world.isRemote)
        {
            this.pigTimer = Math.max(0, this.pigTimer - 1);
        }

        super.onLivingUpdate();
    }
	
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
		if (this.getSheared()) 
		{
			return LootTableHandler.WOOLY_PIG;
		}
		else 
		{
			return LootTableHandler.WOOLY_PIG_WOOL;
		}
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
	
    public static void registerFixesWoolyPig(DataFixer fixer)
    {
        EntityLiving.registerFixesMob(fixer, EntityWoolyPig.class);
    }
	
    public float getHeadRotationPointY(float p_70894_1_)
    {
        if (this.pigTimer <= 0)
        {
            return 0.0F;
        }
        else if (this.pigTimer >= 4 && this.pigTimer <= 36)
        {
            return 1.0F;
        }
        else
        {
            return this.pigTimer < 4 ? ((float)this.pigTimer - p_70894_1_) / 4.0F : -((float)(this.pigTimer - 40) - p_70894_1_) / 4.0F;
        }
    }

    public float getHeadRotationAngleX(float p_70890_1_)
    {
        if (this.pigTimer > 4 && this.pigTimer <= 36)
        {
            float f = ((float)(this.pigTimer - 4) - p_70890_1_) / 32.0F;
            return ((float)Math.PI / 5F) + ((float)Math.PI * 7F / 100F) * MathHelper.sin(f * 28.7F);
        }
        else
        {
            return this.pigTimer > 0 ? ((float)Math.PI / 5F) : this.rotationPitch * 0.017453292F;
        }
    }
	
	@Override
	public void readEntityFromNBT(NBTTagCompound compound)
	{
		super.readEntityFromNBT(compound);
        this.setSheared(compound.getBoolean("Sheared"));
	}
	
	@Override
	public void writeEntityToNBT(NBTTagCompound compound) 
	{
		super.writeEntityToNBT(compound);
        compound.setBoolean("Sheared", this.getSheared());
	}
	
	/**
     * returns true if a pigs wool has been sheared
     */
    public boolean getSheared()
    {
    	return this.sheared;
    }

    /**
     * make a pig sheared if set to true
     */
    public void setSheared(boolean sheared)
    {
    	this.sheared = sheared;
    }
    
    public void eatGrassBonus()
    {
        this.setSheared(false);

        if (this.isChild())
        {
            this.addGrowth(60);
        }
    }
    
    @Override
    public boolean isShearable(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
    	return item.getItem() == Items.SHEARS && !this.getSheared() && !this.isChild(); 
    }
    
    @Override
    public java.util.List<ItemStack> onSheared(ItemStack item, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        this.setSheared(true);
        int i = 1 + this.rand.nextInt(3);

        java.util.List<ItemStack> ret = new java.util.ArrayList<ItemStack>();
        for (int j = 0; j < i; ++j)
            ret.add(new ItemStack(Item.getItemFromBlock(ModBlocks.PIG_WOOL), 1));

        this.playSound(SoundEvents.ENTITY_SHEEP_SHEAR, 1.0F, 1.0F);
        return ret;
    }
}