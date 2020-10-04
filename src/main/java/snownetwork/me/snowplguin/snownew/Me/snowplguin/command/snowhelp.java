package snownetwork.me.snowplguin.snownew.Me.snowplguin.command;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.Mannage.DateMannage;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.Mannage.GatherMannga;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.other.timer;

public class snowhelp implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender Sender, Command command, String s, String[] args) {
        if(Sender instanceof Player){
                Player p =(Player)Sender;
                GatherMannga.size.put(p.getUniqueId(),1);
                GatherMannga.time.put(p.getUniqueId(),0L);
            GatherMannga.innewguide.replace(p.getUniqueId(),true);
            for(Player pl: Bukkit.getOnlinePlayers()){
                pl.hidePlayer(p);
                p.hidePlayer(pl);
            }
        }
        return false;
    }
}
