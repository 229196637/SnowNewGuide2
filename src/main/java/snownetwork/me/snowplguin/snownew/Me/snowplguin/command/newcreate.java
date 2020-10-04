package snownetwork.me.snowplguin.snownew.Me.snowplguin.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.other.CreateLocation;

public class newcreate implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player p = (Player)sender;
            if(args.length==2){
                CreateLocation.createloaction(p,args[0],args[1]);
                p.sendMessage("成功设置!");
            }else {
                p.sendMessage("§c用法：/snewcreate 第一行内容 第二行内容");
            }

        }
        return false;
    }
}
