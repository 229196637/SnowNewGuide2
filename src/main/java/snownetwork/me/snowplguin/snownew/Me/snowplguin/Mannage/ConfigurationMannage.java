package snownetwork.me.snowplguin.snownew.Me.snowplguin.Mannage;

import org.bukkit.Bukkit;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.SnowNew;

import java.io.IOException;

public class ConfigurationMannage {
    private static FileConfiguration configuration;

    public static Configuration getConfiguration() {
        return configuration;
    }
    public static void loadconfig(){
        SnowNew.getInstance().getConfig().options().copyDefaults();
        SnowNew.getInstance().saveDefaultConfig();//这两行为加载config配置文件
        SnowNew.getInstance().reloadConfig();//重载配置文件
        configuration=SnowNew.getInstance().getConfig();
    }
}
