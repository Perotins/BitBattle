package me.perotin.bitbattle.players;

import me.perotin.bitbattle.traits.Trait;
import me.perotin.bitbattle.weapons.BitWeapon;
import org.bukkit.entity.Player;

import java.util.List;

/*
    Class to store loaded players in pvp arena
 */
public class ArenaPlayer implements BitPlayer {

    // safe to store players here as they will only remain stored until they logout or die
    private Player player;

    private BitWeapon weapon;

    private double maxHealth;

    private List<Trait> traits;



    public ArenaPlayer(Player player, BitWeapon weapon, double maxHealth, List<Trait> traits){
        this.player = player;
        this.weapon = weapon;
        this.maxHealth = maxHealth;
        this.traits = traits;

    }


    public BitWeapon getWeapon() {
        return weapon;
    }

    public List<Trait> getTraits(){
        return this.traits;
    }

    @Override
    public double getHealth() {
        return player.getHealth();
    }



    @Override
    public boolean damage(double amount) {
        player.damage(amount);
        if(amount >= getHealth()){
            return true;
        }
        return false;
    }

    @Override
    public double getMaxHealth() {
        return this.maxHealth;
    }

    @Override
    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;

    }
}
