package nl.kaine.deus;

import nl.kaine.deus.commands.Test;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("test")).setExecutor(new Test());
        System.out.println("DEUS | LOADED");
    }
}
