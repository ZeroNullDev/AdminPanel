package me.zeronull.adminpanel.addons;

import org.bukkit.plugin.Plugin;

public class Addon {
	
	private Plugin plugin;
	
	public Addon(Plugin plugin) {
		this.plugin = plugin;
	}
	
	public Plugin getPlugin() {
		return plugin;
	}

}
