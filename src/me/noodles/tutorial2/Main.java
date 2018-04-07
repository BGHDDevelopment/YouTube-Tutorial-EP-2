package me.noodles.tutorial2;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	
	
	@Override
	public void onEnable() { 
		this.getCommand("YT").setExecutor(new PluginCommand());
	}
	
	
	
}
