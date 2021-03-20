package net.mcreator.thechaosmod.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.thechaosmod.potion.FlyPotion;
import net.mcreator.thechaosmod.TheChaosModModElements;
import net.mcreator.thechaosmod.TheChaosModMod;

import java.util.Map;
import java.util.Collection;

@TheChaosModModElements.ModElement.Tag
public class FflyProcedure extends TheChaosModModElements.ModElement {
	public FflyProcedure(TheChaosModModElements instance) {
		super(instance, 488);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheChaosModMod.LOGGER.warn("Failed to load dependency entity for procedure Ffly!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).experienceLevel : 0) > 3)) {
			if (((new Object() {
				int check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == FlyPotion.potion)
								return effect.getAmplifier();
						}
					}
					return 0;
				}
			}.check(entity)) == 0)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(FlyPotion.potion, (int) Double.POSITIVE_INFINITY, (int) 1));
			} else if ((!((new Object() {
				int check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == FlyPotion.potion)
								return effect.getAmplifier();
						}
					}
					return 0;
				}
			}.check(entity)) == 0))) {
				System.out.println(((new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == FlyPotion.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity)) + 1));
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).addExperienceLevel(-((int) 3));
			}
		}
	}
}