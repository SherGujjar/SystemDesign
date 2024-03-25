package org.example.ScoreUpdater;

import org.example.Inning.Balls;
import org.example.Inning.RunType;
import org.example.Team.Player.Player;
import org.example.Team.Player.Score.BattingScoreCard;

public class BattingScoreCardUpdater implements ScoreCardUpdater{

    private BattingScoreCard battingScoreCard;

    public BattingScoreCardUpdater(BattingScoreCard battingScoreCard){
        this.battingScoreCard = battingScoreCard;
    }

    @Override
    public void update(Balls balls) {
       battingScoreCard.setBowlsPlayed(battingScoreCard.getBowlsPlayed()+1);
        RunType runType = balls.getRunType();
        if(runType== RunType.ONE){
           battingScoreCard.setTotalRuns(battingScoreCard.getTotalRuns()+1);
       }
       else if(runType==RunType.TWO){
            battingScoreCard.setTotalRuns(battingScoreCard.getTotalRuns()+2);
        }
       else if(runType==RunType.FOUR){
            battingScoreCard.setTotalRuns(battingScoreCard.getTotalRuns()+4);
            battingScoreCard.setTotalFours(battingScoreCard.getTotalFours()+1);
        }
       else if(runType==RunType.THREE){
            battingScoreCard.setTotalRuns(battingScoreCard.getTotalRuns()+3);
        }
       else if(runType==RunType.SIX){
            battingScoreCard.setTotalRuns(battingScoreCard.getTotalRuns()+6);
            battingScoreCard.setTotalFours(battingScoreCard.getTotalSix()+1);
        }
       battingScoreCard.setStrikeRate(battingScoreCard.getTotalRuns()/battingScoreCard.getBowlsPlayed());
    }
}
