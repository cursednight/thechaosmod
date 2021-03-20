package net.mcreator.thechaosmod.procedures;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thechaosmod.item.Lightsaber1Item;
import net.mcreator.thechaosmod.TheChaosModModElements;
import net.mcreator.thechaosmod.TheChaosModMod;

import java.util.Map;

@TheChaosModModElements.ModElement.Tag
public class LightsaberRightClickedInAirProcedure extends TheChaosModModElements.ModElement {
	public LightsaberRightClickedInAirProcedure(TheChaosModModElements instance) {
		super(instance, 594);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheChaosModMod.LOGGER.warn("Failed to load dependency entity for procedure LightsaberRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			ItemStack _setstack = new ItemStack(Lightsaber1Item.block, (int) (1));
			_setstack.setCount((int) 1);
			((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
			if (entity instanceof ServerPlayerEntity)
				((ServerPlayerEntity) entity).inventory.markDirty();
		}
	}
}
