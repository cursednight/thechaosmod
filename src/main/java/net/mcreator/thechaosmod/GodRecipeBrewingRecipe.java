
package net.mcreator.thechaosmod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.thechaosmod.item.GodAppleItem;

@TheChaosModModElements.ModElement.Tag
public class GodRecipeBrewingRecipe extends TheChaosModModElements.ModElement {
	public GodRecipeBrewingRecipe(TheChaosModModElements instance) {
		super(instance, 615);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, (int) (1))),
				Ingredient.fromStacks(new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, (int) (1))), new ItemStack(GodAppleItem.block, (int) (1)));
	}
}
