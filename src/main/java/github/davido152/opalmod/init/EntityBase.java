package github.davido152.opalmod.init;

import com.google.common.reflect.Reflection;

import github.davido152.opalmod.Main;
import github.davido152.opalmod.entity.EntityLystrosaurus;
import github.davido152.opalmod.entity.EntityWoolyPig;
import github.davido152.opalmod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class EntityBase 
{   
    public static void registerEntities()
	{
		registerEntity("lystrosaurus", EntityLystrosaurus.class, Reference.ENTITY_LYSTROSAURUS, 50, 6580564, 7168094);
		registerEntity("wooly_pig", EntityWoolyPig.class, Reference.ENTITY_WOOLY_PIG, 50, 6636321, 13789470);
		
		EntityRegistry.addSpawn(EntityLystrosaurus.class, 32, 2, 5, EnumCreatureType.CREATURE, Biome.getBiome(1));
		EntityRegistry.addSpawn(EntityWoolyPig.class, 42, 3, 6, EnumCreatureType.CREATURE, Biome.getBiome(1));
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.Instance, range, 1, true, color1, color2);
	}
}