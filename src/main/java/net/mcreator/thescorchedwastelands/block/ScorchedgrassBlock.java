
package net.mcreator.thescorchedwastelands.block;

import net.minecraftforge.common.PlantType;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.thescorchedwastelands.init.TheScorchedWastelandsModBlocks;

import java.util.List;
import java.util.Collections;

public class ScorchedgrassBlock extends FlowerBlock {
	public ScorchedgrassBlock() {
		super(MobEffects.WITHER, 70, BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.SAND).sound(SoundType.CHAIN).instabreak().noCollission());
	}

	@Override
	public int getEffectDuration() {
		return 70;
	}

	@Override
	public boolean canBeReplaced(BlockState state, BlockPlaceContext useContext) {
		return useContext.getItemInHand().getItem() != this.asItem();
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(TheScorchedWastelandsModBlocks.JUNKPILE.get()));
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(TheScorchedWastelandsModBlocks.JUNKPILE.get()) || groundState.is(TheScorchedWastelandsModBlocks.RED_DRY_SAND.get()) || groundState.is(TheScorchedWastelandsModBlocks.DRYROCK.get())
				|| groundState.is(TheScorchedWastelandsModBlocks.DRYDIRT.get());
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.DESERT;
	}
}
