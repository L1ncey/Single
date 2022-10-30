package nevermind.lincey.single.Command;

import nevermind.lincey.single.Utils.ChatUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class FoodHealCommand implements CommandExecutor {
    public FoodHealCommand() {
        Bukkit.getPluginCommand("fheal").setExecutor(this);
    }
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) {
            Bukkit.getLogger().info("This command is for players only.");
            return true;
        }
        Player ps = (Player) sender;
        if (!ps.hasPermission("single.fheal")) {
            ChatUtils.CCunknow(ps);
            return true;
        }
        ps.setFoodLevel(20);
        ps.sendMessage(ChatUtils.CC("Food-Healed &e" + ps.getName() + "&b ."));
        return true;
    }
}

