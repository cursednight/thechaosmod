package net.mcreator.thechaosmod.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.thechaosmod.entity.NetheriteGolemEntity;
import net.mcreator.thechaosmod.TheChaosModModElements;
import net.mcreator.thechaosmod.TheChaosModMod;

import java.util.Map;
import java.util.HashMap;

@TheChaosModModElements.ModElement.Tag
public class GolemnetheriteproProcedure extends TheChaosModModElements.ModElement {
	public GolemnetheriteproProcedure(TheChaosModModElements instance) {
		super(instance, 531);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheChaosModMod.LOGGER.warn("Failed to load dependency x for procedure Golemnetheritepro!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheChaosModMod.LOGGER.warn("Failed to load dependency y for procedure Golemnetheritepro!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheChaosModMod.LOGGER.warn("Failed to load dependency z for procedure Golemnetheritepro!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheChaosModMod.LOGGER.warn("Failed to load dependency world for procedure Golemnetheritepro!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 0)))).getBlock() == Blocks.CARVED_PUMPKIN.getDefaultState()
				.getBlock())
				&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.NETHERITE_BLOCK
						.getDefaultState().getBlock()))
				&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 2), (int) (z + 0)))).getBlock() == Blocks.NETHERITE_BLOCK
						.getDefaultState().getBlock()))
				&& (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.NETHERITE_BLOCK
						.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.NETHERITE_BLOCK
								.getDefaultState().getBlock())))) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new NetheriteGolemEntity.CustomEntity(NetheriteGolemEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, (y - 1), z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
		} else if ((((((world.getBlockState(new BlockPos((int) (x + 0), (int) (y + 0), (int) (z + 0)))).getBlock() == Blocks.CARVED_PUMPKIN
				.getDefaultState().getBlock())
				&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.COAL_BLOCK.getDefaultState()
						.getBlock()))
				&& ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 2), (int) (z + 0)))).getBlock() == Blocks.NETHERITE_BLOCK
						.getDefaultState().getBlock()))
				&& (((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.NETHERITE_BLOCK
						.getDefaultState().getBlock())
						&& ((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.NETHERITE_BLOCK
								.getDefaultState().getBlock())))) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new NetheriteGolemEntity.CustomEntity(NetheriteGolemEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, (y - 1), z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), Blocks.AIR.getDefaultState(), 3);
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
