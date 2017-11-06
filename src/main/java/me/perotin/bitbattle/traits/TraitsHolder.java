package me.perotin.bitbattle.traits;

import org.bukkit.entity.Player;

import java.util.Optional;
import java.util.function.Function;

public interface TraitsHolder {

    <T extends Trait> void applyTrait(Function<Player, Trait> traitCreator);

    <T extends Trait> void retractTrait(Class<T> traitType);

    void retractAllTraits();

    <T extends LevelableTrait> void levelUpTrait(Class<T> traitType);

    <T extends Trait> boolean hasTrait(Class<T> traitType);

    <T extends Trait> Optional<T> getTrait(Class<T> traitType);
}
