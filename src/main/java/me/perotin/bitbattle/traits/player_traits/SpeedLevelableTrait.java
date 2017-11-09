package me.perotin.bitbattle.traits.player_traits;

import me.perotin.bitbattle.traits.AbstractLevelableTrait;
import me.perotin.bitbattle.traits.LevelableTrait;

import java.util.UUID;
/*
    Example class of a trait
    Created by Perotin 11/07/17
 */
public class SpeedLevelableTrait extends AbstractLevelableTrait implements LevelableTrait {



    public SpeedLevelableTrait(UUID playerId, String name, int maxLevel){
        super(playerId, name, maxLevel);

    }


    @Override
    protected void onLevelUp(int newLevel) {

    }

    @Override
    public void apply() {

    }

    @Override
    public void retract() {

    }
}
