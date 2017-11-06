package me.perotin.bitbattle.traits;

public interface LevelableTrait extends Trait {

    int getLevel();

    int getMaxLevel();

    boolean hasNextLevel();

    void levelUp();
}
