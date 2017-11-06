package me.perotin.bitbattle.traits;

public abstract class AbstractLevelableTrait implements LevelableTrait {
    protected int level;
    protected final int maxLevel;

    protected AbstractLevelableTrait(int maxLevel) {
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
            //TODO: Throw exception
        }

        onLevelUp(++level);
    }

    protected abstract void onLevelUp(int newLevel);
}
