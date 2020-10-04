package snownetwork.me.snowplguin.snownew.Me.snowplguin.Mannage;

import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class TitleMannage {
    public static void sendTitle(Player p, String title, String subTitle, int ticks){
        IChatBaseComponent chatTitle = IChatBaseComponent.ChatSerializer.a("{\"text\":\""+ title +"\"}");
        IChatBaseComponent chatsubTitle = IChatBaseComponent.ChatSerializer.a("{\"text\":\""+ subTitle +"\"}");


        PacketPlayOutTitle titre =new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TITLE,chatTitle);
        PacketPlayOutTitle sourtitre =new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.SUBTITLE,chatsubTitle);

        ((CraftPlayer)p).getHandle().playerConnection.sendPacket(titre);
        ((CraftPlayer)p).getHandle().playerConnection.sendPacket(sourtitre);

        sendtime(p,ticks);
    }
    public static void sendtime(Player p, int ticks){
        PacketPlayOutTitle c = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TIMES,null,20,ticks,20);
        ((CraftPlayer)p).getHandle().playerConnection.sendPacket(c);

    }
    public static void sentActionBar(Player p,String message){
        IChatBaseComponent actionBar = IChatBaseComponent.ChatSerializer.a("{\"text\":\""+ message +"\"}");
        PacketPlayOutChat ab=new PacketPlayOutChat(actionBar,(byte) 2);
        ((CraftPlayer)p).getHandle().playerConnection.sendPacket(ab);
    }
}
