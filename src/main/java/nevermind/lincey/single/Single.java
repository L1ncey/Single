package nevermind.lincey.single;


import nevermind.lincey.single.Command.FHeal;
import nevermind.lincey.single.Command.Heal;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Single extends JavaPlugin implements Listener {

    public Single() {
    }

    public void onEnable() {
        this.getLogger().config("  ");
        this.getLogger().config("  Single Loaded.");
        this.getLogger().config("  Dev: Lincey");
        this.getLogger().config("  Is private: True");
        this.getLogger().config("  ");

        new Heal(this);
        new FHeal(this);

    }

    public void onDisable() {
        this.getLogger().config("  ");
        this.getLogger().config("  Single De-Loaded.");
        this.getLogger().config("  Dev: Lincey");
        this.getLogger().config("  Is private: True");
        this.getLogger().config("  ");
    }


}
