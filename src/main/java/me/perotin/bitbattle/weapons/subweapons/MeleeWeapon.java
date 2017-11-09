package me.perotin.bitbattle.weapons.subweapons;

import me.perotin.bitbattle.weapons.BitWeapon;

/*
    Created 11/07/17 by Perotin

    Class for melee weapons
 */
public class MeleeWeapon extends BitWeapon {

    /*
    TODO
    think of cool stuff we can make here
     */

    private String material;
    public MeleeWeapon(String name, int baseDamage, int cooldown, String material){
        super(name, baseDamage, cooldown);

        this.material = material;

    }





}
