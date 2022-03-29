package github.davido152.opalmod.util.compat.jei.purifier;

import java.awt.Color;
import java.util.List;

import github.davido152.opalmod.blocks.purifier.PurifierRecipes;
import github.davido152.opalmod.util.compat.jei.JEICompat;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.item.ItemStack;

public class PurifierRecipe implements IRecipeWrapper
{
	private final List<ItemStack> inputs;
	private final ItemStack output; 
	
	public PurifierRecipe(List<ItemStack> inputs, ItemStack output) 
	{
		this.inputs = inputs;
		this.output = output;
	}
	
	@Override
	public void getIngredients(IIngredients ingredients) 
	{
		ingredients.setInputs(ItemStack.class, inputs);
		ingredients.setOutput(ItemStack.class, output);
	}
	
	@Override
	public void drawInfo(Minecraft minecraft, int recipeWidth, int recipeHeight, int mouseX, int mouseY)
	{
		PurifierRecipes recipes = PurifierRecipes.getInstance();
		float experience = recipes.getPurifierExperience(output);
		
		if(experience > 0)
		{
			String experienceString = JEICompat.translateToLocalFormatted("gui.jei.category.smelting.experience", experience);
			FontRenderer renderer = minecraft.fontRenderer;
			int stringWidth = renderer.getStringWidth(experienceString);
			renderer.drawString(experienceString, recipeWidth - stringWidth, 0, Color.gray.getRGB());
		}
	}
}
