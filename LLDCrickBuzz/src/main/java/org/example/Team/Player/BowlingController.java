package org.example.Team.Player;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class BowlingController {
    Deque<Player> playerYetToBowl;

    Map<Player, Integer> overCountOfBowler = new HashMap<>();
    Player currentBowler;

    public Player getCurrentBowler() {
        return currentBowler;
    }

    int overLimit;

    public BowlingController(Deque<Player> playerQueue){
        playerYetToBowl = playerQueue;
    }

    public void sendOpeningBowler(){
        this.currentBowler = playerYetToBowl.peek();
        playerYetToBowl.pop();
        overCountOfBowler.put(currentBowler,1);
    }

    public void changeBolwer(){
        Player newPlayer = playerYetToBowl.peek();
        playerYetToBowl.pop();
        if(overCountOfBowler.get(this.currentBowler)<overLimit){
            playerYetToBowl.addFirst(this.currentBowler);
        }
        this.currentBowler = newPlayer;
        if(overCountOfBowler.containsKey(newPlayer)){
            overCountOfBowler.put(newPlayer,overCountOfBowler.get(newPlayer)+1);
        }
        else{
            overCountOfBowler.put(newPlayer,1);
        }
    }
    public void assignOverLimit(int limit){
        this.overLimit = limit;
    }

}
