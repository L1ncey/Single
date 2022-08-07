package nevermind.lincey.single;


import nevermind.lincey.single.Command.FoodHealCommand;
import nevermind.lincey.single.Command.GamemodeCommandC;
import nevermind.lincey.single.Command.GamemodeCommandS;
import nevermind.lincey.single.Command.HealCommand;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Single extends JavaPlugin {

    public Single() {
    }

    public void onEnable() {
        Logger.getLogger("  ");
        Logger.getLogger("  Single Loaded.");
        Logger.getLogger("  Dev: Lincey");
        Logger.getLogger("  ");
        new HealCommand();
        new FoodHealCommand();
        new GamemodeCommandC();
        new GamemodeCommandS();

    }

    public void onDisable() {
        Logger.getLogger("  ");
        Logger.getLogger("  Single De-Loaded.");
        Logger.getLogger("  Dev: Lincey");
        Logger.getLogger("  ");
    }


}
