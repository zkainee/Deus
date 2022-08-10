package nl.kaine.deus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.java.JavaPlugin;

public final class Deus extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        System.out.println("DEUS | LOADED");

        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta helmetMeta = (LeatherArmorMeta) helmet.getItemMeta();
        assert helmetMeta != null;
        helmetMeta.setColor(Color.LIME);
        helmet.setItemMeta(helmetMeta);

        e.getPlayer().getInventory().addItem(helmet);

        ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta chestplateMeta = (LeatherArmorMeta) chestplate.getItemMeta();
        assert chestplateMeta != null;
        chestplateMeta.setColor(Color.FUCHSIA);
        chestplate.setItemMeta(chestplateMeta);

        ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta leggingsMeta = (LeatherArmorMeta) leggings.getItemMeta();
        assert leggingsMeta != null;
        leggingsMeta.setColor(Color.SILVER);
        leggings.setItemMeta(leggingsMeta);

        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta bootsMeta = (LeatherArmorMeta) boots.getItemMeta();
        assert bootsMeta != null;
        bootsMeta.setColor(Color.BLUE);
        boots.setItemMeta(bootsMeta);

        e.getPlayer().getInventory().addItem(helmet);
        e.getPlayer().getInventory().addItem(chestplate);
        e.getPlayer().getInventory().addItem(leggings);
        e.getPlayer().getInventory().addItem(boots);
        e.getPlayer().sendMessage(ChatColor.DARK_GREEN + "NETWORK | Kleding ontvangen!");
    }

}
