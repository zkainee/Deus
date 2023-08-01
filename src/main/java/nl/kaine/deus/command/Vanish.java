package nl.kaine.deus.command;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Vanish implements CommandExecutor {
    // Vanished player list
    private List<UUID> vanished = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        //Check if player sends
        if(sender instanceof Player) {
            Player player = (Player) sender;

            // Vanished = TRUE
            if(vanished.contains(player.getUniqueId())) {
                vanished.remove(player.getUniqueId());
                for (Player target : Bukkit.getOnlinePlayers()) {
                    target.showPlayer(player);
                    player.playSound(player.getLocation(), Sound.ITEM_GOAT_HORN_SOUND_0, 2, 5);
                    player.getWorld().strikeLightningEffect(player.getLocation());
                    player.getWorld().playEffect(player.getLocation(), Effect.MOBSPAWNER_FLAMES, 5);
                }
                player.sendMessage("ᴅᴇᴜs | ʏᴏᴜ'ᴠᴇ ᴜɴᴠᴀɴɪsʜᴇᴅ");
            // Vanished = FALSE
            } else {
                vanished.add(player.getUniqueId());
                for (Player target : Bukkit.getOnlinePlayers()) {
                    target.hidePlayer(player);
                }
                player.sendMessage("ᴅᴇᴜs | ʏᴏᴜ'ᴠᴇ ᴠᴀɴɪsʜᴇᴅ");
            }
        }
        return false;
    }
}

