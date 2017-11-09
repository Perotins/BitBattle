package me.perotin.bitbattle.weapons;


import java.util.HashMap;

/*
    Created 11/05/17 by Perotin



     class used for handling projectile weapons and melee weapons
 */
public  class BitWeapon {
    /*
    TODO
        Expand on this class as we find more integral parts that we can convert from Arrow.io
        Make most fields on loading pull from config, for now we can use our own values
    */

    // name of the weapon
    private final String name;
    /*
        @int
        base value, don't make higher than 2

     */
    private final int baseDamage;


    /*
    @cooldown until the weapon can be used again
     */
    private int cooldown;




    // default weapon constructor, pull from config so they can customize the defaults
   public BitWeapon(String name, int baseDamage, int cooldown){
       this.name = name;
       this.baseDamage = baseDamage;
       this.cooldown = cooldown;

   }



    public String getName() {
        return name;
    }



    public int getBaseDamage() {
        return baseDamage;
    }


    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }
}
