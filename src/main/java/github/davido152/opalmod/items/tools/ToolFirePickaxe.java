package github.davido152.opalmod.items.tools;

import java.util.ListIterator;

import com.google.common.collect.Multimap;

import github.davido152.opalmod.OpalMod;
import github.davido152.opalmod.init.ModItems;
import github.davido152.opalmod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.event.world.BlockEvent;

public class ToolFirePickaxe extends ItemPickaxe implements IHasModel
{
	private Block block;
	
	public ToolFirePickaxe(String name, ToolMaterial material, CreativeTabs tab)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
	
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		OpalMod.proxy.registerItemRenderer(this, 0, "invemtory");
	}	
}
