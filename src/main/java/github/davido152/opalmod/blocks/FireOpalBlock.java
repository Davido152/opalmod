package github.davido152.opalmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FireOpalBlock extends BlockBase 
{
    public FireOpalBlock(String name, Material material) 
    {
        super(name, material);

        setSoundType(SoundType.METAL);
        setHardness(5.0f);
        setResistance(30.0f);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(0.2f);
    }
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
    {
        if (!entityIn.isImmuneToFire() && entityIn instanceof EntityLivingBase && !EnchantmentHelper.hasFrostWalkerEnchantment((EntityLivingBase)entityIn))
        {
            entityIn.attackEntityFrom(DamageSource.HOT_FLOOR, 0.5F);
        }

        super.onEntityWalk(worldIn, pos, entityIn);
    }
}