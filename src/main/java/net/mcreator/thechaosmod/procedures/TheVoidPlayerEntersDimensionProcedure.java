package net.mcreator.thechaosmod.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thechaosmod.potion.CurseOfTheVoidPotion;
import net.mcreator.thechaosmod.TheChaosModModElements;
import net.mcreator.thechaosmod.TheChaosModMod;

import java.util.Map;

@TheChaosModModElements.ModElement.Tag
public class TheVoidPlayerEntersDimensionProcedure extends TheChaosModModElements.ModElement {
	public TheVoidPlayerEntersDimensionProcedure(TheChaosModModElements instance) {
		super(instance, 380);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheChaosModMod.LOGGER.warn("Failed to load dependency entity for procedure TheVoidPlayerEntersDimension!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(CurseOfTheVoidPotion.potion, (int) 552000, (int) 1));
	}
}
