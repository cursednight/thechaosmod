
package net.mcreator.thechaosmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.thechaosmod.item.NetheriteCoinItem;
import net.mcreator.thechaosmod.TheChaosModModElements;

@TheChaosModModElements.ModElement.Tag
public class CurrencyItemGroup extends TheChaosModModElements.ModElement {
	public CurrencyItemGroup(TheChaosModModElements instance) {
		super(instance, 558);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcurrency") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(NetheriteCoinItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
