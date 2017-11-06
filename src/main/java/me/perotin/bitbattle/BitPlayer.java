package me.perotin.bitbattle;

import me.perotin.bitbattle.traits.Trait;

import java.util.Optional;

public interface BitPlayer {

    double getHealth();

    //TODO: Returns true if the player died
    boolean damage(double amount);

    double getMaxHealth();

    void setMaxHealth();

    void apply(Trait trait);

    <T extends Trait> Optional<T> getTrait(Class<T> traitType);
}
