package me.perotin.bitbattle;

import me.perotin.bitbattle.players.ArenaPlayer;
import me.perotin.bitbattle.weapons.subweapons.MeleeWeapon;
import me.perotin.bitbattle.weapons.subweapons.RangedWeapon;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/*
    Plugin started on 11/05/17

    For committing to the repository, make sure to include a descriptive message. It will then be
    reviewed and either approved or denied appropriately.

    For documentation on the plugin you can visit this link
    https://docs.google.com/document/d/1okG7dZr_JQ91rvUvxSz_-XvidK2h0oqYD2WTv89Tsug/edit?usp=sharing

    If you want to contribute on a deeper level, and be an integral part of the project,
    contact Perotin on discord (Perotin#3447)

    All dating in comments and throughout the repository are in month / day / year format.

 */

public class BitBattle extends JavaPlugin{


    // instance only used for files, because we're laazy and don't want to pass
    // an instance around all the time :p
    private static BitBattle instance;

    @Override
    public void onEnable(){
        instance = this;





    }

    public static BitBattle getInstance(){
        return instance;
    }

}
