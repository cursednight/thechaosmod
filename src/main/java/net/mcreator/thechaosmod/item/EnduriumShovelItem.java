
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
public class EnduriumShovelItem extends TheChaosModModElements.ModElement {
	@ObjectHolder("the_chaos_mod:endurium_shovel")
	public static final Item block = null;
	public EnduriumShovelItem(TheChaosModModElements instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 18f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 84;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EnduriumIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {
		}.setRegistryName("endurium_shovel"));
	}
}
