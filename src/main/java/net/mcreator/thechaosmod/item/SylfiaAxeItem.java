
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
public class SylfiaAxeItem extends TheChaosModModElements.ModElement {
	@ObjectHolder("the_chaos_mod:sylfia_axe")
	public static final Item block = null;
	public SylfiaAxeItem(TheChaosModModElements instance) {
		super(instance, 359);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1561;
			}

			public float getEfficiency() {
				return 13f;
			}

			public float getAttackDamage() {
				return 31f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 52;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SylfiaDustItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("sylfia_axe"));
	}
}
