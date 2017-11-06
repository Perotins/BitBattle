package me.perotin.bitbattle.traits;

import java.util.Optional;

public interface TraitsHolder {

    void apply(Trait trait);

    <T extends LevelableTrait> void levelUpTrait(Class<T> traitType);

    <T extends Trait> boolean hasTrait(Class<T> traitType);

    <T extends Trait> Optional<T> getTrait(Class<T> traitType);
}
