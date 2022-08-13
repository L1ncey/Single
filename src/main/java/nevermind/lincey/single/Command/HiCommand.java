package nevermind.lincey.single.Command;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HiCommand implements CommandExecutor{
    public HiCommand() {
        Bukkit.getPluginCommand("hi").setExecutor(this);
    }
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player){
            Player ps = (Player) sender;
            ps.sendMessage("Hi~");
            return true;
        }
        Bukkit.getLogger().info("Hi~");
        return true;
    }
}
