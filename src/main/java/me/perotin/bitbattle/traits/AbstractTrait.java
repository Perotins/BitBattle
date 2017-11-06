package me.perotin.bitbattle.traits;

import java.util.UUID;

public abstract class AbstractTrait implements Trait {
    protected final UUID playerId;

    protected AbstractTrait(UUID playerId) {
        this.playerId = playerId;
    }
}
