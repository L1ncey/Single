package nevermind.lincey.single;


import nevermind.lincey.single.Command.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Single extends JavaPlugin {

    public Single() {
    }

    public void onEnable() {
        Bukkit.getLogger().info("  ");
        Bukkit.getLogger().info("  Single Loaded.");
        Bukkit.getLogger().info("  Dev: Lincey");
        Bukkit.getLogger().info("  ");
        new HealCommand();
        new FoodHealCommand();
        new GamemodeCommandC();
        new GamemodeCommandS();
        new HiCommand();
        new FlyCommand();
        new SuicideCommand();
    }

    public void onDisable() {
        Bukkit.getLogger().info("  ");
        Bukkit.getLogger().info("  Single De-Loaded.");
        Bukkit.getLogger().info("  Dev: Lincey");
        Bukkit.getLogger().info("  ");
    }


}
