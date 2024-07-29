package me.agwoo.cowCannon;

import org.bukkit.plugin.java.JavaPlugin;

public final class CowCannon extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EntityListener(), this);
        getCommand("cow").setExecutor(new CowCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static CowCannon getInstance() {
        return getPlugin(CowCannon.class);
    }
}
