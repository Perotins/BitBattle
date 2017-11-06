package me.perotin.bitbattle.traits;

import org.bukkit.entity.Player;

public interface LevelableTrait extends Trait {

    int getLevel();

    int getMaxLevel();

    void levelUp(Player player);
}
