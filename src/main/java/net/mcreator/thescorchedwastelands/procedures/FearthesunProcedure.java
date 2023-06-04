package net.mcreator.thescorchedwastelands.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.thescorchedwastelands.init.TheScorchedWastelandsModMobEffects;
import net.mcreator.thescorchedwastelands.init.TheScorchedWastelandsModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FearthesunProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("the_scorched_wastelands:scorched"))) == (entity.level.dimension())) {
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TheScorchedWastelandsModMobEffects.HOT_TEMPERATURE.get()) : false)
					&& !((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == TheScorchedWastelandsModItems.COOLINGEPP_CHESTPLATE.get())) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(TheScorchedWastelandsModMobEffects.EXTREME_HEAT.get()) : false)) {
					if (new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
							} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
							}
							return false;
						}
					}.checkGamemode(entity) || new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
							} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.ADVENTURE;
							}
							return false;
						}
					}.checkGamemode(entity)) {
						entity.getPersistentData().putBoolean("burningloop", (true));
						if (world.dayTime() < 12500) {
							if (world.canSeeSkyFromBelowWater(new BlockPos(entity.getX(), entity.getY(), entity.getZ()))) {
								if (1 < (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
									if (entity instanceof LivingEntity _entity)
										_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 1));
									if (entity instanceof LivingEntity _entity)
										_entity.addEffect(new MobEffectInstance(TheScorchedWastelandsModMobEffects.EXTREME_HEAT.get(), 20, 0));
									entity.setSecondsOnFire(1);
								} else if (1 == (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
									if (entity instanceof LivingEntity _entity)
										_entity.addEffect(new MobEffectInstance(TheScorchedWastelandsModMobEffects.EXTREME_HEAT.get(), 20, 0));
									entity.setSecondsOnFire(1);
								}
							} else if (!world.canSeeSkyFromBelowWater(new BlockPos(entity.getX(), entity.getY(), entity.getZ()))) {
								if (4 < (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
									if (entity instanceof LivingEntity _entity)
										_entity.hurt(new DamageSource("hot_tempature").bypassArmor(), 1);
									if (entity instanceof LivingEntity _entity)
										_entity.addEffect(new MobEffectInstance(TheScorchedWastelandsModMobEffects.HOT_TEMPERATURE.get(), 100, 0));
								} else if (4 >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
									if (entity instanceof LivingEntity _entity)
										_entity.addEffect(new MobEffectInstance(TheScorchedWastelandsModMobEffects.HOT_TEMPERATURE.get(), 100, 0));
								}
							}
						} else if (world.dayTime() >= 12500) {
							if (4 < (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
								if (entity instanceof LivingEntity _entity)
									_entity.hurt(new DamageSource("hot_tempature").bypassArmor(), 1);
								if (entity instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(TheScorchedWastelandsModMobEffects.HOT_TEMPERATURE.get(), 100, 0));
							} else if (4 >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
								if (entity instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(TheScorchedWastelandsModMobEffects.HOT_TEMPERATURE.get(), 100, 0));
							}
						}
					}
				}
			}
		}
	}
}
