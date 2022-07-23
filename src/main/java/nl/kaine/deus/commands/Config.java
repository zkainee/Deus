package nl.kaine.deus.commands;

import nl.kaine.deus.Deus;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Config implements CommandExecutor {

    private Deus deus;
    public Config(Deus deus) {
        this.deus = deus;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(deus.getConfig().getString("Word"));
            player.sendMessage(deus.getConfig().getInt("Number") + "");
            if (deus.getConfig().getBoolean("Boolean")) {
                player.sendMessage("This feature is enabled.");
            }
            for (String string : deus.getConfig().getStringList("String-list")) {
                player.sendMessage(string);
            }
        }
        return false;
    }
}
