package me.perotin.bitbattle.files;

import me.perotin.bitbattle.BitBattle;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

/*
    Created on 11/07/17 by Perotin
    Class to quickly retrieve files

 */
public class BitFile {

    private File file;
    private FileConfiguration configuration;

    public BitFile(BitFileType type){
        // hard-coding some stuff to make our lives easier, since we'll be using
        // files A LOT so it is important we have a good system set in place to easily retreive these things

        if(type == BitFileType.MESSAGES){
            file = new File(BitBattle.getInstance().getDataFolder(), "messages.yml");
            configuration = YamlConfiguration.loadConfiguration(file);
        }
        if(type == BitFileType.PLAYERS){
            file = new File(BitBattle.getInstance().getDataFolder(), "players.yml");
            configuration = YamlConfiguration.loadConfiguration(file);
        }
        if(type == BitFileType.LOCATIONS){
            file = new File(BitBattle.getInstance().getDataFolder(), "locations.yml");
            configuration = YamlConfiguration.loadConfiguration(file);
        }
        if(type == BitFileType.WEAPONS){
            file = new File(BitBattle.getInstance().getDataFolder(), "weapons.yml");
            configuration = YamlConfiguration.loadConfiguration(file);
        }




    }

    // some generic methods to speed up the process

    public void save(){
        try{
            configuration.save(file);
        } catch (IOException ex){
            ex.printStackTrace();;
        }
    }


    public FileConfiguration getConfiguration() {
        return configuration;
    }

    public Object get(String path){
        return configuration.get(path);
    }

    public void set(String path, Object value){
        configuration.set(path, value);
    }


}
