package me.perotin.bitbattle.traits;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public interface TraitsHolder {

    void applyTrait(Function<UUID, Trait> traitCreator);

    boolean retractTrait(Class<? extends Trait> traitType);

    void retractAllTraits();

    boolean hasTrait(Class<? extends Trait> traitType);

    //TODO: What if the specified traitType is not present?
    void levelUpTrait(Class<? extends LevelableTrait> traitType);

    <T extends Trait> Optional<T> getTrait(Class<T> traitType);

    Collection<? extends Trait> findAllTraits();
}
