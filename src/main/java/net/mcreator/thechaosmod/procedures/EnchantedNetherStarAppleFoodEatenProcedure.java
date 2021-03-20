package net.mcreator.thechaosmod.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thechaosmod.potion.GodPotion;
import net.mcreator.thechaosmod.potion.FlyPotion;
import net.mcreator.thechaosmod.TheChaosModModElements;
import net.mcreator.thechaosmod.TheChaosModMod;

import java.util.Map;

@TheChaosModModElements.ModElement.Tag
public class EnchantedNetherStarAppleFoodEatenProcedure extends TheChaosModModElements.ModElement {
	public EnchantedNetherStarAppleFoodEatenProcedure(TheChaosModModElements instance) {
		super(instance, 554);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheChaosModMod.LOGGER.warn("Failed to load dependency entity for procedure EnchantedNetherStarAppleFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(GodPotion.potion, (int) 55200, (int) 1));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(FlyPotion.potion, (int) 55200, (int) 1));
	}
}
