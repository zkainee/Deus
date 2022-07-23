package nl.kaine.deus.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Test implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            ((Player) sender).sendMessage(ChatColor.RED + "SYSTEM | Console only command");
        } else {
            System.out.println("Hello you've messaged the console.");
        }
        return false;
    }
}
