package nevermind.lincey.single.Command;

import nevermind.lincey.single.Utils.ChatUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class FlyCommand implements CommandExecutor {
    public FlyCommand() {
        Bukkit.getPluginCommand("fly").setExecutor(this);
    }
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getLogger().info("This command is for players only.");
            return true;
        }
        Player ps = (Player) sender;
        if (!ps.hasPermission("single.fly")) {
            ChatUtils.CCunknow(ps);
            return true;
        }
        if (!ps.getAllowFlight()) {
            ps.setAllowFlight(true);
            ps.sendMessage(ChatUtils.CC("&bFly-Enabled &e" + ps.getName() + "&b ."));
            return true;
        }
        ps.setAllowFlight(false);
        ps.sendMessage(ChatUtils.CC("&bFly-Disabled &e" + ps.getName() + "&b ."));
        return true;
    }
}
