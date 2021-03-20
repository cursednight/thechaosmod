
package net.mcreator.thechaosmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.thechaosmod.TheChaosModModElements;

@TheChaosModModElements.ModElement.Tag
public class PinkGarnetAxeItem extends TheChaosModModElements.ModElement {
	@ObjectHolder("the_chaos_mod:pink_garnet_axe")
	public static final Item block = null;
	public PinkGarnetAxeItem(TheChaosModModElements instance) {
		super(instance, 829);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1164;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 25f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PinkGarnetIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("pink_garnet_axe"));
	}
}
