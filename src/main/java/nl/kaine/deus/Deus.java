package nl.kaine.deus;

import nl.kaine.deus.commands.Config;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Deus extends JavaPlugin {
    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        Objects.requireNonNull(getCommand("config")).setExecutor(new Config(this));
        System.out.println("DEUS | LOADED");
    }
}
