package org.example.Team;

import org.example.Team.Player.BattingController;
import org.example.Team.Player.BowlingController;
import org.example.Team.Player.Player;

import java.util.ArrayDeque;
import java.util.Deque;

public class Team {
    public String teamName;

    Deque<Player> players;

    public BattingController battingController;
    public BowlingController bowlingController;

    public TeamScoreCard teamScoreCard;

    public Team(String teamName,Deque<Player> players){
        // if we pass same than when while batting all gets all out than no one is there to bowl as we pop out all players;
        Deque<Player> battingPlayers = new ArrayDeque<>(players);
        Deque<Player> bowlingPlayers = new ArrayDeque<>(players);
        this.teamName = teamName;
        this.players = players;
        this.battingController = new BattingController(battingPlayers);
        this.bowlingController = new BowlingController(bowlingPlayers);
        this.teamScoreCard = new TeamScoreCard();
    }
}
