package org.example.ScoreUpdater;

import org.example.Inning.Balls;
import org.example.Inning.RunType;
import org.example.Team.TeamScoreCard;

public class TeamScoreCardUpdater implements ScoreCardUpdater{

    TeamScoreCard teamScoreCard;

    public TeamScoreCardUpdater(TeamScoreCard teamScoreCard){
        this.teamScoreCard = teamScoreCard;
    }

    @Override
    public void update(Balls balls) {
        RunType runType = balls.getRunType();
        if(runType== RunType.ONE){
            teamScoreCard.setTotalScore(teamScoreCard.getTotalScore()+1);
        }
        else if(runType==RunType.TWO){
            teamScoreCard.setTotalScore(teamScoreCard.getTotalScore()+2);
        }
        else if(runType==RunType.FOUR){
            teamScoreCard.setTotalScore(teamScoreCard.getTotalScore()+4);
            teamScoreCard.setTotalFours(teamScoreCard.getTotalFours()+1);
        }
        else if(runType==RunType.THREE){
            teamScoreCard.setTotalScore(teamScoreCard.getTotalScore()+3);
        }
        else if(runType==RunType.SIX){
            teamScoreCard.setTotalScore(teamScoreCard.getTotalScore()+6);
            teamScoreCard.setTotalSix(teamScoreCard.getTotalSix()+1);
        }

    }
}
