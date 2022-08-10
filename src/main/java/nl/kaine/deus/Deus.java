package nl.kaine.deus;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Deus extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("DEUS | LOADED");

        // Item uit
        ItemStack itemStack = new ItemStack(Material.CARROT, 4);

        //Item ready, enkel aan player geven
        ItemMeta meta = itemStack.getItemMeta();

        itemStack.setItemMeta(meta);
        // meta. [list]


        Block block = Objects.requireNonNull(Bukkit.getWorld("world")).getBlockAt(15,60,1);
        block.getType().equals(Material.CARROT);


    }

}
