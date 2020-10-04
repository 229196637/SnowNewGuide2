package snownetwork.me.snowplguin.snownew.Me.snowplguin.Mannage;

import org.bukkit.Location;
import org.bukkit.block.data.type.Snow;
import org.bukkit.configuration.file.YamlConfiguration;
import snownetwork.me.snowplguin.snownew.Me.snowplguin.SnowNew;

import java.io.File;
import java.io.IOException;

public class DateMannage {
    private static YamlConfiguration Locationdata;
    private static YamlConfiguration messagedata;
    public static void LoadData(){
        File file = new File(SnowNew.getInstance().getDataFolder(),"data.yml");
        if(!file.exists()){
            SnowNew.getInstance().saveResource("data.yml",false);

        }
        Locationdata = YamlConfiguration.loadConfiguration(file);
    }
    public static void LoadData2(){
        File file = new File(SnowNew.getInstance().getDataFolder(),"message.yml");
        if(!file.exists()){
            SnowNew.getInstance().saveResource("message.yml",false);

        }
        messagedata = YamlConfiguration.loadConfiguration(file);
    }
    public static YamlConfiguration getdata(){
        return Locationdata;

    }

    public static YamlConfiguration getMessagedata() {
        return messagedata;
    }

    public static void createlocation(String s , Location loc ){
        File file = new File(SnowNew.getInstance().getDataFolder(),"data.yml");
        YamlConfiguration date = YamlConfiguration.loadConfiguration(file);
        date.set(s,loc);
        try {
            date.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void createString(String s , String line ){
        File file = new File(SnowNew.getInstance().getDataFolder(),"message.yml");
        YamlConfiguration date = YamlConfiguration.loadConfiguration(file);
        date.set(s,line);
        try {
            date.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
