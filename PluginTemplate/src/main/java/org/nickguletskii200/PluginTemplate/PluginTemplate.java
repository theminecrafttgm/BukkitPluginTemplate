package org.nickguletskii200.PluginTemplate;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class PluginTemplate extends JavaPlugin {
	@Override
	public void onEnable() {
		Bukkit.getLogger().info("PluginTemplate loaded!");
	}

	@Override
	public void onDisable() {

	}
}
