package github.davido152.opalmod.init;

import java.util.ArrayList;
import java.util.List;

import github.davido152.opalmod.items.ItemBase;
import github.davido152.opalmod.items.armor.ArmorBase;
import github.davido152.opalmod.items.food.FoodEffectBase;
import github.davido152.opalmod.items.food.OpalApple;
import github.davido152.opalmod.items.tools.ToolAxe;
import github.davido152.opalmod.items.tools.ToolHoe;
import github.davido152.opalmod.items.tools.ToolPickaxe;
import github.davido152.opalmod.items.tools.ToolSpade;
import github.davido152.opalmod.items.tools.ToolSword;
import github.davido152.opalmod.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_OPAL = EnumHelper.addToolMaterial("material_opal", 3, 1283, 9.5f, 3.5f, 15);
	public static final ArmorMaterial ARMOR_MATERIAL_OPAL = EnumHelper.addArmorMaterial("armor_material_opal", Reference.MOD_ID + ":opal", 14, new int[] {3, 5, 7, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f);
	
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
	public static final Item OPAL_BOOTS = new ArmorBase("opal_boots", ARMOR_MATERIAL_OPAL, 1, EntityEquipmentSlot.FEET, CreativeTabs.COMBAT);
	public static final Item OPAL_LEGGINGS = new ArmorBase("opal_leggings", ARMOR_MATERIAL_OPAL, 2, EntityEquipmentSlot.LEGS, CreativeTabs.COMBAT);
	public static final Item OPAL_CHESTPLATE = new ArmorBase("opal_chestplate", ARMOR_MATERIAL_OPAL, 1, EntityEquipmentSlot.CHEST, CreativeTabs.COMBAT);
	public static final Item OPAL_HELMET = new ArmorBase("opal_helmet", ARMOR_MATERIAL_OPAL, 1, EntityEquipmentSlot.HEAD, CreativeTabs.COMBAT);
	
	//Food
	public static final Item OPAL_APPLE = new OpalApple("opal_apple", 4, 9.5f, false, new PotionEffect(MobEffects.HASTE, 3*(60*20), 1, false, true), new PotionEffect(MobEffects.NIGHT_VISION, 3*(60*20), 0, false, true));	
	public static final Item OPAL_POPSICLE = new FoodEffectBase("opal_popsicle", 5, 6.0f, false, new PotionEffect(MobEffects.SATURATION, 6, 0, false, true));
}
