package snownetwork.me.snowplguin.snownew.Me.snowplguin.other;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.Mannage.DateMannage;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.Mannage.GatherMannga;

public class Playerthing implements Listener {
    @EventHandler
    public void Playjoin(PlayerJoinEvent e){
        GatherMannga.innewguide.put(e.getPlayer().getUniqueId(),false);
    }
    @EventHandler
    public void Playquit(PlayerQuitEvent e){
        if(GatherMannga.innewguide.get(e.getPlayer().getUniqueId())){
            for(Player pl: Bukkit.getOnlinePlayers()){
                    pl.showPlayer(e.getPlayer());
                    e.getPlayer().showPlayer(pl);

            }
        }
        GatherMannga.innewguide.remove(e.getPlayer().getUniqueId());
        if(GatherMannga.size.containsKey(e.getPlayer().getUniqueId())){
            GatherMannga.size.remove(e.getPlayer().getUniqueId());

        }

    }
}
