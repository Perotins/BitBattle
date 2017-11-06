package me.perotin.bitbattle.traits;

import org.bukkit.entity.Player;

public interface Trait {

    void apply(Player player);

    void retract(Player player);
}
