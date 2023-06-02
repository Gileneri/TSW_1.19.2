
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thescorchedwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.thescorchedwastelands.world.biome.TestplainsBiome;
import net.mcreator.thescorchedwastelands.world.biome.Testplains3Biome;
import net.mcreator.thescorchedwastelands.world.biome.Testplains2Biome;
import net.mcreator.thescorchedwastelands.world.biome.FarmontainsBiome;
import net.mcreator.thescorchedwastelands.TheScorchedWastelandsMod;

public class TheScorchedWastelandsModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, TheScorchedWastelandsMod.MODID);
	public static final RegistryObject<Biome> TESTPLAINS = REGISTRY.register("testplains", TestplainsBiome::createBiome);
	public static final RegistryObject<Biome> TESTPLAINS_2 = REGISTRY.register("testplains_2", Testplains2Biome::createBiome);
	public static final RegistryObject<Biome> TESTPLAINS_3 = REGISTRY.register("testplains_3", Testplains3Biome::createBiome);
	public static final RegistryObject<Biome> FARMONTAINS = REGISTRY.register("farmontains", FarmontainsBiome::createBiome);
}
