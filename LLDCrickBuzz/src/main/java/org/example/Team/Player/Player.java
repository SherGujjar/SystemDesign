package org.example.Team.Player;

import org.example.Inning.Balls;
import org.example.Team.Player.Score.BattingScoreCard;
import org.example.Team.Player.Score.BowlingScoreCard;

import java.security.PublicKey;

public class Player {
    Person person;
    PlayerType playerType;
    public BattingScoreCard battingScoreCard;
    public BowlingScoreCard bowlingScoreCard;


    public Player(Person person){
        this.person  = person;
        this.battingScoreCard = new BattingScoreCard();
        this.bowlingScoreCard= new BowlingScoreCard();
        this.playerType = PlayerType.BATTING;
    }

    public int delieverTheBall(){
        int run = randomBall();
        return run;
    }

    private int randomBall(){
            int run = (int) (Math.random()*10);

            if(run==1){
                return 1;
            }
            else if(run==2){
                return 2;
            }
            else if(run==3){
                return 3;
            }
            else if(run==4){
                return 4;
            }
            else if(run==6){
                return 6;
            }
            else if(run==7 || run==9){
                return -1; // for wicket
            }
            else if(run==5){ // for noball
                return -2;
            }
            else if(run==8){
                return -3 ;// for wide
            }
            else{
                return 0;
            }
    }

}
