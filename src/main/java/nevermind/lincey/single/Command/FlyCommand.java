package nevermind.lincey.single.Command;

import nevermind.lincey.single.Single;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;


public class FlyCommand implements CommandExecutor {
    public FlyCommand() {
        Bukkit.getPluginCommand("fly").setExecutor(this);
    }


    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getLogger().info("This command is for players only.");
            return true;
        } else {
            Player ps = (Player) sender;
            if (ps.hasPermission("single.fly")) {
                if(!ps.getAllowFlight()){
                    ps.setAllowFlight(true);
                    ps.sendMessage(ChatColor.AQUA + "Fly-Enabled " + ChatColor.YELLOW  + ps.getName() + ChatColor.AQUA  + " .");
                } else if (ps.getAllowFlight()) {
                    ps.setAllowFlight(false);
                    ps.sendMessage(ChatColor.AQUA + "Fly-Disabled " + ChatColor.YELLOW  + ps.getName() + ChatColor.AQUA  + " .");
                }
            } else {
                ps.sendMessage(ChatColor.WHITE + "Unknown command.");
            }
        }
        return true;
    }
}
