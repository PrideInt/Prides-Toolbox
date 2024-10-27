package me.prride.phenomena;

import org.bukkit.boss.BossBar;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class Temperature {
	public static final Map<UUID, BossBar> TEMPERATURE_BARS = new HashMap<>();

	// Players that can be affected by temperature, i.e., those who are in a specific biome or condition
	// Players not in this set are either "immune" or OP
	private static final Set<UUID> AFFECTED_PLAYERS = new HashSet<>();

	public Temperature() {

	}

	public void init() {

	}

	public static boolean isAffected(UUID playerId) {
		return AFFECTED_PLAYERS.contains(playerId);
	}

	public static void addTemperatureBar(UUID playerId, BossBar bossBar) {
		TEMPERATURE_BARS.put(playerId, bossBar);
	}

	public static void updateTemperature(UUID playerId, float temperature) {
		BossBar bossBar = TEMPERATURE_BARS.get(playerId);
		if (bossBar != null) {
			bossBar.setProgress(temperature);
		}
	}

	public static void handle() {

	}
}
