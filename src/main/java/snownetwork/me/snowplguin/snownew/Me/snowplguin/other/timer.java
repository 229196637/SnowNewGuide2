package snownetwork.me.snowplguin.snownew.Me.snowplguin.other;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.configuration.Configuration;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.Mannage.ConfigurationMannage;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.Mannage.DateMannage;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.Mannage.GatherMannga;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.Mannage.TitleMannage;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.SnowNew;

import java.util.HashMap;

public class timer extends BukkitRunnable {
    private int size=1;
    public timer plguin;

    public timer(SnowNew snowNew) {
        snowNew=SnowNew.getInstance();
    }

    @Override
    public void run() {
        for(Player p: Bukkit.getOnlinePlayers()){
            if(GatherMannga.innewguide.get(p.getUniqueId())){
                if(DateMannage.getdata().get(String.valueOf(GatherMannga.size.get(p.getUniqueId())))==null){
                    GatherMannga.innewguide.replace(p.getUniqueId(),false);
                    GatherMannga.size.remove(p.getUniqueId());
                    GatherMannga.time.remove(p.getUniqueId());
                        for(Player pl:Bukkit.getOnlinePlayers()){
                            pl.showPlayer(p);
                            p.showPlayer(pl);
                        }
                    size=1;
                    return;
                }
                if(GatherMannga.time.containsKey(p.getUniqueId())){
                    if(GatherMannga.time.get(p.getUniqueId())!=0L){
                        GatherMannga.time.replace(p.getUniqueId(),GatherMannga.time.get(p.getUniqueId())-1L);
                    }else {
                        GatherMannga.time.replace(p.getUniqueId(),3L);
                        p.teleport((Location)DateMannage.getdata().get(String.valueOf(GatherMannga.size.get(p.getUniqueId()))));
                        TitleMannage.sendTitle(p, ChatColor.translateAlternateColorCodes('&',DateMannage.getMessagedata().getString(String.valueOf(size)+1)),ChatColor.translateAlternateColorCodes('&',DateMannage.getMessagedata().getString(String.valueOf(size)+2)),20);
                        size++;
                        GatherMannga.size.replace(p.getUniqueId(),size);
                    }
                }
            }
        }

    }

}
