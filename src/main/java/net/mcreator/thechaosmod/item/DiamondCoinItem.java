
package net.mcreator.thechaosmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.thechaosmod.itemgroup.CurrencyItemGroup;
import net.mcreator.thechaosmod.TheChaosModModElements;

@TheChaosModModElements.ModElement.Tag
public class DiamondCoinItem extends TheChaosModModElements.ModElement {
	@ObjectHolder("the_chaos_mod:diamond_coin")
	public static final Item block = null;
	public DiamondCoinItem(TheChaosModModElements instance) {
		super(instance, 557);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CurrencyItemGroup.tab).maxStackSize(64).rarity(Rarity.RARE));
			setRegistryName("diamond_coin");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
