
package net.mcreator.thechaosmod.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.thechaosmod.itemgroup.CurrencyItemGroup;
import net.mcreator.thechaosmod.TheChaosModModElements;

import java.util.List;
import java.util.Collections;

@TheChaosModModElements.ModElement.Tag
public class WillowFenceGateBlock extends TheChaosModModElements.ModElement {
	@ObjectHolder("the_chaos_mod:willow_fence_gate")
	public static final Block block = null;
	public WillowFenceGateBlock(TheChaosModModElements instance) {
		super(instance, 677);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(CurrencyItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends FenceGateBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2f, 3f).setLightLevel(s -> 0));
			setRegistryName("willow_fence_gate");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 5;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
