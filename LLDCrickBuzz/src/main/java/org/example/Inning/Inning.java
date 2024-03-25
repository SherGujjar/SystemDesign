package org.example.Inning;

import org.example.ScoreUpdater.BattingScoreCardUpdater;
import org.example.ScoreUpdater.ScoreCardUpdater;
import org.example.ScoreUpdater.TeamScoreCardUpdater;
import org.example.Team.Player.BattingController;
import org.example.Team.Player.BowlingController;
import org.example.Team.Player.Player;
import org.example.Team.Team;

import java.util.ArrayList;
import java.util.List;

public class Inning {

    int overToPlay;
    List<Over> overs = new ArrayList<>();
    Team battingTeam;
    Team bowlingTeam;

    public Inning(Team battingTeam, Team bowlingTeam, int overToPlay){
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.overToPlay = overToPlay;
    }

    public void startInning(int overLimit,int target, int iningNumber){
        BattingController battingController = battingTeam.battingController;
        BowlingController bowlingController = bowlingTeam.bowlingController;
        bowlingController.assignOverLimit(overLimit);
        // initialising the openers
        battingController.sendOpeners();
        // initialising the opening bowler
        bowlingController.sendOpeningBowler();

        int overCount = 0;
        boolean allOut  = false;
        boolean winner = false;
        while(overCount<overToPlay){
            Over over = new Over();
            over.startOver();
            int ballCount = 0;
            while(ballCount<6){
                Balls balls = over.throwABall();
                Player currentBowler = bowlingController.getCurrentBowler();
                Player strikerBatsman = battingController.getStrikerBatsman();
                if(strikerBatsman==null){
                    // team is all out
                    allOut = true;
                    break;
                }
                int runGivenOnCurrentball = currentBowler.delieverTheBall();
                BallType ballType = setBallType(runGivenOnCurrentball);
                RunType runType = setRunType(runGivenOnCurrentball);

                ScoreCardUpdater batsmanUpdater = new BattingScoreCardUpdater(strikerBatsman.battingScoreCard);
                ScoreCardUpdater teamUpdater = new TeamScoreCardUpdater(battingTeam.teamScoreCard);
                balls.delieveredBowl(strikerBatsman,currentBowler,ballType,runType,ballCount,List.of(batsmanUpdater,teamUpdater));
                if(runType==RunType.THREE || runType==RunType.ONE){
                    battingController.swapPlayer();
                }
                if(ballType==BallType.WICKET){
                    System.out.println(strikerBatsman.battingScoreCard);
                    battingController.sentNextPlayer();

                }
                if(iningNumber==2 && battingTeam.teamScoreCard.getTotalScore()>target){
                    winner = true;
                    break;
                }
                if(ballType!=BallType.NOBALL && ballType!=BallType.WIDEBALL){
                    ballCount++;
                }
            }

            if(allOut || winner){
                break;
            }
            overCount++;
        }
        if(iningNumber==1){
            System.out.println("Target for "+bowlingTeam.teamName +" is "+battingTeam.teamScoreCard.getTotalScore());
        }
        if(iningNumber==2 && winner){
            System.out.println("The score is achieved in over "+overCount);
            System.out.println("The winner is "+battingTeam.teamName);

        }
        if(iningNumber==2 &&allOut && !winner){
            System.out.println("The winner is "+bowlingTeam.teamName+"as "+battingTeam.teamName+" is allout at "+battingTeam.teamScoreCard.getTotalScore());
        }
        System.out.println("Total over bowled "+overCount);
    }

    private BallType setBallType(int runGivenOnCurrentball){
        BallType ballType = BallType.NORMALBALL;
        switch (runGivenOnCurrentball) {
            case -3: {
                ballType = BallType.WIDEBALL;

                break;
            }
            case -2: {
                ballType = BallType.NOBALL;

                break;
            }
            case -1: {
                ballType = BallType.WICKET;

                break;
            }
            case 0: {
                ballType = BallType.NORMALBALL;

                break;
            }
            case 1: {
                ballType = BallType.NORMALBALL;

                break;
            }
            case 2: {
                ballType = BallType.NORMALBALL;

                break;
            }
            case 3: {
                ballType = BallType.NORMALBALL;

                break;
            }
            case 4: {
                ballType = BallType.NORMALBALL;

                break;
            }
            case 6: {
                ballType = BallType.NORMALBALL;
                break;
            }
            default: {
                ballType = BallType.DOTBALL;
            }
        }
        return ballType;
    }

    private RunType setRunType(int runGivenOnCurrentball){
        RunType runType = RunType.ZERO;
        switch (runGivenOnCurrentball) {
            case -3: {
                runType = RunType.ONE;
                break;
            }
            case -2: {
                runType = RunType.ONE;
                break;
            }
            case -1: {

                runType = RunType.ONE;
                break;
            }
            case 0: {
                runType = RunType.ZERO;
                break;
            }
            case 1: {
                runType = RunType.ONE;
                break;
            }
            case 2: {
                runType = RunType.TWO;
                break;
            }
            case 3: {
                runType = RunType.THREE;
                break;
            }
            case 4: {
                runType = RunType.FOUR;
                break;
            }
            case 6: {
                runType = RunType.SIX;
                break;
            }
            default: {
                runType = RunType.ZERO;
            }
        }
        return runType;
    }
}
