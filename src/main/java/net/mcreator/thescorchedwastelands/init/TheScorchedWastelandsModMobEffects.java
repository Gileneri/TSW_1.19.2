
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thescorchedwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.thescorchedwastelands.potion.WaitpotionMobEffect;
import net.mcreator.thescorchedwastelands.potion.HotTemperatureMobEffect;
import net.mcreator.thescorchedwastelands.potion.ExtremeHeatMobEffect;
import net.mcreator.thescorchedwastelands.TheScorchedWastelandsMod;

public class TheScorchedWastelandsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TheScorchedWastelandsMod.MODID);
	public static final RegistryObject<MobEffect> WAITPOTION = REGISTRY.register("waitpotion", () -> new WaitpotionMobEffect());
	public static final RegistryObject<MobEffect> EXTREME_HEAT = REGISTRY.register("extreme_heat", () -> new ExtremeHeatMobEffect());
	public static final RegistryObject<MobEffect> HOT_TEMPERATURE = REGISTRY.register("hot_temperature", () -> new HotTemperatureMobEffect());
}
