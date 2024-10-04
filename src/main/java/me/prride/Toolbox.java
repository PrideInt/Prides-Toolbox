package me.prride;

import org.bukkit.plugin.java.JavaPlugin;

public class Toolbox extends JavaPlugin {
	public static Toolbox instance;

	@Override
	public void onEnable() {
		instance = this;
	}
}