package github.davido152.opalmod.init;

import github.davido152.opalmod.world.biome.BiomeAshyForest;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeBase 
{
	public static final Biome ASHY_FOREST = new BiomeAshyForest();
	
	public static void registerBiomes()
	{
		initBiome(ASHY_FOREST, "Ashy Forest", false, BiomeType.WARM, Type.FOREST, Type.DEAD, Type.WASTELAND, Type.SPARSE, Type.DRY);
	}
	
	private static Biome initBiome(Biome biome, String name, boolean canSpawn, BiomeType biomeType, Type... types)
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome Registered");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addVillageBiome(biome, canSpawn);
		System.out.println("Biome Added");
		return biome;
	}
}
