
package net.mcreator.thescorchedwastelands.world.biome;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.Music;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

public class ScorchedmountainsBiome {
	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-3591664).waterColor(-13820928).waterFogColor(329011).skyColor(-3591664).foliageColorOverride(-6730970).grassColorOverride(-6730970)
				.ambientLoopSound(new SoundEvent(new ResourceLocation("the_scorched_wastelands:aridloop"))).ambientMoodSound(new AmbientMoodSettings(new SoundEvent(new ResourceLocation("the_scorched_wastelands:voices")), 6000, 8, 2))
				.backgroundMusic(new Music(new SoundEvent(new ResourceLocation("the_scorched_wastelands:blizzard")), 12000, 24000, true)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).temperature(2f).downfall(0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
