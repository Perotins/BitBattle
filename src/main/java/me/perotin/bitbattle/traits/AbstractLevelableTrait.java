package me.perotin.bitbattle.traits;

import java.util.UUID;

public abstract class AbstractLevelableTrait extends AbstractTrait implements LevelableTrait {
    private int level;
    private final int maxLevel;

    protected AbstractLevelableTrait(UUID playerId, int maxLevel) {
        super(playerId);
        this.level = 1;
        this.maxLevel = maxLevel;
    }

    @Override
    public final int getLevel() {
        return level;
    }

    @Override
    public final int getMaxLevel() {
        return maxLevel;
    }

    @Override
    public final boolean hasNextLevel() {
        return level < maxLevel;
    }

    @Override
    public final void levelUp() {
        if (!hasNextLevel()) {
            throw new IllegalStateException("trait is already at max level");
        }

        onLevelUp(++level);
    }

    protected abstract void onLevelUp(int newLevel);
}
