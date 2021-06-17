package mc.samlam140330.autorespawn.events;

import mc.samlam140330.autorespawn.AutoRespawn;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class AutoRespawnEvent implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        Bukkit.getScheduler().scheduleSyncDelayedTask(AutoRespawn.getInstance(), () -> player.spigot().respawn(), 5L);
    }
}
