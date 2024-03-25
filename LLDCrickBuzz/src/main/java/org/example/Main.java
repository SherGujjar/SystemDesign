package org.example;

import org.example.Team.Player.Person;
import org.example.Team.Player.Player;
import org.example.Team.Team;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Deque<Player> listOfPlayers = new ArrayDeque<>();
        for(int i=0;i<11;i++){
            Player p1 = new Player(new Person("A"+Integer.toString(i),1,"A"));
            listOfPlayers.addLast(p1);
        }
        Deque<Player> lisofPlayer2 = new ArrayDeque<>(listOfPlayers);
        Team t1 = new Team("Sher",listOfPlayers);
        Team t2 = new Team("Vinod",lisofPlayer2);
        Match match = new Match(t1,t2,"Delhi",new T20MatchType(),t1);
        match.startMatch();
    }
}