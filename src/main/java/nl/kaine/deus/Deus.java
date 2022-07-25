package nl.kaine.deus;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Deus extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("DEUS | LOADED");

        Entity polarBear = Objects.requireNonNull(Bukkit.getWorld("world")).spawnEntity(new Location(Bukkit.getWorld("world"), -60, 64, -99), EntityType.POLAR_BEAR);
        polarBear.setGlowing(true);

        ArmorStand stand = (ArmorStand) Objects.requireNonNull(Bukkit.getWorld("world")).spawnEntity(new Location(Bukkit.getWorld("world"), -63, 64, -99), EntityType.ARMOR_STAND);
    }

}
