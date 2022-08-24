package nevermind.lincey.single.Command;

import nevermind.lincey.single.Utils.ChatUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SuicideCommand implements CommandExecutor{
    public SuicideCommand(){
            Bukkit.getPluginCommand("zs").setExecutor(this);
        }
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getLogger().info("This command is for players only.");
            return true;
        }
        Player ps = (Player) sender;
        ps.setHealth(0);
        ps.sendMessage(ChatUtils.cu("&bOpps, that must be hurt."));
        return true;
    }
}
