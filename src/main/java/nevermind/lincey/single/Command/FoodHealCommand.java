package nevermind.lincey.single.Command;

import nevermind.lincey.single.Single;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;


public class FoodHealCommand implements CommandExecutor {

    public FoodHealCommand() {
        Bukkit.getPluginCommand("fheal").setExecutor(this);
    }
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getLogger().info("This command is for players only.");
            return true;
        } else {
            Player ps = (Player) sender;
            if (ps.hasPermission("single.fheal")) {
                    ps.setFoodLevel(20);
                    ps.sendMessage(ChatColor.AQUA + "Food-Healed " + ChatColor.YELLOW  + ps.getName() + ChatColor.AQUA  + " .");
            } else {
                ps.sendMessage(ChatColor.WHITE + "Unknown command.");
            }
        }
        return true;
    }
}

