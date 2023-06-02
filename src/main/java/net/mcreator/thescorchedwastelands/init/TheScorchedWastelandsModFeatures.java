
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thescorchedwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.thescorchedwastelands.world.features.plants.ScorchedgrassFeature;
import net.mcreator.thescorchedwastelands.world.features.plants.ScorchedDebrisFeature;
import net.mcreator.thescorchedwastelands.world.features.plants.ScorchedBushFeature;
import net.mcreator.thescorchedwastelands.world.features.plants.OldpapersFeature;
import net.mcreator.thescorchedwastelands.world.features.plants.Oldpapers3Feature;
import net.mcreator.thescorchedwastelands.world.features.plants.Oldpapers2Feature;
import net.mcreator.thescorchedwastelands.world.features.plants.Oldpapers1Feature;
import net.mcreator.thescorchedwastelands.world.features.ores.UtilitypoleFeature;
import net.mcreator.thescorchedwastelands.world.features.ores.RoughstoneFeature;
import net.mcreator.thescorchedwastelands.world.features.ores.RedDrySandFeature;
import net.mcreator.thescorchedwastelands.world.features.ores.PoletopFeature;
import net.mcreator.thescorchedwastelands.world.features.ores.OlddebrisFeature;
import net.mcreator.thescorchedwastelands.world.features.ores.JunktechFeature;
import net.mcreator.thescorchedwastelands.world.features.ores.JunkpileFeature;
import net.mcreator.thescorchedwastelands.world.features.ores.DryrockFeature;
import net.mcreator.thescorchedwastelands.world.features.ores.DrydirtFeature;
import net.mcreator.thescorchedwastelands.world.features.Utilitypole2Feature;
import net.mcreator.thescorchedwastelands.world.features.TelephonepoleFeature;
import net.mcreator.thescorchedwastelands.world.features.RustystreetFeature;
import net.mcreator.thescorchedwastelands.world.features.RustysidewalkFeature;
import net.mcreator.thescorchedwastelands.world.features.PileofdebrisFeature;
import net.mcreator.thescorchedwastelands.world.features.Junkpile3Feature;
import net.mcreator.thescorchedwastelands.world.features.Junkpile2Feature;
import net.mcreator.thescorchedwastelands.world.features.GasstationFeature;
import net.mcreator.thescorchedwastelands.world.features.ErodedstoreFeature;
import net.mcreator.thescorchedwastelands.world.features.DumpsterwalkwayFeature;
import net.mcreator.thescorchedwastelands.world.features.CratestashFeature;
import net.mcreator.thescorchedwastelands.world.features.BenchesFeature;
import net.mcreator.thescorchedwastelands.TheScorchedWastelandsMod;

@Mod.EventBusSubscriber
public class TheScorchedWastelandsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TheScorchedWastelandsMod.MODID);
	public static final RegistryObject<Feature<?>> JUNKPILE = REGISTRY.register("junkpile", JunkpileFeature::feature);
	public static final RegistryObject<Feature<?>> SCORCHEDJUNK = REGISTRY.register("scorchedjunk", ScorchedgrassFeature::feature);
	public static final RegistryObject<Feature<?>> SCORCHED_DEBRIS = REGISTRY.register("scorched_debris", ScorchedDebrisFeature::feature);
	public static final RegistryObject<Feature<?>> SCORCHED_BUSH = REGISTRY.register("scorched_bush", ScorchedBushFeature::feature);
	public static final RegistryObject<Feature<?>> RED_DRY_SAND = REGISTRY.register("red_dry_sand", RedDrySandFeature::feature);
	public static final RegistryObject<Feature<?>> DRYROCK = REGISTRY.register("dryrock", DryrockFeature::feature);
	public static final RegistryObject<Feature<?>> POLETOP = REGISTRY.register("poletop", PoletopFeature::feature);
	public static final RegistryObject<Feature<?>> TELEPHONEPOLE = REGISTRY.register("telephonepole", TelephonepoleFeature::feature);
	public static final RegistryObject<Feature<?>> UTILITYPOLE = REGISTRY.register("utilitypole", UtilitypoleFeature::feature);
	public static final RegistryObject<Feature<?>> UTILITYPOLE_2 = REGISTRY.register("utilitypole_2", Utilitypole2Feature::feature);
	public static final RegistryObject<Feature<?>> DRYDIRT = REGISTRY.register("drydirt", DrydirtFeature::feature);
	public static final RegistryObject<Feature<?>> JUNKPILE_2 = REGISTRY.register("junkpile_2", Junkpile2Feature::feature);
	public static final RegistryObject<Feature<?>> JUNKPILE_3 = REGISTRY.register("junkpile_3", Junkpile3Feature::feature);
	public static final RegistryObject<Feature<?>> OLDDEBRIS = REGISTRY.register("olddebris", OlddebrisFeature::feature);
	public static final RegistryObject<Feature<?>> PILEOFDEBRIS = REGISTRY.register("pileofdebris", PileofdebrisFeature::feature);
	public static final RegistryObject<Feature<?>> CRATESTASH = REGISTRY.register("cratestash", CratestashFeature::feature);
	public static final RegistryObject<Feature<?>> RUSTYSIDEWALK = REGISTRY.register("rustysidewalk", RustysidewalkFeature::feature);
	public static final RegistryObject<Feature<?>> GASSTATION = REGISTRY.register("gasstation", GasstationFeature::feature);
	public static final RegistryObject<Feature<?>> BENCHES = REGISTRY.register("benches", BenchesFeature::feature);
	public static final RegistryObject<Feature<?>> ERODEDSTORE = REGISTRY.register("erodedstore", ErodedstoreFeature::feature);
	public static final RegistryObject<Feature<?>> DUMPSTERWALKWAY = REGISTRY.register("dumpsterwalkway", DumpsterwalkwayFeature::feature);
	public static final RegistryObject<Feature<?>> RUSTYSTREET = REGISTRY.register("rustystreet", RustystreetFeature::feature);
	public static final RegistryObject<Feature<?>> OLDPAPERS = REGISTRY.register("oldpapers", OldpapersFeature::feature);
	public static final RegistryObject<Feature<?>> OLDPAPERS_3 = REGISTRY.register("oldpapers_3", Oldpapers3Feature::feature);
	public static final RegistryObject<Feature<?>> OLDPAPERS_2 = REGISTRY.register("oldpapers_2", Oldpapers2Feature::feature);
	public static final RegistryObject<Feature<?>> OLDPAPERS_1 = REGISTRY.register("oldpapers_1", Oldpapers1Feature::feature);
	public static final RegistryObject<Feature<?>> JUNKTECH = REGISTRY.register("junktech", JunktechFeature::feature);
	public static final RegistryObject<Feature<?>> ROUGHSTONE = REGISTRY.register("roughstone", RoughstoneFeature::feature);
}
