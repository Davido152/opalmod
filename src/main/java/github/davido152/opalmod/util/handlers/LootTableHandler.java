package github.davido152.opalmod.util.handlers;

import github.davido152.opalmod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler 
{
	public static final ResourceLocation WOOLY_PIG = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "entities/wooly_pig"));
	public static final ResourceLocation WOOLY_PIG_WOOL = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "entities/wooly_pig_wool"));
}