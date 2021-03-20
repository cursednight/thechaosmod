
package net.mcreator.thechaosmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.thechaosmod.item.RedEmeraldItem;
import net.mcreator.thechaosmod.TheChaosModModElements;

@TheChaosModModElements.ModElement.Tag
public class SecurityItemGroup extends TheChaosModModElements.ModElement {
	public SecurityItemGroup(TheChaosModModElements instance) {
		super(instance, 596);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsecurity") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RedEmeraldItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
