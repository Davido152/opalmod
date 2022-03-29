package github.davido152.opalmod.util.compat.jei;

import java.util.IllegalFormatException;

import github.davido152.opalmod.blocks.purifier.ContainerPurifier;
import github.davido152.opalmod.blocks.purifier.GuiPurifier;
import github.davido152.opalmod.util.compat.jei.purifier.PurifierRecipeCategory;
import github.davido152.opalmod.util.compat.jei.purifier.PurifierRecipeMaker;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.ingredients.IIngredientRegistry;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import mezz.jei.api.recipe.transfer.IRecipeTransferRegistry;
import net.minecraft.util.text.translation.I18n;

@JEIPlugin
public class JEICompat implements IModPlugin
{
	@Override
	public void registerCategories(IRecipeCategoryRegistration registry) 
	{
		final IJeiHelpers helpers = registry.getJeiHelpers();
		final IGuiHelper gui = helpers.getGuiHelper();
		
		registry.addRecipeCategories(new PurifierRecipeCategory(gui));
	}
	
	@Override
	public void register(IModRegistry registry) 
	{
		final IIngredientRegistry ingredientRegistry = registry.getIngredientRegistry();
		final IJeiHelpers jeiHelpers = registry.getJeiHelpers();
		IRecipeTransferRegistry recipeTransfer = registry.getRecipeTransferRegistry();
		
		registry.addRecipes(PurifierRecipeMaker.getRecipes(jeiHelpers), RecipeCategories.PURIFIER);
		registry.addRecipeClickArea(GuiPurifier.class, 110, 0, 50, 50, RecipeCategories.PURIFIER);
		recipeTransfer.addRecipeTransferHandler(ContainerPurifier.class, RecipeCategories.PURIFIER, 0, 1, 3, 36);
	}
	
	public static String translateToLocal(String key)
	{
		if(I18n.canTranslate(key)) return I18n.translateToLocal(key);
		else return I18n.translateToFallback(key);
	}
	
	public static String translateToLocalFormatted(String key, Object... format)
	{
		String s = translateToLocal(key);
		try
		{
			return String.format(s, format);
		}catch(IllegalFormatException e)
		{
			return "Format error: " + s;
		}
	}
}
