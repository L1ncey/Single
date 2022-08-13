package nevermind.lincey.single.Command;

import nevermind.lincey.single.Utils.ChatUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    public HealCommand() {
        Bukkit.getPluginCommand("heal").setExecutor(this);
    }
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getLogger().info("This command is for players only.");
            return true;
        }
        Player ps = (Player) sender;
        if (!ps.hasPermission("single.heal")) {
            ChatUtils.cuunknow(ps);
            return true;
        }
        ps.setHealth(ps.getMaxHealth());
        ps.sendMessage(ChatUtils.cu("Healed &e") + ps.getName() + "&b .");
        return true;
    }
}