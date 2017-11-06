package me.perotin.bitbattle.traits;

import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public interface TraitsHolder {

    <T extends Trait> void applyTrait(Function<UUID, Trait> traitCreator);

    <T extends Trait> void retractTrait(Class<T> traitType);

    void retractAllTraits();

    <T extends LevelableTrait> void levelUpTrait(Class<T> traitType);

    <T extends Trait> boolean hasTrait(Class<T> traitType);

    <T extends Trait> Optional<T> getTrait(Class<T> traitType);
}
