package org.example.Inning;

import org.example.ScoreUpdater.BattingScoreCardUpdater;
import org.example.ScoreUpdater.ScoreCardUpdater;
import org.example.Team.Player.Player;

import java.util.List;

public class Balls {
    private int ballNumber;
    private BallType ballType;

    private RunType runType;
    private Player playedBy;
    private Player bowledBy;

    public int getBallNumber() {
        return ballNumber;
    }

    public BallType getBallType() {
        return ballType;
    }

    public RunType getRunType() {
        return runType;
    }

    public Player getPlayedBy() {
        return playedBy;
    }

    public Player getBowledBy() {
        return bowledBy;
    }


    private void notifyObservers(List<ScoreCardUpdater> scoreCardUpdater){
       scoreCardUpdater.forEach(e->e.update(this));
    }

    public void delieveredBowl(Player playedBy, Player bowledBy,BallType ballType,RunType runType,int ballNumber,List<ScoreCardUpdater> scoreCardUpdaterList){
        this.bowledBy = bowledBy;
        this.playedBy = playedBy;
        this.ballNumber = ballNumber;
        this.runType = runType;
        this.ballType = ballType;

        notifyObservers(scoreCardUpdaterList);
    }


}
