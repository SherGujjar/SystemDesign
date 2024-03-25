package org.example.Inning;

import org.example.Team.Player.Player;

import java.util.ArrayList;
import java.util.List;

public class Over {
    public List<Balls> ballsList;
    private int overNumber;

    public Over startOver(){

        this.ballsList = new ArrayList<>();
        this.overNumber =overNumber;
        return this;
    }

    public Balls throwABall(){
        return new Balls();
    }
}
