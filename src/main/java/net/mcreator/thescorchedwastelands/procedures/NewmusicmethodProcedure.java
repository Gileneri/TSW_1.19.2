package net.mcreator.thescorchedwastelands.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.thescorchedwastelands.network.TheScorchedWastelandsModVariables;
import net.mcreator.thescorchedwastelands.TheScorchedWastelandsMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NewmusicmethodProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("kickstart") == true && entity.getPersistentData().getBoolean("punchstop") == false) {
			entity.getPersistentData().putBoolean("kickstart", (false));
			if ((entity.level.dimension()) == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("the_scorched_wastelands:scorched")))) {
				if ((entity.level.dimension()) == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("the_scorched_wastelands:scorched")))) {
					if (entity.getPersistentData().getDouble("pbtimeinsec") > 0) {
						entity.getPersistentData().putDouble("pbtimeinsec", (entity.getPersistentData().getDouble("pbtimeinsec") - 1));
					} else if (entity.getPersistentData().getDouble("pbtimeinsec") == 0) {
						TheScorchedWastelandsMod.queueServerWork(2, () -> {
							entity.getPersistentData().putDouble("pbtimeinmin", (entity.getPersistentData().getDouble("pbtimeinmin") * 60));
							entity.getPersistentData().putDouble("pbtimeinsec", (entity.getPersistentData().getDouble("pbtimeinmin") + entity.getPersistentData().getDouble("pbtimeinsec")));
						});
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									("playsound " + "thescorchedwastelands:blizzard" + " " + "ambient" + " " + entity.getDisplayName().getString() + " ~ 3000000000000 ~ 340282356779733661637539395458142568447 1 1"));
						entity.getPersistentData().putDouble("pbtimeinmin", 1);
						entity.getPersistentData().putDouble("pbtimeinsec", 3);
					}
				} else if (!((entity.level.dimension()) == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("the_scorched_wastelands:scorched")))) && entity.getPersistentData().getDouble("pbtimeinsec") > 0) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								("stopsound " + entity.getDisplayName().getString() + " " + "ambient" + " " + "thescorchedwastelands:blizzard"));
					entity.getPersistentData().putDouble("pbtimeinsec", 0);
				}
			}
			if ((TheScorchedWastelandsModVariables.WorldVariables.get(world).dj).equals(entity.getDisplayName().getString())) {
				TheScorchedWastelandsMod.queueServerWork(20, () -> {
					if ((entity.level.dimension()) == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("the_scorched_wastelands:scorched")))) {
						if (entity.getPersistentData().getDouble("timeinsec") > 0) {
							entity.getPersistentData().putDouble("timeinsec", (entity.getPersistentData().getDouble("timeinsec") - 1));
							TheScorchedWastelandsModVariables.WorldVariables.get(world).jukeboxtimer = entity.getPersistentData().getDouble("timeinsec");
							TheScorchedWastelandsModVariables.WorldVariables.get(world).syncData(world);
							entity.getPersistentData().putBoolean("kickstart", (true));
						} else if (entity.getPersistentData().getDouble("timeinsec") == 0) {
							entity.getPersistentData().putDouble("playtrack", (Mth.nextInt(RandomSource.create(), 1, 9)));
							if (entity.getPersistentData().getDouble("playtrack") == entity.getPersistentData().getDouble("lasttrack")) {
								entity.getPersistentData().putBoolean("kickstart", (true));
							} else if (entity.getPersistentData().getDouble("playtrack") != entity.getPersistentData().getDouble("lasttrack")) {
								entity.getPersistentData().putDouble("newdj", 0);
								entity.getPersistentData().putDouble("lasttrack", (entity.getPersistentData().getDouble("playtrack")));
								TheScorchedWastelandsMod.queueServerWork(2, () -> {
									entity.getPersistentData().putDouble("timeinmin", (entity.getPersistentData().getDouble("timeinmin") * 60));
									entity.getPersistentData().putDouble("timeinsec", (entity.getPersistentData().getDouble("timeinmin") + entity.getPersistentData().getDouble("timeinsec")));
									entity.getPersistentData().putBoolean("kickstart", (true));
								});
								if (entity.getPersistentData().getDouble("playtrack") == 1) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(0, 0, 0), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_scorched_wastelands:nomads")), SoundSource.AMBIENT, (float) 3.4028235677973366e+38, 1);
										} else {
											_level.playLocalSound(0, 0, 0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_scorched_wastelands:nomads")), SoundSource.AMBIENT, (float) 3.4028235677973366e+38, 1, false);
										}
									}
									entity.getPersistentData().putDouble("timeinmin", 10);
									entity.getPersistentData().putDouble("timeinsec", 5);
								} else if (entity.getPersistentData().getDouble("playtrack") == 2) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(0, 0, 0), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_scorched_wastelands:bodyeletricmusic")), SoundSource.AMBIENT, (float) 3.4028235677973366e+38,
													1);
										} else {
											_level.playLocalSound(0, 0, 0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_scorched_wastelands:bodyeletricmusic")), SoundSource.AMBIENT, (float) 3.4028235677973366e+38, 1, false);
										}
									}
									entity.getPersistentData().putDouble("timeinmin", 4);
									entity.getPersistentData().putDouble("timeinsec", 25);
								} else if (entity.getPersistentData().getDouble("playtrack") == 3) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(0, 0, 0), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_scorched_wastelands:ultramarine")), SoundSource.AMBIENT, (float) 3.4028235677973366e+38, 1);
										} else {
											_level.playLocalSound(0, 0, 0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_scorched_wastelands:ultramarine")), SoundSource.AMBIENT, (float) 3.4028235677973366e+38, 1, false);
										}
									}
									entity.getPersistentData().putDouble("timeinmin", 1);
									entity.getPersistentData().putDouble("timeinsec", 46);
								} else if (entity.getPersistentData().getDouble("playtrack") == 4) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(0, 0, 0), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_scorched_wastelands:inviolate")), SoundSource.AMBIENT, (float) 3.4028235677973366e+38, 1);
										} else {
											_level.playLocalSound(0, 0, 0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_scorched_wastelands:inviolate")), SoundSource.AMBIENT, (float) 3.4028235677973366e+38, 1, false);
										}
									}
									entity.getPersistentData().putDouble("timeinmin", 2);
									entity.getPersistentData().putDouble("timeinsec", 46);
								} else if (entity.getPersistentData().getDouble("playtrack") == 5) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(0, 0, 0), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_scorched_wastelands:lava_exploration")), SoundSource.AMBIENT, (float) 3.4028235677973366e+38,
													1);
										} else {
											_level.playLocalSound(0, 0, 0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_scorched_wastelands:lava_exploration")), SoundSource.AMBIENT, (float) 3.4028235677973366e+38, 1, false);
										}
									}
									entity.getPersistentData().putDouble("timeinmin", 3);
									entity.getPersistentData().putDouble("timeinsec", 20);
								} else if (entity.getPersistentData().getDouble("playtrack") == 6) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(0, 0, 0), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_scorched_wastelands:desert_exploration")), SoundSource.AMBIENT, (float) 3.4028235677973366e+38,
													1);
										} else {
											_level.playLocalSound(0, 0, 0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_scorched_wastelands:desert_exploration")), SoundSource.AMBIENT, (float) 3.4028235677973366e+38, 1, false);
										}
									}
									entity.getPersistentData().putDouble("timeinmin", 3);
									entity.getPersistentData().putDouble("timeinsec", 5);
								} else if (entity.getPersistentData().getDouble("playtrack") == 7) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(0, 0, 0), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_scorched_wastelands:crystal_exploration_1")), SoundSource.AMBIENT,
													(float) 3.4028235677973366e+38, 1);
										} else {
											_level.playLocalSound(0, 0, 0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_scorched_wastelands:crystal_exploration_1")), SoundSource.AMBIENT, (float) 3.4028235677973366e+38, 1, false);
										}
									}
									entity.getPersistentData().putDouble("timeinmin", 3);
									entity.getPersistentData().putDouble("timeinsec", 5);
								} else if (entity.getPersistentData().getDouble("playtrack") == 8) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(0, 0, 0), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_scorched_wastelands:crystal_exploration_2")), SoundSource.AMBIENT,
													(float) 3.4028235677973366e+38, 1);
										} else {
											_level.playLocalSound(0, 0, 0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_scorched_wastelands:crystal_exploration_2")), SoundSource.AMBIENT, (float) 3.4028235677973366e+38, 1, false);
										}
									}
									entity.getPersistentData().putDouble("timeinmin", 4);
									entity.getPersistentData().putDouble("timeinsec", 20);
								} else if (entity.getPersistentData().getDouble("playtrack") == 9) {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, new BlockPos(0, 0, 0), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_scorched_wastelands:lava_exploration_2")), SoundSource.AMBIENT, (float) 3.4028235677973366e+38,
													1);
										} else {
											_level.playLocalSound(0, 0, 0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_scorched_wastelands:lava_exploration_2")), SoundSource.AMBIENT, (float) 3.4028235677973366e+38, 1, false);
										}
									}
									entity.getPersistentData().putDouble("timeinmin", 4);
									entity.getPersistentData().putDouble("timeinsec", 48);
								}
							}
						}
					}
				});
			} else if ((TheScorchedWastelandsModVariables.WorldVariables.get(world).dj).equals("")) {
				TheScorchedWastelandsModVariables.WorldVariables.get(world).dj = entity.getDisplayName().getString();
				TheScorchedWastelandsModVariables.WorldVariables.get(world).syncData(world);
				entity.getPersistentData().putDouble("newdj", 1);
				entity.getPersistentData().putBoolean("kickstart", (true));
			} else if (!(TheScorchedWastelandsModVariables.WorldVariables.get(world).dj).equals("") && !(TheScorchedWastelandsModVariables.WorldVariables.get(world).dj).equals(entity.getDisplayName().getString())) {
				if (entity.getPersistentData().getDouble("tagName") == 2) {
					entity.getPersistentData().putDouble("djdelay", 1);
				} else if (entity.getPersistentData().getDouble("tagName") == 1) {
					entity.getPersistentData().putDouble("djdelay", 0);
				} else if (entity.getPersistentData().getDouble("tagName") == 0) {
					if (TheScorchedWastelandsModVariables.WorldVariables.get(world).jukeboxtimer == entity.getPersistentData().getDouble("timeinsec")) {
						if (entity.getPersistentData().getBoolean("takeover") == false) {
							entity.getPersistentData().putBoolean("takeover", (true));
							TheScorchedWastelandsMod.queueServerWork(20, () -> {
								entity.getPersistentData().putBoolean("kickstart", (true));
								entity.getPersistentData().putDouble("djdelay", 1);
								TheScorchedWastelandsMod.queueServerWork(5, () -> {
									entity.getPersistentData().putBoolean("takeover", (false));
								});
							});
						} else if (entity.getPersistentData().getBoolean("takeover") == true) {
							TheScorchedWastelandsModVariables.WorldVariables.get(world).dj = entity.getDisplayName().getString();
							TheScorchedWastelandsModVariables.WorldVariables.get(world).syncData(world);
							entity.getPersistentData().putDouble("newdj", 1);
							entity.getPersistentData().putBoolean("takeover", (false));
							if (TheScorchedWastelandsModVariables.WorldVariables.get(world).jukeboxtimer > 3) {
								TheScorchedWastelandsModVariables.WorldVariables.get(world).jukeboxtimer = entity.getPersistentData().getDouble("timeinsec") - 3;
								TheScorchedWastelandsModVariables.WorldVariables.get(world).syncData(world);
								entity.getPersistentData().putDouble("timeinsec", (entity.getPersistentData().getDouble("timeinsec") - 3));
								entity.getPersistentData().putBoolean("kickstart", (true));
							} else if (TheScorchedWastelandsModVariables.WorldVariables.get(world).jukeboxtimer < 3) {
								entity.getPersistentData().putBoolean("kickstart", (true));
							}
						}
					} else if (TheScorchedWastelandsModVariables.WorldVariables.get(world).jukeboxtimer != entity.getPersistentData().getDouble("timeinsec")) {
						entity.getPersistentData().putDouble("timeinsec", TheScorchedWastelandsModVariables.WorldVariables.get(world).jukeboxtimer);
						entity.getPersistentData().putBoolean("takeover", (false));
						if ((TheScorchedWastelandsModVariables.WorldVariables.get(world).dj).equals("[left]")) {
							entity.getPersistentData().putDouble("newdj", 1);
							TheScorchedWastelandsModVariables.WorldVariables.get(world).dj = entity.getDisplayName().getString();
							TheScorchedWastelandsModVariables.WorldVariables.get(world).syncData(world);
							entity.getPersistentData().putBoolean("kickstart", (true));
						} else if (!(TheScorchedWastelandsModVariables.WorldVariables.get(world).dj).equals("[left]")) {
							entity.getPersistentData().putDouble("newdj", 0);
							TheScorchedWastelandsMod.queueServerWork(20, () -> {
								entity.getPersistentData().putDouble("djdelay", 2);
								entity.getPersistentData().putBoolean("kickstart", (true));
							});
						}
					}
				}
			}
			if (entity.getPersistentData().getDouble("newdj") > 0) {
				if (TheScorchedWastelandsModVariables.WorldVariables.get(world).skipvote == true) {
					TheScorchedWastelandsMod.queueServerWork(5, () -> {
						if (TheScorchedWastelandsModVariables.WorldVariables.get(world).skipvote == true) {
							TheScorchedWastelandsMod.queueServerWork(5, () -> {
								if (TheScorchedWastelandsModVariables.WorldVariables.get(world).skipvote == true) {
									TheScorchedWastelandsMod.queueServerWork(5, () -> {
										if (TheScorchedWastelandsModVariables.WorldVariables.get(world).skipvote == true) {
											TheScorchedWastelandsMod.queueServerWork(5, () -> {
												if (entity.getPersistentData().getDouble("newdj") > 0) {
													if (TheScorchedWastelandsModVariables.WorldVariables.get(world).skipvote == true) {
														if (entity.getPersistentData().getDouble("newdj") == 5) {
															TheScorchedWastelandsModVariables.WorldVariables.get(world).jukeboxtimer = 0;
															TheScorchedWastelandsModVariables.WorldVariables.get(world).syncData(world);
															entity.getPersistentData().putDouble("timeinsec", 0);
															entity.getPersistentData().putDouble("newdj", 0);
														} else if (entity.getPersistentData().getDouble("newdj") < 5) {
															entity.getPersistentData().putDouble("newdj", (entity.getPersistentData().getDouble("newdj") + 1));
														}
													} else if (TheScorchedWastelandsModVariables.WorldVariables.get(world).skipvote == false) {
														entity.getPersistentData().putDouble("newdj", 0);
													}
												}
											});
										} else if (TheScorchedWastelandsModVariables.WorldVariables.get(world).skipvote == false) {
											entity.getPersistentData().putDouble("newdj", 0);
										}
									});
								} else if (TheScorchedWastelandsModVariables.WorldVariables.get(world).skipvote == false) {
									entity.getPersistentData().putDouble("newdj", 0);
								}
							});
						} else if (TheScorchedWastelandsModVariables.WorldVariables.get(world).skipvote == false) {
							entity.getPersistentData().putDouble("newdj", 0);
						}
					});
				} else if (TheScorchedWastelandsModVariables.WorldVariables.get(world).skipvote == false) {
					entity.getPersistentData().putDouble("newdj", 0);
				}
			} else if (entity.getPersistentData().getBoolean("skipvote") == false) {
				TheScorchedWastelandsModVariables.WorldVariables.get(world).skipvote = false;
				TheScorchedWastelandsModVariables.WorldVariables.get(world).syncData(world);
			} else if (5 >= TheScorchedWastelandsModVariables.WorldVariables.get(world).jukeboxtimer) {
				entity.getPersistentData().putBoolean("skipvote", (false));
			}
		}
	}
}
