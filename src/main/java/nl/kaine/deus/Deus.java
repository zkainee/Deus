package nl.kaine.deus;

import nl.kaine.deus.command.Punish;
import nl.kaine.deus.command.Vanish;
import org.bukkit.plugin.java.JavaPlugin;

public final class Deus extends JavaPlugin  {

    public void onEnable() {
        System.out.println("DEUS | LOADED");

        getCommand("vanish").setExecutor(new Vanish());
        getCommand("punish").setExecutor(new Punish());
    }
}
