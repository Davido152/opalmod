package github.davido152.opalmod.init;

import java.util.ArrayList;
import java.util.List;

import github.davido152.opalmod.OpalMod;
import github.davido152.opalmod.items.ItemSharpeningStone;
import github.davido152.opalmod.items.PureFireOpal;
import github.davido152.opalmod.items.armor.ArmorBase;
import github.davido152.opalmod.items.food.OpalApple;
import github.davido152.opalmod.items.food.OpalPopsicle;
import github.davido152.opalmod.items.tools.ToolAxe;
import github.davido152.opalmod.items.tools.ToolFireAxe;
import github.davido152.opalmod.items.tools.ToolFireHoe;
import github.davido152.opalmod.items.tools.ToolFirePickaxe;
import github.davido152.opalmod.items.tools.ToolFireSpade;
import github.davido152.opalmod.items.tools.ToolFireSword;
import github.davido152.opalmod.items.tools.ToolHoe;
import github.davido152.opalmod.items.tools.ToolPickaxe;
import github.davido152.opalmod.items.tools.ToolSpade;
import github.davido152.opalmod.items.tools.ToolSword;
import github.davido152.opalmod.util.Reference;
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
	public static final ToolMaterial MATERIAL_OPAL = EnumHelper.addToolMaterial("material_opal", 3, 1283, 9.5f, 3.5f, 16);
	public static final ArmorMaterial ARMOR_MATERIAL_OPAL = EnumHelper.addArmorMaterial("armor_material_opal", Reference.MOD_ID + ":opal", 27, new int[] {3, 5, 7, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0f);
	public static final ToolMaterial MATERIAL_FIRE_OPAL = EnumHelper.addToolMaterial("material_fire_opal", 3, 1873, 8.0f, 3.0f, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_FIRE_OPAL = EnumHelper.addArmorMaterial("armor_material_fire_opal", Reference.MOD_ID + ":fire_opal", 34, new int[] {3, 6, 8, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5f);
	public static final ToolMaterial MATERIAL_MATRIX_OPAL = EnumHelper.addToolMaterial("material_matrix_opal", 3, 1795, 9.0f, 3.5f, 19);
	public static final ArmorMaterial ARMOR_MATERIAL_MATRIX_OPAL = EnumHelper.addArmorMaterial("armor_material_matrix_opal", Reference.MOD_ID + ":matrix_opal", 36, new int[] {3, 6, 8, 3}, 13, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f);
	
	//Items
	public static final Item PURE_OPAL = new ItemBase("pure_opal", OpalMod.opalmodtab);
	public static final Item CRUDE_OPAL = new ItemBase("crude_opal", OpalMod.opalmodtab);
	public static final Item PURE_FIRE_OPAL = new PureFireOpal("pure_fire_opal", OpalMod.opalmodtab);
	public static final Item CRUDE_FIRE_OPAL = new ItemBase("crude_fire_opal", OpalMod.opalmodtab);
	public static final Item PURE_MATRIX_OPAL = new ItemBase("pure_matrix_opal", OpalMod.opalmodtab);
	public static final Item CRUDE_MATRIX_OPAL = new ItemBase("crude_matrix_opal", OpalMod.opalmodtab);
	public static final Item OPALIZED_WOOD = new ItemBase("opalized_wood", OpalMod.opalmodtab);
	public static final Item SHARPENING_STONE = new ItemSharpeningStone("sharpening_stone", OpalMod.opalmodtab);
	
	//Tools
	public static final ItemSword OPAL_SWORD = new ToolSword("opal_sword", MATERIAL_OPAL, OpalMod.opalmodtab);
	public static final ItemSpade OPAL_SHOVEL = new ToolSpade("opal_shovel", MATERIAL_OPAL, OpalMod.opalmodtab);
	public static final ItemPickaxe OPAL_PICKAXE = new ToolPickaxe("opal_pickaxe", MATERIAL_OPAL, OpalMod.opalmodtab);
	public static final ItemAxe OPAL_AXE = new ToolAxe("opal_axe", MATERIAL_OPAL, OpalMod.opalmodtab);
	public static final ItemHoe OPAL_HOE = new ToolHoe("opal_hoe", MATERIAL_OPAL, OpalMod.opalmodtab);
	
	public static final ItemSword FIRE_OPAL_SWORD = new ToolFireSword("fire_opal_sword", MATERIAL_FIRE_OPAL, OpalMod.opalmodtab);
	public static final ItemSpade FIRE_OPAL_SHOVEL = new ToolFireSpade("fire_opal_shovel", MATERIAL_FIRE_OPAL, OpalMod.opalmodtab);
	public static final ItemPickaxe FIRE_OPAL_PICKAXE = new ToolFirePickaxe("fire_opal_pickaxe", MATERIAL_FIRE_OPAL, OpalMod.opalmodtab);
	public static final ItemAxe FIRE_OPAL_AXE = new ToolFireAxe("fire_opal_axe", MATERIAL_FIRE_OPAL, OpalMod.opalmodtab);
	public static final ItemHoe FIRE_OPAL_HOE = new ToolFireHoe("fire_opal_hoe", MATERIAL_FIRE_OPAL, OpalMod.opalmodtab);
	
	public static final ItemSword MATRIX_OPAL_SWORD = new ToolSword("matrix_opal_sword", MATERIAL_MATRIX_OPAL, OpalMod.opalmodtab);
	public static final ItemSpade MATRIX_OPAL_SHOVEL = new ToolSpade("matrix_opal_shovel", MATERIAL_MATRIX_OPAL, OpalMod.opalmodtab);
	public static final ItemPickaxe MATRIX_OPAL_PICKAXE = new ToolPickaxe("matrix_opal_pickaxe", MATERIAL_MATRIX_OPAL, OpalMod.opalmodtab);
	public static final ItemAxe MATRIX_OPAL_AXE = new ToolAxe("matrix_opal_axe", MATERIAL_MATRIX_OPAL, OpalMod.opalmodtab);
	public static final ItemHoe MATRIX_OPAL_HOE = new ToolHoe("matrix_opal_hoe", MATERIAL_MATRIX_OPAL, OpalMod.opalmodtab);

	//Armour
	public static final Item OPAL_BOOTS = new ArmorBase("opal_boots", ARMOR_MATERIAL_OPAL, 1, EntityEquipmentSlot.FEET, OpalMod.opalmodtab);
	public static final Item OPAL_LEGGINGS = new ArmorBase("opal_leggings", ARMOR_MATERIAL_OPAL, 2, EntityEquipmentSlot.LEGS, OpalMod.opalmodtab);
	public static final Item OPAL_CHESTPLATE = new ArmorBase("opal_chestplate", ARMOR_MATERIAL_OPAL, 1, EntityEquipmentSlot.CHEST, OpalMod.opalmodtab);
	public static final Item OPAL_HELMET = new ArmorBase("opal_helmet", ARMOR_MATERIAL_OPAL, 1, EntityEquipmentSlot.HEAD, OpalMod.opalmodtab);
	
	public static final Item FIRE_OPAL_BOOTS = new ArmorBase("fire_opal_boots", ARMOR_MATERIAL_FIRE_OPAL, 1, EntityEquipmentSlot.FEET, OpalMod.opalmodtab);
	public static final Item FIRE_OPAL_LEGGINGS = new ArmorBase("fire_opal_leggings", ARMOR_MATERIAL_FIRE_OPAL, 2, EntityEquipmentSlot.LEGS, OpalMod.opalmodtab);
	public static final Item FIRE_OPAL_CHESTPLATE = new ArmorBase("fire_opal_chestplate", ARMOR_MATERIAL_FIRE_OPAL, 1, EntityEquipmentSlot.CHEST, OpalMod.opalmodtab);
	public static final Item FIRE_OPAL_HELMET = new ArmorBase("fire_opal_helmet", ARMOR_MATERIAL_FIRE_OPAL, 1, EntityEquipmentSlot.HEAD, OpalMod.opalmodtab);
	
	public static final Item MATRIX_OPAL_BOOTS = new ArmorBase("matrix_opal_boots", ARMOR_MATERIAL_MATRIX_OPAL, 1, EntityEquipmentSlot.FEET, OpalMod.opalmodtab);
	public static final Item MATRIX_OPAL_LEGGINGS = new ArmorBase("matrix_opal_leggings", ARMOR_MATERIAL_MATRIX_OPAL, 2, EntityEquipmentSlot.LEGS, OpalMod.opalmodtab);
	public static final Item MATRIX_OPAL_CHESTPLATE = new ArmorBase("matrix_opal_chestplate", ARMOR_MATERIAL_MATRIX_OPAL, 1, EntityEquipmentSlot.CHEST, OpalMod.opalmodtab);
	public static final Item MATRIX_OPAL_HELMET = new ArmorBase("matrix_opal_helmet", ARMOR_MATERIAL_MATRIX_OPAL, 1, EntityEquipmentSlot.HEAD, OpalMod.opalmodtab);
	
	//Food
	public static final Item OPAL_APPLE = new OpalApple("opal_apple", 4, 9.5f, false, new PotionEffect(MobEffects.HASTE, (150*20), 1, false, true), new PotionEffect(MobEffects.NIGHT_VISION, (150*20), 0, false, true));	
	public static final Item OPAL_POPSICLE = new OpalPopsicle("opal_popsicle", 5, 6.0f, false, new PotionEffect(MobEffects.SATURATION, 6, 0, false, true));

}
