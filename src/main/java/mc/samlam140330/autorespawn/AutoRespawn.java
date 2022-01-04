package mc.samlam140330.autorespawn;

import mc.samlam140330.autorespawn.events.AutoRespawnEvent;
import mc.samlam140330.autorespawn.utils.UpdateChecker;
import org.bukkit.plugin.java.JavaPlugin;

public final class AutoRespawn extends JavaPlugin {
    private static AutoRespawn instance;

    public static AutoRespawn getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        new UpdateChecker().checkLatestVersion(version -> {
            if (getDescription().getVersion().equalsIgnoreCase(version)) {
                getLogger().info("You are running the latest version.");
            } else {
                getLogger().info("There is a new update available.");
            }
        });
        getServer().getPluginManager().registerEvents(new AutoRespawnEvent(), this);
        getLogger().info("Successfully enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Successfully disabled!");
    }
}
