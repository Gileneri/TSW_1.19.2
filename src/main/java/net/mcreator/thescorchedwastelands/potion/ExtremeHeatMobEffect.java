
package net.mcreator.thescorchedwastelands.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ExtremeHeatMobEffect extends MobEffect {
	public ExtremeHeatMobEffect() {
		super(MobEffectCategory.HARMFUL, -4312576);
	}

	@Override
	public String getDescriptionId() {
		return "effect.the_scorched_wastelands.extreme_heat";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
