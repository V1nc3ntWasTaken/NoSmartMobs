package me.vincent.nosmartmobs.listeners;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

import me.vincent.nosmartmobs.Main;

public class OnEntitySpawn implements Listener {

	@SuppressWarnings("unused")
	private static Main plugin;
	
	@SuppressWarnings("static-access")
	public OnEntitySpawn(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onSpawn(EntitySpawnEvent event) {
		
		EntityType entity = (EntityType) event.getEntity().getType();

		if (entity.equals(EntityType.AREA_EFFECT_CLOUD)) return;
		if (entity.equals(EntityType.ARMOR_STAND)) return;
		if (entity.equals(EntityType.ARROW)) return;
		if (entity.equals(EntityType.BOAT)) return;
		if (entity.equals(EntityType.DRAGON_FIREBALL)) return;
		if (entity.equals(EntityType.DROPPED_ITEM)) return;
		if (entity.equals(EntityType.EGG)) return;
		if (entity.equals(EntityType.ENDER_CRYSTAL)) return;
		if (entity.equals(EntityType.ENDER_PEARL)) return;
		if (entity.equals(EntityType.EXPERIENCE_ORB)) return;
		if (entity.equals(EntityType.FIREBALL)) return;
		if (entity.equals(EntityType.FIREWORK)) return;
		if (entity.equals(EntityType.FISHING_HOOK)) return;
		if (entity.equals(EntityType.ITEM_FRAME)) return;
		if (entity.equals(EntityType.ITEM_FRAME)) return;
		if (entity.equals(EntityType.LEASH_HITCH)) return;
		if (entity.equals(EntityType.LIGHTNING)) return;
		if (entity.equals(EntityType.LLAMA_SPIT)) return;
		if (entity.equals(EntityType.MINECART)) return;
		if (entity.equals(EntityType.MINECART_CHEST)) return;
		if (entity.equals(EntityType.MINECART_COMMAND)) return;
		if (entity.equals(EntityType.MINECART_FURNACE)) return;
		if (entity.equals(EntityType.MINECART_HOPPER)) return;
		if (entity.equals(EntityType.MINECART_MOB_SPAWNER)) return;
		if (entity.equals(EntityType.MINECART_TNT)) return;
		if (entity.equals(EntityType.PAINTING)) return;
		if (entity.equals(EntityType.PLAYER)) return;
		if (entity.equals(EntityType.PRIMED_TNT)) return;
		if (entity.equals(EntityType.SHULKER_BULLET)) return;
		if (entity.equals(EntityType.SMALL_FIREBALL)) return;
		if (entity.equals(EntityType.SPECTRAL_ARROW)) return;
		if (entity.equals(EntityType.SPLASH_POTION)) return;
		if (entity.equals(EntityType.THROWN_EXP_BOTTLE)) return;
		if (entity.equals(EntityType.TRIDENT)) return;
		if (entity.equals(EntityType.UNKNOWN)) return;
			
		UUID temp = (UUID) event.getEntity().getUniqueId();
		LivingEntity entityL = (LivingEntity) Bukkit.getEntity(temp);
		
		entityL.setAI(false);
		
	}
	
}
