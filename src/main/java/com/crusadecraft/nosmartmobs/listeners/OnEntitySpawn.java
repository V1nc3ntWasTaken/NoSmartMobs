package com.crusadecraft.nosmartmobs.listeners;

import com.crusadecraft.nosmartmobs.NoSmartMobs;
import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class OnEntitySpawn implements Listener {

    private static NoSmartMobs plugin;

    public OnEntitySpawn(NoSmartMobs plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onSpawn(CreatureSpawnEvent event) {
        // Declare some variables
        LivingEntity entity = event.getEntity();

        // If not living, stop
        if (entity.getType().equals(EntityType.AREA_EFFECT_CLOUD)) return;
        if (entity.getType().equals(EntityType.ARMOR_STAND)) return;
        if (entity.getType().equals(EntityType.ARROW)) return;
        if (entity.getType().equals(EntityType.BOAT)) return;
        if (entity.getType().equals(EntityType.DRAGON_FIREBALL)) return;
        if (entity.getType().equals(EntityType.DROPPED_ITEM)) return;
        if (entity.getType().equals(EntityType.EGG)) return;
        if (entity.getType().equals(EntityType.ENDER_CRYSTAL)) return;
        if (entity.getType().equals(EntityType.ENDER_PEARL)) return;
        if (entity.getType().equals(EntityType.EXPERIENCE_ORB)) return;
        if (entity.getType().equals(EntityType.FIREBALL)) return;
        if (entity.getType().equals(EntityType.FIREWORK)) return;
        if (entity.getType().equals(EntityType.FISHING_HOOK)) return;
        if (entity.getType().equals(EntityType.ITEM_FRAME)) return;
        if (entity.getType().equals(EntityType.ITEM_FRAME)) return;
        if (entity.getType().equals(EntityType.LEASH_HITCH)) return;
        if (entity.getType().equals(EntityType.LIGHTNING)) return;
        if (entity.getType().equals(EntityType.LLAMA_SPIT)) return;
        if (entity.getType().equals(EntityType.MINECART)) return;
        if (entity.getType().equals(EntityType.MINECART_CHEST)) return;
        if (entity.getType().equals(EntityType.MINECART_COMMAND)) return;
        if (entity.getType().equals(EntityType.MINECART_FURNACE)) return;
        if (entity.getType().equals(EntityType.MINECART_HOPPER)) return;
        if (entity.getType().equals(EntityType.MINECART_MOB_SPAWNER)) return;
        if (entity.getType().equals(EntityType.MINECART_TNT)) return;
        if (entity.getType().equals(EntityType.PAINTING)) return;
        if (entity.getType().equals(EntityType.PLAYER)) return;
        if (entity.getType().equals(EntityType.PRIMED_TNT)) return;
        if (entity.getType().equals(EntityType.SHULKER_BULLET)) return;
        if (entity.getType().equals(EntityType.SMALL_FIREBALL)) return;
        if (entity.getType().equals(EntityType.SPECTRAL_ARROW)) return;
        if (entity.getType().equals(EntityType.SPLASH_POTION)) return;
        if (entity.getType().equals(EntityType.THROWN_EXP_BOTTLE)) return;
        if (entity.getType().equals(EntityType.TRIDENT)) return;
        if (entity.getType().equals(EntityType.UNKNOWN)) return;

        // Make entity dumb
        entity.setAI(false);
    }
}
