package net.mcreator.thescorchedwastelands.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.thescorchedwastelands.network.TheScorchedWastelandsModVariables;
import net.mcreator.thescorchedwastelands.TheScorchedWastelandsMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerjoinsdimencionProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("punchstop", (true));
		if ((TheScorchedWastelandsModVariables.WorldVariables.get(world).dj).equals(entity.getDisplayName().getString())) {
			TheScorchedWastelandsModVariables.WorldVariables.get(world).dj = "[left]";
			TheScorchedWastelandsModVariables.WorldVariables.get(world).syncData(world);
		}
		TheScorchedWastelandsMod.queueServerWork(80, () -> {
			entity.getPersistentData().putDouble("timeinsec", 0);
			entity.getPersistentData().putBoolean("skipvote", (true));
			TheScorchedWastelandsModVariables.WorldVariables.get(world).skipvote = true;
			TheScorchedWastelandsModVariables.WorldVariables.get(world).syncData(world);
			entity.getPersistentData().putBoolean("takeover", (false));
			entity.getPersistentData().putBoolean("punchstop", (false));
			entity.getPersistentData().putBoolean("kickstart", (true));
		});
	}
}
