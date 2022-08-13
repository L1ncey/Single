package nevermind.lincey.single.Utils;

import nevermind.lincey.single.Single;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ChatUtils {
    public static String cu(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }
    public static void cuunknow(Player player) {
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', Single.unknowmsg));
    }
}