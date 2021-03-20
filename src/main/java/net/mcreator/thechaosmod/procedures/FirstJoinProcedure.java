package net.mcreator.thechaosmod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.util.Hand;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.thechaosmod.item.TutorialBookItem;
import net.mcreator.thechaosmod.TheChaosModModElements;
import net.mcreator.thechaosmod.TheChaosModMod;

import java.util.Map;
import java.util.HashMap;

@TheChaosModModElements.ModElement.Tag
public class FirstJoinProcedure extends TheChaosModModElements.ModElement {
	public FirstJoinProcedure(TheChaosModModElements instance) {
		super(instance, 503);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TheChaosModMod.LOGGER.warn("Failed to load dependency entity for procedure FirstJoin!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double ok = 0;
		if (((ok) < 7)) {
			ok = (double) 8;
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(TutorialBookItem.block, (int) (1));
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.STONE_PICKAXE, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.CHISELED_POLISHED_BLACKSTONE, (int) (1));
				_setstack.setCount((int) 64);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.CHISELED_POLISHED_BLACKSTONE, (int) (1));
				_setstack.setCount((int) 64);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Blocks.CHISELED_POLISHED_BLACKSTONE, (int) (1));
				_setstack.setCount((int) 64);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		Entity entity = event.getPlayer();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", entity.getPosX());
		dependencies.put("y", entity.getPosY());
		dependencies.put("z", entity.getPosZ());
		dependencies.put("world", entity.world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
