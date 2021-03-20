package net.mcreator.thechaosmod.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;

import net.mcreator.thechaosmod.enchantment.WitherEnchantment;
import net.mcreator.thechaosmod.TheChaosModModElements;
import net.mcreator.thechaosmod.TheChaosModMod;

import java.util.Map;

@TheChaosModModElements.ModElement.Tag
public class CritBringerItemIsCraftedsmeltedProcedure extends TheChaosModModElements.ModElement {
	public CritBringerItemIsCraftedsmeltedProcedure(TheChaosModModElements instance) {
		super(instance, 500);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				TheChaosModMod.LOGGER.warn("Failed to load dependency itemstack for procedure CritBringerItemIsCraftedsmelted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(WitherEnchantment.enchantment, (int) 6);
		((itemstack)).addEnchantment(Enchantments.SHARPNESS, (int) 6);
		((itemstack)).addEnchantment(Enchantments.SMITE, (int) 6);
		((itemstack)).addEnchantment(Enchantments.BANE_OF_ARTHROPODS, (int) 6);
		((itemstack)).addEnchantment(Enchantments.LOOTING, (int) 10);
		((itemstack)).addEnchantment(Enchantments.SWEEPING, (int) 6);
		((itemstack)).addEnchantment(Enchantments.MENDING, (int) 99);
		((itemstack)).addEnchantment(Enchantments.MENDING, (int) 99);
	}
}
