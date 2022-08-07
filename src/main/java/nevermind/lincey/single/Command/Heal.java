package nevermind.lincey.single.Command;

import nevermind.lincey.single.Single;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class Heal implements CommandExecutor {
    public Heal(Single single) {
        Bukkit.getPluginCommand("heal").setExecutor(this);
    }
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        } else {
            Player ps = (Player) sender;
            if (ps.hasPermission("single.heal")) {
                if (args.length == 0) {
                    ps.setHealth(ps.getMaxHealth());
                    ps.sendMessage(ChatColor.AQUA + "Healed " + ChatColor.YELLOW  + ps + ChatColor.AQUA  + " .");
                    return true;
                } else if (args.length == 1) {
                    Player pr = Bukkit.getPlayer(args[0]);
                    boolean po = pr.isOnline();
                    if(po){
                        pr.setHealth(ps.getMaxHealth());
                        ps.sendMessage(ChatColor.AQUA + "Healed " + ChatColor.YELLOW  + pr + ChatColor.AQUA  + " .");
                        return true;
                    } else {
                        ps.sendMessage(ChatColor.AQUA + "Target not found.");
                        return true;
                    }
                }else {
                    ps.sendMessage(ChatColor.AQUA + "Usage: /heal [target]" );
                }
            } else {
                ps.sendMessage(ChatColor.WHITE + "Unknown command.");
                return true;
            }
        }
        return true;
    }
}