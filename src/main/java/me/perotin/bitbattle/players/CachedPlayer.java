package me.perotin.bitbattle.players;

import me.perotin.bitbattle.weapons.BitWeapon;

import java.util.UUID;

/*
    Class to store loaded players in pvp arena
 */
public class CachedPlayer implements BitPlayer {

    private UUID uuid;

    private BitWeapon  weapon;



    @Override
    public double getHealth() {
        return 0;
    }

    @Override
    public boolean damage(double amount) {
        return false;
    }

    @Override
    public double getMaxHealth() {
        return 0;
    }

    @Override
    public void setMaxHealth() {

    }
}
