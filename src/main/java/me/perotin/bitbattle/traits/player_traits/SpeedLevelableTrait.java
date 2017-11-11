package me.perotin.bitbattle.traits.player_traits;

import me.perotin.bitbattle.players.ArenaPlayer;
import me.perotin.bitbattle.traits.AbstractLevelableTrait;

/*
    Example class of a trait
    Created by Perotin 11/07/17
 */
public class SpeedLevelableTrait extends AbstractLevelableTrait  {



    public SpeedLevelableTrait(ArenaPlayer player, String name, int maxLevel){
        super(player, name, maxLevel);

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
