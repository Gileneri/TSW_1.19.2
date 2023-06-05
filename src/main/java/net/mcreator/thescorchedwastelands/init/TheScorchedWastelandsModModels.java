
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thescorchedwastelands.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.thescorchedwastelands.client.model.Modelcold_epp;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TheScorchedWastelandsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcold_epp.LAYER_LOCATION, Modelcold_epp::createBodyLayer);
	}
}
