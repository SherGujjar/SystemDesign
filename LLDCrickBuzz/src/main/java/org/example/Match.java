package org.example;

import org.example.Inning.Inning;
import org.example.Team.Team;

import java.util.ArrayList;
import java.util.List;

public class Match {

    Team teamA;
    Team teamB;
    List<Inning> innings = new ArrayList<>();

    String venue;
    MatchType matchType;
    Team tossWinner;

    public Match(Team teamA,Team teamB,String venue,MatchType matchType,Team tossWinner){
        this.matchType = matchType;
        this.venue = venue;
        this.teamA = teamA;
        this.teamB = teamB;
        this.tossWinner = tossWinner;
    }

    public void startMatch(){
        int overs = matchType.totalOver();
        Inning inning1 = new Inning(teamA,teamB,overs);
        Inning inning2 = new Inning(teamB,teamA,overs);
        inning1.startInning(matchType.overLimit(),0,1);
        inning2.startInning(matchType.overLimit(),teamA.teamScoreCard.getTotalScore(),2);
        innings.add(inning1);
        innings.add(inning2);
    }

}
