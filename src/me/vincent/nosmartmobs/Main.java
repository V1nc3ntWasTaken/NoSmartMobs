package me.vincent.nosmartmobs;

import org.bukkit.plugin.java.JavaPlugin;

import me.vincent.nosmartmobs.listeners.OnEntitySpawn;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		
		new OnEntitySpawn(this);
	}
	
}
