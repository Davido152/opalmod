package github.davido152.opalmod.init;

import java.util.ArrayList;
import java.util.List;

import github.davido152.opalmod.items.ItemBase;
import github.davido152.opalmod.items.tools.ToolAxe;
import github.davido152.opalmod.items.tools.ToolHoe;
import github.davido152.opalmod.items.tools.ToolPickaxe;
import github.davido152.opalmod.items.tools.ToolSpade;
import github.davido152.opalmod.items.tools.ToolSword;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_OPAL = EnumHelper.addToolMaterial("material_opal", 3, 1283, 9.5f, 3.5f, 15);
	
	//Items
	public static final Item PURE_OPAL = new ItemBase("pure_opal", CreativeTabs.MATERIALS);
	public static final Item CRUDE_OPAL = new ItemBase("crude_opal", CreativeTabs.MATERIALS);

	//Tools
	public static final ItemSword OPAL_SWORD = new ToolSword("opal_sword", MATERIAL_OPAL, CreativeTabs.COMBAT);
	public static final ItemSpade OPAL_SHOVEL = new ToolSpade("opal_shovel", MATERIAL_OPAL, CreativeTabs.TOOLS);
	public static final ItemPickaxe OPAL_PICKAXE = new ToolPickaxe("opal_pickaxe", MATERIAL_OPAL, CreativeTabs.TOOLS);
	public static final ItemAxe OPAL_AXE = new ToolAxe("opal_axe", MATERIAL_OPAL, CreativeTabs.TOOLS);
	public static final ItemHoe OPAL_HOE = new ToolHoe("opal_hoe", MATERIAL_OPAL, CreativeTabs.TOOLS);
	
	//Armour
	
	//Food

}
