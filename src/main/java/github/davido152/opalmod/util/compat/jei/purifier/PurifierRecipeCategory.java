package github.davido152.opalmod.util.compat.jei.purifier;

import github.davido152.opalmod.util.Reference;
import github.davido152.opalmod.util.compat.jei.RecipeCategories;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import net.minecraft.client.Minecraft;

public class PurifierRecipeCategory extends AbstractPurifierRecipeCategory<PurifierRecipe>
{
	private final IDrawable background;
	private final String name;
	
	public PurifierRecipeCategory(IGuiHelper helper) 
	{
		super(helper);
		background = helper.createDrawable(TEXTURES, 4, 12, 150, 60);
		name = "Purifier";
	}
	
	@Override
	public IDrawable getBackground()
	{
		return background;
	}
	
	@Override
	public void drawExtras(Minecraft minecraft) 
	{
		animatedFlame.draw(minecraft, 52, 24);
		animatedArrow.draw(minecraft, 75, 22 );
	}
	
	@Override
	public String getTitle() 
	{
		return name;
	}
	
	@Override
	public String getModName() 
	{
		return Reference.NAME;
	}
	
	@Override
	public String getUid()
	{
		return RecipeCategories.PURIFIER;
	}
	
	public void setRecipe(IRecipeLayout recipeLayout, PurifierRecipe recipeWrapper, IIngredients ingredients) 
	{
		IGuiItemStackGroup stacks = recipeLayout.getItemStacks();
		stacks.init(sharpening_stone, true, 27, 4);
		stacks.init(input, true, 51, 4);
		stacks.init(output, false, 51, 40);
		stacks.set(ingredients);
	};
}
