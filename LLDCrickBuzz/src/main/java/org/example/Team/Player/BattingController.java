package org.example.Team.Player;

import java.util.Deque;
import java.util.Queue;

public class BattingController {

    Deque<Player> playerYetToPLay;
    Player strikerBatsman;

    public Player getStrikerBatsman() {
        return strikerBatsman;
    }

    public Player getNonStrikerBatsman() {
        return nonStrikerBatsman;
    }

    Player nonStrikerBatsman;

    public BattingController(Deque<Player> playerQueue){
        playerYetToPLay = playerQueue;
    }

    public void sendOpeners(){
        this.strikerBatsman = playerYetToPLay.peek();
        playerYetToPLay.poll();
        this.nonStrikerBatsman = playerYetToPLay.peek();
        playerYetToPLay.poll();

    }

    public void swapPlayer(){
        Player tempPlayer = this.strikerBatsman;
        this.strikerBatsman = this.nonStrikerBatsman;
        this.nonStrikerBatsman = tempPlayer;
    }
    public void sentNextPlayer(){
        if(!playerYetToPLay.isEmpty()){
            strikerBatsman = playerYetToPLay.peek();
            playerYetToPLay.poll();
        }
        else{
            strikerBatsman = null;
        }
    }
}
