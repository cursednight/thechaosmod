
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
public class EndersteelAxeItem extends TheChaosModModElements.ModElement {
	@ObjectHolder("the_chaos_mod:endersteel_axe")
	public static final Item block = null;
	public EndersteelAxeItem(TheChaosModModElements instance) {
		super(instance, 330);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1004;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 22f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 38;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EndersteelIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("endersteel_axe"));
	}
}
