package nl.kaine.deus;

import nl.kaine.deus.commands.Interaction;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Deus extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        Objects.requireNonNull(getCommand("interaction")).setExecutor(new Interaction());
        System.out.println("DEUS PLUGIN | STARTED");
        // Plugin startup logic
    }

}
