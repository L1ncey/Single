package nevermind.lincey.single;


import nevermind.lincey.single.Command.FHeal;
import nevermind.lincey.single.Command.GMC;
import nevermind.lincey.single.Command.GMS;
import nevermind.lincey.single.Command.Heal;

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
        new Heal(this);
        new FHeal(this);
        new GMC(this);
        new GMS(this);

    }

    public void onDisable() {
        Logger.getLogger("  ");
        Logger.getLogger("  Single De-Loaded.");
        Logger.getLogger("  Dev: Lincey");
        Logger.getLogger("  ");
    }


}
