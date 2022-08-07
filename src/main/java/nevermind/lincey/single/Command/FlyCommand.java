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
                if (args.length == 0) {
                    ps.setAllowFlight(true);
                    ps.sendMessage(ChatColor.AQUA + "Fly-Enabled " + ChatColor.YELLOW  + ps + ChatColor.AQUA  + " .");

                } else if (args.length == 1) {
                    Player pr = Bukkit.getPlayer(args[0]);
                    boolean po = pr.isOnline();
                    if(po){
                        ps.setAllowFlight(true);
                        ps.sendMessage(ChatColor.AQUA + "Fly-Enabled " + ChatColor.YELLOW  + pr + ChatColor.AQUA  + " .");

                    } else {
                        ps.sendMessage(ChatColor.AQUA + "Target not found.");

                    }
                } else {
                    ps.sendMessage(ChatColor.AQUA + "Usage: /fly [target]");

                }
            } else {
                ps.sendMessage(ChatColor.WHITE + "Unknown command.");

            }

        }

        return true;
    }
}
