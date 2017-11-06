package me.perotin.bitbattle.traits;

import java.util.Optional;

public interface TraitsHolder {

    void applyTrait(Trait trait);

    <T extends Trait> void retractTrait(Class<T> traitType);

    void retractAllTraits();

    <T extends LevelableTrait> void levelUpTrait(Class<T> traitType);

    <T extends Trait> boolean hasTrait(Class<T> traitType);

    <T extends Trait> Optional<T> getTrait(Class<T> traitType);
}
