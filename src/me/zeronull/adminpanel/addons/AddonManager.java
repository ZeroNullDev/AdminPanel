package me.zeronull.adminpanel.addons;

import java.util.LinkedList;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class AddonManager {
	
	private static AddonManager instance = new AddonManager();
	private LinkedList<Addon> addons = new LinkedList<Addon>();
	
	// Goes through all plugins and creates an Addon instance and stores it
	private AddonManager() {
		for(Plugin plugin : Bukkit.getPluginManager().getPlugins()) {
			addons.add(new Addon(plugin));
		}
	}
	
	public static AddonManager getInstance() {
		return instance;
	}
	
	public LinkedList<Addon> getAddons() {
		return addons;
	}

}
