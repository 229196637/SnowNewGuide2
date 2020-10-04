package snownetwork.me.snowplguin.snownew.Me.snowplguin.other;

import org.bukkit.entity.Player;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.Mannage.DateMannage;

public class CreateLocation {
    public static CreateLocation main;
    private static int size=0;
    public static void createloaction(Player p,String line1,String line2){
        size++;
        DateMannage.createlocation(String.valueOf(size),p.getLocation());
        DateMannage.createString(String.valueOf(size)+1,line1);
        DateMannage.createString(String.valueOf(size)+2,line2);

    }
}
