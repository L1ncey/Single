package nevermind.lincey.single.Command;

import nevermind.lincey.single.Single;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class SuicideCommand implements CommandExecutor{
        public SuicideCommand(){
            Bukkit.getPluginCommand("zs").setExecutor(this);
        }

    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getLogger().info("This command is for players only.");
            return true;
        } else {
            Player ps = (Player) sender;
             ps.setHealth(0);
             ps.sendMessage(ChatColor.AQUA + "Done.");

        }
        return true;
    }
}
