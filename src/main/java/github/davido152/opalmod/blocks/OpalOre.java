package github.davido152.opalmod.blocks;

import java.util.Random;

import github.davido152.opalmod.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class OpalOre extends BlockBase
{

	public OpalOre(String name, Material material, CreativeTabs tab) 
	{
		super(name, material, tab);
		
		setCreativeTab(tab);
		setSoundType(SoundType.STONE);
		setHardness(3.8f);
		setResistance(15.5f);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ModItems.CRUDE_OPAL;
	}
	
	public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0)
            {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }
        
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
    {
    	super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);

        if (this.getItemDropped(state, worldIn.rand, fortune) != Item.getItemFromBlock(this))
        {
        int i = 0;

        i = MathHelper.getInt(worldIn.rand, 3, 7); 

        this.dropXpOnBlockBreak(worldIn, pos, i);
        }
    }

}
