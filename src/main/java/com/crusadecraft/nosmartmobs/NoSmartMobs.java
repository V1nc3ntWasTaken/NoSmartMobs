package com.crusadecraft.nosmartmobs;

import com.crusadecraft.nosmartmobs.listeners.OnEntitySpawn;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoSmartMobs extends JavaPlugin {

    @Override
    public void onEnable() {
        // Enable message
        System.out.println("[" + "NoSmartMobs" + "]" + " " + "Successfully enabled!");

        // Link the files to this file
        new OnEntitySpawn(this);
    }

    @Override
    public void onDisable() {
        // Disable message
        System.out.println("[" + "NoSmartMobs" + "]" + " " + "Successfully disabled!");
    }
}
