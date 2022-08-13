package nevermind.lincey.single;

import nevermind.lincey.single.Command.*;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class Single extends JavaPlugin {

    public static Single instance;
    public static String unknowmsg;
    FileConfiguration config = this.getConfig();

    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        reloadConfig();

        if (config.getString("Unknow_command_message.mode").equals("custom")){
            unknowmsg = config.getString("Unknow_command_message.custom_message");
        }
        if (config.getString("Unknow_command_message.mode").equals("default")){
            try {
                YamlConfiguration yc = new YamlConfiguration();
                yc.load(new File("spigot.yml"));
                unknowmsg = yc.getString("messages.unknown-command");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (!config.getString("Unknow_command_message.mode").equals("custom")
                && !config.getString("Unknow_command_message.mode").equals("default")){
            Bukkit.getLogger().warning(" ");
            Bukkit.getLogger().warning("WARN: Config Unknow_command_message mode ERROR! Please check your config file!");
            Bukkit.getLogger().warning(" ");
            Bukkit.shutdown();
        }




        Bukkit.getLogger().info("  ");
        Bukkit.getLogger().info("  Single Loaded.");
        Bukkit.getLogger().info("  Dev: Lincey / NaerQAQ");
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
        Bukkit.getLogger().info("  Dev: Lincey / NaerQAQ");
        Bukkit.getLogger().info("  ");
    }
}
