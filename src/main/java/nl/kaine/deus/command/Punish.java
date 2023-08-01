package nl.kaine.deus.command;

import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Calendar;

public class Punish implements CommandExecutor {

    //  /punish <playerName> <kick/ban/tempban>
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) return true;
        Player player = (Player) sender;

        if (args.length != 2) {
            player.sendMessage(ChatColor.RED + "ᴅᴇᴜs | ɪɴᴠᴀʟɪᴅ ᴜsᴀɢᴇ");
            return true;
        }

        if (Bukkit.getPlayer(args[0]) == null) {
            player.sendMessage(ChatColor.RED + "ᴅᴇᴜs | ᴘʟᴀʏᴇʀ ɪs ɴᴏᴛ ᴏɴʟɪɴᴇ");
            return true;
        }

        Player target = Bukkit.getPlayer(args[0]);
        switch (args[1].toLowerCase()) {
            case "kick":
                target.kickPlayer(ChatColor.RED + "ᴅᴇᴜs | ʏᴏᴜ'ᴠᴇ ʙᴇᴇɴ ᴋɪᴄᴋᴇᴅ\nᴅᴇᴜs | ᴀɴᴏᴛʜᴇʀ ᴋɪᴄᴋ ᴡɪʟʟ ʀᴇsᴜʟᴛ ɪɴ ᴀ ʜɪɢʜᴇʀ ᴘᴜɴɪsʜᴍᴇɴᴛ.");
                break;
            case "ban":
                Bukkit.getBanList(BanList.Type.NAME).addBan(target.getName(), ChatColor.RED + "ᴅᴇᴜs | ʏᴏᴜ'ᴠᴇ ʙᴇᴇɴ ʙᴀɴɴᴇᴅ\nᴅᴇᴜs | ʏᴏᴜ ɴᴇᴇᴅ ᴛᴏ ᴀᴘᴘᴇᴀʟ ꜰᴏʀ ᴀ ᴜɴʙᴀɴ", null, null);
                target.kickPlayer(ChatColor.RED + "ᴅᴇᴜs | ʏᴏᴜ ʜᴀᴠᴇ ʙᴇᴇɴ ʙᴀɴɴᴇᴅ");
                break;
            case "tempban":
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.HOUR, 12);
                Bukkit.getBanList(BanList.Type.NAME).addBan(target.getName(), ChatColor.RED + "ᴅᴇᴜs | ʏᴏᴜ'ᴠᴇ ʙᴇᴇɴ ʙᴀɴɴᴇᴅ\nᴅᴇᴜs | ʏᴏᴜ ɴᴇᴇᴅ ᴛᴏ ᴀᴘᴘᴇᴀʟ ꜰᴏʀ ᴀ ᴜɴʙᴀɴ", cal.getTime(), null);
                target.kickPlayer(ChatColor.RED + "ᴅᴇᴜs | ʏᴏᴜ ʜᴀᴠᴇ ʙᴇᴇɴ ᴛᴇᴍᴘʙᴀɴɴᴇᴅ");
                break;
            default:
                player.sendMessage(ChatColor.RED + "ᴅᴇᴜs | ɪɴᴠᴀʟɪᴅ ᴜsᴀɢᴇ");
                return false;
        }
        return false;
    }
}
