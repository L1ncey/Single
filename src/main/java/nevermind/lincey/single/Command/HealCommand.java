package nevermind.lincey.single.Command;

import nevermind.lincey.single.Single;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class HealCommand implements CommandExecutor {

    public HealCommand() {
        Bukkit.getPluginCommand("heal").setExecutor(this);
    }
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getLogger().info("This command is for players only.");
            return true;
        } else {
            Player ps = (Player) sender;
            if (ps.hasPermission("single.heal")) {
                    ps.setHealth(ps.getMaxHealth());
                    ps.sendMessage(ChatColor.AQUA + "Healed " + ChatColor.YELLOW  + ps.getName() + ChatColor.AQUA  + " .");

            } else {
                ps.sendMessage(ChatColor.WHITE + "Unknown command.");

            }
        }
        return true;
    }
}