
package net.mcreator.thechaosmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.thechaosmod.TheChaosModModElements;

@TheChaosModModElements.ModElement.Tag
public class AragoniteShovelItem extends TheChaosModModElements.ModElement {
	@ObjectHolder("the_chaos_mod:aragonite_shovel")
	public static final Item block = null;
	public AragoniteShovelItem(TheChaosModModElements instance) {
		super(instance, 177);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1444;
			}

			public float getEfficiency() {
				return 13f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 49;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AragoniteIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("aragonite_shovel"));
	}
}
