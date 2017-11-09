package me.perotin.bitbattle.traits;

import java.util.UUID;

public abstract class AbstractTrait implements Trait {
    protected final UUID playerId;

    protected final String name;


    protected AbstractTrait(UUID playerId, String name) {
        this.playerId = playerId;

        this.name = name;
    }
}
