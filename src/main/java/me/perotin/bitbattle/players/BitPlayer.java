package me.perotin.bitbattle.players;

public interface BitPlayer {

    double getHealth();

    //TODO: Returns true if the player died
    boolean damage(double amount);

    double getMaxHealth();

    void setMaxHealth(double amount);
}
