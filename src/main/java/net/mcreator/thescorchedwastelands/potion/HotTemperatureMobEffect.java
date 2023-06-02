
package net.mcreator.thescorchedwastelands.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class HotTemperatureMobEffect extends MobEffect {
	public HotTemperatureMobEffect() {
		super(MobEffectCategory.HARMFUL, -2865407);
	}

	@Override
	public String getDescriptionId() {
		return "effect.the_scorched_wastelands.hot_temperature";
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
