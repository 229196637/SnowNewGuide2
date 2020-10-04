package snownetwork.me.snowplguin.snownew.Me.snowplguin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.Mannage.ConfigurationMannage;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.Mannage.DateMannage;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.Mannage.GatherMannga;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.command.newcreate;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.command.snowhelp;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.command.snownewreload;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.other.Playerthing;

public final class SnowNew extends JavaPlugin {
   private static SnowNew instance;


    @Override
    public void onEnable() {
        instance=this;
        getLogger().info("[SnowNewGuide]已经加载！");
        DateMannage.LoadData();
        DateMannage.LoadData2();
        getCommand("snewcreate").setExecutor(new newcreate());
        getCommand("snowhelp").setExecutor(new snowhelp());
        getCommand("snownewreload").setExecutor(new snownewreload());
        getServer().getPluginManager().registerEvents(new Playerthing(), this);
        if(Bukkit.getOnlinePlayers().size()!=0){
            for(Player p:Bukkit.getOnlinePlayers()){
                GatherMannga.innewguide.put(p.getUniqueId(),false);
            }

        }
        BukkitTask task2 = new snownetwork.me.snowplguin.snownew.Me.snowplguin.other.timer(this).runTaskTimer(this, 0, 20);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        getLogger().info("[SnowNewGuide]成功卸载！");
        // Plugin shutdown logic
    }

    public static SnowNew getInstance() {
        return instance;
    }
}
