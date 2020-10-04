package snownetwork.me.snowplguin.snownew.Me.snowplguin.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.Mannage.DateMannage;

public class snownewreload implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        DateMannage.LoadData2();
        DateMannage.LoadData();
        commandSender.sendMessage("重载成功");
        return false;
    }
}
