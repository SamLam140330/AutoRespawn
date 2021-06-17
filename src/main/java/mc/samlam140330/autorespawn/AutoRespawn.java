package mc.samlam140330.autorespawn;

import mc.samlam140330.autorespawn.events.AutoRespawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AutoRespawn extends JavaPlugin {
    private static AutoRespawn instance;

    public static AutoRespawn getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(new AutoRespawnEvent(), this);
        getServer().getConsoleSender().sendMessage("[AutoRespawn] Successfully enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("[AutoRespawn] Successfully disabled!");
    }
}
