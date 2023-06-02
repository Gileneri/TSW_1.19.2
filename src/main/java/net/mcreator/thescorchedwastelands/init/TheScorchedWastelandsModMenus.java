
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thescorchedwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.thescorchedwastelands.world.inventory.SmallrustedcrateguiMenu;
import net.mcreator.thescorchedwastelands.world.inventory.Rustedcrate1guiMenu;
import net.mcreator.thescorchedwastelands.world.inventory.RustedLockerMenu;
import net.mcreator.thescorchedwastelands.TheScorchedWastelandsMod;

public class TheScorchedWastelandsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TheScorchedWastelandsMod.MODID);
	public static final RegistryObject<MenuType<Rustedcrate1guiMenu>> RUSTEDCRATE_1GUI = REGISTRY.register("rustedcrate_1gui", () -> IForgeMenuType.create(Rustedcrate1guiMenu::new));
	public static final RegistryObject<MenuType<SmallrustedcrateguiMenu>> SMALLRUSTEDCRATEGUI = REGISTRY.register("smallrustedcrategui", () -> IForgeMenuType.create(SmallrustedcrateguiMenu::new));
	public static final RegistryObject<MenuType<RustedLockerMenu>> RUSTED_LOCKER = REGISTRY.register("rusted_locker", () -> IForgeMenuType.create(RustedLockerMenu::new));
}
