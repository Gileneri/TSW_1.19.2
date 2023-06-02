
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thescorchedwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.thescorchedwastelands.block.entity.SmallrustedcrateBlockEntity;
import net.mcreator.thescorchedwastelands.block.entity.RustedcrateBlockEntity;
import net.mcreator.thescorchedwastelands.TheScorchedWastelandsMod;

public class TheScorchedWastelandsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TheScorchedWastelandsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> RUSTEDCRATE = register("rustedcrate", TheScorchedWastelandsModBlocks.RUSTEDCRATE, RustedcrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SMALLRUSTEDCRATE = register("smallrustedcrate", TheScorchedWastelandsModBlocks.SMALLRUSTEDCRATE, SmallrustedcrateBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
