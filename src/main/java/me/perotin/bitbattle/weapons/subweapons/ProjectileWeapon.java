package me.perotin.bitbattle.weapons.subweapons;

import me.perotin.bitbattle.weapons.BitWeapon;

/*
    Created 11/7/16 by Perotin

    Class for projectile weapons
 */
public class ProjectileWeapon extends BitWeapon {

    /*
    TODO
    make it pull from a weapons.yml for default values

    also add more capabilities i/e tracking
    doing bare minimum for now, will add fancy stuff once prototype is finished
     */

    private int range;

    private int roundsShotAtOnce;

    private int roundsShotAfterFirstShot;




    // constructor with all fields
    public ProjectileWeapon(String name, int cooldown, int baseDamage, int range, int roundsShotAfterFirstShot, int roundsShotAtOnce){
        super(name, baseDamage, cooldown);

        this.range = range;
        this.roundsShotAfterFirstShot = roundsShotAfterFirstShot;
        this.roundsShotAtOnce = roundsShotAtOnce;
    }

    // default constructor i/e first used
    public ProjectileWeapon(String name, int cooldown, int baseDamage){
        super(name, baseDamage, cooldown);

        // change this to pull from a file so user can configurate it
        this.range = 5;
        this.roundsShotAfterFirstShot = 1;
        this.roundsShotAtOnce = 1;
    }



    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getRoundsShotAtOnce() {
        return roundsShotAtOnce;
    }

    public void setRoundsShotAtOnce(int roundsShotAtOnce) {
        this.roundsShotAtOnce = roundsShotAtOnce;
    }

    public int getRoundsShotAfterFirstShot() {
        return roundsShotAfterFirstShot;
    }

    public void setRoundsShotAfterFirstShot(int roundsShotAfterFirstShot) {
        this.roundsShotAfterFirstShot = roundsShotAfterFirstShot;
    }





}
