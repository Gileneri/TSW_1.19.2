
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thescorchedwastelands.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TheScorchedWastelandsModTabs {
	public static CreativeModeTab TAB_SCORCHED_WASTELANDS;
	public static CreativeModeTab TAB_WRECKED_OBJECTS;

	public static void load() {
		TAB_SCORCHED_WASTELANDS = new CreativeModeTab("tabscorched_wastelands") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TheScorchedWastelandsModBlocks.JUNKPILE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_WRECKED_OBJECTS = new CreativeModeTab("tabwrecked_objects") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TheScorchedWastelandsModBlocks.SCORCHED_DEBRIS.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
