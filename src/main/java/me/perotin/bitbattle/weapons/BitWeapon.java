package me.perotin.bitbattle.weapons;

import java.util.HashMap;

/*
    Created 11/05/17 by Perotin



    Class used to create, load, and manage weapons
    Weapons fields change as apart of upgrades, none of the fields will be constant
    besides for the name and projectile during runtime
 */
public class BitWeapon {
    /*
    TODO
        Expand on this class as we find more integral parts that we can convert from Arrow.io
        Make most fields on loading pull from config, for now we can use our own values
    */

    // name of the weapon
    private String name;

    /*
        @percentage
        percentage of victim's max health,

        percentages should be created out of 100
        Example: player has 10 hearts, weapon has a damage percentage of 10%, player loses 1 heart

      */
    private int damagePercentage;

    /*
        @returns a boolean if the weapon is thrown, if false, weapon is melee

     */
    private boolean projectile;

    /*
        Amount of projectiles shot at the same time
        for melee weapons this will be 0
     */
    private int amountShotAtOnce;

    /*
        Amount of projectiles shot in procession,
        for melee weapons this will be 0
     */
    private int amountShotInARow;

    /*
        stores the weapon itself as the key, and the ammunition as the value
        for melee weapons set the value as AIR
        Strings stored should be a Material#toString, saving as strings for parsing purposes
     */
    private HashMap<String, String> weaponBuild;

    /*
        Cooldown of which a player can fire/attack again, this can be
        set to 0 in the config for all weapons
     */
    private int cooldown;


    // default weapon constructor, pull from config so they can customize the defaults
    public BitWeapon(String name, int damagePercentage, boolean projectile, int amountShotAtOnce, int amountShotInARow, HashMap<String, String> weaponBuild, int cooldown) {
        this.name = name;
        this.damagePercentage = 20;
        this.projectile = projectile;
        // defaults for projectile will be just one shot at once, none shot in a row
        if(projectile) {
            this.amountShotAtOnce = 1;
            this.amountShotInARow = 0;
        } else {
            // setting to zero because its melee
            this.amountShotAtOnce = 0;
            this.amountShotInARow = 0;
        }
        this.weaponBuild = weaponBuild;
        this.cooldown = 3;
    }


    public String getName() {
        return name;
    }



    public int getDamagePercentage() {
        return damagePercentage;
    }

    public void setDamagePercentage(int damagePercentage) {
        this.damagePercentage = damagePercentage;
    }



    public void setProjectile(boolean projectile) {
        this.projectile = projectile;
    }

    public int getAmountShotAtOnce() {
        return amountShotAtOnce;
    }

    public void setAmountShotAtOnce(int amountShotAtOnce) {
        this.amountShotAtOnce = amountShotAtOnce;
    }

    public int getAmountShotInARow() {
        return amountShotInARow;
    }

    public void setAmountShotInARow(int amountShotInARow) {
        this.amountShotInARow = amountShotInARow;
    }

    public HashMap<String, String> getWeaponBuild() {
        return weaponBuild;
    }

    public void setWeaponBuild(HashMap<String, String> weaponBuild) {
        this.weaponBuild = weaponBuild;
    }

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }
}
