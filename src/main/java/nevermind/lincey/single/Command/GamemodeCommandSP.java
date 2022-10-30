package nevermind.lincey.single.Command;

import nevermind.lincey.single.Utils.ChatUtils;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommandSP implements CommandExecutor{

    public GamemodeCommandSP() {
        Bukkit.getPluginCommand("gms").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getLogger().info("This command is for players only.");
            return true;
        }
        Player ps = (Player) sender;
        if (!ps.hasPermission("single.gm")) {
            ChatUtils.CCunknow(ps);
            return true;
        }
        ps.setGameMode(GameMode.SPECTATOR);
        ps.sendMessage(ChatUtils.CC("Set &e" + ps.getName() + "&b Gamemode_SPECTATOR."));
        return true;
    }
}
