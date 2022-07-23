package nl.kaine.deus.commands;

import nl.kaine.deus.Deus;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class Config implements CommandExecutor {

    private Deus deus;
    public Config(Deus deus) {
        this.deus = deus;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            deus.getConfig().set("Word", "Sheldon");

            List<String> list = deus.getConfig().getStringList("String-list");
            list.add("Nieuwe waarde");
            deus.getConfig().set("String-list", list);

            deus.saveConfig();
        }
        return false;
    }
}
