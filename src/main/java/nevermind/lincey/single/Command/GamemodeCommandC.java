package nevermind.lincey.single.Command;

import nevermind.lincey.single.Single;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class GamemodeCommandC implements CommandExecutor{

    public GamemodeCommandC() {

        Bukkit.getPluginCommand("gmc").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        } else {
            Player ps = (Player) sender;
            if (ps.hasPermission("single.gm")) {
                if (args.length == 0) {
                    ps.setGameMode(GameMode.CREATIVE);
                    ps.sendMessage(ChatColor.AQUA + "Set " + ChatColor.YELLOW  +  ps + ChatColor.AQUA + " Game_mode_CREATIVE .");

                } else if (args.length == 1) {
                    Player pr = Bukkit.getPlayer(args[0]);
                    boolean po = pr.isOnline();
                    if(po){
                        pr.setGameMode(GameMode.CREATIVE);
                        ps.sendMessage(ChatColor.AQUA + "Set " + ChatColor.YELLOW  + pr + ChatColor.AQUA  + " Game_mode_CREATIVE .");

                    } else {
                        ps.sendMessage(ChatColor.AQUA + "Target not found.");

                    }
                } else {
                    ps.sendMessage(ChatColor.AQUA + "Usage: /gmc [target]");

                }

            } else {
                ps.sendMessage(ChatColor.WHITE + "Unknown command.");

            }

        }
        return true;
    }
}
