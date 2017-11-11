package me.perotin.bitbattle.traits;

import me.perotin.bitbattle.players.ArenaPlayer;


public abstract class AbstractTrait implements Trait {
    protected final ArenaPlayer player;

    protected final String name;


    protected AbstractTrait(ArenaPlayer player, String name) {
        this.player = player;

        this.name = name;
    }
}
