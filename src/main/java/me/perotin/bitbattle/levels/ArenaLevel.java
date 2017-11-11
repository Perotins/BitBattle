package me.perotin.bitbattle.levels;

import me.perotin.bitbattle.players.ArenaPlayer;

/*
    Created by Perotin on 11/10/17

    Used for tracking levels and exp progression while in arena
 */
public class ArenaLevel implements Level {
    // tracking player
    private ArenaPlayer player;
    // current level
    private int level;
    // exp needed to levelup
    private int expNeeded;
    // amount of exp gained so far
    private double currentExp;


    // created at same instance of ArenaPlayer object, so their level will be 0 always starting off.
    public ArenaLevel(ArenaPlayer player, int level, int expNeeded, double currentExp) {
        this.player = player;
        this.level = 0;
        // ideally we'd want to create some system that progressively makes it harder to levelup and
        // make this rate of increase configurable, so on each levelup we'll handle this
        this.expNeeded = 100;
        this.currentExp = 0;
    }

    @Override
    public void levelup() {
        level += 1;
        setCurrentExp(0);
        //TODO
        // set exp needed to be 'x' exp after each new exp
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getExpNeeded() {
        return expNeeded;
    }

    @Override
    public double getCurrentExp() {
        return this.currentExp;
    }

    @Override
    public void setExpNeeded(int expNeeded) {
        this.expNeeded = expNeeded;
    }

    @Override
    public void setCurrentExp(int remaningExp) {
        this.currentExp = remaningExp;
    }
}
