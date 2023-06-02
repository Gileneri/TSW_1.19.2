
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thescorchedwastelands.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.thescorchedwastelands.client.gui.SmallrustedcrateguiScreen;
import net.mcreator.thescorchedwastelands.client.gui.Rustedcrate1guiScreen;
import net.mcreator.thescorchedwastelands.client.gui.RustedLockerScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheScorchedWastelandsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(TheScorchedWastelandsModMenus.RUSTEDCRATE_1GUI.get(), Rustedcrate1guiScreen::new);
			MenuScreens.register(TheScorchedWastelandsModMenus.SMALLRUSTEDCRATEGUI.get(), SmallrustedcrateguiScreen::new);
			MenuScreens.register(TheScorchedWastelandsModMenus.RUSTED_LOCKER.get(), RustedLockerScreen::new);
		});
	}
}
