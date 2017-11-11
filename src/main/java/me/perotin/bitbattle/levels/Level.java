package me.perotin.bitbattle.levels;

/*
    Created by Perotin 11/10/17

    Interface for player levels --
    This does not apply to traits or weapons
    This is the players level earned from gaining exp or killing players
    Each levelup brings a new upgrade in a form of a weapon, or trait boost
 */
public interface Level {


    void levelup();

    int getLevel();

    int getExpNeeded();

    double getCurrentExp();

    void setExpNeeded(int expNeeded);

    void setCurrentExp(int remaningExp);



}
